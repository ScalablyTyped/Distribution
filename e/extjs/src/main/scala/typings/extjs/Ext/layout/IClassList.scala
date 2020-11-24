package typings.extjs.Ext.layout

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClassList extends IBase {
  
  /** [Method] Adds a single class to the class list
    * @param cls Object
    */
  var add: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Adds one or more classes in an array or space delimited string to the class list
    * @param classes Object
    */
  var addMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Removes a single class from the class list
    * @param cls Object
    */
  var remove: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Removes one or more classes in an array or space delimited string from the class list
    * @param classes Object
    */
  var removeMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], Unit]] = js.native
}
object IClassList {
  
  @scala.inline
  def apply(): IClassList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClassList]
  }
  
  @scala.inline
  implicit class IClassListOps[Self <: IClassList] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAddMany(value: /* classes */ js.UndefOr[js.Any] => Unit): Self = this.set("addMany", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddMany: Self = this.set("addMany", js.undefined)
    
    @scala.inline
    def setRemove(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRemoveMany(value: /* classes */ js.UndefOr[js.Any] => Unit): Self = this.set("removeMany", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveMany: Self = this.set("removeMany", js.undefined)
  }
}
