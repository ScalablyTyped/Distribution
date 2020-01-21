package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServingRestriction extends js.Object {
  /** The contexts for the restriction. */
  var contexts: js.UndefOr[js.Array[ServingContext]] = js.undefined
  /**
    * Any disapprovals bound to this restriction.
    * Only present if status=DISAPPROVED.
    * Can be used to filter the response of the
    * creatives.list
    * method.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Disapproval]] = js.undefined
  /**
    * The status of the creative in this context (for example, it has been
    * explicitly disapproved or is pending review).
    */
  var status: js.UndefOr[String] = js.undefined
}

object ServingRestriction {
  @scala.inline
  def apply(
    contexts: js.Array[ServingContext] = null,
    disapprovalReasons: js.Array[Disapproval] = null,
    status: String = null
  ): ServingRestriction = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (disapprovalReasons != null) __obj.updateDynamic("disapprovalReasons")(disapprovalReasons.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServingRestriction]
  }
}

