package typings.geobuf

import typings.geojson.geojsonMod.GeoJSON
import typings.pbf.pbfMod.^
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geobuf", JSImport.Namespace)
@js.native
object geobufMod extends js.Object {
  def decode(pbf: ^): GeoJSON = js.native
  def encode(obj: GeoJSON, pbf: ^): Uint8Array = js.native
}

