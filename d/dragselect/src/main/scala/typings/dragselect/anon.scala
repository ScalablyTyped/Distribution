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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var width: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{  area :std.HTMLElement | std.SVGElement | std.Document,   autoScrollSpeed :number, callback (selected : std.Array<std.HTMLElement | std.SVGElement>, event : std.MouseEvent | std.TouchEvent): void,   customStyles :boolean,   hoverClass :string,   multiSelectKeys :std.ReadonlyArray<'ctrlKey' | 'shiftKey' | 'metaKey' | 'altKey'>,   multiSelectMode :boolean, onDragMove (event : std.MouseEvent | std.TouchEvent): void, onDragStart (event : std.MouseEvent | std.TouchEvent): void, onDragStartBegin (event : std.MouseEvent | std.TouchEvent): void, onElementSelect (selected : std.HTMLElement | std.SVGElement): void, onElementUnselect (selected : std.HTMLElement | std.SVGElement): void,   selectableClass :string,   selectables :std.ArrayLike<std.HTMLElement | std.SVGElement> | std.HTMLElement | std.SVGElement,   selectedClass :string,   selector :std.HTMLElement,   selectorClass :string,   zoom :number}> */
  trait PartialareaHTMLElementSVG extends StObject {
    
    var area: js.UndefOr[HTMLElement | SVGElement | Document] = js.undefined
    
    var autoScrollSpeed: js.UndefOr[Double] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* selected */ js.Array[HTMLElement | SVGElement], 
          /* event */ MouseEvent | TouchEvent, 
          Unit
        ]
      ] = js.undefined
    
    var customStyles: js.UndefOr[Boolean] = js.undefined
    
    var hoverClass: js.UndefOr[String] = js.undefined
    
    var multiSelectKeys: js.UndefOr[js.Array[ctrlKey | shiftKey | metaKey | altKey]] = js.undefined
    
    var multiSelectMode: js.UndefOr[Boolean] = js.undefined
    
    var onDragMove: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.undefined
    
    var onDragStartBegin: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.undefined
    
    var onElementSelect: js.UndefOr[js.Function1[/* selected */ HTMLElement | SVGElement, Unit]] = js.undefined
    
    var onElementUnselect: js.UndefOr[js.Function1[/* selected */ HTMLElement | SVGElement, Unit]] = js.undefined
    
    var selectableClass: js.UndefOr[String] = js.undefined
    
    var selectables: js.UndefOr[(ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement] = js.undefined
    
    var selectedClass: js.UndefOr[String] = js.undefined
    
    var selector: js.UndefOr[HTMLElement] = js.undefined
    
    var selectorClass: js.UndefOr[String] = js.undefined
    
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object PartialareaHTMLElementSVG {
    
    inline def apply(): PartialareaHTMLElementSVG = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialareaHTMLElementSVG]
    }
    
    extension [Self <: PartialareaHTMLElementSVG](x: Self) {
      
      inline def setArea(value: HTMLElement | SVGElement | Document): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setAutoScrollSpeed(value: Double): Self = StObject.set(x, "autoScrollSpeed", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollSpeedUndefined: Self = StObject.set(x, "autoScrollSpeed", js.undefined)
      
      inline def setCallback(
        value: (/* selected */ js.Array[HTMLElement | SVGElement], /* event */ MouseEvent | TouchEvent) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCustomStyles(value: Boolean): Self = StObject.set(x, "customStyles", value.asInstanceOf[js.Any])
      
      inline def setCustomStylesUndefined: Self = StObject.set(x, "customStyles", js.undefined)
      
      inline def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
      
      inline def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
      
      inline def setMultiSelectKeys(value: js.Array[ctrlKey | shiftKey | metaKey | altKey]): Self = StObject.set(x, "multiSelectKeys", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectKeysUndefined: Self = StObject.set(x, "multiSelectKeys", js.undefined)
      
      inline def setMultiSelectKeysVarargs(value: (ctrlKey | shiftKey | metaKey | altKey)*): Self = StObject.set(x, "multiSelectKeys", js.Array(value :_*))
      
      inline def setMultiSelectMode(value: Boolean): Self = StObject.set(x, "multiSelectMode", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectModeUndefined: Self = StObject.set(x, "multiSelectMode", js.undefined)
      
      inline def setOnDragMove(value: /* event */ MouseEvent | TouchEvent => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
      
      inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
      
      inline def setOnDragStart(value: /* event */ MouseEvent | TouchEvent => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartBegin(value: /* event */ MouseEvent | TouchEvent => Unit): Self = StObject.set(x, "onDragStartBegin", js.Any.fromFunction1(value))
      
      inline def setOnDragStartBeginUndefined: Self = StObject.set(x, "onDragStartBegin", js.undefined)
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnElementSelect(value: /* selected */ HTMLElement | SVGElement => Unit): Self = StObject.set(x, "onElementSelect", js.Any.fromFunction1(value))
      
      inline def setOnElementSelectUndefined: Self = StObject.set(x, "onElementSelect", js.undefined)
      
      inline def setOnElementUnselect(value: /* selected */ HTMLElement | SVGElement => Unit): Self = StObject.set(x, "onElementUnselect", js.Any.fromFunction1(value))
      
      inline def setOnElementUnselectUndefined: Self = StObject.set(x, "onElementUnselect", js.undefined)
      
      inline def setSelectableClass(value: String): Self = StObject.set(x, "selectableClass", value.asInstanceOf[js.Any])
      
      inline def setSelectableClassUndefined: Self = StObject.set(x, "selectableClass", js.undefined)
      
      inline def setSelectables(value: (ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement): Self = StObject.set(x, "selectables", value.asInstanceOf[js.Any])
      
      inline def setSelectablesUndefined: Self = StObject.set(x, "selectables", js.undefined)
      
      inline def setSelectedClass(value: String): Self = StObject.set(x, "selectedClass", value.asInstanceOf[js.Any])
      
      inline def setSelectedClassUndefined: Self = StObject.set(x, "selectedClass", js.undefined)
      
      inline def setSelector(value: HTMLElement): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorClass(value: String): Self = StObject.set(x, "selectorClass", value.asInstanceOf[js.Any])
      
      inline def setSelectorClassUndefined: Self = StObject.set(x, "selectorClass", js.undefined)
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
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
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Y {
    
    inline def apply(x: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    extension [Self <: Y](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
