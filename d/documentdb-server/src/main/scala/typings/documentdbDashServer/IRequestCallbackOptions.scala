package typings.documentdbDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information associated with the response to the operation. */
trait IRequestCallbackOptions extends js.Object {
  /** Comma delimited string containing the collection's current quota metrics (storage, number of stored procedure, triggers and UDFs) after completion of the operation. */
  var currentCollectionSizeInMB: String
  /** Comma delimited string containing the collection's maximum quota metrics (storage, number of stored procedure, triggers and UDFs). */
  var maxCollectionSizeInMB: String
  /** Set to true if the requested resource has not been modified compared to the provided ETag in the ifNoneMatch parameter for a read request. */
  var notModified: Boolean
}

object IRequestCallbackOptions {
  @scala.inline
  def apply(currentCollectionSizeInMB: String, maxCollectionSizeInMB: String, notModified: Boolean): IRequestCallbackOptions = {
    val __obj = js.Dynamic.literal(currentCollectionSizeInMB = currentCollectionSizeInMB, maxCollectionSizeInMB = maxCollectionSizeInMB, notModified = notModified)
  
    __obj.asInstanceOf[IRequestCallbackOptions]
  }
}

