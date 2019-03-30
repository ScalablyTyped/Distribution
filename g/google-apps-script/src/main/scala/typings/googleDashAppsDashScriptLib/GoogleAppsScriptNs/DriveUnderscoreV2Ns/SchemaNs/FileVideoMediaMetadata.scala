package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileVideoMediaMetadata extends js.Object {
  var durationMillis: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object FileVideoMediaMetadata {
  @scala.inline
  def apply(
    durationMillis: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): FileVideoMediaMetadata = {
    val __obj = js.Dynamic.literal()
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileVideoMediaMetadata]
  }
}

