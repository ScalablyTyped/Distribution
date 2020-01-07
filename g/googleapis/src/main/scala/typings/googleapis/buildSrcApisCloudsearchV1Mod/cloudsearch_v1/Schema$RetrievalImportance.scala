package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RetrievalImportance extends js.Object {
  /**
    * Indicates the ranking importance given to property when it is matched
    * during retrieval. Once set, the token importance of a property cannot be
    * changed.
    */
  var importance: js.UndefOr[String] = js.native
}

object Schema$RetrievalImportance {
  @scala.inline
  def apply(importance: String = null): Schema$RetrievalImportance = {
    val __obj = js.Dynamic.literal()
    if (importance != null) __obj.updateDynamic("importance")(importance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RetrievalImportance]
  }
}

