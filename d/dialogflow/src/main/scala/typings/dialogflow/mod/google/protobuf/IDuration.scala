package typings.dialogflow.mod.google.protobuf

import typings.long.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Duration. */
trait IDuration extends StObject {
  
  /** Duration nanos */
  var nanos: js.UndefOr[Double | Null] = js.undefined
  
  /** Duration seconds */
  var seconds: js.UndefOr[Double | ^ | String | Null] = js.undefined
}
object IDuration {
  
  inline def apply(): IDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDuration]
  }
  
  extension [Self <: IDuration](x: Self) {
    
    inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setNanosNull: Self = StObject.set(x, "nanos", null)
    
    inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    inline def setSeconds(value: Double | ^ | String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsNull: Self = StObject.set(x, "seconds", null)
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
