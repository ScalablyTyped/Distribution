package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Long extends StObject {
  
  var long: js.Array[String]
  
  var narrow: js.Array[String]
  
  var short: js.Array[String]
}
object Long {
  
  inline def apply(long: js.Array[String], narrow: js.Array[String], short: js.Array[String]): Long = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
  
  extension [Self <: Long](x: Self) {
    
    inline def setLong(value: js.Array[String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setLongVarargs(value: String*): Self = StObject.set(x, "long", js.Array(value*))
    
    inline def setNarrow(value: js.Array[String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setNarrowVarargs(value: String*): Self = StObject.set(x, "narrow", js.Array(value*))
    
    inline def setShort(value: js.Array[String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortVarargs(value: String*): Self = StObject.set(x, "short", js.Array(value*))
  }
}
