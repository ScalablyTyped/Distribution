package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterStructuredNameAndMetadata extends js.Object {
  /** Metadata associated with a counter */
  var metadata: js.UndefOr[CounterMetadata] = js.undefined
  /** Structured name of the counter. */
  var name: js.UndefOr[CounterStructuredName] = js.undefined
}

object CounterStructuredNameAndMetadata {
  @scala.inline
  def apply(metadata: CounterMetadata = null, name: CounterStructuredName = null): CounterStructuredNameAndMetadata = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CounterStructuredNameAndMetadata]
  }
}

