package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAdGroupAudienceBuilder[SearchAdGroupAudience] extends AdWordsBuilder[SearchAdGroupAudience] {
  def exclude(): AdWordsOperation[SearchAdGroupAudience]
  def withAudience(userList: UserList): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  def withAudienceId(audienceId: Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  def withBidModifier(modifier: Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
}

object SearchAdGroupAudienceBuilder {
  @scala.inline
  def apply[SearchAdGroupAudience](
    build: () => AdWordsOperation[SearchAdGroupAudience],
    exclude: () => AdWordsOperation[SearchAdGroupAudience],
    withAudience: UserList => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    withAudienceId: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience],
    withBidModifier: Double => SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  ): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withAudience = js.Any.fromFunction1(withAudience), withAudienceId = js.Any.fromFunction1(withAudienceId), withBidModifier = js.Any.fromFunction1(withBidModifier))
  
    __obj.asInstanceOf[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]]
  }
}

