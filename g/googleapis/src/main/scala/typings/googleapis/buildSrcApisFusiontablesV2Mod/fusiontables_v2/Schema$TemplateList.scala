package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of templates for a given table.
  */
@js.native
trait Schema$TemplateList extends js.Object {
  /**
    * List of all requested templates.
    */
  var items: js.UndefOr[js.Array[Schema$Template]] = js.native
  /**
    * The kind of item this is. For a template list, this is always
    * fusiontables#templateList .
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Total number of templates for the table.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object Schema$TemplateList {
  @scala.inline
  def apply(
    items: js.Array[Schema$Template] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): Schema$TemplateList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TemplateList]
  }
}

