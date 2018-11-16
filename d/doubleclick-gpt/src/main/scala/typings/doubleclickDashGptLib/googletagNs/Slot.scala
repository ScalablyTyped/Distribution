package typings
package doubleclickDashGptLib.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slot extends js.Object {
  def addService(service: Service): Slot = js.native
  def clearCategoryExclusions(): Slot = js.native
  def clearTargeting(): Slot = js.native
  def clearTargeting(opt_key: java.lang.String): Slot = js.native
  def defineSizeMapping(sizeMapping: SizeMappingArray): Slot = js.native
  def get(key: java.lang.String): java.lang.String | scala.Null = js.native
  def getAdUnitPath(): java.lang.String = js.native
  def getAttributeKeys(): js.Array[java.lang.String] = js.native
  def getCategoryExclusions(): js.Array[java.lang.String] = js.native
  def getResponseInformation(): ResponseInformation = js.native
  def getSlotElementId(): java.lang.String = js.native
  def getTargeting(key: java.lang.String): js.Array[java.lang.String] = js.native
  def getTargetingKeys(): js.Array[java.lang.String] = js.native
  def set(key: java.lang.String, value: java.lang.String): Slot = js.native
  def setCategoryExclusion(categoryExclusion: java.lang.String): Slot = js.native
  def setClickUrl(value: java.lang.String): Slot = js.native
  def setCollapseEmptyDiv(collapse: scala.Boolean): Slot = js.native
  def setCollapseEmptyDiv(collapse: scala.Boolean, opt_collapseBeforeAdFetch: scala.Boolean): Slot = js.native
  def setForceSafeFrame(forceSafeFrame: scala.Boolean): Slot = js.native
  def setSafeFrameConfig(config: SafeFrameConfig): Slot = js.native
  def setTargeting(key: java.lang.String, value: java.lang.String): Slot = js.native
  def setTargeting(key: java.lang.String, value: js.Array[java.lang.String]): Slot = js.native
}

