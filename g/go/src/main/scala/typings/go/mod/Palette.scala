package typings.go.mod

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Palette extends the Diagram class to allow objects to be dragged and placed onto other Diagrams.
  * Its Diagram.layout is a GridLayout.
  * The Palette is Diagram.isReadOnly but to support drag-and-drop its Diagram.allowDragOut is true.
  */
@JSImport("go", "Palette")
@js.native
/**
  * @param {string} id A reference to a DIV by its ID as a string.
  */
open class Palette () extends Diagram {
  /**
    * @param {HTMLDivElement} div A reference to a DIV in the DOM.
    */
  def this(div: HTMLDivElement) = this()
  def this(id: String) = this()
}
