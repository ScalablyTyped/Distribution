package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Ad
@js.native
trait Ad
  extends StObject
     with AdWordsEntity
     with canBeEnabled
     with hasLabels
     with hasStats
     with isAdGroupChild {
  
  def asType(): AdViewSpace = js.native
  
  def getApprovalStatus(): ApprovalStatus = js.native
  
  def getDisapprovalReasons(): js.Array[String] = js.native
  
  def getId(): Double = js.native
  
  def getPolicyApprovalStatus(): PolicyApprovalStatus = js.native
  
  def getPolicyTopics(): js.Array[PolicyTopic] = js.native
  
  def getType(): AdType = js.native
  
  def isType(): AdTypeSpace = js.native
  
  def remove(): Unit = js.native
  
  def urls(): AdUrls = js.native
}
