package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specification of the desired way to instantiate a disk in the instance
  * template when its created from a source instance.
  */
@js.native
trait SchemaDiskInstantiationConfig extends js.Object {
  
  /**
    * Specifies whether the disk will be auto-deleted when the instance is
    * deleted (but not when the disk is detached from the instance).
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  
  /**
    * The custom source image to be used to restore this disk when
    * instantiating this instance template.
    */
  var customImage: js.UndefOr[String] = js.native
  
  /**
    * Specifies the device name of the disk to which the configurations apply
    * to.
    */
  var deviceName: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether to include the disk and what image to use. Possible
    * values are:   - source-image: to use the same image that was used to
    * create the source instance&#39;s corresponding disk. Applicable to the
    * boot disk and additional read-write disks.  - source-image-family: to use
    * the same image family that was used to create the source instance&#39;s
    * corresponding disk. Applicable to the boot disk and additional read-write
    * disks.  - custom-image: to use a user-provided image url for disk
    * creation. Applicable to the boot disk and additional read-write disks.  -
    * attach-read-only: to attach a read-only disk. Applicable to read-only
    * disks.  - do-not-include: to exclude a disk from the template. Applicable
    * to additional read-write disks, local SSDs, and read-only disks.
    */
  var instantiateFrom: js.UndefOr[String] = js.native
}
object SchemaDiskInstantiationConfig {
  
  @scala.inline
  def apply(): SchemaDiskInstantiationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskInstantiationConfig]
  }
  
  @scala.inline
  implicit class SchemaDiskInstantiationConfigOps[Self <: SchemaDiskInstantiationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoDelete(value: Boolean): Self = this.set("autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDelete: Self = this.set("autoDelete", js.undefined)
    
    @scala.inline
    def setCustomImage(value: String): Self = this.set("customImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomImage: Self = this.set("customImage", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setInstantiateFrom(value: String): Self = this.set("instantiateFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstantiateFrom: Self = this.set("instantiateFrom", js.undefined)
  }
}
