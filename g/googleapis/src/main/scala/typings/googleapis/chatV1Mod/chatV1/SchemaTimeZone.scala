package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeZone extends StObject {
  
  /**
    * The [IANA TZ](https://www.iana.org/time-zones) time zone database code, such as "America/Toronto".
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user timezone offset, in milliseconds, from Coordinated Universal Time (UTC).
    */
  var offset: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTimeZone {
  
  inline def apply(): SchemaTimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeZone]
  }
  
  extension [Self <: SchemaTimeZone](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
