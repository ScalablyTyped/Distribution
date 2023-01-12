package typings.expoKeepAwake

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait SuppressDeactivateWarnings extends StObject {
    
    var suppressDeactivateWarnings: Boolean
  }
  object SuppressDeactivateWarnings {
    
    inline def apply(suppressDeactivateWarnings: Boolean): SuppressDeactivateWarnings = {
      val __obj = js.Dynamic.literal(suppressDeactivateWarnings = suppressDeactivateWarnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuppressDeactivateWarnings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuppressDeactivateWarnings] (val x: Self) extends AnyVal {
      
      inline def setSuppressDeactivateWarnings(value: Boolean): Self = StObject.set(x, "suppressDeactivateWarnings", value.asInstanceOf[js.Any])
    }
  }
}
