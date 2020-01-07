package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The time span search restrict (e.g. &quot;after:2017-09-11
  * before:2017-09-12&quot;).
  */
@js.native
trait Schema$DriveTimeSpanRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Schema$DriveTimeSpanRestrict {
  @scala.inline
  def apply(`type`: String = null): Schema$DriveTimeSpanRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DriveTimeSpanRestrict]
  }
}

