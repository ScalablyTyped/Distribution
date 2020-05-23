package typings.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  /**
    * The write time as set by the Firestore servers.
    */
  val writeTime: Timestamp
  /**
    * Returns true if this `WriteResult` is equal to the provided one.
    *
    * @param other The `WriteResult` to compare against.
    * @return true if this `WriteResult` is equal to the provided one.
    */
  def isEqual(other: WriteResult): Boolean
}

object WriteResult {
  @scala.inline
  def apply(isEqual: WriteResult => Boolean, writeTime: Timestamp): WriteResult = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), writeTime = writeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
}

