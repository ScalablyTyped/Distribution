package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ServerBinding extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Schema$ServerBinding {
  @scala.inline
  def apply(`type`: String = null): Schema$ServerBinding = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServerBinding]
  }
}

