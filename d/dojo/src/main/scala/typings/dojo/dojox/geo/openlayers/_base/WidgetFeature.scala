package typings.dojo.dojox.geo.openlayers._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.WidgetFeature.html
  *
  * Wraps a Dojo widget, provide geolocalisation of the widget and interface
  * to Layer class.
  * This class allows to add a widget in a dojox.geo.openlayers.Layer.
  *
  * @param params The parameters describing the widget.
  */
@JSGlobal("dojox.geo.openlayers._base.WidgetFeature")
@js.native
class WidgetFeature protected ()
  extends typings.dojo.dojox.geo.openlayers.Feature {
  def this(params: js.Object) = this()
  /**
    * Returns the parameters describing the widget.
    *
    */
  def getParameters(): js.Any = js.native
  /**
    * Sets the parameters describing the widget.
    *
    * @param params The parameters describing the widget.
    */
  def setParameters(params: js.Object): Unit = js.native
}

