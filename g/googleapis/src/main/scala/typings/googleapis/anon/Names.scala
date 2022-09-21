package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Names extends StObject {
  
  var names: js.UndefOr[js.Array[String]] = js.undefined
}
object Names {
  
  inline def apply(): Names = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Names]
  }
  
  extension [Self <: Names](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
