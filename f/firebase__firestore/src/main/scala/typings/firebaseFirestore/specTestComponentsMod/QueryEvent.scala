package typings.firebaseFirestore.specTestComponentsMod

import typings.firebaseFirestore.errorMod.FirestoreError
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryEvent extends js.Object {
  var error: js.UndefOr[FirestoreError] = js.undefined
  var query: Query
  var view: js.UndefOr[ViewSnapshot] = js.undefined
}

object QueryEvent {
  @scala.inline
  def apply(query: Query, error: FirestoreError = null, view: ViewSnapshot = null): QueryEvent = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEvent]
  }
}

