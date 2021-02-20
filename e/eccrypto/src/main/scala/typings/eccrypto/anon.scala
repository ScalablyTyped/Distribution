package typings.eccrypto

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait EphemPrivateKey extends StObject {
    
    var ephemPrivateKey: js.UndefOr[Buffer] = js.native
    
    var iv: js.UndefOr[Buffer] = js.native
  }
  object EphemPrivateKey {
    
    @scala.inline
    def apply(): EphemPrivateKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EphemPrivateKey]
    }
    
    @scala.inline
    implicit class EphemPrivateKeyMutableBuilder[Self <: EphemPrivateKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEphemPrivateKey(value: Buffer): Self = StObject.set(x, "ephemPrivateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemPrivateKeyUndefined: Self = StObject.set(x, "ephemPrivateKey", js.undefined)
      
      @scala.inline
      def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    }
  }
}
