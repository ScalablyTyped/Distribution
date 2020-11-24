package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Widget extends DOMComponent {
  
  /**
    * [descr:Widget.focus()]
    */
  def focus(): Unit = js.native
  
  /**
    * [descr:Widget.registerKeyHandler(key, handler)]
    */
  def registerKeyHandler(key: String, handler: js.Function): Unit = js.native
  
  /**
    * [descr:Widget.repaint()]
    */
  def repaint(): Unit = js.native
}
