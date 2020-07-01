package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Targets extends js.Object {
  var source: js.UndefOr[String] = js.native
  var targets: js.UndefOr[js.Array[String]] = js.native
}

object Targets {
  @scala.inline
  def apply(source: String = null, targets: js.Array[String] = null): Targets = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targets]
  }
}

