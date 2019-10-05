package typings.distributionsDashPoissonDashQuantile.distributionsDashPoissonDashQuantileMod

import typings.distributionsDashPoissonDashQuantile.Anon_DtypeFloat64
import typings.distributionsDashPoissonDashQuantile.Anon_DtypeUndefined
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("distributions-poisson-quantile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(p: js.Array[Double]): js.Array[Double] = js.native
  def apply(p: js.Array[Double], options: Options with Anon_DtypeUndefined): js.Array[Double] = js.native
  def apply(p: Double): Double = js.native
  def apply(p: Double, options: Options): Double = js.native
  def apply(p: Data): Float64Array = js.native
  def apply(p: Data, options: Options with Anon_DtypeFloat64): Float64Array = js.native
  def apply(p: MatrixLike): Double | Data | Matrix = js.native
  def apply(p: MatrixLike, options: Options): Double | Data | Matrix = js.native
}

