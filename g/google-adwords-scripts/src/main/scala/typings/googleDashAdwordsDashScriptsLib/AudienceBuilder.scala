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

object AudienceBuilder {
  @scala.inline
  def apply[Audience](
    build: js.Function0[AdWordsOperation[AudienceBuilder[Audience]]],
    exclude: js.Function0[AdWordsOperation[AudienceBuilder[Audience]]],
    withAudience: js.Function1[UserList, AudienceBuilder[Audience]],
    withAudienceId: js.Function1[scala.Double, AudienceBuilder[Audience]],
    withAudienceType: js.Function1[AudienceType, AudienceBuilder[Audience]],
    withCpc: js.Function1[scala.Double, AudienceBuilder[Audience]],
    withCpm: js.Function1[scala.Double, AudienceBuilder[Audience]]
  ): AudienceBuilder[Audience] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("exclude")(exclude)
    __obj.updateDynamic("withAudience")(withAudience)
    __obj.updateDynamic("withAudienceId")(withAudienceId)
    __obj.updateDynamic("withAudienceType")(withAudienceType)
    __obj.updateDynamic("withCpc")(withCpc)
    __obj.updateDynamic("withCpm")(withCpm)
    __obj.asInstanceOf[AudienceBuilder[Audience]]
  }
}

