package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AudienceBuilder[Audience] extends DisplayBuilder[AudienceBuilder[Audience]] {
  def withAudience(userList: UserList): AudienceBuilder[Audience]
  def withAudienceId(audienceId: scala.Double): AudienceBuilder[Audience]
  def withAudienceType(audienceType: AudienceType): AudienceBuilder[Audience]
}

