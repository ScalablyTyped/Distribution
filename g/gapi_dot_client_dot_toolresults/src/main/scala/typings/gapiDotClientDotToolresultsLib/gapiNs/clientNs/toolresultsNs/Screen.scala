package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen extends js.Object {
  /** File reference of the png file. Required. */
  var fileReference: js.UndefOr[java.lang.String] = js.undefined
  /** Locale of the device that the screenshot was taken on. Required. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Model of the device that the screenshot was taken on. Required. */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /** OS version of the device that the screenshot was taken on. Required. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Screen {
  @scala.inline
  def apply(
    fileReference: java.lang.String = null,
    locale: java.lang.String = null,
    model: java.lang.String = null,
    version: java.lang.String = null
  ): Screen = {
    val __obj = js.Dynamic.literal()
    if (fileReference != null) __obj.updateDynamic("fileReference")(fileReference)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (model != null) __obj.updateDynamic("model")(model)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Screen]
  }
}

