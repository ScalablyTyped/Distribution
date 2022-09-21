package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimestamp extends StObject {
  
  /**
    * Non-negative fractions of a second at nanosecond resolution. Must be from 0 to 999,999,999 inclusive.
    */
  var nanos: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Represents seconds of UTC time since Unix epoch.
    */
  var seconds: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimestamp {
  
  inline def apply(): SchemaTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestamp]
  }
  
  extension [Self <: SchemaTimestamp](x: Self) {
    
    inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setNanosNull: Self = StObject.set(x, "nanos", null)
    
    inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsNull: Self = StObject.set(x, "seconds", null)
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
