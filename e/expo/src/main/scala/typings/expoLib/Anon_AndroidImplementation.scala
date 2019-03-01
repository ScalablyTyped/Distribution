package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AndroidImplementation
  extends expoLib.expoMod.PlaybackStatus {
  var androidImplementation: js.UndefOr[java.lang.String] = js.undefined
  /** Populated exactly once when an error forces the object to unload. */
  var error: js.UndefOr[java.lang.String] = js.undefined
  var isLoaded: expoLib.expoLibNumbers.`false`
}

object Anon_AndroidImplementation {
  @scala.inline
  def apply(
    isLoaded: expoLib.expoLibNumbers.`false`,
    androidImplementation: java.lang.String = null,
    error: java.lang.String = null
  ): Anon_AndroidImplementation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isLoaded")(isLoaded)
    if (androidImplementation != null) __obj.updateDynamic("androidImplementation")(androidImplementation)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_AndroidImplementation]
  }
}

