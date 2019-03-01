package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestContribution extends js.Object {
  /**
    * The formatted value of the contribution as a string. Format depends on the configuration for the associated event definition in the Play Games
    * Developer Console.
    */
  var formattedValue: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#questContribution. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the contribution. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object QuestContribution {
  @scala.inline
  def apply(
    formattedValue: java.lang.String = null,
    kind: java.lang.String = null,
    value: java.lang.String = null
  ): QuestContribution = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[QuestContribution]
  }
}

