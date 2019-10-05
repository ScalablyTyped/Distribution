package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  /** The kind of resource this is, in this case dfareporting#metric. */
  var kind: js.UndefOr[String] = js.undefined
  /** The metric name, e.g. dfa:impressions */
  var name: js.UndefOr[String] = js.undefined
}

object Metric {
  @scala.inline
  def apply(kind: String = null, name: String = null): Metric = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Metric]
  }
}

