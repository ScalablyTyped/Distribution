package typings.ethers

import typings.ethers.typesCryptoSignatureMod.Signature
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCryptoSigningKeyMod {
  
  @JSImport("ethers/types/crypto/signing-key", "SigningKey")
  @js.native
  open class SigningKey protected () extends StObject {
    /**
      *  Creates a new **SigningKey** for %%privateKey%%.
      */
    def this(privateKey: BytesLike) = this()
    
    /**
      *  The compressed public key.
      *
      *  This will always begin with either the prefix ``0x02`` or ``0x03``
      *  and be 68 characters long (the ``0x`` prefix and 33 hexadecimal
      *  nibbles)
      */
    def compressedPublicKey: String = js.native
    
    /**
      *  Returns the [[link-wiki-ecdh]] shared secret between this
      *  private key and the %%other%% key.
      *
      *  The %%other%% key may be any type of key, a raw public key,
      *  a compressed/uncompressed pubic key or aprivate key.
      *
      *  Best practice is usually to use a cryptographic hash on the
      *  returned value before using it as a symetric secret.
      *
      *  @example:
      *    sign1 = new SigningKey(id("some-secret-1"))
      *    sign2 = new SigningKey(id("some-secret-2"))
      *
      *    // Notice that privA.computeSharedSecret(pubB)...
      *    sign1.computeSharedSecret(sign2.publicKey)
      *    //_result:
      *
      *    // ...is equal to privB.computeSharedSecret(pubA).
      *    sign2.computeSharedSecret(sign1.publicKey)
      *    //_result:
      */
    def computeSharedSecret(other: BytesLike): String = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  The private key.
      */
    def privateKey: String = js.native
    
    /**
      *  The uncompressed public key.
      *
      * This will always begin with the prefix ``0x04`` and be 132
      * characters long (the ``0x`` prefix and 130 hexadecimal nibbles).
      */
    def publicKey: String = js.native
    
    /**
      *  Return the signature of the signed %%digest%%.
      */
    def sign(digest: BytesLike): Signature = js.native
  }
  /* static members */
  object SigningKey {
    
    @JSImport("ethers/types/crypto/signing-key", "SigningKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns the point resulting from adding the ellipic curve points
      *  %%p0%% and %%p1%%.
      *
      *  This is not a common function most developers should require, but
      *  can be useful for certain privacy-specific techniques.
      *
      *  For example, it is used by [[HDNodeWallet]] to compute child
      *  addresses from parent public keys and chain codes.
      */
    inline def addPoints(p0: BytesLike, p1: BytesLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addPoints")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def addPoints(p0: BytesLike, p1: BytesLike, compressed: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addPoints")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      *  Compute the public key for %%key%%, optionally %%compressed%%.
      *
      *  The %%key%% may be any type of key, a raw public key, a
      *  compressed/uncompressed public key or private key.
      *
      *  @example:
      *    sign = new SigningKey(id("some-secret"));
      *
      *    // Compute the uncompressed public key for a private key
      *    SigningKey.computePublicKey(sign.privateKey)
      *    //_result:
      *
      *    // Compute the compressed public key for a private key
      *    SigningKey.computePublicKey(sign.privateKey, true)
      *    //_result:
      *
      *    // Compute the uncompressed public key
      *    SigningKey.computePublicKey(sign.publicKey, false);
      *    //_result:
      *
      *    // Compute the Compressed a public key
      *    SigningKey.computePublicKey(sign.publicKey, true);
      *    //_result:
      */
    inline def computePublicKey(key: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computePublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def computePublicKey(key: BytesLike, compressed: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computePublicKey")(key.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      *  Returns the public key for the private key which produced the
      *  %%signature%% for the given %%digest%%.
      *
      *  @example:
      *    key = new SigningKey(id("some-secret"))
      *    digest = id("hello world")
      *    sig = key.sign(digest)
      *
      *    // Notice the signer public key...
      *    key.publicKey
      *    //_result:
      *
      *    // ...is equal to the recovered public key
      *    SigningKey.recoverPublicKey(digest, sig)
      *    //_result:
      *
      */
    inline def recoverPublicKey(digest: BytesLike, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPublicKey")(digest.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
