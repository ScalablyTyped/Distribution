package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  /** The kind of resource this is, in this case dfareporting#dimension. */
  var kind: js.UndefOr[String] = js.undefined
  /** The dimension name, e.g. dfa:advertiser */
  var name: js.UndefOr[String] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(kind: String = null, name: String = null): Dimension = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
}

