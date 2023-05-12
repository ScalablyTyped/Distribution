package typings.ethers

import typings.ethers.ethersInts.`0`
import typings.ethers.ethersInts.`1`
import typings.ethers.ethersInts.`27`
import typings.ethers.ethersInts.`28`
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCryptoSignatureMod {
  
  @JSImport("ethers/types/crypto/signature", "Signature")
  @js.native
  open class Signature protected ()
    extends StObject
       with _SignatureLike {
    /**
      *  @private
      */
    def this(guard: Any, r: String, s: String, v: `27` | `28`) = this()
    
    /**
      *  The [[link-eip-2098]] compact representation.
      */
    def compactSerialized: String = js.native
    
    /**
      *  The chain ID for EIP-155 legacy transactions. For non-legacy
      *  transactions, this value is ``null``.
      */
    def legacyChainId: Null | js.BigInt = js.native
    
    /**
      *  The EIP-155 ``v`` for legacy transactions. For non-legacy
      *  transactions, this value is ``null``.
      */
    def networkV: Null | js.BigInt = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  The ``r`` value for a signautre.
      *
      *  This represents the ``x`` coordinate of a "reference" or
      *  challenge point, from which the ``y`` can be computed.
      */
    def r: String = js.native
    def r_=(value: BytesLike): Unit = js.native
    
    /**
      *  The ``s`` value for a signature.
      */
    def s: String = js.native
    def s_=(_value: BytesLike): Unit = js.native
    
    /**
      *  The serialized representation.
      */
    def serialized: String = js.native
    
    /**
      *  Returns a representation that is compatible with ``JSON.stringify``.
      */
    def toJSON(): Any = js.native
    
    /**
      *  The ``v`` value for a signature.
      *
      *  Since a given ``x`` value for ``r`` has two possible values for
      *  its correspondin ``y``, the ``v`` indicates which of the two ``y``
      *  values to use.
      *
      *  It is normalized to the values ``27`` or ``28`` for legacy
      *  purposes.
      */
    def v: `27` | `28` = js.native
    def v_=(value: BigNumberish): Unit = js.native
    
    /**
      *  The ``yParity`` for the signature.
      *
      *  See ``v`` for more details on how this value is used.
      */
    def yParity: `0` | `1` = js.native
    
    /**
      *  The [[link-eip-2098]] compact representation of the ``yParity``
      *  and ``s`` compacted into a single ``bytes32``.
      */
    def yParityAndS: String = js.native
  }
  /* static members */
  object Signature {
    
    @JSImport("ethers/types/crypto/signature", "Signature")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new [[Signature]].
      *
      *  If no %%sig%% is provided, a new [[Signature]] is created
      *  with default values.
      *
      *  If %%sig%% is a string, it is parsed.
      */
    inline def from(): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[Signature]
    inline def from(sig: SignatureLike): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(sig.asInstanceOf[js.Any]).asInstanceOf[Signature]
    
    /**
      *  Compute the chain ID from the ``v`` in a legacy EIP-155 transactions.
      *
      *  @example:
      *    Signature.getChainId(45)
      *    //_result:
      *
      *    Signature.getChainId(46)
      *    //_result:
      */
    inline def getChainId(v: BigNumberish): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("getChainId")(v.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    
    /**
      *  Compute the ``v`` for a chain ID for a legacy EIP-155 transactions.
      *
      *  Legacy transactions which use [[link-eip-155]] hijack the ``v``
      *  property to include the chain ID.
      *
      *  @example:
      *    Signature.getChainIdV(5, 27)
      *    //_result:
      *
      *    Signature.getChainIdV(5, 28)
      *    //_result:
      *
      */
    inline def getChainIdV(chainId: BigNumberish, v: `27` | `28`): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("getChainIdV")(chainId.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    
    /**
      *  Compute the normalized legacy transaction ``v`` from a ``yParirty``,
      *  a legacy transaction ``v`` or a legacy [[link-eip-155]] transaction.
      *
      *  @example:
      *    // The values 0 and 1 imply v is actually yParity
      *    Signature.getNormalizedV(0)
      *    //_result:
      *
      *    // Legacy non-EIP-1559 transaction (i.e. 27 or 28)
      *    Signature.getNormalizedV(27)
      *    //_result:
      *
      *    // Legacy EIP-155 transaction (i.e. >= 35)
      *    Signature.getNormalizedV(46)
      *    //_result:
      *
      *    // Invalid values throw
      *    Signature.getNormalizedV(5)
      *    //_error:
      */
    inline def getNormalizedV(v: BigNumberish): `27` | `28` = ^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedV")(v.asInstanceOf[js.Any]).asInstanceOf[`27` | `28`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.typesCryptoSignatureMod.Signature
    - java.lang.String
    - typings.ethers.anon.R
    - typings.ethers.anon.S
    - typings.ethers.anon.V
  */
  type SignatureLike = _SignatureLike | String
  
  trait _SignatureLike extends StObject
}
