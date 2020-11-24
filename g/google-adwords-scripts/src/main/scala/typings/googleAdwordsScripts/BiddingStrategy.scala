package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Bidding Strategies
@js.native
trait BiddingStrategy extends hasStats {
  
  def adGroups(): AdWordsSelector[AdGroup] = js.native
  
  def campaigns(): AdWordsSelector[Campaign] = js.native
  
  def getId(): Double = js.native
  
  def getName(): String = js.native
  
  def getType(): String = js.native
  
  def keywords(): AdWordsSelector[Keyword] = js.native
  
  def shoppingAdGroups(): AdWordsSelector[AdWordsEntity] = js.native
  
   // TODO: ShoppingAdGroup
  def shoppingCampaigns(): AdWordsSelector[AdWordsEntity] = js.native
}
