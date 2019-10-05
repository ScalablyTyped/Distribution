package typings.extjs.Ext.form

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabel extends IComponent {
  /** [Config Option] (String) */
  var forId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  @JSName("html")
  var html_ILabel: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates the label s innerHTML with the specified string
  		* @param text String The new label text
  		* @param encode Boolean False to skip HTML-encoding the text when rendering it to the label. This might be useful if you want to include tags in the label's innerHTML rather than rendering them as string literals per the default logic.
  		* @returns Ext.form.Label this
  		*/
  var setText: js.UndefOr[
    js.Function2[/* text */ js.UndefOr[java.lang.String], /* encode */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ILabel {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    autoEl: js.Any = null,
    forId: java.lang.String = null,
    html: java.lang.String = null,
    setText: (/* text */ js.UndefOr[java.lang.String], /* encode */ js.UndefOr[Boolean]) => ILabel = null,
    text: java.lang.String = null
  ): ILabel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (autoEl != null) __obj.updateDynamic("autoEl")(autoEl)
    if (forId != null) __obj.updateDynamic("forId")(forId)
    if (html != null) __obj.updateDynamic("html")(html)
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction2(setText))
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ILabel]
  }
}

