package typings.doubleclickGpt.googletag

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Googletag extends js.Object {
  
  var apiReady: Boolean = js.native
  
  var cmd: CommandArray = js.native
  
  def companionAds(): CompanionAdsService = js.native
  
  def content(): ContentService = js.native
  
  def defineOutOfPageSlot(adUnitPath: String): Slot = js.native
  def defineOutOfPageSlot(adUnitPath: String, opt_div: String): Slot = js.native
  
  def defineSlot(adUnitPath: String, size: GeneralSize): Slot = js.native
  def defineSlot(adUnitPath: String, size: GeneralSize, opt_div: String): Slot = js.native
  
  def destroySlots(): Boolean = js.native
  def destroySlots(opt_slots: js.Array[Slot]): Boolean = js.native
  
  def disablePublisherConsole(): Unit = js.native
  
  def display(): Unit = js.native
  def display(divOrSlot: String): Unit = js.native
  def display(divOrSlot: Slot): Unit = js.native
  def display(divOrSlot: Element): Unit = js.native
  
  def enableServices(): Unit = js.native
  
  def getVersion(): String = js.native
  
  def openConsole(): Unit = js.native
  def openConsole(opt_div: String): Unit = js.native
  
  def pubads(): PubAdsService = js.native
  
  var pubadsReady: Boolean = js.native
  
  def setAdIframeTitle(title: String): Unit = js.native
  
  def sizeMapping(): SizeMappingBuilder = js.native
}
