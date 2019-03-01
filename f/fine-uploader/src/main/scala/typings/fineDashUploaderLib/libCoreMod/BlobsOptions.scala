package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobsOptions extends js.Object {
  /**
    * The default name to be used for nameless `Blob`s
    *
    * @default `Misc data`
    */
  var defaultName: js.UndefOr[java.lang.String] = js.undefined
}

object BlobsOptions {
  @scala.inline
  def apply(defaultName: java.lang.String = null): BlobsOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultName != null) __obj.updateDynamic("defaultName")(defaultName)
    __obj.asInstanceOf[BlobsOptions]
  }
}

