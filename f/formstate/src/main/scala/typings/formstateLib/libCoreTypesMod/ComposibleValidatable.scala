package typings
package formstateLib.libCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposibleValidatable[TValue] extends Validatable[TValue] {
  /** Used to tell the parent about validation */
  @JSName("on$ChangeAfterValidation")
  def on$ChangeAfterValidation(): scala.Unit
  @JSName("on$Reinit")
  def on$Reinit(): scala.Unit
  /** Allows a convinient reset for all fields */
  def reset(): scala.Unit
  /** Used by the parent to register listeners */
  def setCompositionParent(config: formstateLib.Anon_OnChangeAfterValidation): scala.Unit
}

