package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesconfiguration.anon.AchievementId
import typings.gapiClientGamesconfiguration.anon.Alt
import typings.gapiClientGamesconfiguration.anon.ApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementConfigurationsResource extends js.Object {
  /** Delete the achievement configuration with the given ID. */
  def delete(request: AchievementId): Request[Unit] = js.native
  /** Retrieves the metadata of the achievement configuration with the given ID. */
  def get(request: AchievementId): Request[AchievementConfiguration] = js.native
  /** Insert a new achievement configuration in this application. */
  def insert(request: Alt): Request[AchievementConfiguration] = js.native
  /** Returns a list of the achievement configurations in this application. */
  def list(request: ApplicationId): Request[AchievementConfigurationListResponse] = js.native
  /** Update the metadata of the achievement configuration with the given ID. This method supports patch semantics. */
  def patch(request: AchievementId): Request[AchievementConfiguration] = js.native
  /** Update the metadata of the achievement configuration with the given ID. */
  def update(request: AchievementId): Request[AchievementConfiguration] = js.native
}

object AchievementConfigurationsResource {
  @scala.inline
  def apply(
    delete: AchievementId => Request[Unit],
    get: AchievementId => Request[AchievementConfiguration],
    insert: Alt => Request[AchievementConfiguration],
    list: ApplicationId => Request[AchievementConfigurationListResponse],
    patch: AchievementId => Request[AchievementConfiguration],
    update: AchievementId => Request[AchievementConfiguration]
  ): AchievementConfigurationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AchievementConfigurationsResource]
  }
  @scala.inline
  implicit class AchievementConfigurationsResourceOps[Self <: AchievementConfigurationsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: AchievementId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: AchievementId => Request[AchievementConfiguration]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Alt => Request[AchievementConfiguration]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: ApplicationId => Request[AchievementConfigurationListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: AchievementId => Request[AchievementConfiguration]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: AchievementId => Request[AchievementConfiguration]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

