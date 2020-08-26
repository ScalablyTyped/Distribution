package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information associated with the response to the operation. */
@js.native
trait IFeedCallbackOptions extends js.Object {
  /** Opaque token for continuing the read feed or query. */
  var continuation: String = js.native
  /** Comma delimited string containing the collection's current quota metrics (storage, number of stored procedure, triggers and UDFs) after completion of the operation. */
  var currentCollectionSizeInMB: String = js.native
  /** Comma delimited string containing the collection's maximum quota metrics (storage, number of stored procedure, triggers and UDFs). */
  var maxCollectionSizeInMB: String = js.native
}

object IFeedCallbackOptions {
  @scala.inline
  def apply(continuation: String, currentCollectionSizeInMB: String, maxCollectionSizeInMB: String): IFeedCallbackOptions = {
    val __obj = js.Dynamic.literal(continuation = continuation.asInstanceOf[js.Any], currentCollectionSizeInMB = currentCollectionSizeInMB.asInstanceOf[js.Any], maxCollectionSizeInMB = maxCollectionSizeInMB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFeedCallbackOptions]
  }
  @scala.inline
  implicit class IFeedCallbackOptionsOps[Self <: IFeedCallbackOptions] (val x: Self) extends AnyVal {
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
    def setContinuation(value: String): Self = this.set("continuation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentCollectionSizeInMB(value: String): Self = this.set("currentCollectionSizeInMB", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxCollectionSizeInMB(value: String): Self = this.set("maxCollectionSizeInMB", value.asInstanceOf[js.Any])
  }
  
}

