package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetedProximity
  extends AdWordsEntity
     with canSetBidModifier
     with hasStats
     with isCampaignChild {
  
  def getAddress(): Address = js.native
  
  def getCampaignType(): CampaignType = js.native
  
  def getId(): Double = js.native
  
  def getLatitude(): Double = js.native
  
  def getLongitude(): Double = js.native
  
  def getRadius(): Double = js.native
  
  def getRadiusUnits(): RadiusUnits = js.native
  
  def getVideoCampaign(): Campaign = js.native
  
  // TODO: VideoCampaign
  def remove(): Unit = js.native
}
