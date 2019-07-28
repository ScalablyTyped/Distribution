package typings.dropboxDashChooser.DropboxNs

import typings.dropboxDashChooser.dropboxDashChooserStrings.direct
import typings.dropboxDashChooser.dropboxDashChooserStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooserOptions extends js.Object {
  // called when the user closes the dialog without selecting a file
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  // eg. '.png'
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  // default: false
  var folderselect: js.UndefOr[Boolean] = js.undefined
  // default: 'preview'
  var linkType: js.UndefOr[preview | direct] = js.undefined
  // default: false
  var multiselect: js.UndefOr[Boolean] = js.undefined
  // any positive number
  var sizeLimit: js.UndefOr[Double] = js.undefined
  // called when a user selects an item in the Chooser
  def success(files: js.Array[ChooserFile]): Unit
}

object ChooserOptions {
  @scala.inline
  def apply(
    success: js.Array[ChooserFile] => Unit,
    cancel: () => Unit = null,
    extensions: js.Array[String] = null,
    folderselect: js.UndefOr[Boolean] = js.undefined,
    linkType: preview | direct = null,
    multiselect: js.UndefOr[Boolean] = js.undefined,
    sizeLimit: Int | Double = null
  ): ChooserOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(folderselect)) __obj.updateDynamic("folderselect")(folderselect)
    if (linkType != null) __obj.updateDynamic("linkType")(linkType.asInstanceOf[js.Any])
    if (!js.isUndefined(multiselect)) __obj.updateDynamic("multiselect")(multiselect)
    if (sizeLimit != null) __obj.updateDynamic("sizeLimit")(sizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooserOptions]
  }
}

