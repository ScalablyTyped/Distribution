package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaFlags extends js.Object {
  /**
    * Whether the media element can be rotated.
    */
  var canRotate: scala.Boolean
  /**
    * Whether the media element's controls are toggleable.
    */
  var canToggleControls: scala.Boolean
  /**
    * Whether the media element has audio.
    */
  var hasAudio: scala.Boolean
  /**
    * Whether the media element has crashed.
    */
  var inError: scala.Boolean
  /**
    * Whether the media element's controls are visible.
    */
  var isControlsVisible: scala.Boolean
  /**
    * Whether the media element is looping.
    */
  var isLooping: scala.Boolean
  /**
    * Whether the media element is muted.
    */
  var isMuted: scala.Boolean
  /**
    * Whether the media element is paused.
    */
  var isPaused: scala.Boolean
}

object MediaFlags {
  @scala.inline
  def apply(
    canRotate: scala.Boolean,
    canToggleControls: scala.Boolean,
    hasAudio: scala.Boolean,
    inError: scala.Boolean,
    isControlsVisible: scala.Boolean,
    isLooping: scala.Boolean,
    isMuted: scala.Boolean,
    isPaused: scala.Boolean
  ): MediaFlags = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canRotate")(canRotate)
    __obj.updateDynamic("canToggleControls")(canToggleControls)
    __obj.updateDynamic("hasAudio")(hasAudio)
    __obj.updateDynamic("inError")(inError)
    __obj.updateDynamic("isControlsVisible")(isControlsVisible)
    __obj.updateDynamic("isLooping")(isLooping)
    __obj.updateDynamic("isMuted")(isMuted)
    __obj.updateDynamic("isPaused")(isPaused)
    __obj.asInstanceOf[MediaFlags]
  }
}

