package typings.dragselect

import typings.dragselect.dragselectStrings.altKey
import typings.dragselect.dragselectStrings.ctrlKey
import typings.dragselect.dragselectStrings.metaKey
import typings.dragselect.dragselectStrings.shiftKey
import typings.std.ArrayLike
import typings.std.Document
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.SVGElement
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{  area :std.HTMLElement | std.SVGElement | std.Document,   autoScrollSpeed :number, callback (selected : std.Array<std.HTMLElement | std.SVGElement>, event : std.MouseEvent | std.TouchEvent): void,   customStyles :boolean,   hoverClass :string,   multiSelectKeys :std.ReadonlyArray<'ctrlKey' | 'shiftKey' | 'metaKey' | 'altKey'>,   multiSelectMode :boolean, onDragMove (event : std.MouseEvent | std.TouchEvent): void, onDragStart (event : std.MouseEvent | std.TouchEvent): void, onDragStartBegin (event : std.MouseEvent | std.TouchEvent): void, onElementSelect (selected : std.HTMLElement | std.SVGElement): void, onElementUnselect (selected : std.HTMLElement | std.SVGElement): void,   selectableClass :string,   selectables :std.ArrayLike<std.HTMLElement | std.SVGElement> | std.HTMLElement | std.SVGElement,   selectedClass :string,   selector :std.HTMLElement,   selectorClass :string,   zoom :number}> */
  @js.native
  trait PartialareaHTMLElementSVG extends StObject {
    
    var area: js.UndefOr[HTMLElement | SVGElement | Document] = js.native
    
    var autoScrollSpeed: js.UndefOr[Double] = js.native
    
    var callback: js.UndefOr[
        js.Function2[
          /* selected */ js.Array[HTMLElement | SVGElement], 
          /* event */ MouseEvent | TouchEvent, 
          Unit
        ]
      ] = js.native
    
    var customStyles: js.UndefOr[Boolean] = js.native
    
    var hoverClass: js.UndefOr[String] = js.native
    
    var multiSelectKeys: js.UndefOr[js.Array[ctrlKey | shiftKey | metaKey | altKey]] = js.native
    
    var multiSelectMode: js.UndefOr[Boolean] = js.native
    
    var onDragMove: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.native
    
    var onDragStart: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.native
    
    var onDragStartBegin: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.native
    
    var onElementSelect: js.UndefOr[js.Function1[/* selected */ HTMLElement | SVGElement, Unit]] = js.native
    
    var onElementUnselect: js.UndefOr[js.Function1[/* selected */ HTMLElement | SVGElement, Unit]] = js.native
    
    var selectableClass: js.UndefOr[String] = js.native
    
    var selectables: js.UndefOr[(ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement] = js.native
    
    var selectedClass: js.UndefOr[String] = js.native
    
    var selector: js.UndefOr[HTMLElement] = js.native
    
    var selectorClass: js.UndefOr[String] = js.native
    
    var zoom: js.UndefOr[Double] = js.native
  }
  object PartialareaHTMLElementSVG {
    
    @scala.inline
    def apply(): PartialareaHTMLElementSVG = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialareaHTMLElementSVG]
    }
    
    @scala.inline
    implicit class PartialareaHTMLElementSVGMutableBuilder[Self <: PartialareaHTMLElementSVG] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea(value: HTMLElement | SVGElement | Document): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      @scala.inline
      def setAutoScrollSpeed(value: Double): Self = StObject.set(x, "autoScrollSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScrollSpeedUndefined: Self = StObject.set(x, "autoScrollSpeed", js.undefined)
      
      @scala.inline
      def setCallback(
        value: (/* selected */ js.Array[HTMLElement | SVGElement], /* event */ MouseEvent | TouchEvent) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCustomStyles(value: Boolean): Self = StObject.set(x, "customStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomStylesUndefined: Self = StObject.set(x, "customStyles", js.undefined)
      
      @scala.inline
      def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
      
      @scala.inline
      def setMultiSelectKeys(value: js.Array[ctrlKey | shiftKey | metaKey | altKey]): Self = StObject.set(x, "multiSelectKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectKeysUndefined: Self = StObject.set(x, "multiSelectKeys", js.undefined)
      
      @scala.inline
      def setMultiSelectKeysVarargs(value: (ctrlKey | shiftKey | metaKey | altKey)*): Self = StObject.set(x, "multiSelectKeys", js.Array(value :_*))
      
      @scala.inline
      def setMultiSelectMode(value: Boolean): Self = StObject.set(x, "multiSelectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectModeUndefined: Self = StObject.set(x, "multiSelectMode", js.undefined)
      
      @scala.inline
      def setOnDragMove(value: /* event */ MouseEvent | TouchEvent => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* event */ MouseEvent | TouchEvent => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartBegin(value: /* event */ MouseEvent | TouchEvent => Unit): Self = StObject.set(x, "onDragStartBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartBeginUndefined: Self = StObject.set(x, "onDragStartBegin", js.undefined)
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnElementSelect(value: /* selected */ HTMLElement | SVGElement => Unit): Self = StObject.set(x, "onElementSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnElementSelectUndefined: Self = StObject.set(x, "onElementSelect", js.undefined)
      
      @scala.inline
      def setOnElementUnselect(value: /* selected */ HTMLElement | SVGElement => Unit): Self = StObject.set(x, "onElementUnselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnElementUnselectUndefined: Self = StObject.set(x, "onElementUnselect", js.undefined)
      
      @scala.inline
      def setSelectableClass(value: String): Self = StObject.set(x, "selectableClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableClassUndefined: Self = StObject.set(x, "selectableClass", js.undefined)
      
      @scala.inline
      def setSelectables(value: (ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement): Self = StObject.set(x, "selectables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectablesUndefined: Self = StObject.set(x, "selectables", js.undefined)
      
      @scala.inline
      def setSelectedClass(value: String): Self = StObject.set(x, "selectedClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedClassUndefined: Self = StObject.set(x, "selectedClass", js.undefined)
      
      @scala.inline
      def setSelector(value: HTMLElement): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorClass(value: String): Self = StObject.set(x, "selectorClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorClassUndefined: Self = StObject.set(x, "selectorClass", js.undefined)
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Y extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Y {
    
    @scala.inline
    def apply(x: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
