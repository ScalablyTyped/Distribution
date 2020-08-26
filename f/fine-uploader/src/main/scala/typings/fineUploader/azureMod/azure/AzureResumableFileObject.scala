package typings.fineUploader.azureMod.azure

import typings.fineUploader.coreMod.ResumableFileObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureResumableFileObject extends ResumableFileObject {
  /**
    * The associated file's blob name in Azure Blob Storage
    */
  var key: js.UndefOr[String] = js.native
}

object AzureResumableFileObject {
  @scala.inline
  def apply(): AzureResumableFileObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureResumableFileObject]
  }
  @scala.inline
  implicit class AzureResumableFileObjectOps[Self <: AzureResumableFileObject] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

