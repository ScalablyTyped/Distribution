package typings.ethersprojectAddress

import typings.ethersprojectBignumber.libBignumberMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait From extends StObject {
    
    var from: String
    
    var nonce: BigNumberish
  }
  object From {
    
    inline def apply(from: String, nonce: BigNumberish): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: BigNumberish): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
}
