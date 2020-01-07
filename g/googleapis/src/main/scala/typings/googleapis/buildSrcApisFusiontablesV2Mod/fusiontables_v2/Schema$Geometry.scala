package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Geometry object.
  */
@js.native
trait Schema$Geometry extends js.Object {
  /**
    * The list of geometries in this geometry collection.
    */
  var geometries: js.UndefOr[js.Array[_]] = js.native
  var geometry: js.UndefOr[js.Any] = js.native
  /**
    * Type: A collection of geometries.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Geometry {
  @scala.inline
  def apply(geometries: js.Array[_] = null, geometry: js.Any = null, `type`: String = null): Schema$Geometry = {
    val __obj = js.Dynamic.literal()
    if (geometries != null) __obj.updateDynamic("geometries")(geometries.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Geometry]
  }
}

