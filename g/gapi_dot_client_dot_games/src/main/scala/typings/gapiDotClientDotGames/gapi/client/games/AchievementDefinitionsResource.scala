package typings.gapiDotClientDotGames.gapi.client.games

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGames.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementDefinitionsResource extends js.Object {
  /** Lists all the achievement definitions for your application. */
  def list(request: Anon_Alt): Request[AchievementDefinitionsListResponse]
}

object AchievementDefinitionsResource {
  @scala.inline
  def apply(list: Anon_Alt => Request[AchievementDefinitionsListResponse]): AchievementDefinitionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AchievementDefinitionsResource]
  }
}

