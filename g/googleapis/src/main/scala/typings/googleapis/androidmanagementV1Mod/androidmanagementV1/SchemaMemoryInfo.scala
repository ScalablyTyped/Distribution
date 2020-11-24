package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about device memory and storage.
  */
@js.native
trait SchemaMemoryInfo extends js.Object {
  
  /**
    * Total internal storage on device in bytes.
    */
  var totalInternalStorage: js.UndefOr[String] = js.native
  
  /**
    * Total RAM on device in bytes.
    */
  var totalRam: js.UndefOr[String] = js.native
}
object SchemaMemoryInfo {
  
  @scala.inline
  def apply(): SchemaMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemoryInfo]
  }
  
  @scala.inline
  implicit class SchemaMemoryInfoOps[Self <: SchemaMemoryInfo] (val x: Self) extends AnyVal {
    
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
    def setTotalInternalStorage(value: String): Self = this.set("totalInternalStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalInternalStorage: Self = this.set("totalInternalStorage", js.undefined)
    
    @scala.inline
    def setTotalRam(value: String): Self = this.set("totalRam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRam: Self = this.set("totalRam", js.undefined)
  }
}
