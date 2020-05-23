package typings.googleEarth.google

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object earth {
  type GEEventPhaseEnum = js.Any
  type GEFeatureBalloon = typings.googleEarth.google.earth.GEAbstractBalloon
  type GEFeatureContainer = typings.googleEarth.google.earth.GESchemaObjectContainer[typings.googleEarth.google.earth.KmlFeature]
  type GEGeometryContainer = typings.googleEarth.google.earth.GESchemaObjectContainer[typings.googleEarth.google.earth.KmlGeometry]
  /**
    * Specifies what to sample when performing a hit test.
    */
  type GEHitTestModeEnum = js.Any
  type GELinearRingContainer = typings.googleEarth.google.earth.GESchemaObjectContainer[typings.googleEarth.google.earth.KmlLinearRing]
  /**
    * Specifies if the map type is Earth or sky mode.
    */
  type GEMapTypeEnum = js.Any
  /**
    * Specifies the size of the navigation control.
    */
  type GENavigationControlEnum = js.Any
  type GEStyleSelectorContainer = typings.googleEarth.google.earth.GESchemaObjectContainer[typings.googleEarth.google.earth.KmlStyleSelector]
  /*
    * Specifies the viewer option types.
    */
  type GEViewerOptionsTypeEnum = js.Any
  /**
    * Specifies the state of viewer options, including sunlight,
    * Street View, and historical imagery.
    */
  type GEViewerOptionsValueEnum = js.Any
  /**
    * Specifies if a control is always visible, always hidden,
    * or visible only when the user intends to use the control.
    */
  type GEVisibilityEnum = js.Any
  type KmlAltitudeModeEnum = js.Any
  type KmlColorModeEnum = js.Any
  type KmlFolder = typings.googleEarth.google.earth.KmlContainer
  type KmlGeometry = typings.googleEarth.google.earth.KmlObject
  type KmlLayer = typings.googleEarth.google.earth.KmlFolder
  type KmlLinearRing = typings.googleEarth.google.earth.KmlLineString
  type KmlListItemTypeEnum = js.Any
  type KmlPhotoOverlay = typings.googleEarth.google.earth.KmlOverlay
  type KmlRefreshModeEnum = js.Any
  type KmlStyleSelector = typings.googleEarth.google.earth.KmlObject
  type KmlTimePrimitive = typings.googleEarth.google.earth.KmlObject
  type KmlTour = typings.googleEarth.google.earth.KmlFeature
  /**
    * Specifies which units a value is specified in.
    */
  type KmlUnitsEnum = js.Any
  type KmlViewRefreshModeEnum = js.Any
}
