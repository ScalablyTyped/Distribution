package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.activityLog._UndefinedType
import typings.firefoxDashWebextDashBrowser.browser.activityLog._UndefinedViewType
import typings.firefoxDashWebextDashBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Anon_Args
  /** The name of the api call or event, or the script url if this is a content or user script event. */
  var name: String
  /** The date string when this call is triggered. */
  var timeStamp: Date
  /**
    * The type of log entry. api_call is a function call made by the extension and api_event is an event callback
    * to the extension. content_script is logged when a content script is injected.
    */
  var `type`: _UndefinedType
  /** The type of view where the activity occurred. Content scripts will not have a viewType. */
  var viewType: js.UndefOr[_UndefinedViewType] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    data: Anon_Args,
    name: String,
    timeStamp: Date,
    `type`: _UndefinedType,
    viewType: _UndefinedViewType = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, name = name, timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (viewType != null) __obj.updateDynamic("viewType")(viewType)
    __obj.asInstanceOf[Anon_Data]
  }
}

