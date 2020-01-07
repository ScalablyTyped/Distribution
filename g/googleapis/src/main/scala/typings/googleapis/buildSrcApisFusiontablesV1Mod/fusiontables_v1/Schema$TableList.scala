package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of tables.
  */
@js.native
trait Schema$TableList extends js.Object {
  /**
    * List of all requested tables.
    */
  var items: js.UndefOr[js.Array[Schema$Table]] = js.native
  /**
    * Type name: a list of all tables.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$TableList {
  @scala.inline
  def apply(items: js.Array[Schema$Table] = null, kind: String = null, nextPageToken: String = null): Schema$TableList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableList]
  }
}

