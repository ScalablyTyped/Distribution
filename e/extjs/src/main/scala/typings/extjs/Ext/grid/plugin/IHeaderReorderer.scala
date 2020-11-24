package typings.extjs.Ext.grid.plugin

import typings.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHeaderReorderer extends IAbstractPlugin {
  
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
    * @param headerCt Object
    */
  @JSName("init")
  var init_IHeaderReorderer: js.UndefOr[js.Function1[/* headerCt */ js.UndefOr[js.Any], Unit]] = js.native
}
object IHeaderReorderer {
  
  @scala.inline
  def apply(): IHeaderReorderer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeaderReorderer]
  }
  
  @scala.inline
  implicit class IHeaderReordererOps[Self <: IHeaderReorderer] (val x: Self) extends AnyVal {
    
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
    def setInit(value: /* headerCt */ js.UndefOr[js.Any] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
  }
}
