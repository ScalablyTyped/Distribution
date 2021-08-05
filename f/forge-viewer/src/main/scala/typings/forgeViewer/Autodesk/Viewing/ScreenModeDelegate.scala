package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenModeDelegate extends StObject {
  
  def doScreenModeChange(oldMode: ScreenMode, newMode: ScreenMode): Unit
  
  def fullscreenEventListener(): Unit
  
  def getEscapeMode(): js.UndefOr[ScreenMode]
  
  def getMode(): ScreenMode
  
  def getNextMode(): js.UndefOr[ScreenMode]
  
  def isModeSupported(mode: ScreenMode): Boolean
  
  def onScreenModeChanged(oldMode: ScreenMode, newMode: ScreenMode): Unit
  
  def setMode(mode: ScreenMode): Boolean
  
  def uninitialize(): Unit
}
object ScreenModeDelegate {
  
  inline def apply(
    doScreenModeChange: (ScreenMode, ScreenMode) => Unit,
    fullscreenEventListener: () => Unit,
    getEscapeMode: () => js.UndefOr[ScreenMode],
    getMode: () => ScreenMode,
    getNextMode: () => js.UndefOr[ScreenMode],
    isModeSupported: ScreenMode => Boolean,
    onScreenModeChanged: (ScreenMode, ScreenMode) => Unit,
    setMode: ScreenMode => Boolean,
    uninitialize: () => Unit
  ): ScreenModeDelegate = {
    val __obj = js.Dynamic.literal(doScreenModeChange = js.Any.fromFunction2(doScreenModeChange), fullscreenEventListener = js.Any.fromFunction0(fullscreenEventListener), getEscapeMode = js.Any.fromFunction0(getEscapeMode), getMode = js.Any.fromFunction0(getMode), getNextMode = js.Any.fromFunction0(getNextMode), isModeSupported = js.Any.fromFunction1(isModeSupported), onScreenModeChanged = js.Any.fromFunction2(onScreenModeChanged), setMode = js.Any.fromFunction1(setMode), uninitialize = js.Any.fromFunction0(uninitialize))
    __obj.asInstanceOf[ScreenModeDelegate]
  }
  
  extension [Self <: ScreenModeDelegate](x: Self) {
    
    inline def setDoScreenModeChange(value: (ScreenMode, ScreenMode) => Unit): Self = StObject.set(x, "doScreenModeChange", js.Any.fromFunction2(value))
    
    inline def setFullscreenEventListener(value: () => Unit): Self = StObject.set(x, "fullscreenEventListener", js.Any.fromFunction0(value))
    
    inline def setGetEscapeMode(value: () => js.UndefOr[ScreenMode]): Self = StObject.set(x, "getEscapeMode", js.Any.fromFunction0(value))
    
    inline def setGetMode(value: () => ScreenMode): Self = StObject.set(x, "getMode", js.Any.fromFunction0(value))
    
    inline def setGetNextMode(value: () => js.UndefOr[ScreenMode]): Self = StObject.set(x, "getNextMode", js.Any.fromFunction0(value))
    
    inline def setIsModeSupported(value: ScreenMode => Boolean): Self = StObject.set(x, "isModeSupported", js.Any.fromFunction1(value))
    
    inline def setOnScreenModeChanged(value: (ScreenMode, ScreenMode) => Unit): Self = StObject.set(x, "onScreenModeChanged", js.Any.fromFunction2(value))
    
    inline def setSetMode(value: ScreenMode => Boolean): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
    
    inline def setUninitialize(value: () => Unit): Self = StObject.set(x, "uninitialize", js.Any.fromFunction0(value))
  }
}
