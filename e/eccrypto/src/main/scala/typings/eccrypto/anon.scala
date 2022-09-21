package typings.eccrypto

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EphemPrivateKey extends StObject {
    
    var ephemPrivateKey: js.UndefOr[Buffer] = js.undefined
    
    var iv: js.UndefOr[Buffer] = js.undefined
  }
  object EphemPrivateKey {
    
    inline def apply(): EphemPrivateKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EphemPrivateKey]
    }
    
    extension [Self <: EphemPrivateKey](x: Self) {
      
      inline def setEphemPrivateKey(value: Buffer): Self = StObject.set(x, "ephemPrivateKey", value.asInstanceOf[js.Any])
      
      inline def setEphemPrivateKeyUndefined: Self = StObject.set(x, "ephemPrivateKey", js.undefined)
      
      inline def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    }
  }
}
