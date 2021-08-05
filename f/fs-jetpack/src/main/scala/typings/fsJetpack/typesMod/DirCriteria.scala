package typings.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirCriteria extends StObject {
  
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String | Double] = js.undefined
}
object DirCriteria {
  
  inline def apply(): DirCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirCriteria]
  }
  
  extension [Self <: DirCriteria](x: Self) {
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
