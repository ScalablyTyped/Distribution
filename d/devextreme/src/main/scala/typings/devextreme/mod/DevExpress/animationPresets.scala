package typings.devextreme.mod.DevExpress

import typings.devextreme.AnonAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait animationPresets extends js.Object {
  /** Applies the changes made in the animation repository. */
  def applyChanges(): Unit = js.native
  /** Removes all animations from the repository. */
  def clear(): Unit = js.native
  /** Deletes an animation with a specific name. */
  def clear(name: String): Unit = js.native
  /** Gets the configuration of an animation with a specific name. */
  def getPreset(name: String): js.Any = js.native
  /** Registers predefined animations in the animation repository. */
  def registerDefaultPresets(): Unit = js.native
  /** Adds an animation with a specific name to the animation repository. */
  def registerPreset(name: String, config: AnonAnimation): Unit = js.native
  /** Deletes all custom animations. */
  def resetToDefaults(): Unit = js.native
}

