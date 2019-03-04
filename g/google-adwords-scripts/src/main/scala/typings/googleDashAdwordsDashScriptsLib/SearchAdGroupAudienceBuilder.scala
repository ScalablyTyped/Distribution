package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAdGroupAudienceBuilder[SearchAdGroupAudience] extends AdWordsBuilder[SearchAdGroupAudience] {
  def exclude(): AdWordsOperation[SearchAdGroupAudience]
  def withAudience(userList: UserList): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  def withAudienceId(audienceId: scala.Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  def withBidModifier(modifier: scala.Double): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
}

object SearchAdGroupAudienceBuilder {
  @scala.inline
  def apply[SearchAdGroupAudience](
    build: js.Function0[AdWordsOperation[SearchAdGroupAudience]],
    exclude: js.Function0[AdWordsOperation[SearchAdGroupAudience]],
    withAudience: js.Function1[UserList, SearchAdGroupAudienceBuilder[SearchAdGroupAudience]],
    withAudienceId: js.Function1[scala.Double, SearchAdGroupAudienceBuilder[SearchAdGroupAudience]],
    withBidModifier: js.Function1[scala.Double, SearchAdGroupAudienceBuilder[SearchAdGroupAudience]]
  ): SearchAdGroupAudienceBuilder[SearchAdGroupAudience] = {
    val __obj = js.Dynamic.literal(build = build, exclude = exclude, withAudience = withAudience, withAudienceId = withAudienceId, withBidModifier = withBidModifier)
  
    __obj.asInstanceOf[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]]
  }
}

