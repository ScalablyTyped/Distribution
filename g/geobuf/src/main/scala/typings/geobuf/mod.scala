package typings.geobuf

import typings.geojson.mod.GeoJSON
import typings.pbf.mod.^
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geobuf", "decode")
  @js.native
  def decode(pbf: ^): GeoJSON = js.native
  
  @JSImport("geobuf", "encode")
  @js.native
  def encode(obj: GeoJSON, pbf: ^): Uint8Array = js.native
}
