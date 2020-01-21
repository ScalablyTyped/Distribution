package typings.expressBusboy.mod

import typings.busboy.AnonFieldNameSize
import typings.connectBusboy.mod.ConnectBusboyOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressBusboyOptions extends ConnectBusboyOptions {
  var allowedPath: js.UndefOr[String | RegExp | (js.Function1[/* url */ String, Boolean])] = js.undefined
  var mimeTypeLimit: js.UndefOr[String | js.Array[String]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var restrictMultiple: js.UndefOr[Boolean] = js.undefined
  var upload: js.UndefOr[Boolean] = js.undefined
}

object ExpressBusboyOptions {
  @scala.inline
  def apply(
    allowedPath: String | RegExp | (js.Function1[/* url */ String, Boolean]) = null,
    defCharset: String = null,
    fileHwm: Int | Double = null,
    headers: js.Any = null,
    highWaterMark: Int | Double = null,
    immediate: js.UndefOr[Boolean] = js.undefined,
    limits: AnonFieldNameSize = null,
    mimeTypeLimit: String | js.Array[String] = null,
    path: String = null,
    preservePath: js.UndefOr[Boolean] = js.undefined,
    restrictMultiple: js.UndefOr[Boolean] = js.undefined,
    upload: js.UndefOr[Boolean] = js.undefined
  ): ExpressBusboyOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedPath != null) __obj.updateDynamic("allowedPath")(allowedPath.asInstanceOf[js.Any])
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset.asInstanceOf[js.Any])
    if (fileHwm != null) __obj.updateDynamic("fileHwm")(fileHwm.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (mimeTypeLimit != null) __obj.updateDynamic("mimeTypeLimit")(mimeTypeLimit.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictMultiple)) __obj.updateDynamic("restrictMultiple")(restrictMultiple.asInstanceOf[js.Any])
    if (!js.isUndefined(upload)) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressBusboyOptions]
  }
}

