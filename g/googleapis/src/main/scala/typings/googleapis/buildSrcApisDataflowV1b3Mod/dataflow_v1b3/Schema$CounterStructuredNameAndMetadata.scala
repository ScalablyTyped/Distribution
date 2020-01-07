package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single message which encapsulates structured name and metadata for a
  * given counter.
  */
@js.native
trait Schema$CounterStructuredNameAndMetadata extends js.Object {
  /**
    * Metadata associated with a counter
    */
  var metadata: js.UndefOr[Schema$CounterMetadata] = js.native
  /**
    * Structured name of the counter.
    */
  var name: js.UndefOr[Schema$CounterStructuredName] = js.native
}

object Schema$CounterStructuredNameAndMetadata {
  @scala.inline
  def apply(metadata: Schema$CounterMetadata = null, name: Schema$CounterStructuredName = null): Schema$CounterStructuredNameAndMetadata = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CounterStructuredNameAndMetadata]
  }
}

