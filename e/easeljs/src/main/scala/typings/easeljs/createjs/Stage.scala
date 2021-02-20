package typings.easeljs.createjs

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stage extends Container {
  
  // properties
  var autoClear: Boolean = js.native
  
  var canvas: HTMLCanvasElement | js.Object = js.native
  
  // methods
  def clear(): Unit = js.native
  
  var drawRect: Rectangle = js.native
  
  def enableDOMEvents(): Unit = js.native
  def enableDOMEvents(enable: Boolean): Unit = js.native
  
  def enableMouseOver(): Unit = js.native
  def enableMouseOver(frequency: Double): Unit = js.native
  
  var handleEvent: js.Function = js.native
  
  var mouseInBounds: Boolean = js.native
  
  var mouseMoveOutside: Boolean = js.native
  
  var mouseX: Double = js.native
  
  var mouseY: Double = js.native
  
  var nextStage: Stage = js.native
  
  /**
    * @deprecated
    */
  var preventSelection: Boolean = js.native
  
  var snapToPixelEnabled: Boolean = js.native
  
  def tick(): Unit = js.native
  def tick(props: js.Object): Unit = js.native
  
  // deprecated
  var tickOnUpdate: Boolean = js.native
  
  def toDataURL(backgroundColor: String, mimeType: String): String = js.native
  
  def update(arg: js.Any*): Unit = js.native
}
