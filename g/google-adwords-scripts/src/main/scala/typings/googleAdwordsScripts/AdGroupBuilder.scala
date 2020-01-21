package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdGroupBuilder[AdGroup]
  extends AdWordsBuilder[AdGroup]
     with hasBiddingStrategyBuilder[AdGroupBuilder[AdGroup]]
     with hasTrackingTemplateBuilder[AdGroupBuilder[AdGroup]] {
  def withCpa(cpa: Double): AdGroupBuilder[AdGroup] = js.native
  def withCpc(cpc: Double): AdGroupBuilder[AdGroup] = js.native
  def withCpm(cpm: Double): AdGroupBuilder[AdGroup] = js.native
  def withName(name: String): AdGroupBuilder[AdGroup] = js.native
  def withStatus(status: String): AdGroupBuilder[AdGroup] = js.native
}

