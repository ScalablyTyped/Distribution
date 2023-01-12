package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaFlags extends StObject {
  
  /**
    * Whether the media element can be looped.
    */
  var canLoop: Boolean
  
  /**
    * Whether the media element can be printed.
    */
  var canPrint: Boolean
  
  /**
    * Whether the media element can be rotated.
    */
  var canRotate: Boolean
  
  /**
    * Whether or not the media element can be downloaded.
    */
  var canSave: Boolean
  
  /**
    * Whether the media element can show picture-in-picture.
    */
  var canShowPictureInPicture: Boolean
  
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
  
  /**
    * Whether the media element is currently showing picture-in-picture.
    */
  var isShowingPictureInPicture: Boolean
}
object MediaFlags {
  
  inline def apply(
    canLoop: Boolean,
    canPrint: Boolean,
    canRotate: Boolean,
    canSave: Boolean,
    canShowPictureInPicture: Boolean,
    canToggleControls: Boolean,
    hasAudio: Boolean,
    inError: Boolean,
    isControlsVisible: Boolean,
    isLooping: Boolean,
    isMuted: Boolean,
    isPaused: Boolean,
    isShowingPictureInPicture: Boolean
  ): MediaFlags = {
    val __obj = js.Dynamic.literal(canLoop = canLoop.asInstanceOf[js.Any], canPrint = canPrint.asInstanceOf[js.Any], canRotate = canRotate.asInstanceOf[js.Any], canSave = canSave.asInstanceOf[js.Any], canShowPictureInPicture = canShowPictureInPicture.asInstanceOf[js.Any], canToggleControls = canToggleControls.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], inError = inError.asInstanceOf[js.Any], isControlsVisible = isControlsVisible.asInstanceOf[js.Any], isLooping = isLooping.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], isShowingPictureInPicture = isShowingPictureInPicture.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaFlags] (val x: Self) extends AnyVal {
    
    inline def setCanLoop(value: Boolean): Self = StObject.set(x, "canLoop", value.asInstanceOf[js.Any])
    
    inline def setCanPrint(value: Boolean): Self = StObject.set(x, "canPrint", value.asInstanceOf[js.Any])
    
    inline def setCanRotate(value: Boolean): Self = StObject.set(x, "canRotate", value.asInstanceOf[js.Any])
    
    inline def setCanSave(value: Boolean): Self = StObject.set(x, "canSave", value.asInstanceOf[js.Any])
    
    inline def setCanShowPictureInPicture(value: Boolean): Self = StObject.set(x, "canShowPictureInPicture", value.asInstanceOf[js.Any])
    
    inline def setCanToggleControls(value: Boolean): Self = StObject.set(x, "canToggleControls", value.asInstanceOf[js.Any])
    
    inline def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    inline def setInError(value: Boolean): Self = StObject.set(x, "inError", value.asInstanceOf[js.Any])
    
    inline def setIsControlsVisible(value: Boolean): Self = StObject.set(x, "isControlsVisible", value.asInstanceOf[js.Any])
    
    inline def setIsLooping(value: Boolean): Self = StObject.set(x, "isLooping", value.asInstanceOf[js.Any])
    
    inline def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
    
    inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
    
    inline def setIsShowingPictureInPicture(value: Boolean): Self = StObject.set(x, "isShowingPictureInPicture", value.asInstanceOf[js.Any])
  }
}
