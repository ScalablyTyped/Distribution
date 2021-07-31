package typings.dockerode.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyObject extends StObject {
  
  var passphrase: js.UndefOr[String] = js.undefined
  
  var pem: String | Buffer
}
object KeyObject {
  
  @scala.inline
  def apply(pem: String | Buffer): KeyObject = {
    val __obj = js.Dynamic.literal(pem = pem.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyObject]
  }
  
  @scala.inline
  implicit class KeyObjectMutableBuilder[Self <: KeyObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    @scala.inline
    def setPem(value: String | Buffer): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
  }
}
