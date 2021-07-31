package typings.extjs.Ext.layout

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClassList
  extends StObject
     with IBase {
  
  /** [Method] Adds a single class to the class list
    * @param cls Object
    */
  var add: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Adds one or more classes in an array or space delimited string to the class list
    * @param classes Object
    */
  var addMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Removes a single class from the class list
    * @param cls Object
    */
  var remove: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Removes one or more classes in an array or space delimited string from the class list
    * @param classes Object
    */
  var removeMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], Unit]] = js.undefined
}
object IClassList {
  
  @scala.inline
  def apply(): IClassList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClassList]
  }
  
  @scala.inline
  implicit class IClassListMutableBuilder[Self <: IClassList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMany(value: /* classes */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addMany", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddManyUndefined: Self = StObject.set(x, "addMany", js.undefined)
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setRemove(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMany(value: /* classes */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "removeMany", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveManyUndefined: Self = StObject.set(x, "removeMany", js.undefined)
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
