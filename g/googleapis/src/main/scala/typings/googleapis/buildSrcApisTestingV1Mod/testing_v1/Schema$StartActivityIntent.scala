package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A starting intent specified by an action, uri, and categories.
  */
@js.native
trait Schema$StartActivityIntent extends js.Object {
  /**
    * Action name. Required for START_ACTIVITY.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Intent categories to set on the intent.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * URI for the action.
    */
  var uri: js.UndefOr[String] = js.native
}

object Schema$StartActivityIntent {
  @scala.inline
  def apply(action: String = null, categories: js.Array[String] = null, uri: String = null): Schema$StartActivityIntent = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StartActivityIntent]
  }
}

