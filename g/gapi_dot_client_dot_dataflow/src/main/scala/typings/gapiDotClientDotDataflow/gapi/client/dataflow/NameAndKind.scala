package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameAndKind extends js.Object {
  /** Counter aggregation kind. */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of the counter. */
  var name: js.UndefOr[String] = js.undefined
}

object NameAndKind {
  @scala.inline
  def apply(kind: String = null, name: String = null): NameAndKind = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameAndKind]
  }
}

