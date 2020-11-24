package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An adornment is a special kind of Part that is associated with another Part,
  * the Adornment.adornedPart.
  * Adornments are normally associated with a particular GraphObject in the adorned part --
  * that is the value of .adornedObject.
  * However, the .adornedObject may be null, in which case the .adornedPart will also be null.
  */
@JSImport("go", "Adornment")
@js.native
/**
  * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
  */
class Adornment () extends Part {
  def this(`type`: EnumValue) = this()
  
  /**Gets or sets the GraphObject that is adorned.*/
  var adornedObject: GraphObject = js.native
  
  /**This read-only property returns the Part that contains the adorned object.*/
  var adornedPart: Part = js.native
  
  /**This read-only property returns a Placeholder that this Adornment may contain in its visual tree.*/
  var placeholder: Placeholder = js.native
}
