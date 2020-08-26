package typings.extjs.Ext.panel

import typings.extjs.Ext.Array
import typings.extjs.Ext.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeader extends IContainer {
  /** [Method] Add a tool to the header
    * @param tool Object
    */
  var addTool: js.UndefOr[js.Function1[/* tool */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] inherit docs
    * @param cls Object
    */
  @JSName("addUIClsToElement")
  var addUIClsToElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components  */
  @JSName("afterLayout")
  var afterLayout_IHeader: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the tools for this header
    * @returns Ext.panel.Tool[] The tools
    */
  var getTools: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var isHeader: js.UndefOr[Boolean] = js.native
  /** [Method] Set up the tools lt tool type gt link in the owning Panel
    * @param component Object
    * @param index Object
    */
  @JSName("onAdd")
  var onAdd_IHeader: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] inherit docs
    * @param cls Object
    */
  @JSName("removeUIClsFromElement")
  var removeUIClsFromElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets glyph that provides the icon image for this header
    * @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
    */
  var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the image path that provides the icon image for this header
    * @param icon String The new icon path
    */
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the CSS class that provides the icon image for this header
    * @param cls String The new CSS class name
    */
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the title of the header
    * @param title String The title to be set
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var titlePosition: js.UndefOr[Double] = js.native
}

object IHeader {
  @scala.inline
  def apply(): IHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeader]
  }
  @scala.inline
  implicit class IHeaderOps[Self <: IHeader] (val x: Self) extends AnyVal {
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
    def setAddTool(value: /* tool */ js.UndefOr[js.Any] => Unit): Self = this.set("addTool", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddTool: Self = this.set("addTool", js.undefined)
    @scala.inline
    def setAddUIClsToElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = this.set("addUIClsToElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddUIClsToElement: Self = this.set("addUIClsToElement", js.undefined)
    @scala.inline
    def setAfterLayout(value: () => Unit): Self = this.set("afterLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterLayout: Self = this.set("afterLayout", js.undefined)
    @scala.inline
    def setGetTools(value: () => Array): Self = this.set("getTools", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTools: Self = this.set("getTools", js.undefined)
    @scala.inline
    def setGlyph(value: js.Any): Self = this.set("glyph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconCls(value: String): Self = this.set("iconCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconCls: Self = this.set("iconCls", js.undefined)
    @scala.inline
    def setIsHeader(value: Boolean): Self = this.set("isHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHeader: Self = this.set("isHeader", js.undefined)
    @scala.inline
    def setOnAdd(value: (/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any]) => Unit): Self = this.set("onAdd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setRemoveUIClsFromElement(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = this.set("removeUIClsFromElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveUIClsFromElement: Self = this.set("removeUIClsFromElement", js.undefined)
    @scala.inline
    def setSetGlyph(value: /* glyph */ js.UndefOr[js.Any] => Unit): Self = this.set("setGlyph", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetGlyph: Self = this.set("setGlyph", js.undefined)
    @scala.inline
    def setSetIcon(value: /* icon */ js.UndefOr[String] => Unit): Self = this.set("setIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIcon: Self = this.set("setIcon", js.undefined)
    @scala.inline
    def setSetIconCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("setIconCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIconCls: Self = this.set("setIconCls", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleAlign(value: String): Self = this.set("titleAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAlign: Self = this.set("titleAlign", js.undefined)
    @scala.inline
    def setTitlePosition(value: Double): Self = this.set("titlePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlePosition: Self = this.set("titlePosition", js.undefined)
  }
  
}

