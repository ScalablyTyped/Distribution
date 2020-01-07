package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource definition for Gmail filters. Filters apply to specific messages
  * instead of an entire email thread.
  */
@js.native
trait Schema$Filter extends js.Object {
  /**
    * Action that the filter performs.
    */
  var action: js.UndefOr[Schema$FilterAction] = js.native
  /**
    * Matching criteria for the filter.
    */
  var criteria: js.UndefOr[Schema$FilterCriteria] = js.native
  /**
    * The server assigned ID of the filter.
    */
  var id: js.UndefOr[String] = js.native
}

object Schema$Filter {
  @scala.inline
  def apply(action: Schema$FilterAction = null, criteria: Schema$FilterCriteria = null, id: String = null): Schema$Filter = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Filter]
  }
}

