package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISorter extends IBase {
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  
  /** [Method] Set the sorting direction for this sorter
    * @param direction String The direction to sort in. Should be either 'ASC' or 'DESC'.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (Function) */
  var sorterFn: js.UndefOr[js.Any] = js.native
  
  /** [Method] Toggles the sorting direction for this sorter  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Function) */
  var transform: js.UndefOr[js.Any] = js.native
  
  /** [Method] Update the sort function for this sorter
    * @param fn Function A new sorter function for this sorter. If not specified it will use the default sorting function.
    */
  var updateSortFunction: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.native
}
object ISorter {
  
  @scala.inline
  def apply(): ISorter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISorter]
  }
  
  @scala.inline
  implicit class ISorterOps[Self <: ISorter] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
    
    @scala.inline
    def setSorterFn(value: js.Any): Self = this.set("sorterFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorterFn: Self = this.set("sorterFn", js.undefined)
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Any): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setUpdateSortFunction(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = this.set("updateSortFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateSortFunction: Self = this.set("updateSortFunction", js.undefined)
  }
}
