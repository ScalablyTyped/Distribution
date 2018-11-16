package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] extends AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] {
  def getTargetingSetting(): java.lang.String
  def newUserListBuilder(): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): scala.Unit
}

