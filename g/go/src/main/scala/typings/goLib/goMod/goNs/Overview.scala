package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Overview is a Diagram that displays all of a different diagram,
  * with a rectangular box showing the viewport displayed by that other diagram.
  * All you need to do is set Overview.observed.
  */
@js.native
trait Overview extends Diagram {
  /**Gets or sets the rectangular Part that represents the viewport of the .observed Diagram.*/
  var box: Part = js.native
  /**Gets or sets whether this overview draws the temporary layers of the observed Diagram.*/
  var drawsTemporaryLayers: scala.Boolean = js.native
  /**Gets or sets the Diagram for which this Overview is displaying a model and showing its viewport into that model.*/
  var observed: Diagram = js.native
}

