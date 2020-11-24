package typings.fineUploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIDragAndDropOptions extends js.Object {
  
  /**
    * Designate additional drop zones for file input
    *
    * @default `[]`
    */
  var extraDropzones: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Include the path of dropped files (starting with the top-level dropped directory). This value will be sent along with the request as a qqpath parameter
    *
    * @default `false`
    */
  var reportDirectoryPaths: js.UndefOr[Boolean] = js.native
}
object UIDragAndDropOptions {
  
  @scala.inline
  def apply(): UIDragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIDragAndDropOptions]
  }
  
  @scala.inline
  implicit class UIDragAndDropOptionsOps[Self <: UIDragAndDropOptions] (val x: Self) extends AnyVal {
    
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
    def setExtraDropzonesVarargs(value: js.Any*): Self = this.set("extraDropzones", js.Array(value :_*))
    
    @scala.inline
    def setExtraDropzones(value: js.Array[_]): Self = this.set("extraDropzones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraDropzones: Self = this.set("extraDropzones", js.undefined)
    
    @scala.inline
    def setReportDirectoryPaths(value: Boolean): Self = this.set("reportDirectoryPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportDirectoryPaths: Self = this.set("reportDirectoryPaths", js.undefined)
  }
}
