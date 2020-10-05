package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaFlags extends js.Object {
  /**
    * Whether the media element can be rotated.
    */
  var canRotate: Boolean = js.native
  /**
    * Whether the media element's controls are toggleable.
    */
  var canToggleControls: Boolean = js.native
  /**
    * Whether the media element has audio.
    */
  var hasAudio: Boolean = js.native
  /**
    * Whether the media element has crashed.
    */
  var inError: Boolean = js.native
  /**
    * Whether the media element's controls are visible.
    */
  var isControlsVisible: Boolean = js.native
  /**
    * Whether the media element is looping.
    */
  var isLooping: Boolean = js.native
  /**
    * Whether the media element is muted.
    */
  var isMuted: Boolean = js.native
  /**
    * Whether the media element is paused.
    */
  var isPaused: Boolean = js.native
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
  @scala.inline
  implicit class MediaFlagsOps[Self <: MediaFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanRotate(value: Boolean): Self = this.set("canRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanToggleControls(value: Boolean): Self = this.set("canToggleControls", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasAudio(value: Boolean): Self = this.set("hasAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def setInError(value: Boolean): Self = this.set("inError", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsControlsVisible(value: Boolean): Self = this.set("isControlsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLooping(value: Boolean): Self = this.set("isLooping", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMuted(value: Boolean): Self = this.set("isMuted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPaused(value: Boolean): Self = this.set("isPaused", value.asInstanceOf[js.Any])
  }
  
}

