package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyValue extends js.Object {
  /** A property. */
  var property: js.UndefOr[java.lang.String] = js.undefined
  /** The property's value. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object PropertyValue {
  @scala.inline
  def apply(property: java.lang.String = null, value: java.lang.String = null): PropertyValue = {
    val __obj = js.Dynamic.literal()
    if (property != null) __obj.updateDynamic("property")(property)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PropertyValue]
  }
}

