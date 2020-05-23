package typings.fineUploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIDisplayOptions extends js.Object {
  /**
    * Enable or disable the display of the file size next to the file after it has been submitted
    *
    * @default `false`
    */
  var fileSizeOnSubmit: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true` batches of files are added to the top of the UI's file list. The default is to append file(s) to the bottom of the list
    *
    * @default `false`
    */
  var prependFiles: js.UndefOr[Boolean] = js.undefined
}

object UIDisplayOptions {
  @scala.inline
  def apply(
    fileSizeOnSubmit: js.UndefOr[Boolean] = js.undefined,
    prependFiles: js.UndefOr[Boolean] = js.undefined
  ): UIDisplayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileSizeOnSubmit)) __obj.updateDynamic("fileSizeOnSubmit")(fileSizeOnSubmit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prependFiles)) __obj.updateDynamic("prependFiles")(prependFiles.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIDisplayOptions]
  }
}

