package typings.firebaseAdmin

import typings.firebaseAdmin.cryptoSignerMod.CryptoSigner
import typings.jsonwebtoken.mod.Algorithm
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authTokenGeneratorMod {
  
  @JSImport("firebase-admin/lib/auth/token-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/auth/token-generator", "BLACKLISTED_CLAIMS")
  @js.native
  val BLACKLISTED_CLAIMS: js.Array[String] = js.native
  
  @JSImport("firebase-admin/lib/auth/token-generator", "EmulatedSigner")
  @js.native
  open class EmulatedSigner ()
    extends StObject
       with CryptoSigner {
    
    /**
      * The name of the signing algorithm.
      */
    /* CompleteClass */
    override val algorithm: Algorithm = js.native
    
    /**
      * Returns the ID of the service account used to sign tokens.
      *
      * @returns A promise that resolves with a service account ID.
      */
    /* CompleteClass */
    override def getAccountId(): js.Promise[String] = js.native
    
    /**
      * Cryptographically signs a buffer of data.
      *
      * @param buffer - The data to be signed.
      * @returns A promise that resolves with the raw bytes of a signature.
      */
    /* CompleteClass */
    override def sign(buffer: Buffer): js.Promise[Buffer] = js.native
  }
  
  inline def handleCryptoSignerError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("handleCryptoSignerError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
}
