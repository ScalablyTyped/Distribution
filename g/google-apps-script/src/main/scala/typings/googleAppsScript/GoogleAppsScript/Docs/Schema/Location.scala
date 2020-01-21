package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var segmentId: js.UndefOr[String] = js.undefined
}

object Location {
  @scala.inline
  def apply(index: Int | Double = null, segmentId: String = null): Location = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

