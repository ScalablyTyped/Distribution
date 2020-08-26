package typings.gapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  /**
    * Identifies the response for this request in the map of batch responses. If one is not provided, the system generates a random ID.
    */
  var id: String = js.native
  def callback(
    /**
    * is the response for this request only. Its format is defined by the API method being called.
    */
  individualResponse: js.Any,
    /**
    * is the raw batch ID-response map as a string. It contains all responses to all requests in the batch.
    */
  rawBatchResponse: js.Any
  ): js.Any = js.native
}

object Callback {
  @scala.inline
  def apply(callback: (js.Any, js.Any) => js.Any, id: String): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
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
    def setCallback(value: (js.Any, js.Any) => js.Any): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

