package typings.fancybox

import typings.fancybox.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxJQueryMethods extends StObject {
  
  def animate(
    $el: JQuery,
    to: FancyBoxThumbPos,
    duration: Double,
    callback: js.Function0[Unit],
    leaveAnimationName: Boolean
  ): Unit = js.native
  
  def close(): Unit = js.native
  def close(all: Boolean): Unit = js.native
  
  var defaults: FancyBoxOptions = js.native
  
  def destroy(): Unit = js.native
  
  def getInstance(): FancyBoxInstance = js.native
  def getInstance(command: String): FancyBoxInstance = js.native
  def getInstance(command: js.Function0[Unit]): FancyBoxInstance = js.native
  
  def getTranslate($el: JQuery): Unit = js.native
  
  var isMobile: Boolean = js.native
  
  def open(items: String): FancyBoxInstance = js.native
  def open(items: String, opts: Unit, index: Double): FancyBoxInstance = js.native
  def open(items: String, opts: FancyBoxOptions): FancyBoxInstance = js.native
  def open(items: String, opts: FancyBoxOptions, index: Double): FancyBoxInstance = js.native
  def open(items: js.Array[FancyBoxGroupItem]): FancyBoxInstance = js.native
  def open(items: js.Array[FancyBoxGroupItem], opts: Unit, index: Double): FancyBoxInstance = js.native
  def open(items: js.Array[FancyBoxGroupItem], opts: FancyBoxOptions): FancyBoxInstance = js.native
  def open(items: js.Array[FancyBoxGroupItem], opts: FancyBoxOptions, index: Double): FancyBoxInstance = js.native
  def open(items: FancyBoxGroupItem): FancyBoxInstance = js.native
  def open(items: FancyBoxGroupItem, opts: Unit, index: Double): FancyBoxInstance = js.native
  def open(items: FancyBoxGroupItem, opts: FancyBoxOptions): FancyBoxInstance = js.native
  def open(items: FancyBoxGroupItem, opts: FancyBoxOptions, index: Double): FancyBoxInstance = js.native
  def open(items: JQuery): FancyBoxInstance = js.native
  def open(items: JQuery, opts: Unit, index: Double): FancyBoxInstance = js.native
  def open(items: JQuery, opts: FancyBoxOptions): FancyBoxInstance = js.native
  def open(items: JQuery, opts: FancyBoxOptions, index: Double): FancyBoxInstance = js.native
  
  def setTranslate($el: JQuery, props: Left): Unit = js.native
  
  def stop($el: JQuery, callCallback: Boolean): Unit = js.native
  
  var use3d: String = js.native
  
  var version: String = js.native
}
