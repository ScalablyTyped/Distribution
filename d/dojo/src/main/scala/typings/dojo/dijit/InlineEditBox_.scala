package typings.dojo.dijit

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.autoSave
import typings.dojo.dojoStrings.buttonCancel
import typings.dojo.dojoStrings.buttonSave
import typings.dojo.dojoStrings.disabled
import typings.dojo.dojoStrings.editing
import typings.dojo.dojoStrings.editorParams
import typings.dojo.dojoStrings.noValueIndicator
import typings.dojo.dojoStrings.renderAsHtml
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.width
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/InlineEditBox.html
  *
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my valuereplace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.InlineEditBox")
@js.native
class InlineEditBox_ () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Changing the value automatically saves it; don't have to push save button
    * (and save button isn't even displayed)
    * 
    */
  var autoSave: Boolean = js.native
  /**
    * Cancel button label
    * 
    */
  var buttonCancel: String = js.native
  /**
    * Save button label
    * 
    */
  var buttonSave: String = js.native
  /**
    * If true, clicking the InlineEditBox to edit it will have no effect.
    * 
    */
  var disabled: Boolean = js.native
  /**
    * Is the node currently in edit mode?
    * 
    */
  var editing: Boolean = js.native
  /**
    * Set of parameters for editor, like {required: true}
    * 
    */
  var editorParams: js.Object = js.native
  /**
    * The text that gets displayed when there is no value (so that the user has a place to click to edit)
    * 
    */
  var noValueIndicator: String = js.native
  /**
    * Set this to true if the specified Editor's value should be interpreted as HTML
    * rather than plain text (ex: dijit.Editor)
    * 
    */
  var renderAsHtml: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_InlineEditBox_ : String = js.native
  /**
    * The display value of the widget in read-only mode
    * 
    */
  var value: String = js.native
  /**
    * Width of editor.  By default it's width=100% (ie, block mode).
    * 
    */
  var width: String = js.native
  /**
    * MID (ex: "dijit/form/TextBox") or constructor for editor widget
    * 
    */
  def editor(): Unit = js.native
  /**
    * Class name (or reference to the Class) for widget that wraps the editor widget, displaying save/cancel
    * buttons.
    * 
    */
  def editorWrapper(): Unit = js.native
  /**
    * Deprecated.   Use get('value') instead.
    * 
    */
  def getValue(): js.Any = js.native
  @JSName("get")
  def get_autoSave(property: autoSave): Boolean = js.native
  @JSName("get")
  def get_buttonCancel(property: buttonCancel): String = js.native
  @JSName("get")
  def get_buttonSave(property: buttonSave): String = js.native
  @JSName("get")
  def get_disabled(property: disabled): Boolean = js.native
  @JSName("get")
  def get_editing(property: editing): Boolean = js.native
  @JSName("get")
  def get_editorParams(property: editorParams): js.Object = js.native
  @JSName("get")
  def get_noValueIndicator(property: noValueIndicator): String = js.native
  @JSName("get")
  def get_renderAsHtml(property: renderAsHtml): Boolean = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  @JSName("get")
  def get_width(property: width): String = js.native
  /**
    * Set this handler to be notified when editing is cancelled.
    * 
    */
  def onCancel(): Unit = js.native
  /**
    * Set this handler to be notified of changes to value.
    * 
    * @param value             
    */
  def onChange(value: js.Any): Unit = js.native
  /**
    * Deprecated.   Use set('disabled', ...) instead.
    * 
    * @param disabled             
    */
  def setDisabled(disabled: Boolean): Unit = js.native
  /**
    * Deprecated.   Use set('value', ...) instead.
    * 
    * @param val             
    */
  def setValue(`val`: String): js.Any = js.native
  @JSName("set")
  def set_autoSave(property: autoSave, value: Boolean): Unit = js.native
  @JSName("set")
  def set_buttonCancel(property: buttonCancel, value: String): Unit = js.native
  @JSName("set")
  def set_buttonSave(property: buttonSave, value: String): Unit = js.native
  @JSName("set")
  def set_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editing(property: editing, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorParams(property: editorParams, value: js.Object): Unit = js.native
  @JSName("set")
  def set_noValueIndicator(property: noValueIndicator, value: String): Unit = js.native
  @JSName("set")
  def set_renderAsHtml(property: renderAsHtml, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("set")
  def set_width(property: width, value: String): Unit = js.native
  @JSName("watch")
  def watch_autoSave(
    property: autoSave,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
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
  def watch_buttonSave(
    property: buttonSave,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_disabled(
    property: disabled,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_editing(
    property: editing,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_editorParams(
    property: editorParams,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_noValueIndicator(
    property: noValueIndicator,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_renderAsHtml(
    property: renderAsHtml,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_width(
    property: width,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

