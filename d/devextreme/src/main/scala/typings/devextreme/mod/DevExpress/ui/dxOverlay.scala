package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxOverlay[TProperties]
  extends StObject
     with Widget[TProperties] {
  
  /**
    * Gets the UI component&apos;s content.
    */
  def content(): DxElement_[HTMLElement] = js.native
  
  /**
    * Hides the UI component.
    */
  def hide(): js.Promise[Boolean] = js.native
  
  /**
    * Shows the UI component.
    */
  def show(): js.Promise[Boolean] = js.native
  
  /**
    * Shows or hides the UI component depending on the argument.
    */
  def toggle(showing: Boolean): js.Promise[Boolean] = js.native
}
