package typings.electron.Electron

import typings.electron.electronStrings.background
import typings.electron.electronStrings.fixed
import typings.electron.electronStrings.free
import typings.electron.electronStrings.none
import typings.electron.electronStrings.outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarScrubberConstructorOptions extends StObject {
  
  /**
    * Defaults to `true`.
    */
  var continuous: js.UndefOr[Boolean] = js.native
  
  /**
    * Called when the user taps any item.
    */
  var highlight: js.UndefOr[js.Function1[/* highlightedIndex */ Double, Unit]] = js.native
  
  /**
    * An array of items to place in this scrubber.
    */
  var items: js.Array[ScrubberItem] = js.native
  
  /**
    * Can be `fixed` or `free`. The default is `free`.
    */
  var mode: js.UndefOr[fixed | free] = js.native
  
  /**
    * Selected overlay item style. Can be `background`, `outline` or `none`. Defaults
    * to `none`.
    */
  var overlayStyle: js.UndefOr[background | outline | none] = js.native
  
  /**
    * Called when the user taps an item that was not the last tapped item.
    */
  var select: js.UndefOr[js.Function1[/* selectedIndex */ Double, Unit]] = js.native
  
  /**
    * Selected item style. Can be `background`, `outline` or `none`. Defaults to
    * `none`.
    */
  var selectedStyle: js.UndefOr[background | outline | none] = js.native
  
  /**
    * Defaults to `false`.
    */
  var showArrowButtons: js.UndefOr[Boolean] = js.native
}
object TouchBarScrubberConstructorOptions {
  
  @scala.inline
  def apply(items: js.Array[ScrubberItem]): TouchBarScrubberConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarScrubberConstructorOptions]
  }
  
  @scala.inline
  implicit class TouchBarScrubberConstructorOptionsMutableBuilder[Self <: TouchBarScrubberConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    @scala.inline
    def setHighlight(value: /* highlightedIndex */ Double => Unit): Self = StObject.set(x, "highlight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ScrubberItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ScrubberItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: fixed | free): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOverlayStyle(value: background | outline | none): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    @scala.inline
    def setSelect(value: /* selectedIndex */ Double => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelectedStyle(value: background | outline | none): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
    
    @scala.inline
    def setShowArrowButtons(value: Boolean): Self = StObject.set(x, "showArrowButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowArrowButtonsUndefined: Self = StObject.set(x, "showArrowButtons", js.undefined)
  }
}
