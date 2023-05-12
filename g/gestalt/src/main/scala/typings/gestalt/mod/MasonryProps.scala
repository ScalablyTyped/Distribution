package typings.gestalt.mod

import typings.gestalt.anon.Data
import typings.gestalt.anon.From
import typings.gestalt.gestaltBooleans.`false`
import typings.gestalt.gestaltStrings.basic
import typings.gestalt.gestaltStrings.basicCentered
import typings.gestalt.gestaltStrings.flexible
import typings.gestalt.gestaltStrings.serverRenderedFlexible
import typings.gestalt.gestaltStrings.uniformRow
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasonryProps[T] extends StObject {
  
  var _batchPaints: js.UndefOr[Boolean] = js.undefined
  
  var columnWidth: js.UndefOr[Double] = js.undefined
  
  var gutterWidth: js.UndefOr[Double] = js.undefined
  
  var items: js.Array[T]
  
  var layout: js.UndefOr[basic | basicCentered | flexible | serverRenderedFlexible | uniformRow] = js.undefined
  
  var loadItems: js.UndefOr[
    `false` | (js.Function1[/* _arg */ js.UndefOr[From], js.UndefOr[Boolean | js.Object]])
  ] = js.undefined
  
  var measurementStore: js.UndefOr[MeasurementStore[T, Any]] = js.undefined
  
  var minCols: js.UndefOr[Double] = js.undefined
  
  def renderItem(args: Data[T]): Node
  
  var scrollContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  
  var virtualBoundsBottom: js.UndefOr[Double] = js.undefined
  
  var virtualBoundsTop: js.UndefOr[Double] = js.undefined
  
  var virtualBufferFactor: js.UndefOr[Double] = js.undefined
  
  var virtualize: js.UndefOr[Boolean] = js.undefined
}
object MasonryProps {
  
  inline def apply[T](items: js.Array[T], renderItem: Data[T] => Node): MasonryProps[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem))
    __obj.asInstanceOf[MasonryProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MasonryProps[?], T] (val x: Self & MasonryProps[T]) extends AnyVal {
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setGutterWidth(value: Double): Self = StObject.set(x, "gutterWidth", value.asInstanceOf[js.Any])
    
    inline def setGutterWidthUndefined: Self = StObject.set(x, "gutterWidth", js.undefined)
    
    inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLayout(value: basic | basicCentered | flexible | serverRenderedFlexible | uniformRow): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLoadItems(value: `false` | (js.Function1[/* _arg */ js.UndefOr[From], js.UndefOr[Boolean | js.Object]])): Self = StObject.set(x, "loadItems", value.asInstanceOf[js.Any])
    
    inline def setLoadItemsFunction1(value: /* _arg */ js.UndefOr[From] => js.UndefOr[Boolean | js.Object]): Self = StObject.set(x, "loadItems", js.Any.fromFunction1(value))
    
    inline def setLoadItemsUndefined: Self = StObject.set(x, "loadItems", js.undefined)
    
    inline def setMeasurementStore(value: MeasurementStore[T, Any]): Self = StObject.set(x, "measurementStore", value.asInstanceOf[js.Any])
    
    inline def setMeasurementStoreUndefined: Self = StObject.set(x, "measurementStore", js.undefined)
    
    inline def setMinCols(value: Double): Self = StObject.set(x, "minCols", value.asInstanceOf[js.Any])
    
    inline def setMinColsUndefined: Self = StObject.set(x, "minCols", js.undefined)
    
    inline def setRenderItem(value: Data[T] => Node): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    inline def setScrollContainer(value: () => HTMLElement): Self = StObject.set(x, "scrollContainer", js.Any.fromFunction0(value))
    
    inline def setScrollContainerUndefined: Self = StObject.set(x, "scrollContainer", js.undefined)
    
    inline def setVirtualBoundsBottom(value: Double): Self = StObject.set(x, "virtualBoundsBottom", value.asInstanceOf[js.Any])
    
    inline def setVirtualBoundsBottomUndefined: Self = StObject.set(x, "virtualBoundsBottom", js.undefined)
    
    inline def setVirtualBoundsTop(value: Double): Self = StObject.set(x, "virtualBoundsTop", value.asInstanceOf[js.Any])
    
    inline def setVirtualBoundsTopUndefined: Self = StObject.set(x, "virtualBoundsTop", js.undefined)
    
    inline def setVirtualBufferFactor(value: Double): Self = StObject.set(x, "virtualBufferFactor", value.asInstanceOf[js.Any])
    
    inline def setVirtualBufferFactorUndefined: Self = StObject.set(x, "virtualBufferFactor", js.undefined)
    
    inline def setVirtualize(value: Boolean): Self = StObject.set(x, "virtualize", value.asInstanceOf[js.Any])
    
    inline def setVirtualizeUndefined: Self = StObject.set(x, "virtualize", js.undefined)
    
    inline def set_batchPaints(value: Boolean): Self = StObject.set(x, "_batchPaints", value.asInstanceOf[js.Any])
    
    inline def set_batchPaintsUndefined: Self = StObject.set(x, "_batchPaints", js.undefined)
  }
}
