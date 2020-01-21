package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  var duration: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object Segment {
  @scala.inline
  def apply(duration: String = null, kind: String = null, start: String = null): Segment = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
}

