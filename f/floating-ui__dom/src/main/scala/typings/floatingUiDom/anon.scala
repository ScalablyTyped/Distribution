package typings.floatingUiDom

import typings.floatingUiCore.srcTypesMod.Coords
import typings.floatingUiCore.srcTypesMod.ElementRects
import typings.floatingUiCore.srcTypesMod.MiddlewareData
import typings.floatingUiCore.srcTypesMod.Placement
import typings.floatingUiCore.srcTypesMod.Platform
import typings.floatingUiCore.srcTypesMod.RootBoundary
import typings.floatingUiCore.srcTypesMod.Strategy
import typings.floatingUiDom.floatingUiDomBooleans.`false`
import typings.floatingUiDom.srcTypesMod.Elements
import typings.floatingUiDom.srcTypesMod.FloatingElement
import typings.floatingUiDom.srcTypesMod.Middleware
import typings.floatingUiDom.srcTypesMod.MiddlewareState
import typings.floatingUiDom.srcTypesMod.Platform_
import typings.floatingUiDom.srcTypesMod.ReferenceElement
import typings.floatingUiDom.srcUtilsIsMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Boundary extends StObject {
    
    var boundary: typings.floatingUiDom.srcTypesMod.Boundary
    
    var element: typings.std.Element
    
    var rootBoundary: RootBoundary
    
    var strategy: Strategy
  }
  object Boundary {
    
    inline def apply(
      boundary: typings.floatingUiDom.srcTypesMod.Boundary,
      element: typings.std.Element,
      rootBoundary: RootBoundary,
      strategy: Strategy
    ): Boundary = {
      val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Boundary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Boundary] (val x: Self) extends AnyVal {
      
      inline def setBoundary(value: typings.floatingUiDom.srcTypesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryVarargs(value: typings.std.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
      
      inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @floating-ui/core.@floating-ui/core.Dimensions & {  $ :boolean} */
  trait Dimensionsboolean extends StObject {
    
    @JSName("$")
    var $: Boolean
    
    var height: Double
    
    var width: Double
  }
  object Dimensionsboolean {
    
    inline def apply($: Boolean, height: Double, width: Double): Dimensionsboolean = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensionsboolean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dimensionsboolean] (val x: Self) extends AnyVal {
      
      inline def set$(value: Boolean): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element extends StObject {
    
    var boundary: typings.floatingUiCore.srcTypesMod.Boundary
    
    var element: typings.std.Element
    
    var rootBoundary: RootBoundary
    
    var strategy: Strategy
  }
  object Element {
    
    inline def apply(
      boundary: typings.floatingUiCore.srcTypesMod.Boundary,
      element: typings.std.Element,
      rootBoundary: RootBoundary,
      strategy: Strategy
    ): Element = {
      val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      inline def setBoundary(value: typings.floatingUiCore.srcTypesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  trait Floating extends StObject {
    
    var floating: FloatingElement
    
    var reference: ReferenceElement
    
    var strategy: Strategy
  }
  object Floating {
    
    inline def apply(floating: FloatingElement, reference: ReferenceElement, strategy: Strategy): Floating = {
      val __obj = js.Dynamic.literal(floating = floating.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Floating]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Floating] (val x: Self) extends AnyVal {
      
      inline def setFloating(value: FloatingElement): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setReference(value: ReferenceElement): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fn extends StObject {
    
    def fn(state: MiddlewareState): Coords
    
    var options: Any
  }
  object Fn {
    
    inline def apply(fn: MiddlewareState => Coords, options: Any): Fn = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fn] (val x: Self) extends AnyVal {
      
      inline def setFn(value: MiddlewareState => Coords): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @floating-ui/dom.@floating-ui/dom/src/types.MiddlewareState & {  availableWidth :number,   availableHeight :number} */
  trait MiddlewareStateavailableW extends StObject {
    
    var availableHeight: Double
    
    var availableWidth: Double
    
    var elements: Elements
    
    var initialPlacement: Placement
    
    var middlewareData: MiddlewareData
    
    var placement: Placement
    
    var platform: Platform
    
    var rects: ElementRects
    
    var strategy: Strategy
    
    var x: Double
    
    var y: Double
  }
  object MiddlewareStateavailableW {
    
    inline def apply(
      availableHeight: Double,
      availableWidth: Double,
      elements: Elements,
      initialPlacement: Placement,
      middlewareData: MiddlewareData,
      placement: Placement,
      platform: Platform,
      rects: ElementRects,
      strategy: Strategy,
      x: Double,
      y: Double
    ): MiddlewareStateavailableW = {
      val __obj = js.Dynamic.literal(availableHeight = availableHeight.asInstanceOf[js.Any], availableWidth = availableWidth.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], initialPlacement = initialPlacement.asInstanceOf[js.Any], middlewareData = middlewareData.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], rects = rects.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareStateavailableW]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiddlewareStateavailableW] (val x: Self) extends AnyVal {
      
      inline def setAvailableHeight(value: Double): Self = StObject.set(x, "availableHeight", value.asInstanceOf[js.Any])
      
      inline def setAvailableWidth(value: Double): Self = StObject.set(x, "availableWidth", value.asInstanceOf[js.Any])
      
      inline def setElements(value: Elements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setInitialPlacement(value: Placement): Self = StObject.set(x, "initialPlacement", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareData(value: MiddlewareData): Self = StObject.set(x, "middlewareData", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setRects(value: ElementRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait OffsetParent extends StObject {
    
    var offsetParent: typings.std.Element
    
    var rect: typings.floatingUiCore.srcTypesMod.Rect
    
    var strategy: Strategy
  }
  object OffsetParent {
    
    inline def apply(
      offsetParent: typings.std.Element,
      rect: typings.floatingUiCore.srcTypesMod.Rect,
      strategy: Strategy
    ): OffsetParent = {
      val __obj = js.Dynamic.literal(offsetParent = offsetParent.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetParent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OffsetParent] (val x: Self) extends AnyVal {
      
      inline def setOffsetParent(value: typings.std.Element): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      inline def setRect(value: typings.floatingUiCore.srcTypesMod.Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@floating-ui/dom.@floating-ui/dom/src/types.ComputePositionConfig> */
  trait PartialComputePositionCon extends StObject {
    
    var middleware: js.UndefOr[js.Array[js.UndefOr[Middleware | Null | `false`]]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var platform: js.UndefOr[Platform_] = js.undefined
    
    var strategy: js.UndefOr[Strategy] = js.undefined
  }
  object PartialComputePositionCon {
    
    inline def apply(): PartialComputePositionCon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialComputePositionCon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialComputePositionCon] (val x: Self) extends AnyVal {
      
      inline def setMiddleware(value: js.Array[js.UndefOr[Middleware | Null | `false`]]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      inline def setMiddlewareVarargs(value: (js.UndefOr[Middleware | Null | `false`])*): Self = StObject.set(x, "middleware", js.Array(value*))
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPlatform(value: Platform_): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  trait Rect extends StObject {
    
    var offsetParent: typings.std.Element | Window
    
    var rect: typings.floatingUiCore.srcTypesMod.Rect
    
    var strategy: Strategy
  }
  object Rect {
    
    inline def apply(
      offsetParent: typings.std.Element | Window,
      rect: typings.floatingUiCore.srcTypesMod.Rect,
      strategy: Strategy
    ): Rect = {
      val __obj = js.Dynamic.literal(offsetParent = offsetParent.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      inline def setOffsetParent(value: typings.std.Element | Window): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      inline def setRect(value: typings.floatingUiCore.srcTypesMod.Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
