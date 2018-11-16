package typings
package doubleclickDashGptLib.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Googletag extends js.Object {
  var apiReady: scala.Boolean = js.native
  var cmd: CommandArray = js.native
  var pubadsReady: scala.Boolean = js.native
  def companionAds(): CompanionAdsService = js.native
  def content(): ContentService = js.native
  def defineOutOfPageSlot(adUnitPath: java.lang.String): Slot = js.native
  def defineOutOfPageSlot(adUnitPath: java.lang.String, opt_div: java.lang.String): Slot = js.native
  def defineSlot(adUnitPath: java.lang.String, size: GeneralSize): Slot = js.native
  def defineSlot(adUnitPath: java.lang.String, size: GeneralSize, opt_div: java.lang.String): Slot = js.native
  def destroySlots(): scala.Boolean = js.native
  def destroySlots(opt_slots: js.Array[Slot]): scala.Boolean = js.native
  def disablePublisherConsole(): scala.Unit = js.native
  def display(): scala.Unit = js.native
  def display(div: java.lang.String): scala.Unit = js.native
  def display(div: stdLib.Element): scala.Unit = js.native
  def enableServices(): scala.Unit = js.native
  def getVersion(): java.lang.String = js.native
  def openConsole(): scala.Unit = js.native
  def openConsole(opt_div: java.lang.String): scala.Unit = js.native
  def pubads(): PubAdsService = js.native
  def setAdIframeTitle(title: java.lang.String): scala.Unit = js.native
  def sizeMapping(): SizeMappingBuilder = js.native
}

