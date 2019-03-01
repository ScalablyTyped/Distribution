package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information associated with the response to the operation. */
trait IFeedCallbackOptions extends js.Object {
  /** Opaque token for continuing the read feed or query. */
  var continuation: java.lang.String
  /** Comma delimited string containing the collection's current quota metrics (storage, number of stored procedure, triggers and UDFs) after completion of the operation. */
  var currentCollectionSizeInMB: java.lang.String
  /** Comma delimited string containing the collection's maximum quota metrics (storage, number of stored procedure, triggers and UDFs). */
  var maxCollectionSizeInMB: java.lang.String
}

object IFeedCallbackOptions {
  @scala.inline
  def apply(
    continuation: java.lang.String,
    currentCollectionSizeInMB: java.lang.String,
    maxCollectionSizeInMB: java.lang.String
  ): IFeedCallbackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("continuation")(continuation)
    __obj.updateDynamic("currentCollectionSizeInMB")(currentCollectionSizeInMB)
    __obj.updateDynamic("maxCollectionSizeInMB")(maxCollectionSizeInMB)
    __obj.asInstanceOf[IFeedCallbackOptions]
  }
}

