package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinedNamesRanges extends StObject {
  
  var name: String
  
  var ranges: js.Array[String]
}
object DefinedNamesRanges {
  
  inline def apply(name: String, ranges: js.Array[String]): DefinedNamesRanges = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedNamesRanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinedNamesRanges] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: js.Array[String]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: String*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
