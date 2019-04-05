package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  var childOf: js.UndefOr[Transaction | Span | java.lang.String] = js.undefined
  var startTime: js.UndefOr[scala.Double] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(childOf: Transaction | Span | java.lang.String = null, startTime: scala.Int | scala.Double = null): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (childOf != null) __obj.updateDynamic("childOf")(childOf.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionOptions]
  }
}

