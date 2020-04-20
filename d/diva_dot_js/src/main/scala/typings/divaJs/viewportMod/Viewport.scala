package typings.divaJs.viewportMod

import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.Region
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var bottom: Double
  var height: Double
  var intersectionTolerance: Double
  var left: Double
  var outer: HTMLElement
  var right: Double
  var top: Double
  var width: Double
  def hasHorizontalOverlap(region: Region): Boolean
  def hasVerticalOverlap(region: Region): Boolean
  def intersectsRegion(region: Region): Boolean
  def invalidate(): Unit
  def setInnerDimensions(dimensions: Dimensions): Unit
}

object Viewport {
  @scala.inline
  def apply(
    bottom: Double,
    hasHorizontalOverlap: Region => Boolean,
    hasVerticalOverlap: Region => Boolean,
    height: Double,
    intersectionTolerance: Double,
    intersectsRegion: Region => Boolean,
    invalidate: () => Unit,
    left: Double,
    outer: HTMLElement,
    right: Double,
    setInnerDimensions: Dimensions => Unit,
    top: Double,
    width: Double
  ): Viewport = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], hasHorizontalOverlap = js.Any.fromFunction1(hasHorizontalOverlap), hasVerticalOverlap = js.Any.fromFunction1(hasVerticalOverlap), height = height.asInstanceOf[js.Any], intersectionTolerance = intersectionTolerance.asInstanceOf[js.Any], intersectsRegion = js.Any.fromFunction1(intersectsRegion), invalidate = js.Any.fromFunction0(invalidate), left = left.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], setInnerDimensions = js.Any.fromFunction1(setInnerDimensions), top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
}

