package typings.extjs.Ext.layout

import typings.extjs.Ext.layout.container.IAuto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnLayout
  extends StObject
     with IAuto {
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IColumnLayout: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.undefined
  
  /** [Method] This method sets the height and or width of the outerCt innerCt to adjust for the following browser specific issues
    * @param ownerContext Object
    * @param containerSize Object
    */
  @JSName("setCtSizeIfNeeded")
  var setCtSizeIfNeeded_IColumnLayout: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[js.Any], /* containerSize */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}
object IColumnLayout {
  
  @scala.inline
  def apply(): IColumnLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnLayout]
  }
  
  @scala.inline
  implicit class IColumnLayoutMutableBuilder[Self <: IColumnLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetItemSizePolicy(value: (/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any]) => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setSetCtSizeIfNeeded(value: (/* ownerContext */ js.UndefOr[js.Any], /* containerSize */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setCtSizeIfNeeded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetCtSizeIfNeededUndefined: Self = StObject.set(x, "setCtSizeIfNeeded", js.undefined)
  }
}
