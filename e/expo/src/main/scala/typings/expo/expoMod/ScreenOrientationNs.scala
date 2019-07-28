package typings.expo.expoMod

import typings.expo.expoMod.ScreenOrientationNs.Orientations
import typings.expo.expoStrings.ALL
import typings.expo.expoStrings.ALL_BUT_UPSIDE_DOWN
import typings.expo.expoStrings.LANDSCAPE
import typings.expo.expoStrings.LANDSCAPE_LEFT
import typings.expo.expoStrings.LANDSCAPE_RIGHT
import typings.expo.expoStrings.PORTRAIT
import typings.expo.expoStrings.PORTRAIT_DOWN
import typings.expo.expoStrings.PORTRAIT_UP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "ScreenOrientation")
@js.native
object ScreenOrientationNs extends js.Object {
  trait Orientations extends js.Object {
    var ALL: typings.expo.expoStrings.ALL
    var ALL_BUT_UPSIDE_DOWN: typings.expo.expoStrings.ALL_BUT_UPSIDE_DOWN
    var LANDSCAPE: typings.expo.expoStrings.LANDSCAPE
    var LANDSCAPE_LEFT: typings.expo.expoStrings.LANDSCAPE_LEFT
    var LANDSCAPE_RIGHT: typings.expo.expoStrings.LANDSCAPE_RIGHT
    var PORTRAIT: typings.expo.expoStrings.PORTRAIT
    var PORTRAIT_DOWN: typings.expo.expoStrings.PORTRAIT_DOWN
    var PORTRAIT_UP: typings.expo.expoStrings.PORTRAIT_UP
  }
  
  val Orientation: Orientations = js.native
  /** Allow a screen orientation. You can call this function multiple times with multiple orientations to allow multiple orientations. */
  @JSName("allowAsync")
  def allowAsync_ALL(orientation: ALL): Unit = js.native
  @JSName("allowAsync")
  def allowAsync_ALLBUTUPSIDEDOWN(orientation: ALL_BUT_UPSIDE_DOWN): Unit = js.native
  @JSName("allowAsync")
  def allowAsync_LANDSCAPE(orientation: LANDSCAPE): Unit = js.native
  @JSName("allowAsync")
  def allowAsync_LANDSCAPELEFT(orientation: LANDSCAPE_LEFT): Unit = js.native
  @JSName("allowAsync")
  def allowAsync_LANDSCAPERIGHT(orientation: LANDSCAPE_RIGHT): Unit = js.native
  @JSName("allowAsync")
  def allowAsync_PORTRAIT(orientation: PORTRAIT): Unit = js.native
  @JSName("allowAsync")
  def allowAsync_PORTRAITDOWN(orientation: PORTRAIT_DOWN): Unit = js.native
  @JSName("allowAsync")
  def allowAsync_PORTRAITUP(orientation: PORTRAIT_UP): Unit = js.native
  /** Deprecated in favour of ScreenOrientation.allowAsync. */
  @JSName("allow")
  def allow_ALL(orientation: ALL): Unit = js.native
  @JSName("allow")
  def allow_ALLBUTUPSIDEDOWN(orientation: ALL_BUT_UPSIDE_DOWN): Unit = js.native
  @JSName("allow")
  def allow_LANDSCAPE(orientation: LANDSCAPE): Unit = js.native
  @JSName("allow")
  def allow_LANDSCAPELEFT(orientation: LANDSCAPE_LEFT): Unit = js.native
  @JSName("allow")
  def allow_LANDSCAPERIGHT(orientation: LANDSCAPE_RIGHT): Unit = js.native
  @JSName("allow")
  def allow_PORTRAIT(orientation: PORTRAIT): Unit = js.native
  @JSName("allow")
  def allow_PORTRAITDOWN(orientation: PORTRAIT_DOWN): Unit = js.native
  @JSName("allow")
  def allow_PORTRAITUP(orientation: PORTRAIT_UP): Unit = js.native
}

