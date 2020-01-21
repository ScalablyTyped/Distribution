package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.columns
import typings.dojo.dojoStrings.rightAlign
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/FormLayout.html
  *
  * A responsive container to create mobile forms.
  * This container layouts form widgets according to the screen size.
  * Each row of a form is made of a  and a  that contains one or more form widgets.
  * By default, if the width of the screen if greater than 500px, the  and the  are positioned on the same line.
  * Otherwise they are stacked vertically. You can force how a  and its  are positioned using the
  * 'columns' property.
  * Form controls are: "dojox/mobile/Button", "dojox/mobile/CheckBox", "dojox/mobile/ComboBox",
  * "dojox/mobile/RadioButton", "dojox/mobile/Slider", "dojox/mobile/TextBox", "dojox/mobile/SearchBox",
  * "dojox/mobile/ExpandingTextArea", "dojox/mobile/ToggleButton".
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.FormLayout")
@js.native
class FormLayout () extends Container {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * This property controls how a  and its  are positioned. The  can be on the same line
    * than its  (two columns) or on top of it (single column).
    * If set to "auto", the number of columns depends on the width of the screen: Two columns
    * if the width of the screen is larger than 500px, one column otherwise. The width of the screen is determined using CSS
    * Media Queries.
    * Setting this property to "single" or "two" allows to force the layout used whatever the width of the screen.
    * Default value for this property is "auto".
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var columns: String = js.native
  /**
    * This property controls the horizontal position of control(s) in a . It applies only
    * to forms that have two columns (see 'columns' property).
    * Default value for this property is false.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var rightAlign: Boolean = js.native
  @JSName("get")
  def get_columns(property: columns): String = js.native
  @JSName("get")
  def get_rightAlign(property: rightAlign): Boolean = js.native
  @JSName("set")
  def set_columns(property: columns, value: String): Unit = js.native
  @JSName("set")
  def set_rightAlign(property: rightAlign, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_columns(
    property: columns,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_rightAlign(
    property: rightAlign,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

