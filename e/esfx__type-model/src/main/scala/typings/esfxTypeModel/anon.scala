package typings.esfxTypeModel

import typings.esfxTypeModel.esfxTypeModelBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Pass extends StObject {
    
    var pass: `true`
  }
  object Pass {
    
    inline def apply(): Pass = {
      val __obj = js.Dynamic.literal(pass = true)
      __obj.asInstanceOf[Pass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pass] (val x: Self) extends AnyVal {
      
      inline def setPass(value: `true`): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
}
