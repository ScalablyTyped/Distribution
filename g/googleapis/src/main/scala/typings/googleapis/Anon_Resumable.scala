package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Resumable extends js.Object {
  var resumable: js.UndefOr[Anon_Multipart] = js.native
  var simple: js.UndefOr[Anon_Multipart] = js.native
}

object Anon_Resumable {
  @scala.inline
  def apply(resumable: Anon_Multipart = null, simple: Anon_Multipart = null): Anon_Resumable = {
    val __obj = js.Dynamic.literal()
    if (resumable != null) __obj.updateDynamic("resumable")(resumable.asInstanceOf[js.Any])
    if (simple != null) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Resumable]
  }
}

