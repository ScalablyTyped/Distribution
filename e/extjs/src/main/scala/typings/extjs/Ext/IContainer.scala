package typings.extjs.Ext

import typings.extjs.Ext.container.IAbstractContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContainer
  extends StObject
     with IAbstractContainer {
  
  /** [Config Option] (Number/Object) */
  var anchorSize: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Return the immediate child Component in which the passed element is located
    * @param el Ext.Element/HTMLElement/String The element to test (or ID of element).
    * @param deep Boolean If true, returns the deepest descendant Component which contains the passed element.
    * @returns Ext.Component The child item which contains the passed element.
    */
  var getChildByElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean], IComponent]
  ] = js.undefined
}
object IContainer {
  
  inline def apply(): IContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainer]
  }
  
  extension [Self <: IContainer](x: Self) {
    
    inline def setAnchorSize(value: js.Any): Self = StObject.set(x, "anchorSize", value.asInstanceOf[js.Any])
    
    inline def setAnchorSizeUndefined: Self = StObject.set(x, "anchorSize", js.undefined)
    
    inline def setGetChildByElement(value: (/* el */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => IComponent): Self = StObject.set(x, "getChildByElement", js.Any.fromFunction2(value))
    
    inline def setGetChildByElementUndefined: Self = StObject.set(x, "getChildByElement", js.undefined)
  }
}
