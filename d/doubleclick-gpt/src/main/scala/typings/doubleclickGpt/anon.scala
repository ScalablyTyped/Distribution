package typings.doubleclickGpt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ChangeCorrelator extends StObject {
    
    var changeCorrelator: Boolean
  }
  object ChangeCorrelator {
    
    inline def apply(changeCorrelator: Boolean): ChangeCorrelator = {
      val __obj = js.Dynamic.literal(changeCorrelator = changeCorrelator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeCorrelator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeCorrelator] (val x: Self) extends AnyVal {
      
      inline def setChangeCorrelator(value: Boolean): Self = StObject.set(x, "changeCorrelator", value.asInstanceOf[js.Any])
    }
  }
}
