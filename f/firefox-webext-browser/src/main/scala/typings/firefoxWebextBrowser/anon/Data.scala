package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.activityLog.UndefinedType
import typings.firefoxWebextBrowser.browser.activityLog.UndefinedViewType
import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Args
  /** The name of the api call or event, or the script url if this is a content or user script event. */
  var name: String
  /** The date string when this call is triggered. */
  var timeStamp: Date
  /**
    * The type of log entry. api_call is a function call made by the extension and api_event is an event callback
    * to the extension. content_script is logged when a content script is injected.
    */
  var `type`: UndefinedType
  /** The type of view where the activity occurred. Content scripts will not have a viewType. */
  var viewType: js.UndefOr[UndefinedViewType] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    data: Args,
    name: String,
    timeStamp: Date,
    `type`: UndefinedType,
    viewType: UndefinedViewType = null
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

