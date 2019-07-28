package typings.fullcalendar.srcTypesInputDashTypesMod

import typings.jquery.JQueryNs.AjaxNs.CompleteCallback
import typings.jquery.JQueryNs.AjaxNs.ErrorCallback
import typings.jquery.JQueryNs.AjaxNs.StatusCodeCallbacks
import typings.jquery.JQueryNs.AjaxNs.SuccessCallback
import typings.jquery.JQueryNs.AjaxNs.XHRFields
import typings.jquery.JQueryNs.AjaxSettings
import typings.jquery.JQueryNs.PlainObject
import typings.jquery.JQueryNs.TypeOrArray
import typings.jquery.JQueryNs.jqXHR
import typings.jquery.jqueryNumbers.`false`
import typings.jquery.jqueryNumbers.`true`
import typings.jquery.jqueryStrings.html
import typings.jquery.jqueryStrings.json
import typings.jquery.jqueryStrings.jsonp
import typings.jquery.jqueryStrings.script
import typings.jquery.jqueryStrings.text
import typings.jquery.jqueryStrings.xml
import typings.std.RegExp
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceExtendedInput
  extends AjaxSettings[js.Any]
     with EventOptionsBase {
  var allDayDefault: js.UndefOr[Boolean] = js.undefined
  var endParam: js.UndefOr[String] = js.undefined
  var eventDataTransform: js.UndefOr[js.Function1[/* eventData */ js.Any, EventObjectInput]] = js.undefined
  var events: js.UndefOr[EventSourceSimpleInput] = js.undefined
  var startParam: js.UndefOr[String] = js.undefined
}

object EventSourceExtendedInput {
  @scala.inline
  def apply(
    accepts: PlainObject[String] = null,
    allDayDefault: js.UndefOr[Boolean] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    beforeSend: js.ThisFunction2[js.Any, /* jqXHR */ jqXHR[_], EventSourceExtendedInput, `false` | Unit] = null,
    borderColor: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    className: String | js.Array[String] = null,
    color: String = null,
    complete: TypeOrArray[CompleteCallback[js.Any]] = null,
    constraint: ConstraintInput = null,
    contentType: String | `false` = null,
    contents: PlainObject[RegExp] = null,
    context: js.Any = null,
    converters: PlainObject[(js.Function1[/* value */ _, _]) | `true`] = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: PlainObject[_] | String = null,
    dataFilter: (/* data */ String, /* type */ String) => _ = null,
    dataType: xml | html | script | json | jsonp | text | String = null,
    durationEditable: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    endParam: String = null,
    error: TypeOrArray[ErrorCallback[js.Any]] = null,
    eventDataTransform: /* eventData */ js.Any => EventObjectInput = null,
    events: EventSourceSimpleInput = null,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[String | Null]] = null,
    ifModified: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    jsonp: String | `false` = null,
    jsonpCallback: String | (js.ThisFunction0[js.Any, String]) = null,
    method: String = null,
    mimeType: String = null,
    overlap: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    rendering: String = null,
    scriptCharset: String = null,
    startEditable: js.UndefOr[Boolean] = js.undefined,
    startParam: String = null,
    statusCode: StatusCodeCallbacks[js.Any] = null,
    success: TypeOrArray[SuccessCallback[js.Any]] = null,
    textColor: String = null,
    timeout: Int | Double = null,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    url: String = null,
    username: String = null,
    xhr: () => XMLHttpRequest = null,
    xhrFields: XHRFields = null
  ): EventSourceExtendedInput = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(allDayDefault)) __obj.updateDynamic("allDayDefault")(allDayDefault)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (context != null) __obj.updateDynamic("context")(context)
    if (converters != null) __obj.updateDynamic("converters")(converters)
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(js.Any.fromFunction2(dataFilter))
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (!js.isUndefined(durationEditable)) __obj.updateDynamic("durationEditable")(durationEditable)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (endParam != null) __obj.updateDynamic("endParam")(endParam)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (eventDataTransform != null) __obj.updateDynamic("eventDataTransform")(js.Any.fromFunction1(eventDataTransform))
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset)
    if (!js.isUndefined(startEditable)) __obj.updateDynamic("startEditable")(startEditable)
    if (startParam != null) __obj.updateDynamic("startParam")(startParam)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    if (xhr != null) __obj.updateDynamic("xhr")(js.Any.fromFunction0(xhr))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[EventSourceExtendedInput]
  }
}

