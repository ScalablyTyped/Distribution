package typings
package googleDotPickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MINEONLY extends js.Object {
  // Show only documents owned by the user when showing items from Google Drive.
  var MINE_ONLY: java.lang.String
  // Allow user to choose more than one item.
  var MULTISELECT_ENABLED: java.lang.String
  // Hide the navigation pane. If the navigation pane is hidden, users can only select from the first view chosen.
  var NAV_HIDDEN: java.lang.String
  // For photo uploads, controls whether per-photo selection (as opposed to per-album) selection is enabled.
  var SIMPLE_UPLOAD_ENABLED: java.lang.String
  // Whether Team Drive items should be included in results.
  var SUPPORT_TEAM_DRIVES: java.lang.String
}

object Anon_MINEONLY {
  @scala.inline
  def apply(
    MINE_ONLY: java.lang.String,
    MULTISELECT_ENABLED: java.lang.String,
    NAV_HIDDEN: java.lang.String,
    SIMPLE_UPLOAD_ENABLED: java.lang.String,
    SUPPORT_TEAM_DRIVES: java.lang.String
  ): Anon_MINEONLY = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MINE_ONLY")(MINE_ONLY)
    __obj.updateDynamic("MULTISELECT_ENABLED")(MULTISELECT_ENABLED)
    __obj.updateDynamic("NAV_HIDDEN")(NAV_HIDDEN)
    __obj.updateDynamic("SIMPLE_UPLOAD_ENABLED")(SIMPLE_UPLOAD_ENABLED)
    __obj.updateDynamic("SUPPORT_TEAM_DRIVES")(SUPPORT_TEAM_DRIVES)
    __obj.asInstanceOf[Anon_MINEONLY]
  }
}

