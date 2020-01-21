package typings.go.mod

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Overview is a Diagram that displays all of a different diagram,
  * with a rectangular box showing the viewport displayed by that other diagram.
  * All you need to do is set Overview.observed.
  */
@JSImport("go", "Overview")
@js.native
/**
  * @param {string} id A reference to a DIV by its ID as a string.
  */
class Overview () extends Diagram {
  /**
    * @param {HTMLDivElement} div A reference to a DIV element in the DOM.
    */
  def this(div: HTMLDivElement) = this()
  def this(id: String) = this()
  /**Gets or sets the rectangular Part that represents the viewport of the .observed Diagram.*/
  var box: Part = js.native
  /**Gets or sets whether this overview draws the temporary layers of the observed Diagram.*/
  var drawsTemporaryLayers: Boolean = js.native
  /**Gets or sets the Diagram for which this Overview is displaying a model and showing its viewport into that model.*/
  var observed: Diagram = js.native
}

