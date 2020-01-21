package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaServerBinding extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaServerBinding {
  @scala.inline
  def apply(`type`: String = null): SchemaServerBinding = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServerBinding]
  }
}

