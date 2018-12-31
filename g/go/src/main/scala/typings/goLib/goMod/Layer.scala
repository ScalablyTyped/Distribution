package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Layers are how named collections of Parts are drawn in front or behind other collections of Parts in a Diagram.
  * Layers can only contain Parts -- they cannot hold GraphObjects directly.
  */
@JSImport("go", "Layer")
@js.native
/**
  * This constructs an empty Layer; you should set the .name before adding the Layer to a Diagram.
  */
class Layer ()
  extends goLib.goMod.goNs.Layer

