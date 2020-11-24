package typings.geobuf

import typings.geojson.mod.GeoJSON
import typings.pbf.mod.^
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geobuf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(pbf: ^): GeoJSON = js.native
  
  def encode(obj: GeoJSON, pbf: ^): Uint8Array = js.native
}
