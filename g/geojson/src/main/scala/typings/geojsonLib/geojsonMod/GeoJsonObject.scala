package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GeoJsonObject extends js.Object {
  /**
       * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
       * https://tools.ietf.org/html/rfc7946#section-5
       */
  var bbox: js.UndefOr[BBox] = js.undefined
  // Don't include foreign members directly into this type def.
  // in order to preserve type safety.
  // [key: string]: any;
  /**
       * Specifies the type of GeoJSON object.
       */
  var `type`: GeoJsonTypes
}

