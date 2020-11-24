package typings.googleAuthLibrary

import typings.googleAuthLibrary.cryptoCryptoMod.Crypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-auth-library/build/src/crypto/browser/crypto", JSImport.Namespace)
@js.native
object cryptoMod extends js.Object {
  
  @js.native
  class BrowserCrypto () extends Crypto
  /* static members */
  @js.native
  object BrowserCrypto extends js.Object {
    
    var padBase64: js.Any = js.native
  }
}
