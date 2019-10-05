package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origination extends js.Object {
  var owner: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object Origination {
  @scala.inline
  def apply(owner: String = null, source: String = null): Origination = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Origination]
  }
}

