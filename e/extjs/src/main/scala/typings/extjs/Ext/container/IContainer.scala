package typings.extjs.Ext.container

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContainer extends IAbstractContainer {
  /** [Config Option] (Number/Object) */
  var anchorSize: js.UndefOr[js.Any] = js.native
  /** [Method] Return the immediate child Component in which the passed element is located
    * @param el Ext.Element/HTMLElement/String The element to test (or ID of element).
    * @param deep Boolean If true, returns the deepest descendant Component which contains the passed element.
    * @returns Ext.Component The child item which contains the passed element.
    */
  var getChildByElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean], IComponent]
  ] = js.native
}

object IContainer {
  @scala.inline
  def apply(): IContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainer]
  }
  @scala.inline
  implicit class IContainerOps[Self <: IContainer] (val x: Self) extends AnyVal {
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
    def setAnchorSize(value: js.Any): Self = this.set("anchorSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorSize: Self = this.set("anchorSize", js.undefined)
    @scala.inline
    def setGetChildByElement(value: (/* el */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => IComponent): Self = this.set("getChildByElement", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetChildByElement: Self = this.set("getChildByElement", js.undefined)
  }
  
}

