package typings.divaJs.viewportMod

import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.Region
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewport extends js.Object {
  
  var bottom: Double = js.native
  
  def hasHorizontalOverlap(region: Region): Boolean = js.native
  
  def hasVerticalOverlap(region: Region): Boolean = js.native
  
  var height: Double = js.native
  
  var intersectionTolerance: Double = js.native
  
  def intersectsRegion(region: Region): Boolean = js.native
  
  def invalidate(): Unit = js.native
  
  var left: Double = js.native
  
  var outer: HTMLElement = js.native
  
  var right: Double = js.native
  
  def setInnerDimensions(dimensions: Dimensions): Unit = js.native
  
  var top: Double = js.native
  
  var width: Double = js.native
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
  
  @scala.inline
  implicit class ViewportOps[Self <: Viewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHorizontalOverlap(value: Region => Boolean): Self = this.set("hasHorizontalOverlap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasVerticalOverlap(value: Region => Boolean): Self = this.set("hasVerticalOverlap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionTolerance(value: Double): Self = this.set("intersectionTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectsRegion(value: Region => Boolean): Self = this.set("intersectsRegion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvalidate(value: () => Unit): Self = this.set("invalidate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuter(value: HTMLElement): Self = this.set("outer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetInnerDimensions(value: Dimensions => Unit): Self = this.set("setInnerDimensions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
