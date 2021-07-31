package typings.googleAuthLibrary

import typings.googleAuthLibrary.cryptoCryptoMod.Crypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("google-auth-library/build/src/crypto/browser/crypto", "BrowserCrypto")
  @js.native
  class BrowserCrypto ()
    extends StObject
       with Crypto
  /* static members */
  object BrowserCrypto {
    
    @JSImport("google-auth-library/build/src/crypto/browser/crypto", "BrowserCrypto")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-auth-library/build/src/crypto/browser/crypto", "BrowserCrypto.padBase64")
    @js.native
    def padBase64: js.Any = js.native
    @scala.inline
    def padBase64_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padBase64")(x.asInstanceOf[js.Any])
  }
}
