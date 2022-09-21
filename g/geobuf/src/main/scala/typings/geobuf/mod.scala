package typings.geobuf

import typings.geojson.mod.GeoJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geobuf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(pbf: typings.pbf.mod.^): GeoJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(pbf.asInstanceOf[js.Any]).asInstanceOf[GeoJSON]
  
  inline def encode(obj: GeoJSON, pbf: typings.pbf.mod.^): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], pbf.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
