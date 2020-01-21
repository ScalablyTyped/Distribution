package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive location search restricts (e.g. &quot;is:starred&quot;).
  */
@js.native
trait SchemaDriveLocationRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDriveLocationRestrict {
  @scala.inline
  def apply(`type`: String = null): SchemaDriveLocationRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDriveLocationRestrict]
  }
}

