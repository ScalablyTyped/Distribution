package typings.documentdbDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information associated with the response to the operation. */
trait IFeedCallbackOptions extends js.Object {
  /** Opaque token for continuing the read feed or query. */
  var continuation: String
  /** Comma delimited string containing the collection's current quota metrics (storage, number of stored procedure, triggers and UDFs) after completion of the operation. */
  var currentCollectionSizeInMB: String
  /** Comma delimited string containing the collection's maximum quota metrics (storage, number of stored procedure, triggers and UDFs). */
  var maxCollectionSizeInMB: String
}

object IFeedCallbackOptions {
  @scala.inline
  def apply(continuation: String, currentCollectionSizeInMB: String, maxCollectionSizeInMB: String): IFeedCallbackOptions = {
    val __obj = js.Dynamic.literal(continuation = continuation.asInstanceOf[js.Any], currentCollectionSizeInMB = currentCollectionSizeInMB.asInstanceOf[js.Any], maxCollectionSizeInMB = maxCollectionSizeInMB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFeedCallbackOptions]
  }
}

