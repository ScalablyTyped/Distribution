package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Platform
  extends AdWordsEntity
     with canSetBidModifier
     with hasStats
     with isCampaignChild {
  
  def getCampaignType(): CampaignType = js.native
  
  def getId(): Double = js.native
  
  def getName(): String = js.native
  
  def getVideoCampaign(): Campaign = js.native
}
