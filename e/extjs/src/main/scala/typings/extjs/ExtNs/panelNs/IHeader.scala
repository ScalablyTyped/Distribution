package typings.extjs.ExtNs.panelNs

import typings.extjs.ExtNs.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeader
  extends typings.extjs.ExtNs.containerNs.IContainer {
  /** [Method] Add a tool to the header
  		* @param tool Object
  		*/
  var addTool: js.UndefOr[js.Function1[/* tool */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("addUIClsToElement")
  var addUIClsToElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components  */
  @JSName("afterLayout")
  var afterLayout_IHeader: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the tools for this header
  		* @returns Ext.panel.Tool[] The tools
  		*/
  var getTools: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var isHeader: js.UndefOr[Boolean] = js.undefined
  /** [Method] Set up the tools lt tool type gt link in the owning Panel
  		* @param component Object
  		* @param index Object
  		*/
  @JSName("onAdd")
  var onAdd_IHeader: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] inherit docs
  		* @param cls Object
  		*/
  @JSName("removeUIClsFromElement")
  var removeUIClsFromElement_IHeader: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets glyph that provides the icon image for this header
  		* @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
  		*/
  var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the image path that provides the icon image for this header
  		* @param icon String The new icon path
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the CSS class that provides the icon image for this header
  		* @param cls String The new CSS class name
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the title of the header
  		* @param title String The title to be set
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var titlePosition: js.UndefOr[Double] = js.undefined
}

object IHeader {
  @scala.inline
  def apply(
    IContainer: typings.extjs.ExtNs.containerNs.IContainer = null,
    addTool: /* tool */ js.UndefOr[js.Any] => Unit = null,
    addUIClsToElement: /* cls */ js.UndefOr[js.Any] => Unit = null,
    afterLayout: () => Unit = null,
    beforeLayout: () => Unit = null,
    componentLayout: js.Any = null,
    defaultType: java.lang.String = null,
    getTools: () => Array = null,
    glyph: js.Any = null,
    icon: java.lang.String = null,
    iconCls: java.lang.String = null,
    isHeader: js.UndefOr[Boolean] = js.undefined,
    onAdd: (/* component */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any]) => Unit = null,
    removeUIClsFromElement: /* cls */ js.UndefOr[js.Any] => Unit = null,
    renderTpl: js.Any = null,
    setGlyph: /* glyph */ js.UndefOr[js.Any] => Unit = null,
    setIcon: /* icon */ js.UndefOr[java.lang.String] => Unit = null,
    setIconCls: /* cls */ js.UndefOr[java.lang.String] => Unit = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => Unit = null,
    shrinkWrap: js.Any = null,
    title: java.lang.String = null,
    titleAlign: java.lang.String = null,
    titlePosition: Int | Double = null
  ): IHeader = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (addTool != null) __obj.updateDynamic("addTool")(js.Any.fromFunction1(addTool))
    if (addUIClsToElement != null) __obj.updateDynamic("addUIClsToElement")(js.Any.fromFunction1(addUIClsToElement))
    if (afterLayout != null) __obj.updateDynamic("afterLayout")(js.Any.fromFunction0(afterLayout))
    if (beforeLayout != null) __obj.updateDynamic("beforeLayout")(js.Any.fromFunction0(beforeLayout))
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (getTools != null) __obj.updateDynamic("getTools")(js.Any.fromFunction0(getTools))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader)
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2(onAdd))
    if (removeUIClsFromElement != null) __obj.updateDynamic("removeUIClsFromElement")(js.Any.fromFunction1(removeUIClsFromElement))
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (setGlyph != null) __obj.updateDynamic("setGlyph")(js.Any.fromFunction1(setGlyph))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1(setIcon))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1(setIconCls))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (shrinkWrap != null) __obj.updateDynamic("shrinkWrap")(shrinkWrap)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign)
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeader]
  }
}

