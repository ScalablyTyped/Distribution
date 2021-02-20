package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The device state, as reported by the device.
  */
@js.native
trait SchemaDeviceState extends StObject {
  
  /**
    * The device state data.
    */
  var binaryData: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The time at which this state version was updated in Cloud
    * IoT Core.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaDeviceState {
  
  @scala.inline
  def apply(): SchemaDeviceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceState]
  }
  
  @scala.inline
  implicit class SchemaDeviceStateMutableBuilder[Self <: SchemaDeviceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryData(value: String): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryDataUndefined: Self = StObject.set(x, "binaryData", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
