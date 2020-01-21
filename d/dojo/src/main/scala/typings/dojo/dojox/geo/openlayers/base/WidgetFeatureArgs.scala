package typings.dojo.dojox.geo.openlayers.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.__WidgetFeatureArgs.html
  *
  * The keyword arguments that can be passed in a WidgetFeature constructor.
  * You must define a least one widget retrieval parameter and the geo-localization parameters.
  *
  */
trait WidgetFeatureArgs extends js.Object {
  /**
    * Function for widget creation. Must return a `dijit._Widget.
    *
    */
  var createWidget: js.Function
  /**
    * The digitId of an existing widget.
    *
    */
  var dijitId: String
  /**
    * The class of a widget to create.
    *
    */
  var dojoType: String
  /**
    * The height of the widget.
    *
    */
  var height: Double
  /**
    * The latitude, in decimal degrees where to place the widget.
    *
    */
  var latitude: Double
  /**
    * The longitude, in decimal degrees where to place the widget.
    *
    */
  var longitude: Double
  /**
    * An already created widget.
    *
    */
  var widget: js.Object
  /**
    * The width of the widget.
    *
    */
  var width: Double
}

object WidgetFeatureArgs {
  @scala.inline
  def apply(
    createWidget: js.Function,
    dijitId: String,
    dojoType: String,
    height: Double,
    latitude: Double,
    longitude: Double,
    widget: js.Object,
    width: Double
  ): WidgetFeatureArgs = {
    val __obj = js.Dynamic.literal(createWidget = createWidget.asInstanceOf[js.Any], dijitId = dijitId.asInstanceOf[js.Any], dojoType = dojoType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WidgetFeatureArgs]
  }
}

