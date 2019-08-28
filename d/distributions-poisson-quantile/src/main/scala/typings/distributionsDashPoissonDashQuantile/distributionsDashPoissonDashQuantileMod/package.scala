package typings.distributionsDashPoissonDashQuantile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distributionsDashPoissonDashQuantileMod {
  import typings.std.Float32Array
  import typings.std.Float64Array
  import typings.std.Int16Array
  import typings.std.Int32Array
  import typings.std.Int8Array
  import typings.std.Uint16Array
  import typings.std.Uint32Array
  import typings.std.Uint8Array
  import typings.std.Uint8ClampedArray

  type Data = js.Array[Double] | Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
  type MatrixCallback = js.Function4[/* d */ Double, /* i */ Double, /* j */ Double, /* idx */ Double, Double]
}
