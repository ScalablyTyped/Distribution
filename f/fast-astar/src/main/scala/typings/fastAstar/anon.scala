package typings.fastAstar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Col extends StObject {
    
    var col: Double
    
    var row: Double
  }
  object Col {
    
    inline def apply(col: Double, row: Double): Col = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[Col]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Col] (val x: Self) extends AnyVal {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptimalResult extends StObject {
    
    var optimalResult: js.UndefOr[Boolean] = js.undefined
    
    var rightAngle: Boolean
  }
  object OptimalResult {
    
    inline def apply(rightAngle: Boolean): OptimalResult = {
      val __obj = js.Dynamic.literal(rightAngle = rightAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimalResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptimalResult] (val x: Self) extends AnyVal {
      
      inline def setOptimalResult(value: Boolean): Self = StObject.set(x, "optimalResult", value.asInstanceOf[js.Any])
      
      inline def setOptimalResultUndefined: Self = StObject.set(x, "optimalResult", js.undefined)
      
      inline def setRightAngle(value: Boolean): Self = StObject.set(x, "rightAngle", value.asInstanceOf[js.Any])
    }
  }
}
