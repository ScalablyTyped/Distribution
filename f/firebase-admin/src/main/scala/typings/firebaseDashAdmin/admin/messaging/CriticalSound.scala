package typings.firebaseDashAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a critical sound configuration that can be included in the
  * `aps` dictionary of an APNs payload.
  */
trait CriticalSound extends js.Object {
  /**
    * The critical alert flag. Set to `true` to enable the critical alert.
    */
  var critical: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of a sound file in the app's main bundle or in the `Library/Sounds`
    * folder of the app's container directory. Specify the string "default" to play
    * the system sound.
    */
  var name: String
  /**
    * The volume for the critical alert's sound. Must be a value between 0.0
    * (silent) and 1.0 (full volume).
    */
  var volume: js.UndefOr[Double] = js.undefined
}

object CriticalSound {
  @scala.inline
  def apply(name: String, critical: js.UndefOr[Boolean] = js.undefined, volume: Int | Double = null): CriticalSound = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[CriticalSound]
  }
}

