package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetReference extends js.Object {
  var target: js.UndefOr[String] = js.native
}

object SchemaTargetReference {
  @scala.inline
  def apply(target: String = null): SchemaTargetReference = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetReference]
  }
}

