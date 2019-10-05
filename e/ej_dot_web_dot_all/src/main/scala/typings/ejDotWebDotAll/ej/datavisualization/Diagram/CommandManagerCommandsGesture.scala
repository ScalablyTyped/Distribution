package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandManagerCommandsGesture extends js.Object {
  /** Sets the key value, on recognition of which the command will be executed.
    * @Default {ej.datavisualization.Diagram.Keys.None}
    */
  var key: js.UndefOr[Keys | String] = js.undefined
  /** Sets a combination of key modifiers, on recognition of which the command will be executed.
    * @Default {ej.datavisualization.Diagram.KeyModifiers.None}
    */
  var keyModifiers: js.UndefOr[KeyModifiers | String] = js.undefined
}

object CommandManagerCommandsGesture {
  @scala.inline
  def apply(key: Keys | String = null, keyModifiers: KeyModifiers | String = null): CommandManagerCommandsGesture = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyModifiers != null) __obj.updateDynamic("keyModifiers")(keyModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandManagerCommandsGesture]
  }
}

