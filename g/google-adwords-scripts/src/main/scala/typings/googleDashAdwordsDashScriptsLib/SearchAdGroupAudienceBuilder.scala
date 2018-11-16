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

