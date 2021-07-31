package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaFlags extends StObject {
  
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
  
  @scala.inline
  implicit class MediaFlagsMutableBuilder[Self <: MediaFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanRotate(value: Boolean): Self = StObject.set(x, "canRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanToggleControls(value: Boolean): Self = StObject.set(x, "canToggleControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInError(value: Boolean): Self = StObject.set(x, "inError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsControlsVisible(value: Boolean): Self = StObject.set(x, "isControlsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLooping(value: Boolean): Self = StObject.set(x, "isLooping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
  }
}
