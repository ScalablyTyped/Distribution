package typings.extjs.Ext.view

import typings.extjs.Ext.util.IKeyNav
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBoundListKeyNav extends IKeyNav {
  
  /** [Config Option] (Ext.view.BoundList) */
  var boundList: js.UndefOr[IBoundList] = js.native
  
  /** [Method] Highlights the item at the given index
    * @param index Number
    */
  var highlightAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Triggers selection of the currently highlighted item according to the behavior of the configured SelectionModel
    * @param e Object
    */
  var selectHighlighted: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
}
object IBoundListKeyNav {
  
  @scala.inline
  def apply(): IBoundListKeyNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoundListKeyNav]
  }
  
  @scala.inline
  implicit class IBoundListKeyNavOps[Self <: IBoundListKeyNav] (val x: Self) extends AnyVal {
    
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
    def setBoundList(value: IBoundList): Self = this.set("boundList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundList: Self = this.set("boundList", js.undefined)
    
    @scala.inline
    def setHighlightAt(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("highlightAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHighlightAt: Self = this.set("highlightAt", js.undefined)
    
    @scala.inline
    def setSelectHighlighted(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("selectHighlighted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectHighlighted: Self = this.set("selectHighlighted", js.undefined)
  }
}
