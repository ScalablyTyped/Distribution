package typings.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassbackSlot extends js.Object {
  
  def display(): Unit = js.native
  
  def get(key: String): String = js.native
  
  def set(key: String, value: String): PassbackSlot = js.native
  
  def setClickUrl(url: String): PassbackSlot = js.native
  
  def setForceSafeFrame(forceSafeFrame: Boolean): PassbackSlot = js.native
  
  def setTagForChildDirectedTreatment(value: Double): PassbackSlot = js.native
  
  def setTagForUnderAgeOfConsent(value: Double): PassbackSlot = js.native
  
  def setTargeting(key: String, value: String): PassbackSlot = js.native
  def setTargeting(key: String, value: js.Array[String]): PassbackSlot = js.native
  
  def updateTargetingFromMap(map: js.Object): PassbackSlot = js.native
}
