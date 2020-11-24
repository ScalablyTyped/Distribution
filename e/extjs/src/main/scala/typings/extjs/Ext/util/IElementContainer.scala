package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElementContainer extends IBase {
  
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
    * @param testFn Function The test function.
    */
  var removeChildEls: js.UndefOr[js.Function1[/* testFn */ js.UndefOr[js.Any], Unit]] = js.native
}
object IElementContainer {
  
  @scala.inline
  def apply(): IElementContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementContainer]
  }
  
  @scala.inline
  implicit class IElementContainerOps[Self <: IElementContainer] (val x: Self) extends AnyVal {
    
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
    def setAddChildEls(value: () => Unit): Self = this.set("addChildEls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAddChildEls: Self = this.set("addChildEls", js.undefined)
    
    @scala.inline
    def setRemoveChildEls(value: /* testFn */ js.UndefOr[js.Any] => Unit): Self = this.set("removeChildEls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveChildEls: Self = this.set("removeChildEls", js.undefined)
  }
}
