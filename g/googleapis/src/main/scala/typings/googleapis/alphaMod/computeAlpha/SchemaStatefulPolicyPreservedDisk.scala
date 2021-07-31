package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatefulPolicyPreservedDisk extends StObject {
  
  /**
    * Device name of the disk to be preserved
    */
  var deviceName: js.UndefOr[String] = js.undefined
}
object SchemaStatefulPolicyPreservedDisk {
  
  @scala.inline
  def apply(): SchemaStatefulPolicyPreservedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedDisk]
  }
  
  @scala.inline
  implicit class SchemaStatefulPolicyPreservedDiskMutableBuilder[Self <: SchemaStatefulPolicyPreservedDisk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
  }
}
