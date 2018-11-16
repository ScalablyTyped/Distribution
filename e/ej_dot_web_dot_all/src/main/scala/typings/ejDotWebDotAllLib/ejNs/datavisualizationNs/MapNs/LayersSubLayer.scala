package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LayersSubLayer extends js.Object {
  /** to get the type of bing map.
               * @Default {aerial}
               */
  var bingMapType: js.UndefOr[BingMapType | java.lang.String] = js.undefined
  /** Specifies the bubble settings for map
               */
  var bubbleSettings: js.UndefOr[LayersSubLayersBubbleSettings] = js.undefined
  /** Specifies the datasource for the shape layer
               */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Enables or disables the shape mouse hover
               * @Default {false}
               */
  var enableMouseHover: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the shape selection
               * @Default {true}
               */
  var enableSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the map view type.
               * @Default {'geographic'}
               */
  var geometryType: js.UndefOr[GeometryType | java.lang.String] = js.undefined
  /** to get the key of bing map
               * @Default {null}
               */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Options for enabling and configuring labelSettings labelPath, smartLabelSize, labelLength etc.,
               */
  var labelSettings: js.UndefOr[LayersSubLayersLabelSettings] = js.undefined
  /** Specifies the map type.
               * @Default {'geometry'}
               */
  var layerType: js.UndefOr[LayerType | java.lang.String] = js.undefined
  /** Options for enabling and configuring legendSettings position, height, width, mode, type etc.,
               */
  var legendSettings: js.UndefOr[LayersSubLayersLegendSettings] = js.undefined
  /** Specifies the map items template for shapes.
               */
  var mapItemsTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the map marker template for map layer.
               * @Default {null}
               */
  var markerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specify markers for shape layer.
               */
  var markers: js.UndefOr[js.Array[_]] = js.undefined
  /** Specify selectedMapShapes for shape layer
               * @Default {[]}
               */
  var selectedMapShapes: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the selection mode of the map. Accepted selection mode values are Default and Multiple.
               * @Default {default}
               */
  var selectionMode: js.UndefOr[SelectionMode | java.lang.String] = js.undefined
  /** Specifies the shape data for the shape layer
               */
  var shapeData: js.UndefOr[js.Any] = js.undefined
  /** Specifies the data path of shape
               */
  var shapeDataPath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the data path of shape
               */
  var shapePropertyPath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the shape settings of map layer
               */
  var shapeSettings: js.UndefOr[LayersSubLayersShapeSettings] = js.undefined
  /** Shows or hides the map items.
               * @Default {false}
               */
  var showMapItems: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows or hides the tooltip for shapes
               * @Default {false}
               */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the tooltip template for shapes.
               */
  var tooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the URL template for the OSM type map.
               * @Default {'http://a.tile.openstreetmap.org/level/tileX/tileY.png'}
               */
  var urlTemplate: js.UndefOr[java.lang.String] = js.undefined
}

