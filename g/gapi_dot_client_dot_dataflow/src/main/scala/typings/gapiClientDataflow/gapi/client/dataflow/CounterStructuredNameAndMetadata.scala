package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CounterStructuredNameAndMetadata extends js.Object {
  /** Metadata associated with a counter */
  var metadata: js.UndefOr[CounterMetadata] = js.native
  /** Structured name of the counter. */
  var name: js.UndefOr[CounterStructuredName] = js.native
}

object CounterStructuredNameAndMetadata {
  @scala.inline
  def apply(): CounterStructuredNameAndMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStructuredNameAndMetadata]
  }
  @scala.inline
  implicit class CounterStructuredNameAndMetadataOps[Self <: CounterStructuredNameAndMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetadata(value: CounterMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: CounterStructuredName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

