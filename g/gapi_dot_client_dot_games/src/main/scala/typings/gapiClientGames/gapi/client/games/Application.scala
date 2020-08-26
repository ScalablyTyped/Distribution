package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  /** The number of achievements visible to the currently authenticated player. */
  var achievement_count: js.UndefOr[Double] = js.native
  /** The assets of the application. */
  var assets: js.UndefOr[js.Array[ImageAsset]] = js.native
  /** The author of the application. */
  var author: js.UndefOr[String] = js.native
  /** The category of the application. */
  var category: js.UndefOr[ApplicationCategory] = js.native
  /** The description of the application. */
  var description: js.UndefOr[String] = js.native
  /**
    * A list of features that have been enabled for the application.
    * Possible values are:
    * - "SNAPSHOTS" - Snapshots has been enabled
    */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.native
  /** The ID of the application. */
  var id: js.UndefOr[String] = js.native
  /** The instances of the application. */
  var instances: js.UndefOr[js.Array[Instance]] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#application. */
  var kind: js.UndefOr[String] = js.native
  /** The last updated timestamp of the application. */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
  /** The number of leaderboards visible to the currently authenticated player. */
  var leaderboard_count: js.UndefOr[Double] = js.native
  /** The name of the application. */
  var name: js.UndefOr[String] = js.native
  /** A hint to the client UI for what color to use as an app-themed color. The color is given as an RGB triplet (e.g. "E0E0E0"). */
  var themeColor: js.UndefOr[String] = js.native
}

object Application {
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAchievement_count(value: Double): Self = this.set("achievement_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAchievement_count: Self = this.set("achievement_count", js.undefined)
    @scala.inline
    def setAssetsVarargs(value: ImageAsset*): Self = this.set("assets", js.Array(value :_*))
    @scala.inline
    def setAssets(value: js.Array[ImageAsset]): Self = this.set("assets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssets: Self = this.set("assets", js.undefined)
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setCategory(value: ApplicationCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnabledFeaturesVarargs(value: String*): Self = this.set("enabledFeatures", js.Array(value :_*))
    @scala.inline
    def setEnabledFeatures(value: js.Array[String]): Self = this.set("enabledFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledFeatures: Self = this.set("enabledFeatures", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[Instance]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastUpdatedTimestamp(value: String): Self = this.set("lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("lastUpdatedTimestamp", js.undefined)
    @scala.inline
    def setLeaderboard_count(value: Double): Self = this.set("leaderboard_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaderboard_count: Self = this.set("leaderboard_count", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setThemeColor(value: String): Self = this.set("themeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeColor: Self = this.set("themeColor", js.undefined)
  }
  
}

