package typings.distributionsDashPoissonDashQuantile.distributionsDashPoissonDashQuantileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// derived from https://github.com/dstructs/matrix
@js.native
trait Matrix extends js.Object {
  val data: Data = js.native
  val dtype: DataType = js.native
  val length: Double = js.native
  val nbytes: Double = js.native
  val ndims: Double = js.native
  var offset: Double = js.native
  val shape: js.Array[Double] = js.native
  var strides: js.Array[Double] = js.native
  def get(i: Double, j: Double): Matrix = js.native
  def iget(index: Double): Matrix = js.native
  def iset(idx: Double, value: Double): Matrix = js.native
  def mget(idx: js.Array[Double]): js.Array[Matrix] = js.native
  def mget(idx: js.Array[Double], cols: js.Array[Double]): js.Array[Matrix] = js.native
  def mset(idx: js.Array[Double], colsOrValue: js.Array[Double]): Matrix = js.native
  def mset(idx: js.Array[Double], colsOrValue: js.Array[Double], value: Double): Matrix = js.native
  def mset(idx: js.Array[Double], colsOrValue: js.Array[Double], value: Matrix): Matrix = js.native
  def mset(idx: js.Array[Double], colsOrValue: js.Array[Double], value: MatrixCallback): Matrix = js.native
  def mset(idx: js.Array[Double], colsOrValue: Matrix): Matrix = js.native
  def mset(idx: js.Array[Double], colsOrValue: Matrix, value: Double): Matrix = js.native
  def mset(idx: js.Array[Double], colsOrValue: Matrix, value: Matrix): Matrix = js.native
  def mset(idx: js.Array[Double], colsOrValue: Matrix, value: MatrixCallback): Matrix = js.native
  def set(i: Double, j: Double, value: Double): Matrix = js.native
  def sget(subsequence: String): Matrix = js.native
  def sset(subsequence: String, value: Double): Matrix = js.native
  def sset(subsequence: String, value: Matrix): Matrix = js.native
  def sset(subsequence: String, value: MatrixCallback): Matrix = js.native
  def toJSON(): String = js.native
}

