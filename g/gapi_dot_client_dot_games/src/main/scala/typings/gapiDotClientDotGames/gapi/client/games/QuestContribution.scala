package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestContribution extends js.Object {
  /**
    * The formatted value of the contribution as a string. Format depends on the configuration for the associated event definition in the Play Games
    * Developer Console.
    */
  var formattedValue: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#questContribution. */
  var kind: js.UndefOr[String] = js.undefined
  /** The value of the contribution. */
  var value: js.UndefOr[String] = js.undefined
}

object QuestContribution {
  @scala.inline
  def apply(formattedValue: String = null, kind: String = null, value: String = null): QuestContribution = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestContribution]
  }
}

