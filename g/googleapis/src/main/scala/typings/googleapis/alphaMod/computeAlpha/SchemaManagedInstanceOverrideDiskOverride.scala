package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedInstanceOverrideDiskOverride extends StObject {
  
  /**
    * The name of the device on the VM
    */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If
    * not specified, the default is to attach the disk in READ_WRITE mode.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * The disk that is/will be mounted
    */
  var source: js.UndefOr[String] = js.undefined
}
object SchemaManagedInstanceOverrideDiskOverride {
  
  @scala.inline
  def apply(): SchemaManagedInstanceOverrideDiskOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceOverrideDiskOverride]
  }
  
  @scala.inline
  implicit class SchemaManagedInstanceOverrideDiskOverrideMutableBuilder[Self <: SchemaManagedInstanceOverrideDiskOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
