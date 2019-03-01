package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameAndKind extends js.Object {
  /** Counter aggregation kind. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the counter. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object NameAndKind {
  @scala.inline
  def apply(kind: java.lang.String = null, name: java.lang.String = null): NameAndKind = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[NameAndKind]
  }
}

