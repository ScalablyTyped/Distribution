package typings
package expressDashBusboyLib.expressDashBusboyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressBusboyOptions
  extends connectDashBusboyLib.connectDashBusboyMod.ConnectBusboyOptions {
  var allowedPath: js.UndefOr[
    java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])
  ] = js.undefined
  var mimeTypeLimit: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var restrictMultiple: js.UndefOr[scala.Boolean] = js.undefined
  var upload: js.UndefOr[scala.Double] = js.undefined
}

object ExpressBusboyOptions {
  @scala.inline
  def apply(
    allowedPath: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]) = null,
    defCharset: java.lang.String = null,
    fileHwm: scala.Int | scala.Double = null,
    headers: js.Any = null,
    highWaterMark: scala.Int | scala.Double = null,
    immediate: js.UndefOr[scala.Boolean] = js.undefined,
    limits: busboyLib.Anon_FieldNameSize = null,
    mimeTypeLimit: java.lang.String | js.Array[java.lang.String] = null,
    path: java.lang.String = null,
    preservePath: js.UndefOr[scala.Boolean] = js.undefined,
    restrictMultiple: js.UndefOr[scala.Boolean] = js.undefined,
    upload: scala.Int | scala.Double = null
  ): ExpressBusboyOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedPath != null) __obj.updateDynamic("allowedPath")(allowedPath.asInstanceOf[js.Any])
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset)
    if (fileHwm != null) __obj.updateDynamic("fileHwm")(fileHwm.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (limits != null) __obj.updateDynamic("limits")(limits)
    if (mimeTypeLimit != null) __obj.updateDynamic("mimeTypeLimit")(mimeTypeLimit.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath)
    if (!js.isUndefined(restrictMultiple)) __obj.updateDynamic("restrictMultiple")(restrictMultiple)
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressBusboyOptions]
  }
}

