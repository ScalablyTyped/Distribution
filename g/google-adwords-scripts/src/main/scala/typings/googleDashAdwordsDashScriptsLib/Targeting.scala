package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Targeting extends VideoCampaignTargeting {
  def audiences(): AdWordsSelector[SearchCampaignAudience]
  def excludedAudiences(): AdWordsSelector[SearchCampaignExcludedAudience]
}

