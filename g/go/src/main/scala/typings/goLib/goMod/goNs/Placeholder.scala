package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * If a Placeholder is in the visual tree of a Group, it represents the area of all of the member Parts of that Group.
    * If a Placeholder is in the visual tree of an Adornment, it represents the area of the Adornment.adornedObject.
    * It can only be used in the visual tree of a Group node or an Adornment.
    * There can be at most one Placeholder in a Group or an Adornment.
    */
@js.native
trait Placeholder extends GraphObject {
  /**Gets or sets the padding as a Margin (or number for a uniform Margin) around the members of the Group or around the Adornment.adornedObject GraphObject.*/
  var padding: MarginLike = js.native
}

