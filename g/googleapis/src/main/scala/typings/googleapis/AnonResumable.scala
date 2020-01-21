package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResumable extends js.Object {
  var resumable: js.UndefOr[AnonMultipart] = js.native
  var simple: js.UndefOr[AnonMultipart] = js.native
}

object AnonResumable {
  @scala.inline
  def apply(resumable: AnonMultipart = null, simple: AnonMultipart = null): AnonResumable = {
    val __obj = js.Dynamic.literal()
    if (resumable != null) __obj.updateDynamic("resumable")(resumable.asInstanceOf[js.Any])
    if (simple != null) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResumable]
  }
}

