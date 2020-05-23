package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait animationPresets extends js.Object {
  /** @name animationPresets.applyChanges() */
  def applyChanges(): Unit = js.native
  /** @name animationPresets.clear() */
  def clear(): Unit = js.native
  /** @name animationPresets.clear(name) */
  def clear(name: String): Unit = js.native
  /** @name animationPresets.getPreset(name) */
  def getPreset(name: String): js.Any = js.native
  /** @name animationPresets.registerDefaultPresets() */
  def registerDefaultPresets(): Unit = js.native
  /** @name animationPresets.registerPreset(name, config) */
  def registerPreset(name: String, config: Animation): Unit = js.native
  /** @name animationPresets.resetToDefaults() */
  def resetToDefaults(): Unit = js.native
}

