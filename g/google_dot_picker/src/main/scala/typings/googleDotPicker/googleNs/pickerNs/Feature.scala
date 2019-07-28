package typings.googleDotPicker.googleNs.pickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.picker.Feature")
@js.native
object Feature extends js.Object {
  // Show only documents owned by the user when showing items from Google Drive.
  var MINE_ONLY: String = js.native
  // Allow user to choose more than one item.
  var MULTISELECT_ENABLED: String = js.native
  // Hide the navigation pane. If the navigation pane is hidden, users can only select from the first view chosen.
  var NAV_HIDDEN: String = js.native
  // For photo uploads, controls whether per-photo selection (as opposed to per-album) selection is enabled.
  var SIMPLE_UPLOAD_ENABLED: String = js.native
  // Whether Team Drive items should be included in results.
  var SUPPORT_TEAM_DRIVES: String = js.native
}

