package typings.fineDashUploader.libAzureMod.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var name: js.UndefOr[String | AzureBlobPropertyNameFunction] = js.undefined
}

object AzureBlobPropertyOptions {
  @scala.inline
  def apply(name: String | AzureBlobPropertyNameFunction = null): AzureBlobPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureBlobPropertyOptions]
  }
}

