package typings.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slot extends js.Object {
  def addService(service: Service): Slot = js.native
  def clearCategoryExclusions(): Slot = js.native
  def clearTargeting(): Slot = js.native
  def clearTargeting(opt_key: String): Slot = js.native
  def defineSizeMapping(sizeMapping: SizeMappingArray): Slot = js.native
  def get(key: String): String | Null = js.native
  def getAdUnitPath(): String = js.native
  def getAttributeKeys(): js.Array[String] = js.native
  def getCategoryExclusions(): js.Array[String] = js.native
  def getResponseInformation(): ResponseInformation = js.native
  def getSlotElementId(): String = js.native
  def getTargeting(key: String): js.Array[String] = js.native
  def getTargetingKeys(): js.Array[String] = js.native
  def set(key: String, value: String): Slot = js.native
  def setCategoryExclusion(categoryExclusion: String): Slot = js.native
  def setClickUrl(value: String): Slot = js.native
  def setCollapseEmptyDiv(collapse: Boolean): Slot = js.native
  def setCollapseEmptyDiv(collapse: Boolean, opt_collapseBeforeAdFetch: Boolean): Slot = js.native
  def setForceSafeFrame(forceSafeFrame: Boolean): Slot = js.native
  def setSafeFrameConfig(config: SafeFrameConfig): Slot = js.native
  def setTargeting(key: String, value: String): Slot = js.native
  def setTargeting(key: String, value: js.Array[String]): Slot = js.native
}

