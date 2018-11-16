package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * This is the base class for all of the predefined diagram layout implementations.
    * They only arrange Parts (primarily Nodes and Links) in a Diagram,
    * not to GraphObjects in Panels (i.e. panel layout).
    */
@JSImport("go", "Layout")
@js.native
class Layout ()
  extends goLib.goMod.goNs.Layout

