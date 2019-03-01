package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniversalAdId extends js.Object {
  /** Registry used for the Ad ID value. */
  var registry: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID value for this creative. Only alphanumeric characters and the following symbols are valid: "_/\-". Maximum length is 64 characters. Read only when
    * registry is DCM.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object UniversalAdId {
  @scala.inline
  def apply(registry: java.lang.String = null, value: java.lang.String = null): UniversalAdId = {
    val __obj = js.Dynamic.literal()
    if (registry != null) __obj.updateDynamic("registry")(registry)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UniversalAdId]
  }
}

