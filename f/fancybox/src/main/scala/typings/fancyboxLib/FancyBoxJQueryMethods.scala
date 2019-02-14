package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxJQueryMethods extends js.Object {
  var defaults: FancyBoxOptions = js.native
  var isMobile: scala.Boolean = js.native
  var use3d: java.lang.String = js.native
  var version: java.lang.String = js.native
  def animate(
    $el: JQuery,
    to: FancyBoxThumbPos,
    duration: scala.Double,
    callback: js.Function0[scala.Unit],
    leaveAnimationName: scala.Boolean
  ): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(all: scala.Boolean): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getInstance(): FancyBoxInstance = js.native
  def getInstance(command: java.lang.String): FancyBoxInstance = js.native
  def getInstance(command: js.Function0[scala.Unit]): FancyBoxInstance = js.native
  def getTranslate($el: JQuery): scala.Unit = js.native
  def open(items: FancyBoxGroupItem): FancyBoxInstance = js.native
  def open(items: FancyBoxGroupItem, opts: FancyBoxOptions): FancyBoxInstance = js.native
  def open(items: FancyBoxGroupItem, opts: FancyBoxOptions, index: scala.Double): FancyBoxInstance = js.native
  def open(items: JQuery): FancyBoxInstance = js.native
  def open(items: JQuery, opts: FancyBoxOptions): FancyBoxInstance = js.native
  def open(items: JQuery, opts: FancyBoxOptions, index: scala.Double): FancyBoxInstance = js.native
  def open(items: java.lang.String): FancyBoxInstance = js.native
  def open(items: java.lang.String, opts: FancyBoxOptions): FancyBoxInstance = js.native
  def open(items: java.lang.String, opts: FancyBoxOptions, index: scala.Double): FancyBoxInstance = js.native
  def open(items: js.Array[FancyBoxGroupItem]): FancyBoxInstance = js.native
  def open(items: js.Array[FancyBoxGroupItem], opts: FancyBoxOptions): FancyBoxInstance = js.native
  def open(items: js.Array[FancyBoxGroupItem], opts: FancyBoxOptions, index: scala.Double): FancyBoxInstance = js.native
  def setTranslate($el: JQuery, props: Anon_Left): scala.Unit = js.native
  def stop($el: JQuery, callCallback: scala.Boolean): scala.Unit = js.native
}

