package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidRuntimeConfiguration extends js.Object {
  /**
    * The set of available locales.
    * @OutputOnly
    */
  var locales: js.UndefOr[js.Array[Locale]] = js.undefined
  /**
    * The set of available orientations.
    * @OutputOnly
    */
  var orientations: js.UndefOr[js.Array[Orientation]] = js.undefined
}

object AndroidRuntimeConfiguration {
  @scala.inline
  def apply(locales: js.Array[Locale] = null, orientations: js.Array[Orientation] = null): AndroidRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (orientations != null) __obj.updateDynamic("orientations")(orientations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidRuntimeConfiguration]
  }
}

