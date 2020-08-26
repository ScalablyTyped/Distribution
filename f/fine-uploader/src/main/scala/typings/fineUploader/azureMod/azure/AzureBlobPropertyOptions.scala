package typings.fineUploader.azureMod.azure

import typings.fineUploader.coreMod.PromiseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureBlobPropertyOptions extends js.Object {
  /**
    * Describes the blob name used to identify the file in your Azure Blob Storage container.
    *
    * Possible values are
    * * `'uuid'`
    * * `'filename'`
    * * `function`
    *
    * If the value is a function, Fine Uploader Azure will pass the associated file ID as a parameter when invoking your function.
    * If the value is a function it may return one of a `qq.Promise` or a `String`
    *
    * @default `'uuid'`
    */
  var name: js.UndefOr[String | AzureBlobPropertyNameFunction] = js.native
}

object AzureBlobPropertyOptions {
  @scala.inline
  def apply(): AzureBlobPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureBlobPropertyOptions]
  }
  @scala.inline
  implicit class AzureBlobPropertyOptionsOps[Self <: AzureBlobPropertyOptions] (val x: Self) extends AnyVal {
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
    def setNameFunction1(value: /* id */ Double => PromiseOptions | String): Self = this.set("name", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String | AzureBlobPropertyNameFunction): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

