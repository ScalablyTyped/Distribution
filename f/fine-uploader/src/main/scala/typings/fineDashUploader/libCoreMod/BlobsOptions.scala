package typings.fineDashUploader.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobsOptions extends js.Object {
  /**
    * The default name to be used for nameless `Blob`s
    *
    * @default `Misc data`
    */
  var defaultName: js.UndefOr[String] = js.undefined
}

object BlobsOptions {
  @scala.inline
  def apply(defaultName: String = null): BlobsOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultName != null) __obj.updateDynamic("defaultName")(defaultName)
    __obj.asInstanceOf[BlobsOptions]
  }
}

