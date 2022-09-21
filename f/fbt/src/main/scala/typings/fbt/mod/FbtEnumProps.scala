package typings.fbt.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtEnumProps extends StObject {
  
  var `enum-range`: js.Array[String] | StringDictionary[String]
  
  var value: String
}
object FbtEnumProps {
  
  inline def apply(`enum-range`: js.Array[String] | StringDictionary[String], value: String): FbtEnumProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("enum-range")(`enum-range`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtEnumProps]
  }
  
  extension [Self <: FbtEnumProps](x: Self) {
    
    inline def `setEnum-range`(value: js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "enum-range", value.asInstanceOf[js.Any])
    
    inline def `setEnum-rangeVarargs`(value: String*): Self = StObject.set(x, "enum-range", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
