package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  /** The list of geometries in this geometry collection. */
  var geometries: js.UndefOr[js.Array[_]] = js.undefined
  var geometry: js.UndefOr[js.Any] = js.undefined
  /** Type: A collection of geometries. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Geometry {
  @scala.inline
  def apply(geometries: js.Array[_] = null, geometry: js.Any = null, `type`: String = null): Geometry = {
    val __obj = js.Dynamic.literal()
    if (geometries != null) __obj.updateDynamic("geometries")(geometries.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

