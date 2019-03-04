package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementDefinitionsResource extends js.Object {
  /** Lists all the achievement definitions for your application. */
  def list(request: gapiDotClientDotGamesLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AchievementDefinitionsListResponse]
}

object AchievementDefinitionsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotGamesLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementDefinitionsListResponse]
    ]
  ): AchievementDefinitionsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[AchievementDefinitionsResource]
  }
}

