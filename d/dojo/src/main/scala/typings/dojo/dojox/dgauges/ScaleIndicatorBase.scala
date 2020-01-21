package typings.dojo.dojox.dgauges

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.animationDuration
import typings.dojo.dojoStrings.animationEaser
import typings.dojo.dojoStrings.interactionArea
import typings.dojo.dojoStrings.interactionMode
import typings.dojo.dojoStrings.scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/ScaleIndicatorBase.html
  *
  * The base class for indicators that rely on a scale for their rendering.
  * Typically, value indicators and range indicators are subclasses of ScaleIndicatorBase.
  *
  */
@JSGlobal("dojox.dgauges.ScaleIndicatorBase")
@js.native
class ScaleIndicatorBase () extends IndicatorBase {
  /**
    * The duration of the value change animation in milliseconds. Default is 0.
    * The animation occurs on both user interactions and programmatic value changes.
    * Set this property to 0 to disable animation.
    *
    */
  var animationDuration: Double = js.native
  /**
    * The easer function of the value change animation. Default is fx._defaultEasing.
    *
    */
  var animationEaser: js.Object = js.native
  /**
    * How to interact with the indicator using mouse or touch interactions.
    * Can be "indicator", "gauge", "area" or "none". The default value is "gauge".
    * If set to "indicator", the indicator shape reacts to mouse and touch events.
    * If set to "gauge", the whole gauge reacts to mouse and touch events.
    * If set to "area", the whole bounding box of the widget reacts to mouse and touch events.
    * If "none", interactions are disabled.
    *
    */
  var interactionArea: String = js.native
  /**
    * Deprecated. Can be "mouse" or "touch".
    *
    */
  var interactionMode: String = js.native
  /**
    *
    */
  var scale: js.Object = js.native
  @JSName("get")
  def get_animationDuration(property: animationDuration): Double = js.native
  @JSName("get")
  def get_animationEaser(property: animationEaser): js.Object = js.native
  @JSName("get")
  def get_interactionArea(property: interactionArea): String = js.native
  @JSName("get")
  def get_interactionMode(property: interactionMode): String = js.native
  @JSName("get")
  def get_scale(property: scale): js.Object = js.native
  @JSName("set")
  def set_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_animationEaser(property: animationEaser, value: js.Object): Unit = js.native
  @JSName("set")
  def set_interactionArea(property: interactionArea, value: String): Unit = js.native
  @JSName("set")
  def set_interactionMode(property: interactionMode, value: String): Unit = js.native
  @JSName("set")
  def set_scale(property: scale, value: js.Object): Unit = js.native
  /**
    * Invoked when the value of the indicator changes.
    * User can connect an listener on this function:
    *
    * theIndicator.on("valueChanged", lang.hitch(this, function(){
    *     //do something
    * }));
    *
    * @param indicator
    */
  def valueChanged(indicator: js.Any): Unit = js.native
  @JSName("watch")
  def watch_animationDuration(
    property: animationDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_animationEaser(
    property: animationEaser,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_interactionArea(
    property: interactionArea,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_interactionMode(
    property: interactionMode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scale(
    property: scale,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

