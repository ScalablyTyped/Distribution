package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for `ListDeviceStates`.
  */
@js.native
trait SchemaListDeviceStatesResponse extends StObject {
  
  /**
    * The last few device states. States are listed in descending order of
    * server update time, starting from the most recent one.
    */
  var deviceStates: js.UndefOr[js.Array[SchemaDeviceState]] = js.native
}
object SchemaListDeviceStatesResponse {
  
  @scala.inline
  def apply(): SchemaListDeviceStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceStatesResponse]
  }
  
  @scala.inline
  implicit class SchemaListDeviceStatesResponseMutableBuilder[Self <: SchemaListDeviceStatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceStates(value: js.Array[SchemaDeviceState]): Self = StObject.set(x, "deviceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatesUndefined: Self = StObject.set(x, "deviceStates", js.undefined)
    
    @scala.inline
    def setDeviceStatesVarargs(value: SchemaDeviceState*): Self = StObject.set(x, "deviceStates", js.Array(value :_*))
  }
}
