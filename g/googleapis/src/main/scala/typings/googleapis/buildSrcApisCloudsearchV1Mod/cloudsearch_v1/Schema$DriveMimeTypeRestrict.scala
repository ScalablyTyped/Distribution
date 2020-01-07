package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive mime-type search restricts (e.g. &quot;type:pdf&quot;).
  */
@js.native
trait Schema$DriveMimeTypeRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Schema$DriveMimeTypeRestrict {
  @scala.inline
  def apply(`type`: String = null): Schema$DriveMimeTypeRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DriveMimeTypeRestrict]
  }
}

