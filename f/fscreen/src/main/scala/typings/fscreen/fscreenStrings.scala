package typings.fscreen

import typings.fscreen.mod.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fscreenStrings {
  
  @js.native
  sealed trait exitFullscreen
    extends StObject
       with EventName
  inline def exitFullscreen: exitFullscreen = "exitFullscreen".asInstanceOf[exitFullscreen]
  
  @js.native
  sealed trait fullscreenElement
    extends StObject
       with EventName
  inline def fullscreenElement: fullscreenElement = "fullscreenElement".asInstanceOf[fullscreenElement]
  
  @js.native
  sealed trait fullscreenEnabled
    extends StObject
       with EventName
  inline def fullscreenEnabled: fullscreenEnabled = "fullscreenEnabled".asInstanceOf[fullscreenEnabled]
  
  @js.native
  sealed trait fullscreenchange
    extends StObject
       with EventName
  inline def fullscreenchange: fullscreenchange = "fullscreenchange".asInstanceOf[fullscreenchange]
  
  @js.native
  sealed trait fullscreenerror
    extends StObject
       with EventName
  inline def fullscreenerror: fullscreenerror = "fullscreenerror".asInstanceOf[fullscreenerror]
  
  @js.native
  sealed trait requestFullscreen
    extends StObject
       with EventName
  inline def requestFullscreen: requestFullscreen = "requestFullscreen".asInstanceOf[requestFullscreen]
}
