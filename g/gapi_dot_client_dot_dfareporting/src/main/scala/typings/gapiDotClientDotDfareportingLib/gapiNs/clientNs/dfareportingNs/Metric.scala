package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  /** The kind of resource this is, in this case dfareporting#metric. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The metric name, e.g. dfa:impressions */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Metric {
  @scala.inline
  def apply(kind: java.lang.String = null, name: java.lang.String = null): Metric = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Metric]
  }
}

