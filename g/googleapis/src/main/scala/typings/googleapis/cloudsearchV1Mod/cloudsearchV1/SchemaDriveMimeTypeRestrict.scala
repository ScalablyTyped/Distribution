package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive mime-type search restricts (e.g. &quot;type:pdf&quot;).
  */
@js.native
trait SchemaDriveMimeTypeRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDriveMimeTypeRestrict {
  @scala.inline
  def apply(`type`: String = null): SchemaDriveMimeTypeRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDriveMimeTypeRestrict]
  }
}

