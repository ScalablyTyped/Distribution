package typings.dialogflow.mod.google.protobuf

import typings.long.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Timestamp. */
@js.native
trait ITimestamp extends StObject {
  
  /** Timestamp nanos */
  var nanos: js.UndefOr[Double | Null] = js.native
  
  /** Timestamp seconds */
  var seconds: js.UndefOr[Double | Long | String | Null] = js.native
}
object ITimestamp {
  
  @scala.inline
  def apply(): ITimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimestamp]
  }
  
  @scala.inline
  implicit class ITimestampMutableBuilder[Self <: ITimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanosNull: Self = StObject.set(x, "nanos", null)
    
    @scala.inline
    def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double | Long | String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsNull: Self = StObject.set(x, "seconds", null)
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
