package typings.firebaseFirestore.syncEngineMod

import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.typesMod.TargetId
import typings.firebaseFirestore.viewMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * QueryView contains all of the data that SyncEngine needs to keep track of for
  * a particular query.
  */
trait QueryView extends js.Object {
  /**
    * The query itself.
    */
  var query: Query
  /**
    * The target number created by the client that is used in the watch
    * stream to identify this query.
    */
  var targetId: TargetId
  /**
    * The view is responsible for computing the final merged truth of what
    * docs are in the query. It gets notified of local and remote changes,
    * and applies the query filters and limits to determine the most correct
    * possible results.
    */
  var view: View
}

object QueryView {
  @scala.inline
  def apply(query: Query, targetId: TargetId, view: View): QueryView = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryView]
  }
}

