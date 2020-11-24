package typings.dragselect.anon

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  area :std.HTMLElement | std.SVGElement | std.Document,   autoScrollSpeed :number, callback (selected : std.Array<std.HTMLElement | std.SVGElement>, event : std.MouseEvent | std.TouchEvent): void,   customStyles :boolean,   hoverClass :string,   multiSelectKeys :std.ReadonlyArray<'ctrlKey' | 'shiftKey' | 'metaKey' | 'altKey'>,   multiSelectMode :boolean, onDragMove (event : std.MouseEvent | std.TouchEvent): void, onDragStart (event : std.MouseEvent | std.TouchEvent): void, onDragStartBegin (event : std.MouseEvent | std.TouchEvent): void, onElementSelect (selected : std.HTMLElement | std.SVGElement): void, onElementUnselect (selected : std.HTMLElement | std.SVGElement): void,   selectableClass :string,   selectables :std.ArrayLike<std.HTMLElement | std.SVGElement> | std.HTMLElement | std.SVGElement,   selectedClass :string,   selector :std.HTMLElement,   selectorClass :string,   zoom :number}> */
@js.native
trait PartialareaHTMLElementSVG extends js.Object {
  
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
  implicit class PartialareaHTMLElementSVGOps[Self <: PartialareaHTMLElementSVG] (val x: Self) extends AnyVal {
    
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
    def setArea(value: HTMLElement | SVGElement | Document): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    
    @scala.inline
    def setAutoScrollSpeed(value: Double): Self = this.set("autoScrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScrollSpeed: Self = this.set("autoScrollSpeed", js.undefined)
    
    @scala.inline
    def setCallback(
      value: (/* selected */ js.Array[HTMLElement | SVGElement], /* event */ MouseEvent | TouchEvent) => Unit
    ): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCustomStyles(value: Boolean): Self = this.set("customStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomStyles: Self = this.set("customStyles", js.undefined)
    
    @scala.inline
    def setHoverClass(value: String): Self = this.set("hoverClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverClass: Self = this.set("hoverClass", js.undefined)
    
    @scala.inline
    def setMultiSelectKeysVarargs(value: (ctrlKey | shiftKey | metaKey | altKey)*): Self = this.set("multiSelectKeys", js.Array(value :_*))
    
    @scala.inline
    def setMultiSelectKeys(value: js.Array[ctrlKey | shiftKey | metaKey | altKey]): Self = this.set("multiSelectKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelectKeys: Self = this.set("multiSelectKeys", js.undefined)
    
    @scala.inline
    def setMultiSelectMode(value: Boolean): Self = this.set("multiSelectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelectMode: Self = this.set("multiSelectMode", js.undefined)
    
    @scala.inline
    def setOnDragMove(value: /* event */ MouseEvent | TouchEvent => Unit): Self = this.set("onDragMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* event */ MouseEvent | TouchEvent => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragStartBegin(value: /* event */ MouseEvent | TouchEvent => Unit): Self = this.set("onDragStartBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStartBegin: Self = this.set("onDragStartBegin", js.undefined)
    
    @scala.inline
    def setOnElementSelect(value: /* selected */ HTMLElement | SVGElement => Unit): Self = this.set("onElementSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnElementSelect: Self = this.set("onElementSelect", js.undefined)
    
    @scala.inline
    def setOnElementUnselect(value: /* selected */ HTMLElement | SVGElement => Unit): Self = this.set("onElementUnselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnElementUnselect: Self = this.set("onElementUnselect", js.undefined)
    
    @scala.inline
    def setSelectableClass(value: String): Self = this.set("selectableClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectableClass: Self = this.set("selectableClass", js.undefined)
    
    @scala.inline
    def setSelectables(value: (ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement): Self = this.set("selectables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectables: Self = this.set("selectables", js.undefined)
    
    @scala.inline
    def setSelectedClass(value: String): Self = this.set("selectedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedClass: Self = this.set("selectedClass", js.undefined)
    
    @scala.inline
    def setSelector(value: HTMLElement): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSelectorClass(value: String): Self = this.set("selectorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectorClass: Self = this.set("selectorClass", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
