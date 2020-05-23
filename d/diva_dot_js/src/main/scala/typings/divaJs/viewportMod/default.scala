package typings.divaJs.viewportMod

import typings.divaJs.anon.IntersectionTolerance
import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.Region
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diva.js/viewport", JSImport.Default)
@js.native
class default protected () extends Viewport {
  def this(outer: HTMLElement) = this()
  def this(outer: HTMLElement, options: IntersectionTolerance) = this()
  /* CompleteClass */
  override var bottom: Double = js.native
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var intersectionTolerance: Double = js.native
  /* CompleteClass */
  override var left: Double = js.native
  /* CompleteClass */
  override var outer: HTMLElement = js.native
  /* CompleteClass */
  override var right: Double = js.native
  /* CompleteClass */
  override var top: Double = js.native
  /* CompleteClass */
  override var width: Double = js.native
  /* CompleteClass */
  override def hasHorizontalOverlap(region: Region): Boolean = js.native
  /* CompleteClass */
  override def hasVerticalOverlap(region: Region): Boolean = js.native
  /* CompleteClass */
  override def intersectsRegion(region: Region): Boolean = js.native
  /* CompleteClass */
  override def invalidate(): Unit = js.native
  /* CompleteClass */
  override def setInnerDimensions(dimensions: Dimensions): Unit = js.native
}

