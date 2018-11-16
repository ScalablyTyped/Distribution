package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * An adornment is a special kind of Part that is associated with another Part,
    * the Adornment.adornedPart.
    * Adornments are normally associated with a particular GraphObject in the adorned part --
    * that is the value of .adornedObject.
    * However, the .adornedObject may be null, in which case the .adornedPart will also be null.
    */
@JSImport("go", "Adornment")
@js.native
class Adornment ()
  extends goLib.goMod.goNs.Adornment {
  /**
          * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
          */
  def this(`type`: goLib.goMod.goNs.EnumValue) = this()
}

