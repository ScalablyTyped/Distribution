package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PollItemsResponse extends js.Object {
  /**
    * Set of items from the queue available for connector to process. &lt;br
    * /&gt;These items have the following subset of fields populated: &lt;br
    * /&gt; &lt;br /&gt;version &lt;br /&gt;metadata.hash &lt;br
    * /&gt;structured_data.hash &lt;br /&gt;content.hash &lt;br /&gt;payload
    * &lt;br /&gt;status &lt;br /&gt;queue
    */
  var items: js.UndefOr[js.Array[Schema$Item]] = js.native
}

object Schema$PollItemsResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Item] = null): Schema$PollItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PollItemsResponse]
  }
}

