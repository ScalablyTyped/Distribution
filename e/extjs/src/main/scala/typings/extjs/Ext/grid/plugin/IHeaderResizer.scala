package typings.extjs.Ext.grid.plugin

import typings.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderResizer extends IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of dynamic
    * @returns Boolean
    */
  var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] not using w and e resize bc we are only ever resizing one column wResizeCursor Ext isWebKit w resize  col resi
    * @param headerCt Object
    */
  @JSName("init")
  var init_IHeaderResizer: js.UndefOr[js.Function1[/* headerCt */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of dynamic
    * @param dynamic Boolean
    */
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.native
}

object IHeaderResizer {
  @scala.inline
  def apply(): IHeaderResizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeaderResizer]
  }
  @scala.inline
  implicit class IHeaderResizerOps[Self <: IHeaderResizer] (val x: Self) extends AnyVal {
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
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
    @scala.inline
    def setGetDynamic(value: () => Boolean): Self = this.set("getDynamic", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDynamic: Self = this.set("getDynamic", js.undefined)
    @scala.inline
    def setInit(value: /* headerCt */ js.UndefOr[js.Any] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setSetDynamic(value: /* dynamic */ js.UndefOr[Boolean] => Unit): Self = this.set("setDynamic", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDynamic: Self = this.set("setDynamic", js.undefined)
  }
  
}

