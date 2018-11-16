package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
    * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
    */
@JSImport("go", "Group")
@js.native
class Group ()
  extends goLib.goMod.goNs.Group {
  /**
          * Constructs an empty Group with no visual elements and no member parts; normally a Group will have some visual elements surrounding a Placeholder.
          * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
          */
  def this(`type`: goLib.goMod.goNs.EnumValue) = this()
}

