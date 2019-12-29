package typings.distributionsDashPoissonDashQuantile.distributionsDashPoissonDashQuantileMod

import typings.distributionsDashPoissonDashQuantile.Anon_DtypeUint8clamped
import typings.distributionsDashPoissonDashQuantile.Anon_DtypeUndefined
import typings.std.Float64Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("distributions-poisson-quantile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(p: js.Array[Double]): js.Array[Double] = js.native
  def apply(p: js.Array[Double], options: Options with Anon_DtypeUndefined): js.Array[Double] = js.native
  /**
    * Evaluates the quantile function for a Poisson distribution.
    * @param p input value
    * @param options function options
    * @returns quantile function value(s)
    */
  def apply(p: Double): Double | Data | Matrix = js.native
  def apply(p: Double, options: Options): Double | Data | Matrix = js.native
  def apply(p: Data): Float64Array = js.native
  def apply(p: Data, options: Options with Anon_DtypeUint8clamped): Uint8ClampedArray = js.native
  def apply(p: MatrixLike): Double | Data | Matrix = js.native
  def apply(p: MatrixLike, options: Options): Double | Data | Matrix = js.native
}

