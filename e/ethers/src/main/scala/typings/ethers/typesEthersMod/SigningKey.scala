package typings.ethers.typesEthersMod

import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "SigningKey")
@js.native
open class SigningKey protected ()
  extends typings.ethers.typesCryptoMod.SigningKey {
  /**
    *  Creates a new **SigningKey** for %%privateKey%%.
    */
  def this(privateKey: BytesLike) = this()
}
/* static members */
object SigningKey {
  
  @JSImport("ethers/types/ethers", "SigningKey")
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
