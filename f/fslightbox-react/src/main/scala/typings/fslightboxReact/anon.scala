package typings.fslightboxReact

import typings.fslightboxReact.mod.ToolbarButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    var close: js.UndefOr[ToolbarButtonProps] = js.undefined
    
    var fullscreen: Enter
    
    var slideshow: Pause
    
    var thumbs: js.UndefOr[ToolbarButtonProps] = js.undefined
    
    var zoomIn: js.UndefOr[ToolbarButtonProps] = js.undefined
    
    var zoomOut: js.UndefOr[ToolbarButtonProps] = js.undefined
  }
  object Close {
    
    inline def apply(fullscreen: Enter, slideshow: Pause): Close = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], slideshow = slideshow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      inline def setClose(value: ToolbarButtonProps): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setFullscreen(value: Enter): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setSlideshow(value: Pause): Self = StObject.set(x, "slideshow", value.asInstanceOf[js.Any])
      
      inline def setThumbs(value: ToolbarButtonProps): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
      
      inline def setThumbsUndefined: Self = StObject.set(x, "thumbs", js.undefined)
      
      inline def setZoomIn(value: ToolbarButtonProps): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
      
      inline def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
      
      inline def setZoomOut(value: ToolbarButtonProps): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
      
      inline def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
    }
  }
  
  trait Enter extends StObject {
    
    var enter: js.UndefOr[ToolbarButtonProps] = js.undefined
    
    var exit: js.UndefOr[ToolbarButtonProps] = js.undefined
  }
  object Enter {
    
    inline def apply(): Enter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enter] (val x: Self) extends AnyVal {
      
      inline def setEnter(value: ToolbarButtonProps): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: ToolbarButtonProps): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
  
  trait Next extends StObject {
    
    var next: js.UndefOr[ToolbarButtonProps] = js.undefined
    
    var previous: js.UndefOr[ToolbarButtonProps] = js.undefined
  }
  object Next {
    
    inline def apply(): Next = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Next]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
      
      inline def setNext(value: ToolbarButtonProps): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrevious(value: ToolbarButtonProps): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  trait Pause extends StObject {
    
    var pause: js.UndefOr[ToolbarButtonProps] = js.undefined
    
    var start: js.UndefOr[ToolbarButtonProps] = js.undefined
  }
  object Pause {
    
    inline def apply(): Pause = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pause]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pause] (val x: Self) extends AnyVal {
      
      inline def setPause(value: ToolbarButtonProps): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setStart(value: ToolbarButtonProps): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait SlideButtons extends StObject {
    
    var slideButtons: js.UndefOr[Next] = js.undefined
    
    var toolbarButtons: js.UndefOr[Close] = js.undefined
  }
  object SlideButtons {
    
    inline def apply(): SlideButtons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideButtons]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlideButtons] (val x: Self) extends AnyVal {
      
      inline def setSlideButtons(value: Next): Self = StObject.set(x, "slideButtons", value.asInstanceOf[js.Any])
      
      inline def setSlideButtonsUndefined: Self = StObject.set(x, "slideButtons", js.undefined)
      
      inline def setToolbarButtons(value: Close): Self = StObject.set(x, "toolbarButtons", value.asInstanceOf[js.Any])
      
      inline def setToolbarButtonsUndefined: Self = StObject.set(x, "toolbarButtons", js.undefined)
    }
  }
}
