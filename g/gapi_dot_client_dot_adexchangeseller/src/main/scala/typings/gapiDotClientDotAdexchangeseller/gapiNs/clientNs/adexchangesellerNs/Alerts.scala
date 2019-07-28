package typings.gapiDotClientDotAdexchangeseller.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alerts extends js.Object {
  /** The alerts returned in this list response. */
  var items: js.UndefOr[js.Array[Alert]] = js.undefined
  /** Kind of list this is, in this case adexchangeseller#alerts. */
  var kind: js.UndefOr[String] = js.undefined
}

object Alerts {
  @scala.inline
  def apply(items: js.Array[Alert] = null, kind: String = null): Alerts = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Alerts]
  }
}

