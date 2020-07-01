package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resumable extends js.Object {
  var resumable: js.UndefOr[Multipart] = js.native
  var simple: js.UndefOr[Multipart] = js.native
}

object Resumable {
  @scala.inline
  def apply(resumable: Multipart = null, simple: Multipart = null): Resumable = {
    val __obj = js.Dynamic.literal()
    if (resumable != null) __obj.updateDynamic("resumable")(resumable.asInstanceOf[js.Any])
    if (simple != null) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resumable]
  }
}

