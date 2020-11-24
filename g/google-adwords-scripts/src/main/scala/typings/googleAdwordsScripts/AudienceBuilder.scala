package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudienceBuilder[Audience] extends DisplayBuilder[AudienceBuilder[Audience]] {
  
  def withAudience(userList: UserList): AudienceBuilder[Audience] = js.native
  
  def withAudienceId(audienceId: Double): AudienceBuilder[Audience] = js.native
  
  def withAudienceType(audienceType: AudienceType): AudienceBuilder[Audience] = js.native
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
  
  @scala.inline
  implicit class AudienceBuilderOps[Self <: AudienceBuilder[_], Audience] (val x: Self with AudienceBuilder[Audience]) extends AnyVal {
    
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
    def setWithAudience(value: UserList => AudienceBuilder[Audience]): Self = this.set("withAudience", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithAudienceId(value: Double => AudienceBuilder[Audience]): Self = this.set("withAudienceId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithAudienceType(value: AudienceType => AudienceBuilder[Audience]): Self = this.set("withAudienceType", js.Any.fromFunction1(value))
  }
}
