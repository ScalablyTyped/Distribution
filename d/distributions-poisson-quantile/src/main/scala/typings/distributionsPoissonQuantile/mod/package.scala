package typings.distributionsPoissonQuantile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Data = js.Array[scala.Double] | typings.std.Int8Array | typings.std.Uint8Array | typings.std.Uint8ClampedArray | typings.std.Int16Array | typings.std.Uint16Array | typings.std.Int32Array | typings.std.Uint32Array | typings.std.Float32Array | typings.std.Float64Array
  
  type MatrixCallback = js.Function4[
    /* d */ scala.Double, 
    /* i */ scala.Double, 
    /* j */ scala.Double, 
    /* idx */ scala.Double, 
    scala.Double
  ]
}
