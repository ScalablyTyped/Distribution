package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StyleSetting extends js.Object {
  /**
               * The kind of item this is. A StyleSetting contains the style definitions for points, lines, and polygons in a table. Since a table can have any one or
               * all of them, a style definition can have point, line and polygon style definitions.
               */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Style definition for points in the table. */
  var markerOptions: js.UndefOr[PointStyle] = js.undefined
  /** Optional name for the style setting. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Style definition for polygons in the table. */
  var polygonOptions: js.UndefOr[PolygonStyle] = js.undefined
  /** Style definition for lines in the table. */
  var polylineOptions: js.UndefOr[LineStyle] = js.undefined
  /** Identifier for the style setting (unique only within tables). */
  var styleId: js.UndefOr[scala.Double] = js.undefined
  /** Identifier for the table. */
  var tableId: js.UndefOr[java.lang.String] = js.undefined
}

