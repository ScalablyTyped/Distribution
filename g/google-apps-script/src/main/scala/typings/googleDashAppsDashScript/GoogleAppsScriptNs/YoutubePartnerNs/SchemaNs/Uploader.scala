package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uploader extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var uploaderName: js.UndefOr[String] = js.undefined
}

object Uploader {
  @scala.inline
  def apply(kind: String = null, uploaderName: String = null): Uploader = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (uploaderName != null) __obj.updateDynamic("uploaderName")(uploaderName)
    __obj.asInstanceOf[Uploader]
  }
}

