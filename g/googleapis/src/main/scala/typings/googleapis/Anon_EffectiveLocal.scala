package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EffectiveLocal extends js.Object {
  var effective: js.UndefOr[js.Array[String]] = js.native
  var local: js.UndefOr[js.Array[String]] = js.native
}

object Anon_EffectiveLocal {
  @scala.inline
  def apply(effective: js.Array[String] = null, local: js.Array[String] = null): Anon_EffectiveLocal = {
    val __obj = js.Dynamic.literal()
    if (effective != null) __obj.updateDynamic("effective")(effective.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EffectiveLocal]
  }
}

