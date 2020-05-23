package typings.extjs.Ext.form

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabel extends IComponent {
  /** [Config Option] (String) */
  var forId: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  @JSName("html")
  var html_ILabel: js.UndefOr[String] = js.undefined
  /** [Method] Updates the label s innerHTML with the specified string
    * @param text String The new label text
    * @param encode Boolean False to skip HTML-encoding the text when rendering it to the label. This might be useful if you want to include tags in the label's innerHTML rather than rendering them as string literals per the default logic.
    * @returns Ext.form.Label this
    */
  var setText: js.UndefOr[
    js.Function2[/* text */ js.UndefOr[String], /* encode */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
}

object ILabel {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    forId: String = null,
    html: String = null,
    setText: (/* text */ js.UndefOr[String], /* encode */ js.UndefOr[Boolean]) => ILabel = null,
    text: String = null
  ): ILabel = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (forId != null) __obj.updateDynamic("forId")(forId.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction2(setText))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILabel]
  }
}

