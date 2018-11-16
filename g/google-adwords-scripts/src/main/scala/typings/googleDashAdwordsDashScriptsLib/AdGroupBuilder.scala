package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdGroupBuilder[AdGroup]
  extends AdWordsBuilder[AdGroup]
     with hasBiddingStrategyBuilder[AdGroupBuilder[AdGroup]]
     with hasTrackingTemplateBuilder[AdGroupBuilder[AdGroup]] {
  def withCpa(cpa: scala.Double): AdGroupBuilder[AdGroup] = js.native
  def withCpc(cpc: scala.Double): AdGroupBuilder[AdGroup] = js.native
  def withCpm(cpm: scala.Double): AdGroupBuilder[AdGroup] = js.native
  def withName(name: java.lang.String): AdGroupBuilder[AdGroup] = js.native
  def withStatus(status: java.lang.String): AdGroupBuilder[AdGroup] = js.native
}

