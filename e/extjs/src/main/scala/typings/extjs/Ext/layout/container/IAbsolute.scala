package typings.extjs.Ext.layout.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbsolute extends IAnchor {
  /** [Config Option] (Boolean) */
  var ignoreOnContentChange: js.UndefOr[Boolean] = js.native
  /** [Method] This method is called when a child item changes in some way
    * @returns Boolean True if this layout has handled the content change.
    */
  @JSName("onContentChange")
  var onContentChange_IAbsolute: js.UndefOr[js.Function0[Boolean]] = js.native
}

object IAbsolute {
  @scala.inline
  def apply(): IAbsolute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbsolute]
  }
  @scala.inline
  implicit class IAbsoluteOps[Self <: IAbsolute] (val x: Self) extends AnyVal {
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
    def setIgnoreOnContentChange(value: Boolean): Self = this.set("ignoreOnContentChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreOnContentChange: Self = this.set("ignoreOnContentChange", js.undefined)
    @scala.inline
    def setOnContentChange(value: () => Boolean): Self = this.set("onContentChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnContentChange: Self = this.set("onContentChange", js.undefined)
  }
  
}

