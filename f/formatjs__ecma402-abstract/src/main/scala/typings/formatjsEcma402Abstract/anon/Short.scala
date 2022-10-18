package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Short extends StObject {
  
  var long: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  var short: js.UndefOr[js.Tuple2[String, String]] = js.undefined
}
object Short {
  
  inline def apply(): Short = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Short]
  }
  
  extension [Self <: Short](x: Self) {
    
    inline def setLong(value: js.Tuple2[String, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
    
    inline def setShort(value: js.Tuple2[String, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
  }
}
