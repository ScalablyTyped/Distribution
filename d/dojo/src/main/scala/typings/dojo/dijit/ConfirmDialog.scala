package typings.dojo.dijit

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.form.Button
import typings.dojo.dojoStrings.actionBarTemplate
import typings.dojo.dojoStrings.buttonCancel
import typings.dojo.dojoStrings.buttonOk
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.10/dijit/ConfirmDialog.html
  *
  * A Dialog with OK/Cancel buttons.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.ConfirmDialogMixin because Inheritance from two classes. Inlined actionBarTemplate, buttonCancel, buttonOk, contextRequire, widgetsInTemplate, startup */ @JSGlobal("dijit.ConfirmDialog")
@js.native
class ConfirmDialog protected () extends Dialog {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * HTML snippet to show the action bar (gray bar with OK/cancel buttons).
    * Blank by default, but used by ConfirmDialog/ConfirmTooltipDialog subclasses.
    * 
    */
  var actionBarTemplate: js.Object | String = js.native
  /**
    * Label of cancel button
    * 
    */
  var buttonCancel: String = js.native
  /**
    * Label of OK button
    * 
    */
  var buttonOk: String = js.native
  var cancelButon: Button = js.native
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    * 
    */
  var contextRequire: js.Function = js.native
  var okButton: Button = js.native
  /**
    * Should we parse the template to find widgets that might be
    * declared in markup inside it?  (Remove for 2.0 and assume true)
    * 
    */
  var widgetsInTemplate: Boolean = js.native
  @JSName("get")
  def get_actionBarTemplate(property: actionBarTemplate): String = js.native
  @JSName("get")
  def get_buttonCancel(property: buttonCancel): String = js.native
  @JSName("get")
  def get_buttonOk(property: buttonOk): String = js.native
  @JSName("get")
  def get_contextRequire(property: contextRequire): js.Function = js.native
  @JSName("get")
  def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
  /**
    * Returns true if all of the widgets are valid.
    * Deprecated, will be removed in 2.0.  Use get("state") instead.
    * 
    */
  @JSName("isValid")
  def isValid_MConfirmDialog(): Boolean = js.native
  @JSName("set")
  def set_actionBarTemplate(property: actionBarTemplate, value: String): Unit = js.native
  @JSName("set")
  def set_buttonCancel(property: buttonCancel, value: String): Unit = js.native
  @JSName("set")
  def set_buttonOk(property: buttonOk, value: String): Unit = js.native
  @JSName("set")
  def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
  @JSName("set")
  def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_actionBarTemplate(
    property: actionBarTemplate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_buttonCancel(
    property: buttonCancel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_buttonOk(
    property: buttonOk,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_contextRequire(
    property: contextRequire,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_widgetsInTemplate(
    property: widgetsInTemplate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

