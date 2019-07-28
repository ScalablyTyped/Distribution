package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen extends js.Object {
  /** File reference of the png file. Required. */
  var fileReference: js.UndefOr[String] = js.undefined
  /** Locale of the device that the screenshot was taken on. Required. */
  var locale: js.UndefOr[String] = js.undefined
  /** Model of the device that the screenshot was taken on. Required. */
  var model: js.UndefOr[String] = js.undefined
  /** OS version of the device that the screenshot was taken on. Required. */
  var version: js.UndefOr[String] = js.undefined
}

object Screen {
  @scala.inline
  def apply(fileReference: String = null, locale: String = null, model: String = null, version: String = null): Screen = {
    val __obj = js.Dynamic.literal()
    if (fileReference != null) __obj.updateDynamic("fileReference")(fileReference)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (model != null) __obj.updateDynamic("model")(model)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Screen]
  }
}

