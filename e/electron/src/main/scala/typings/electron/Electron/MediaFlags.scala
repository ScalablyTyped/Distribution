package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaFlags extends js.Object {
  /**
    * Whether the media element can be rotated.
    */
  var canRotate: Boolean
  /**
    * Whether the media element's controls are toggleable.
    */
  var canToggleControls: Boolean
  /**
    * Whether the media element has audio.
    */
  var hasAudio: Boolean
  /**
    * Whether the media element has crashed.
    */
  var inError: Boolean
  /**
    * Whether the media element's controls are visible.
    */
  var isControlsVisible: Boolean
  /**
    * Whether the media element is looping.
    */
  var isLooping: Boolean
  /**
    * Whether the media element is muted.
    */
  var isMuted: Boolean
  /**
    * Whether the media element is paused.
    */
  var isPaused: Boolean
}

object MediaFlags {
  @scala.inline
  def apply(
    canRotate: Boolean,
    canToggleControls: Boolean,
    hasAudio: Boolean,
    inError: Boolean,
    isControlsVisible: Boolean,
    isLooping: Boolean,
    isMuted: Boolean,
    isPaused: Boolean
  ): MediaFlags = {
    val __obj = js.Dynamic.literal(canRotate = canRotate.asInstanceOf[js.Any], canToggleControls = canToggleControls.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], inError = inError.asInstanceOf[js.Any], isControlsVisible = isControlsVisible.asInstanceOf[js.Any], isLooping = isLooping.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFlags]
  }
}

