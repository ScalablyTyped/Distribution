package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An adornment is a special kind of Part that is associated with another Part,
  * the Adornment.adornedPart.
  * Adornments are normally associated with a particular GraphObject in the adorned part --
  * that is the value of .adornedObject.
  * However, the .adornedObject may be null, in which case the .adornedPart will also be null.
  */
@JSGlobal("go.Adornment")
@js.native
/**
  * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
  */
open class Adornment ()
  extends typings.go.mod.Adornment {
  def this(`type`: typings.go.mod.EnumValue) = this()
}
