package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The time span search restrict (e.g. &quot;after:2017-09-11
  * before:2017-09-12&quot;).
  */
@js.native
trait SchemaDriveTimeSpanRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDriveTimeSpanRestrict {
  @scala.inline
  def apply(`type`: String = null): SchemaDriveTimeSpanRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDriveTimeSpanRestrict]
  }
}

