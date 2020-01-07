package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a Quest Criterion Contribution resource.
  */
@js.native
trait Schema$QuestContribution extends js.Object {
  /**
    * The formatted value of the contribution as a string. Format depends on
    * the configuration for the associated event definition in the Play Games
    * Developer Console.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#questContribution.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The value of the contribution.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$QuestContribution {
  @scala.inline
  def apply(formattedValue: String = null, kind: String = null, value: String = null): Schema$QuestContribution = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QuestContribution]
  }
}

