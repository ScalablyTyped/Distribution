package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupDisplay extends Display {
  def excludedAudiences(): AdWordsSelector[ExcludedAudience]
  def excludedKeywords(): AdWordsSelector[ExcludedDisplayKeyword]
  def excludedPlacements(): AdWordsSelector[ExcludedPlacement]
  def excludedTopics(): AdWordsSelector[Topic]
  def newAudienceBuilder(): AudienceBuilder[Audience]
  def newKeywordBuilder(): DisplayKeywordBuilder[DisplayKeyword]
  def newPlacementBuilder(): PlacementBuilder[Placement]
  def newTopicBuilder(): TopicBuilder[Topic]
}

