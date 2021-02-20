package typings.divaJs

import typings.divaJs.anon.IntersectionTolerance
import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.Region
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewportMod {
  
  @JSImport("diva.js/viewport", JSImport.Default)
  @js.native
  class default protected () extends Viewport {
    def this(outer: HTMLElement) = this()
    def this(outer: HTMLElement, options: IntersectionTolerance) = this()
  }
  
  @js.native
  trait Viewport extends StObject {
    
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
    implicit class ViewportMutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasHorizontalOverlap(value: Region => Boolean): Self = StObject.set(x, "hasHorizontalOverlap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasVerticalOverlap(value: Region => Boolean): Self = StObject.set(x, "hasVerticalOverlap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectionTolerance(value: Double): Self = StObject.set(x, "intersectionTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectsRegion(value: Region => Boolean): Self = StObject.set(x, "intersectsRegion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInvalidate(value: () => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuter(value: HTMLElement): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetInnerDimensions(value: Dimensions => Unit): Self = StObject.set(x, "setInnerDimensions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
