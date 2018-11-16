package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "ScreenOrientation")
@js.native
object ScreenOrientationNs extends js.Object {
  
  trait Orientations extends js.Object {
    var ALL: expoLib.expoLibStrings.ALL
    var ALL_BUT_UPSIDE_DOWN: expoLib.expoLibStrings.ALL_BUT_UPSIDE_DOWN
    var LANDSCAPE: expoLib.expoLibStrings.LANDSCAPE
    var LANDSCAPE_LEFT: expoLib.expoLibStrings.LANDSCAPE_LEFT
    var LANDSCAPE_RIGHT: expoLib.expoLibStrings.LANDSCAPE_RIGHT
    var PORTRAIT: expoLib.expoLibStrings.PORTRAIT
    var PORTRAIT_DOWN: expoLib.expoLibStrings.PORTRAIT_DOWN
    var PORTRAIT_UP: expoLib.expoLibStrings.PORTRAIT_UP
  }
  
  val Orientation: Orientations = js.native
  @JSName("allow")
  def allow_ALL(orientation: expoLib.expoLibStrings.ALL): scala.Unit = js.native
  @JSName("allow")
  def allow_ALL_BUT_UPSIDE_DOWN(orientation: expoLib.expoLibStrings.ALL_BUT_UPSIDE_DOWN): scala.Unit = js.native
  @JSName("allow")
  def allow_LANDSCAPE(orientation: expoLib.expoLibStrings.LANDSCAPE): scala.Unit = js.native
  @JSName("allow")
  def allow_LANDSCAPE_LEFT(orientation: expoLib.expoLibStrings.LANDSCAPE_LEFT): scala.Unit = js.native
  @JSName("allow")
  def allow_LANDSCAPE_RIGHT(orientation: expoLib.expoLibStrings.LANDSCAPE_RIGHT): scala.Unit = js.native
  @JSName("allow")
  def allow_PORTRAIT(orientation: expoLib.expoLibStrings.PORTRAIT): scala.Unit = js.native
  @JSName("allow")
  def allow_PORTRAIT_DOWN(orientation: expoLib.expoLibStrings.PORTRAIT_DOWN): scala.Unit = js.native
  @JSName("allow")
  def allow_PORTRAIT_UP(orientation: expoLib.expoLibStrings.PORTRAIT_UP): scala.Unit = js.native
}

