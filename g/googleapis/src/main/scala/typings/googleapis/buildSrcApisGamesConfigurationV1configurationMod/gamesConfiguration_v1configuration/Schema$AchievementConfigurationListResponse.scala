package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a ListConfigurations response.
  */
@js.native
trait Schema$AchievementConfigurationListResponse extends js.Object {
  /**
    * The achievement configurations.
    */
  var items: js.UndefOr[js.Array[Schema$AchievementConfiguration]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementConfigurationListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$AchievementConfigurationListResponse {
  @scala.inline
  def apply(
    items: js.Array[Schema$AchievementConfiguration] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$AchievementConfigurationListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AchievementConfigurationListResponse]
  }
}

