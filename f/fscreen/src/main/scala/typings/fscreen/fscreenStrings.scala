package typings.fscreen

import typings.fscreen.mod.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fscreenStrings {
  
  @scala.inline
  def exitFullscreen: exitFullscreen = "exitFullscreen".asInstanceOf[exitFullscreen]
  
  @scala.inline
  def fullscreenElement: fullscreenElement = "fullscreenElement".asInstanceOf[fullscreenElement]
  
  @scala.inline
  def fullscreenEnabled: fullscreenEnabled = "fullscreenEnabled".asInstanceOf[fullscreenEnabled]
  
  @scala.inline
  def fullscreenchange: fullscreenchange = "fullscreenchange".asInstanceOf[fullscreenchange]
  
  @scala.inline
  def fullscreenerror: fullscreenerror = "fullscreenerror".asInstanceOf[fullscreenerror]
  
  @scala.inline
  def requestFullscreen: requestFullscreen = "requestFullscreen".asInstanceOf[requestFullscreen]
  
  @js.native
  sealed trait exitFullscreen extends EventName
  
  @js.native
  sealed trait fullscreenElement extends EventName
  
  @js.native
  sealed trait fullscreenEnabled extends EventName
  
  @js.native
  sealed trait fullscreenchange extends EventName
  
  @js.native
  sealed trait fullscreenerror extends EventName
  
  @js.native
  sealed trait requestFullscreen extends EventName
}
