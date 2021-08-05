package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fix extends StObject {
  
  var fix: js.UndefOr[String] = js.undefined
  
  var leftPosition: js.UndefOr[String] = js.undefined
  
  var rightPosition: js.UndefOr[String] = js.undefined
  
  var unfix: js.UndefOr[String] = js.undefined
}
object Fix {
  
  inline def apply(): Fix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fix]
  }
  
  extension [Self <: Fix](x: Self) {
    
    inline def setFix(value: String): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    
    inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
    
    inline def setLeftPosition(value: String): Self = StObject.set(x, "leftPosition", value.asInstanceOf[js.Any])
    
    inline def setLeftPositionUndefined: Self = StObject.set(x, "leftPosition", js.undefined)
    
    inline def setRightPosition(value: String): Self = StObject.set(x, "rightPosition", value.asInstanceOf[js.Any])
    
    inline def setRightPositionUndefined: Self = StObject.set(x, "rightPosition", js.undefined)
    
    inline def setUnfix(value: String): Self = StObject.set(x, "unfix", value.asInstanceOf[js.Any])
    
    inline def setUnfixUndefined: Self = StObject.set(x, "unfix", js.undefined)
  }
}
