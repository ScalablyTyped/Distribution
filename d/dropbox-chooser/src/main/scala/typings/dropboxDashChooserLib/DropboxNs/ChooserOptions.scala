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

