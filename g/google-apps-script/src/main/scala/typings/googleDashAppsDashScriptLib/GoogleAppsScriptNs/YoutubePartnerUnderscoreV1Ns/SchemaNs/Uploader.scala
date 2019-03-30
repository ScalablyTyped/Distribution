package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uploader extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var uploaderName: js.UndefOr[java.lang.String] = js.undefined
}

object Uploader {
  @scala.inline
  def apply(kind: java.lang.String = null, uploaderName: java.lang.String = null): Uploader = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (uploaderName != null) __obj.updateDynamic("uploaderName")(uploaderName)
    __obj.asInstanceOf[Uploader]
  }
}

