package typings.expoStatusBarHeight

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@expo/status-bar-height", JSImport.Default)
  @js.native
  val default: StatusBarHeight = js.native
  
  @JSImport("@expo/status-bar-height", "StatusBarHeight")
  @js.native
  class StatusBarHeight () extends StObject {
    
    /**
      * Add 'willChange' event listener
      */
    def addEventListener(handler: StatusBarHeightHandler): Unit = js.native
    
    /**
      * Get the current status bar height
      */
    def getAsync(): js.Promise[Double] = js.native
    
    /**
      * Remove 'willChange' event listener
      */
    def removeEventListener(handler: StatusBarHeightHandler): Unit = js.native
  }
  
  type StatusBarHeightHandler = js.Function1[/* height */ Double, Unit]
  
  type _To = StatusBarHeight
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: StatusBarHeight = default
}
