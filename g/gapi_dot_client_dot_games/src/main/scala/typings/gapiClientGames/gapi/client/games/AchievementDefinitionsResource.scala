package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementDefinitionsResource extends js.Object {
  /** Lists all the achievement definitions for your application. */
  def list(request: Alt): Request[AchievementDefinitionsListResponse] = js.native
}

object AchievementDefinitionsResource {
  @scala.inline
  def apply(list: Alt => Request[AchievementDefinitionsListResponse]): AchievementDefinitionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AchievementDefinitionsResource]
  }
  @scala.inline
  implicit class AchievementDefinitionsResourceOps[Self <: AchievementDefinitionsResource] (val x: Self) extends AnyVal {
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
    def setList(value: Alt => Request[AchievementDefinitionsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

