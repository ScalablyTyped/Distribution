package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudienceBuilder[Audience] extends DisplayBuilder[AudienceBuilder[Audience]] {
  def withAudience(userList: UserList): AudienceBuilder[Audience]
  def withAudienceId(audienceId: Double): AudienceBuilder[Audience]
  def withAudienceType(audienceType: AudienceType): AudienceBuilder[Audience]
}

object AudienceBuilder {
  @scala.inline
  def apply[Audience](
    build: () => AdWordsOperation[AudienceBuilder[Audience]],
    exclude: () => AdWordsOperation[AudienceBuilder[Audience]],
    withAudience: UserList => AudienceBuilder[Audience],
    withAudienceId: Double => AudienceBuilder[Audience],
    withAudienceType: AudienceType => AudienceBuilder[Audience],
    withCpc: Double => AudienceBuilder[Audience],
    withCpm: Double => AudienceBuilder[Audience]
  ): AudienceBuilder[Audience] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withAudienceType = js.Any.fromFunction1(withAudienceType), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm))
    __obj.asInstanceOf[AudienceBuilder[Audience]]
  }
}

