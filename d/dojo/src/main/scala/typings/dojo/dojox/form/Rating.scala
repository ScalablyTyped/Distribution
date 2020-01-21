package typings.dojo.dojox.form

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.form.FormWidget
import typings.dojo.dojoStrings.numStars
import typings.dojo.dojoStrings.required
import typings.dojo.dojoStrings.value
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/Rating.html
  *
  * A widget for rating using stars.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.form.Rating")
@js.native
class Rating () extends FormWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The number of stars to show, default is 3.
    *
    */
  var numStars: Double = js.native
  /**
    * TODO: Can be true or false, default is false.
    *
    */
  var required: Boolean = js.native
  /**
    * The current value of the Rating
    *
    */
  @JSName("value")
  var value_Rating: Double = js.native
  def buildRendering(params: js.Object): Unit = js.native
  @JSName("get")
  def get_numStars(property: numStars): Double = js.native
  @JSName("get")
  def get_required(property: required): Boolean = js.native
  def onMouseOver(evt: js.Any, value: js.Any): Unit = js.native
  /**
    * Connect on this method to get noticed when a star was clicked.
    *
    * @param evt
    */
  def onStarClick(evt: Event_): Unit = js.native
  /**
    * Deprecated.   Use set("value", ...) instead.
    *
    * @param key
    * @param value
    */
  def setAttribute(key: String, value: Double): Unit = js.native
  @JSName("set")
  def set_numStars(property: numStars, value: Double): Unit = js.native
  @JSName("set")
  def set_required(property: required, value: Boolean): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: Double): Unit = js.native
  @JSName("watch")
  def watch_numStars(
    property: numStars,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_required(
    property: required,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

