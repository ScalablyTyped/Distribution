package typings.dojo.dojox.dgauges.components

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dojoStrings.animationDuration
import typings.dojo.dojoStrings.borderColor
import typings.dojo.dojoStrings.fillColor
import typings.dojo.dojoStrings.indicatorColor
import typings.dojo.dojoStrings.interactionArea
import typings.dojo.dojoStrings.interactionMode
import typings.dojo.dojoStrings.majorTickInterval
import typings.dojo.dojoStrings.maximum
import typings.dojo.dojoStrings.minimum
import typings.dojo.dojoStrings.minorTickInterval
import typings.dojo.dojoStrings.minorTicksEnabled
import typings.dojo.dojoStrings.snapInterval
import typings.dojo.dojox.dgauges.CircularGauge
import typings.dojo.dojox.dgauges.RectangularGauge
import typings.dojo.dojox.gfx.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.dgauges.components.black")
@js.native
object black extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/components/black/CircularLinearGauge.html
    *
    * A circular gauge widget.
    *
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dojox.dgauges.components.DefaultPropertiesMixin because Inheritance from two classes. Inlined animationDuration, interactionArea, interactionMode, majorTickInterval, maximum, minimum, minorTickInterval, minorTicksEnabled, snapInterval */ @js.native
  class CircularLinearGauge () extends CircularGauge {
    /**
      * The duration of the value change animation in milliseconds. Default is 0.
      * The animation occurs on both user interactions and programmatic value changes.
      * Set this property to 0 to disable animation.
      *
      */
    var animationDuration: Double = js.native
    /**
      * The border color. Default is "#000000".
      *
      */
    var borderColor: js.Object = js.native
    /**
      * The background color. Default is "#000000".
      *
      */
    var fillColor: js.Object = js.native
    /**
      * The indicator fill color. Default is "#A4A4A4".
      *
      */
    var indicatorColor: js.Object = js.native
    /**
      * How to interact with the indicator using mouse or touch interactions.
      * Can be "indicator", "gauge" or "none". The default value is "gauge".
      * If set to "indicator", the indicator shape reacts to mouse and touch events.
      * If set to "gauge", the whole gauge reacts to mouse and touch events.
      * If "none", interactions are disabled.
      *
      */
    var interactionArea: String = js.native
    /**
      * Can be "mouse" or "touch".
      *
      */
    var interactionMode: String = js.native
    /**
      * The interval between two major ticks.
      *
      */
    var majorTickInterval: Double = js.native
    /**
      * The maximum value of the scaler. Default is 100.
      *
      */
    var maximum: Double = js.native
    /**
      * The minimum value of the scaler. Default is 0.
      *
      */
    var minimum: Double = js.native
    /**
      * The interval between two minor ticks.
      *
      */
    var minorTickInterval: Double = js.native
    /**
      * If false, minor ticks are not generated. Default is true.
      *
      */
    var minorTicksEnabled: Boolean = js.native
    /**
      * Specifies the increment value to be used as snap values on this scale
      * during user interaction.
      * Default is 1.
      *
      */
    var snapInterval: Double = js.native
    /**
      * Draws the background shape of the gauge.
      *
      * @param g The group used to draw the background.
      */
    def drawBackground(g: Group): Unit = js.native
    /**
      * Draws the foreground shape of the gauge.
      *
      * @param g The group used to draw the foreground.
      */
    def drawForeground(g: Group): Unit = js.native
    @JSName("get")
    def get_animationDuration(property: animationDuration): Double = js.native
    @JSName("get")
    def get_borderColor(property: borderColor): js.Object = js.native
    @JSName("get")
    def get_fillColor(property: fillColor): js.Object = js.native
    @JSName("get")
    def get_indicatorColor(property: indicatorColor): js.Object = js.native
    @JSName("get")
    def get_interactionArea(property: interactionArea): String = js.native
    @JSName("get")
    def get_interactionMode(property: interactionMode): String = js.native
    @JSName("get")
    def get_majorTickInterval(property: majorTickInterval): Double = js.native
    @JSName("get")
    def get_maximum(property: maximum): Double = js.native
    @JSName("get")
    def get_minimum(property: minimum): Double = js.native
    @JSName("get")
    def get_minorTickInterval(property: minorTickInterval): Double = js.native
    @JSName("get")
    def get_minorTicksEnabled(property: minorTicksEnabled): Boolean = js.native
    @JSName("get")
    def get_snapInterval(property: snapInterval): Double = js.native
    @JSName("set")
    def set_animationDuration(property: animationDuration, value: Double): Unit = js.native
    @JSName("set")
    def set_borderColor(property: borderColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_fillColor(property: fillColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_indicatorColor(property: indicatorColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_interactionArea(property: interactionArea, value: String): Unit = js.native
    @JSName("set")
    def set_interactionMode(property: interactionMode, value: String): Unit = js.native
    @JSName("set")
    def set_majorTickInterval(property: majorTickInterval, value: Double): Unit = js.native
    @JSName("set")
    def set_maximum(property: maximum, value: Double): Unit = js.native
    @JSName("set")
    def set_minimum(property: minimum, value: Double): Unit = js.native
    @JSName("set")
    def set_minorTickInterval(property: minorTickInterval, value: Double): Unit = js.native
    @JSName("set")
    def set_minorTicksEnabled(property: minorTicksEnabled, value: Boolean): Unit = js.native
    @JSName("set")
    def set_snapInterval(property: snapInterval, value: Double): Unit = js.native
    @JSName("watch")
    def watch_animationDuration(property: animationDuration, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_borderColor(property: borderColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_fillColor(property: fillColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_indicatorColor(property: indicatorColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_interactionArea(property: interactionArea, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_interactionMode(property: interactionMode, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_majorTickInterval(property: majorTickInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_maximum(property: maximum, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minimum(property: minimum, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minorTickInterval(property: minorTickInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minorTicksEnabled(property: minorTicksEnabled, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_snapInterval(property: snapInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/components/black/HorizontalLinearGauge.html
    *
    * A horizontal gauge widget.
    *
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dojox.dgauges.components.DefaultPropertiesMixin because Inheritance from two classes. Inlined animationDuration, interactionArea, interactionMode, majorTickInterval, maximum, minimum, minorTickInterval, minorTicksEnabled, snapInterval */ @js.native
  class HorizontalLinearGauge () extends RectangularGauge {
    /**
      * The duration of the value change animation in milliseconds. Default is 0.
      * The animation occurs on both user interactions and programmatic value changes.
      * Set this property to 0 to disable animation.
      *
      */
    var animationDuration: Double = js.native
    /**
      * The border color. Default is "#000000".
      *
      */
    var borderColor: js.Object = js.native
    /**
      * The background color. Default is "#000000".
      *
      */
    var fillColor: js.Object = js.native
    /**
      * The indicator fill color. Default is "#A4A4A4".
      *
      */
    var indicatorColor: js.Object = js.native
    /**
      * How to interact with the indicator using mouse or touch interactions.
      * Can be "indicator", "gauge" or "none". The default value is "gauge".
      * If set to "indicator", the indicator shape reacts to mouse and touch events.
      * If set to "gauge", the whole gauge reacts to mouse and touch events.
      * If "none", interactions are disabled.
      *
      */
    var interactionArea: String = js.native
    /**
      * Can be "mouse" or "touch".
      *
      */
    var interactionMode: String = js.native
    /**
      * The interval between two major ticks.
      *
      */
    var majorTickInterval: Double = js.native
    /**
      * The maximum value of the scaler. Default is 100.
      *
      */
    var maximum: Double = js.native
    /**
      * The minimum value of the scaler. Default is 0.
      *
      */
    var minimum: Double = js.native
    /**
      * The interval between two minor ticks.
      *
      */
    var minorTickInterval: Double = js.native
    /**
      * If false, minor ticks are not generated. Default is true.
      *
      */
    var minorTicksEnabled: Boolean = js.native
    /**
      * Specifies the increment value to be used as snap values on this scale
      * during user interaction.
      * Default is 1.
      *
      */
    var snapInterval: Double = js.native
    /**
      * Draws the background shape of the gauge.
      *
      * @param g The group used to draw the background.
      * @param w The width of the gauge.
      * @param h The height of the gauge.
      */
    def drawBackground(g: Group, w: Double, h: Double): Unit = js.native
    @JSName("get")
    def get_animationDuration(property: animationDuration): Double = js.native
    @JSName("get")
    def get_borderColor(property: borderColor): js.Object = js.native
    @JSName("get")
    def get_fillColor(property: fillColor): js.Object = js.native
    @JSName("get")
    def get_indicatorColor(property: indicatorColor): js.Object = js.native
    @JSName("get")
    def get_interactionArea(property: interactionArea): String = js.native
    @JSName("get")
    def get_interactionMode(property: interactionMode): String = js.native
    @JSName("get")
    def get_majorTickInterval(property: majorTickInterval): Double = js.native
    @JSName("get")
    def get_maximum(property: maximum): Double = js.native
    @JSName("get")
    def get_minimum(property: minimum): Double = js.native
    @JSName("get")
    def get_minorTickInterval(property: minorTickInterval): Double = js.native
    @JSName("get")
    def get_minorTicksEnabled(property: minorTicksEnabled): Boolean = js.native
    @JSName("get")
    def get_snapInterval(property: snapInterval): Double = js.native
    @JSName("set")
    def set_animationDuration(property: animationDuration, value: Double): Unit = js.native
    @JSName("set")
    def set_borderColor(property: borderColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_fillColor(property: fillColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_indicatorColor(property: indicatorColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_interactionArea(property: interactionArea, value: String): Unit = js.native
    @JSName("set")
    def set_interactionMode(property: interactionMode, value: String): Unit = js.native
    @JSName("set")
    def set_majorTickInterval(property: majorTickInterval, value: Double): Unit = js.native
    @JSName("set")
    def set_maximum(property: maximum, value: Double): Unit = js.native
    @JSName("set")
    def set_minimum(property: minimum, value: Double): Unit = js.native
    @JSName("set")
    def set_minorTickInterval(property: minorTickInterval, value: Double): Unit = js.native
    @JSName("set")
    def set_minorTicksEnabled(property: minorTicksEnabled, value: Boolean): Unit = js.native
    @JSName("set")
    def set_snapInterval(property: snapInterval, value: Double): Unit = js.native
    @JSName("watch")
    def watch_animationDuration(property: animationDuration, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_borderColor(property: borderColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_fillColor(property: fillColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_indicatorColor(property: indicatorColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_interactionArea(property: interactionArea, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_interactionMode(property: interactionMode, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_majorTickInterval(property: majorTickInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_maximum(property: maximum, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minimum(property: minimum, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minorTickInterval(property: minorTickInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minorTicksEnabled(property: minorTicksEnabled, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_snapInterval(property: snapInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/components/black/SemiCircularLinearGauge.html
    *
    * A semi circular gauge widget.
    *
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dojox.dgauges.components.DefaultPropertiesMixin because Inheritance from two classes. Inlined animationDuration, interactionArea, interactionMode, majorTickInterval, maximum, minimum, minorTickInterval, minorTicksEnabled, snapInterval */ @js.native
  class SemiCircularLinearGauge () extends CircularGauge {
    /**
      * The duration of the value change animation in milliseconds. Default is 0.
      * The animation occurs on both user interactions and programmatic value changes.
      * Set this property to 0 to disable animation.
      *
      */
    var animationDuration: Double = js.native
    /**
      * The border color. Default is "#000000".
      *
      */
    var borderColor: js.Object = js.native
    /**
      * The background color. Default is "#000000".
      *
      */
    var fillColor: js.Object = js.native
    /**
      * The indicator fill color. Default is "#A4A4A4".
      *
      */
    var indicatorColor: js.Object = js.native
    /**
      * How to interact with the indicator using mouse or touch interactions.
      * Can be "indicator", "gauge" or "none". The default value is "gauge".
      * If set to "indicator", the indicator shape reacts to mouse and touch events.
      * If set to "gauge", the whole gauge reacts to mouse and touch events.
      * If "none", interactions are disabled.
      *
      */
    var interactionArea: String = js.native
    /**
      * Can be "mouse" or "touch".
      *
      */
    var interactionMode: String = js.native
    /**
      * The interval between two major ticks.
      *
      */
    var majorTickInterval: Double = js.native
    /**
      * The maximum value of the scaler. Default is 100.
      *
      */
    var maximum: Double = js.native
    /**
      * The minimum value of the scaler. Default is 0.
      *
      */
    var minimum: Double = js.native
    /**
      * The interval between two minor ticks.
      *
      */
    var minorTickInterval: Double = js.native
    /**
      * If false, minor ticks are not generated. Default is true.
      *
      */
    var minorTicksEnabled: Boolean = js.native
    /**
      * Specifies the increment value to be used as snap values on this scale
      * during user interaction.
      * Default is 1.
      *
      */
    var snapInterval: Double = js.native
    /**
      * Draws the background shape of the gauge.
      *
      * @param g The group used to draw the background.
      */
    def drawBackground(g: Group): Unit = js.native
    /**
      * Draws the foreground shape of the gauge.
      *
      * @param g The group used to draw the foreground.
      */
    def drawForeground(g: Group): Unit = js.native
    @JSName("get")
    def get_animationDuration(property: animationDuration): Double = js.native
    @JSName("get")
    def get_borderColor(property: borderColor): js.Object = js.native
    @JSName("get")
    def get_fillColor(property: fillColor): js.Object = js.native
    @JSName("get")
    def get_indicatorColor(property: indicatorColor): js.Object = js.native
    @JSName("get")
    def get_interactionArea(property: interactionArea): String = js.native
    @JSName("get")
    def get_interactionMode(property: interactionMode): String = js.native
    @JSName("get")
    def get_majorTickInterval(property: majorTickInterval): Double = js.native
    @JSName("get")
    def get_maximum(property: maximum): Double = js.native
    @JSName("get")
    def get_minimum(property: minimum): Double = js.native
    @JSName("get")
    def get_minorTickInterval(property: minorTickInterval): Double = js.native
    @JSName("get")
    def get_minorTicksEnabled(property: minorTicksEnabled): Boolean = js.native
    @JSName("get")
    def get_snapInterval(property: snapInterval): Double = js.native
    @JSName("set")
    def set_animationDuration(property: animationDuration, value: Double): Unit = js.native
    @JSName("set")
    def set_borderColor(property: borderColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_fillColor(property: fillColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_indicatorColor(property: indicatorColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_interactionArea(property: interactionArea, value: String): Unit = js.native
    @JSName("set")
    def set_interactionMode(property: interactionMode, value: String): Unit = js.native
    @JSName("set")
    def set_majorTickInterval(property: majorTickInterval, value: Double): Unit = js.native
    @JSName("set")
    def set_maximum(property: maximum, value: Double): Unit = js.native
    @JSName("set")
    def set_minimum(property: minimum, value: Double): Unit = js.native
    @JSName("set")
    def set_minorTickInterval(property: minorTickInterval, value: Double): Unit = js.native
    @JSName("set")
    def set_minorTicksEnabled(property: minorTicksEnabled, value: Boolean): Unit = js.native
    @JSName("set")
    def set_snapInterval(property: snapInterval, value: Double): Unit = js.native
    @JSName("watch")
    def watch_animationDuration(property: animationDuration, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_borderColor(property: borderColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_fillColor(property: fillColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_indicatorColor(property: indicatorColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_interactionArea(property: interactionArea, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_interactionMode(property: interactionMode, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_majorTickInterval(property: majorTickInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_maximum(property: maximum, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minimum(property: minimum, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minorTickInterval(property: minorTickInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minorTicksEnabled(property: minorTicksEnabled, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_snapInterval(property: snapInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/components/black/VerticalLinearGauge.html
    *
    * A vertical gauge widget.
    *
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dojox.dgauges.components.DefaultPropertiesMixin because Inheritance from two classes. Inlined animationDuration, interactionArea, interactionMode, majorTickInterval, maximum, minimum, minorTickInterval, minorTicksEnabled, snapInterval */ @js.native
  class VerticalLinearGauge () extends RectangularGauge {
    /**
      * The duration of the value change animation in milliseconds. Default is 0.
      * The animation occurs on both user interactions and programmatic value changes.
      * Set this property to 0 to disable animation.
      *
      */
    var animationDuration: Double = js.native
    /**
      * The border color. Default is "#000000".
      *
      */
    var borderColor: js.Object = js.native
    /**
      * The background color. Default is "#000000".
      *
      */
    var fillColor: js.Object = js.native
    /**
      * The indicator fill color. Default is "#A4A4A4".
      *
      */
    var indicatorColor: js.Object = js.native
    /**
      * How to interact with the indicator using mouse or touch interactions.
      * Can be "indicator", "gauge" or "none". The default value is "gauge".
      * If set to "indicator", the indicator shape reacts to mouse and touch events.
      * If set to "gauge", the whole gauge reacts to mouse and touch events.
      * If "none", interactions are disabled.
      *
      */
    var interactionArea: String = js.native
    /**
      * Can be "mouse" or "touch".
      *
      */
    var interactionMode: String = js.native
    /**
      * The interval between two major ticks.
      *
      */
    var majorTickInterval: Double = js.native
    /**
      * The maximum value of the scaler. Default is 100.
      *
      */
    var maximum: Double = js.native
    /**
      * The minimum value of the scaler. Default is 0.
      *
      */
    var minimum: Double = js.native
    /**
      * The interval between two minor ticks.
      *
      */
    var minorTickInterval: Double = js.native
    /**
      * If false, minor ticks are not generated. Default is true.
      *
      */
    var minorTicksEnabled: Boolean = js.native
    /**
      * Specifies the increment value to be used as snap values on this scale
      * during user interaction.
      * Default is 1.
      *
      */
    var snapInterval: Double = js.native
    /**
      * Draws the background shape of the gauge.
      *
      * @param g The group used to draw the background.
      * @param w The width of the gauge.
      * @param h The height of the gauge.
      */
    def drawBackground(g: Group, w: Double, h: Double): Unit = js.native
    @JSName("get")
    def get_animationDuration(property: animationDuration): Double = js.native
    @JSName("get")
    def get_borderColor(property: borderColor): js.Object = js.native
    @JSName("get")
    def get_fillColor(property: fillColor): js.Object = js.native
    @JSName("get")
    def get_indicatorColor(property: indicatorColor): js.Object = js.native
    @JSName("get")
    def get_interactionArea(property: interactionArea): String = js.native
    @JSName("get")
    def get_interactionMode(property: interactionMode): String = js.native
    @JSName("get")
    def get_majorTickInterval(property: majorTickInterval): Double = js.native
    @JSName("get")
    def get_maximum(property: maximum): Double = js.native
    @JSName("get")
    def get_minimum(property: minimum): Double = js.native
    @JSName("get")
    def get_minorTickInterval(property: minorTickInterval): Double = js.native
    @JSName("get")
    def get_minorTicksEnabled(property: minorTicksEnabled): Boolean = js.native
    @JSName("get")
    def get_snapInterval(property: snapInterval): Double = js.native
    @JSName("set")
    def set_animationDuration(property: animationDuration, value: Double): Unit = js.native
    @JSName("set")
    def set_borderColor(property: borderColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_fillColor(property: fillColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_indicatorColor(property: indicatorColor, value: js.Object): Unit = js.native
    @JSName("set")
    def set_interactionArea(property: interactionArea, value: String): Unit = js.native
    @JSName("set")
    def set_interactionMode(property: interactionMode, value: String): Unit = js.native
    @JSName("set")
    def set_majorTickInterval(property: majorTickInterval, value: Double): Unit = js.native
    @JSName("set")
    def set_maximum(property: maximum, value: Double): Unit = js.native
    @JSName("set")
    def set_minimum(property: minimum, value: Double): Unit = js.native
    @JSName("set")
    def set_minorTickInterval(property: minorTickInterval, value: Double): Unit = js.native
    @JSName("set")
    def set_minorTicksEnabled(property: minorTicksEnabled, value: Boolean): Unit = js.native
    @JSName("set")
    def set_snapInterval(property: snapInterval, value: Double): Unit = js.native
    @JSName("watch")
    def watch_animationDuration(property: animationDuration, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_borderColor(property: borderColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_fillColor(property: fillColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_indicatorColor(property: indicatorColor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_interactionArea(property: interactionArea, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_interactionMode(property: interactionMode, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_majorTickInterval(property: majorTickInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_maximum(property: maximum, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minimum(property: minimum, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minorTickInterval(property: minorTickInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minorTicksEnabled(property: minorTicksEnabled, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_snapInterval(property: snapInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  }
  
}

