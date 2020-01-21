package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (uploaderName != null) __obj.updateDynamic("uploaderName")(uploaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uploader]
  }
}

