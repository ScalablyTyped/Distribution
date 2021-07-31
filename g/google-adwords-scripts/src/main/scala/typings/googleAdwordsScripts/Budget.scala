package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Budgets
@js.native
trait Budget
  extends StObject
     with AdWordsEntity
     with hasStats {
  
  def campaigns(): AdWordsSelector[Campaign] = js.native
  
  def getAmount(): Double = js.native
  
  def getDeliveryMethod(): String = js.native
  
  def getId(): Double = js.native
  
  def getName(): String = js.native
  
  def isExplicitlyShared(): Boolean = js.native
  
  def setAmount(amount: Double): Unit = js.native
}
