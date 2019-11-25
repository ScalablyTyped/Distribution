package typings.atGoogleDashCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleDashCloudFirestore.atGoogleDashCloudFirestoreStrings.added
  - typings.atGoogleDashCloudFirestore.atGoogleDashCloudFirestoreStrings.removed
  - typings.atGoogleDashCloudFirestore.atGoogleDashCloudFirestoreStrings.modified
*/
trait DocumentChangeType extends js.Object

object DocumentChangeType {
  @scala.inline
  def added: typings.atGoogleDashCloudFirestore.atGoogleDashCloudFirestoreStrings.added = this.cast("added")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def modified: typings.atGoogleDashCloudFirestore.atGoogleDashCloudFirestoreStrings.modified = this.cast("modified")
  @scala.inline
  def removed: typings.atGoogleDashCloudFirestore.atGoogleDashCloudFirestoreStrings.removed = this.cast("removed")
}

