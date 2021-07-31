package typings.extjs.Ext.form

import typings.extjs.Ext.IComponent
import typings.extjs.Ext.form.field.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHidden
  extends StObject
     with IBase {
  
  /** [Method] Clear any invalid styles messages for this field  */
  @JSName("clearInvalid")
  var clearInvalid_IHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag  */
  @JSName("markInvalid")
  var markInvalid_IHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the height of the component
    * @returns Ext.Component this
    */
  @JSName("setHeight")
  var setHeight_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the page XY position of the component
    * @returns Ext.Component this
    */
  @JSName("setPagePosition")
  var setPagePosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the left and top of the component
    * @returns Ext.Component this
    */
  @JSName("setPosition")
  var setPosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the width and height of this Component
    * @returns Ext.Component this
    */
  @JSName("setSize")
  var setSize_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the width of the component
    * @returns Ext.Component this
    */
  @JSName("setWidth")
  var setWidth_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
}
object IHidden {
  
  @scala.inline
  def apply(): IHidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHidden]
  }
  
  @scala.inline
  implicit class IHiddenMutableBuilder[Self <: IHidden] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearInvalid(value: () => Unit): Self = StObject.set(x, "clearInvalid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
    
    @scala.inline
    def setMarkInvalid(value: () => Unit): Self = StObject.set(x, "markInvalid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkInvalidUndefined: Self = StObject.set(x, "markInvalid", js.undefined)
    
    @scala.inline
    def setSetHeight(value: () => IComponent): Self = StObject.set(x, "setHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    @scala.inline
    def setSetPagePosition(value: () => IComponent): Self = StObject.set(x, "setPagePosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPagePositionUndefined: Self = StObject.set(x, "setPagePosition", js.undefined)
    
    @scala.inline
    def setSetPosition(value: () => IComponent): Self = StObject.set(x, "setPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
    
    @scala.inline
    def setSetSize(value: () => IComponent): Self = StObject.set(x, "setSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
    
    @scala.inline
    def setSetWidth(value: () => IComponent): Self = StObject.set(x, "setWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
  }
}
