package typings.extjs.Ext.chart

import typings.extjs.Ext.draw.ICompositeSprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILegendItem extends ICompositeSprite {
  
  /** [Method] Creates all the individual sprites for this legend item
    * @param config Object
    */
  var createLegend: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Update the positions of all this item s sprites to match the root position of the legend box
    * @param relativeTo Object If specified, this object's 'x' and 'y' values will be used as the reference point for the relative positioning. Defaults to the Legend.
    */
  var updatePosition: js.UndefOr[js.Function1[/* relativeTo */ js.UndefOr[js.Any], Unit]] = js.native
}
object ILegendItem {
  
  @scala.inline
  def apply(): ILegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILegendItem]
  }
  
  @scala.inline
  implicit class ILegendItemMutableBuilder[Self <: ILegendItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateLegend(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "createLegend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateLegendUndefined: Self = StObject.set(x, "createLegend", js.undefined)
    
    @scala.inline
    def setUpdatePosition(value: /* relativeTo */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "updatePosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdatePositionUndefined: Self = StObject.set(x, "updatePosition", js.undefined)
  }
}
