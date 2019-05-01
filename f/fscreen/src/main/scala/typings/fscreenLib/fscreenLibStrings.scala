package typings
package fscreenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fscreenLibStrings {
  @js.native
  sealed trait exitFullscreen
    extends fscreenLib.fscreenMod.EventName
  
  @js.native
  sealed trait fullscreenElement
    extends fscreenLib.fscreenMod.EventName
  
  @js.native
  sealed trait fullscreenEnabled
    extends fscreenLib.fscreenMod.EventName
  
  @js.native
  sealed trait fullscreenchange
    extends fscreenLib.fscreenMod.EventName
  
  @js.native
  sealed trait fullscreenerror
    extends fscreenLib.fscreenMod.EventName
  
  @js.native
  sealed trait requestFullscreen
    extends fscreenLib.fscreenMod.EventName
  
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
}

