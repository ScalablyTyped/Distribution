package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJsonObject extends js.Object {
  /**
    * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
    * The value of the bbox member is an array of length 2*n where n is the number of dimensions
    * represented in the contained geometries, with all axes of the most southwesterly point
    * followed by all axes of the more northeasterly point.
    * The axes order of a bbox follows the axes order of geometries.
    * https://tools.ietf.org/html/rfc7946#section-5
    */
  var bbox: js.UndefOr[BBox] = js.native
  // Don't include foreign members directly into this type def.
  // in order to preserve type safety.
  // [key: string]: any;
  /**
    * Specifies the type of GeoJSON object.
    */
  var `type`: GeoJsonTypes = js.native
}

object GeoJsonObject {
  @scala.inline
  def apply(`type`: GeoJsonTypes): GeoJsonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJsonObject]
  }
  @scala.inline
  implicit class GeoJsonObjectOps[Self <: GeoJsonObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: GeoJsonTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBbox(value: BBox): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
  }
  
}

