package typings.extjs.Ext.util

import typings.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGrouper extends ISorter {
  
  /** [Method] Returns the value for grouping to be used
    * @param instance Ext.data.Model The Model instance
    * @returns String The group string for this model
    */
  var getGroupString: js.UndefOr[js.Function1[/* instance */ js.UndefOr[IModel], String]] = js.native
}
object IGrouper {
  
  @scala.inline
  def apply(): IGrouper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrouper]
  }
  
  @scala.inline
  implicit class IGrouperOps[Self <: IGrouper] (val x: Self) extends AnyVal {
    
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
    def setGetGroupString(value: /* instance */ js.UndefOr[IModel] => String): Self = this.set("getGroupString", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetGroupString: Self = this.set("getGroupString", js.undefined)
  }
}
