package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Bidding Strategies
@js.native
trait BiddingStrategy extends hasStats {
  def adGroups(): AdWordsSelector[AdGroup] = js.native
  def campaigns(): AdWordsSelector[Campaign] = js.native
  def getId(): scala.Double = js.native
  def getName(): java.lang.String = js.native
  def getType(): java.lang.String = js.native
  def keywords(): AdWordsSelector[Keyword] = js.native
  def shoppingAdGroups(): AdWordsSelector[AdWordsEntity] = js.native
   // TODO: ShoppingAdGroup
  def shoppingCampaigns(): AdWordsSelector[AdWordsEntity] = js.native
}

