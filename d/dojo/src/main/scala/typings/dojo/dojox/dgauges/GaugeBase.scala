package typings.dojo.dojox.dgauges

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.font
import typings.dojo.dojoStrings.invalidRendering
import typings.dojo.dojoStrings.invalidatingProperties
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/GaugeBase.html
  *
  * This class is the base class for the circular and
  * rectangular (horizontal and vertical) gauge components.
  * A gauge is a composition of elements added to the gauge using the addElement method.
  * Elements are drawn from back to front in the same order they are added (using addElement).
  * An elements can be:
  *
  * A GFX drawing functions typically used for defining the style of the gauge.
  * A scale: CircularScale or RectangularScale depending on the type of gauge.
  * A text, using the TextIndicator
  * Note: Indicator classes (value indicators, range indicators) are sub-elements of scales
  * To create a custom gauge, subclass CircularGauge or RectangularGauge and
  * configure its elements in the constructor.
  * Ready to use, predefined gauges are available in dojox/dgauges/components/
  * They are good examples of gauges built on top of the framework.
  *
  * @param args
  * @param node
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojo.Stateful because Already inherited
- typings.dojo.dojox.widget._Invalidating because Inheritance from two classes. Inlined invalidatingProperties, set_invalidatingProperties, get_invalidatingProperties, watch_invalidatingProperties, invalidRendering, set_invalidRendering, get_invalidRendering, watch_invalidRendering, addInvalidatingProperties, get, invalidateRendering, postscript, refreshRendering, set, validateRendering, watch */ @JSGlobal("dojox.dgauges.GaugeBase")
@js.native
class GaugeBase protected () extends _WidgetBase {
  def this(args: js.Object, node: HTMLElement) = this()
  /**
    * The font of the gauge used by elements if not overridden.
    *
    */
  var font: js.Object = js.native
  /**
    *
    */
  var invalidRendering: Boolean = js.native
  /**
    *
    */
  var invalidatingProperties: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_GaugeBase: String = js.native
  /**
    * This property acts as a top-level wrapper for the value of the first indicator added to
    * its scale with the name "indicator", i.e. myScale.addIndicator("indicator", myIndicator).
    * This property must be manipulated with get("value") and set("value", xxx).
    *
    */
  var value: Double = js.native
  /**
    * Adds a element to the gauge.
    *
    * @param name The name of the element to be added.
    * @param element This parameter can be:A function which takes on argument of type GFX Group and return null or aGFX element retrievable using the getElementRenderer() method.A Scale instance, i.e. CircularScale or RectangularScale.A TextIndicator instance.
    */
  def addElement(name: String, element: js.Object): js.Any = js.native
  /**
    * Add properties to the watched properties to trigger invalidation. This method must be called in
    * the constructor. It is typically used by subclasses of a _Invalidating class to add more properties
    * to watch for.
    *
    * @param properties The list of properties to watch for.
    */
  def addInvalidatingProperties(properties: js.Array[String]): Unit = js.native
  /**
    * Get the given element, by name.
    *
    * @param name The name of the element as defined using addElement.
    */
  def getElement(name: String): js.Any = js.native
  /**
    * Get the given element renderer, by name.
    *
    * @param name The name of the element as defined using addElement.
    */
  def getElementRenderer(name: String): js.Any = js.native
  @JSName("get")
  def get_font(property: font): js.Object = js.native
  @JSName("get")
  def get_invalidRendering(property: invalidRendering): Boolean = js.native
  @JSName("get")
  def get_invalidatingProperties(property: invalidatingProperties): js.Object = js.native
  @JSName("get")
  def get_value(property: value): Double = js.native
  /**
    * Invalidating the rendering for the next executation frame.
    *
    */
  def invalidateRendering(): Unit = js.native
  /**
    * Called when an interaction ends (keyboard, mouse or gesture).
    *
    * @param event On object with a unique member "indicator". This member is a reference to the modified indicator.
    */
  def onEndEditing(event: js.Any): Unit = js.native
  /**
    * Called when an interaction begins (keyboard, mouse or gesture).
    *
    * @param event On object with a unique member "indicator". This member is a reference to the modified indicator.
    */
  def onStartEditing(event: js.Any): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    *
    * @param mixin
    */
  def postscript(mixin: js.Any): Unit = js.native
  /**
    * Actually refresh the rendering. Implementation should implement that method.
    *
    */
  def refreshRendering(): Unit = js.native
  /**
    * Remove the element defined by name from the gauge.
    *
    * @param name The name of the element as defined using addElement.
    */
  def removeElement(name: String): js.Any = js.native
  /**
    * Resize the gauge to the dimensions of width and height.
    * Resize the gauge and its surface to the width and height dimensions.
    * If a single argument of the form {w: value1, h: value2} is provided take that argument as the dimensions to use.
    * Finally if no argument is provided, resize the surface to the marginBox of the gauge.
    *
    * @param width               OptionalThe new width of the gauge or the box definition.
    * @param height               OptionalThe new height of the gauge.
    */
  def resize(width: js.Object, height: Double): js.Any = js.native
  /**
    * Resize the gauge to the dimensions of width and height.
    * Resize the gauge and its surface to the width and height dimensions.
    * If a single argument of the form {w: value1, h: value2} is provided take that argument as the dimensions to use.
    * Finally if no argument is provided, resize the surface to the marginBox of the gauge.
    *
    * @param width               OptionalThe new width of the gauge or the box definition.
    * @param height               OptionalThe new height of the gauge.
    */
  def resize(width: Double, height: Double): js.Any = js.native
  @JSName("set")
  def set_font(property: font, value: js.Object): Unit = js.native
  @JSName("set")
  def set_invalidRendering(property: invalidRendering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_invalidatingProperties(property: invalidatingProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: Double): Unit = js.native
  /**
    * Immediately validate the rendering if it has been invalidated. You generally do not call that method yourself.
    *
    */
  def validateRendering(): Unit = js.native
  @JSName("watch")
  def watch_font(property: font, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_invalidRendering(property: invalidRendering, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_invalidatingProperties(property: invalidatingProperties, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(property: value, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
}

