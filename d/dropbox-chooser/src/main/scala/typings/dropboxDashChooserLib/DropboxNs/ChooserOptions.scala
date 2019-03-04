package typings
package dropboxDashChooserLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooserOptions extends js.Object {
  // called when the user closes the dialog without selecting a file
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // eg. '.png'
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // default: false
  var folderselect: js.UndefOr[scala.Boolean] = js.undefined
  // default: 'preview'
  var linkType: js.UndefOr[
    dropboxDashChooserLib.dropboxDashChooserLibStrings.preview | dropboxDashChooserLib.dropboxDashChooserLibStrings.direct
  ] = js.undefined
  // default: false
  var multiselect: js.UndefOr[scala.Boolean] = js.undefined
  // any positive number
  var sizeLimit: js.UndefOr[scala.Double] = js.undefined
  // called when a user selects an item in the Chooser
  def success(files: js.Array[ChooserFile]): scala.Unit
}

object ChooserOptions {
  @scala.inline
  def apply(
    success: js.Function1[js.Array[ChooserFile], scala.Unit],
    cancel: js.Function0[scala.Unit] = null,
    extensions: js.Array[java.lang.String] = null,
    folderselect: js.UndefOr[scala.Boolean] = js.undefined,
    linkType: dropboxDashChooserLib.dropboxDashChooserLibStrings.preview | dropboxDashChooserLib.dropboxDashChooserLibStrings.direct = null,
    multiselect: js.UndefOr[scala.Boolean] = js.undefined,
    sizeLimit: scala.Int | scala.Double = null
  ): ChooserOptions = {
    val __obj = js.Dynamic.literal(success = success)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(folderselect)) __obj.updateDynamic("folderselect")(folderselect)
    if (linkType != null) __obj.updateDynamic("linkType")(linkType.asInstanceOf[js.Any])
    if (!js.isUndefined(multiselect)) __obj.updateDynamic("multiselect")(multiselect)
    if (sizeLimit != null) __obj.updateDynamic("sizeLimit")(sizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooserOptions]
  }
}

