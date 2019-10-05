package typings.dojo.dojox.dgauges.components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/components/DefaultPropertiesMixin.html
  *
  * This class defines default properties of predefined gauges.
  *
  */
@JSGlobal("dojox.dgauges.components.DefaultPropertiesMixin")
@js.native
class DefaultPropertiesMixin () extends js.Object {
  /**
    * The duration of the value change animation in milliseconds. Default is 0.
    * The animation occurs on both user interactions and programmatic value changes.
    * Set this property to 0 to disable animation.
    *
    */
  var animationDuration: Double = js.native
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
    *
    */
  var value: Double = js.native
}

