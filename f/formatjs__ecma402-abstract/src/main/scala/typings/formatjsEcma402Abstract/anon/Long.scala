package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Long extends StObject {
  
  var long: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  var short: js.UndefOr[js.Tuple2[String, String]] = js.undefined
}
object Long {
  
  inline def apply(): Long = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Long]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
    
    inline def setLong(value: js.Tuple2[String, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
    
    inline def setShort(value: js.Tuple2[String, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
  }
}
