package typings
package gapiDotClientDotTranslateLib.gapiNs.clientNs.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSupportedLanguagesRequest extends js.Object {
  /**
    * The language to use to return localized, human readable names of supported
    * languages.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object GetSupportedLanguagesRequest {
  @scala.inline
  def apply(target: java.lang.String = null): GetSupportedLanguagesRequest = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[GetSupportedLanguagesRequest]
  }
}

