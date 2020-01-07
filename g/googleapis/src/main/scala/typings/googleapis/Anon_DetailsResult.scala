package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DetailsResult extends js.Object {
  var details: js.UndefOr[js.Array[Anon_Args]] = js.native
  var result: js.UndefOr[Anon_Args] = js.native
}

object Anon_DetailsResult {
  @scala.inline
  def apply(details: js.Array[Anon_Args] = null, result: Anon_Args = null): Anon_DetailsResult = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DetailsResult]
  }
}

