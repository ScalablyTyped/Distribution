package typings.distributionsDashPoissonDashQuantile.distributionsDashPoissonDashQuantileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// derived from https://github.com/validate-io/matrix-like
trait MatrixLike extends js.Object {
  var data: js.Object
  var dtype: String
  var length: Double
  var offset: Double
  var shape: js.Object
  var strides: js.Object
}

object MatrixLike {
  @scala.inline
  def apply(
    data: js.Object,
    dtype: String,
    length: Double,
    offset: Double,
    shape: js.Object,
    strides: js.Object
  ): MatrixLike = {
    val __obj = js.Dynamic.literal(data = data, dtype = dtype, length = length, offset = offset, shape = shape, strides = strides)
  
    __obj.asInstanceOf[MatrixLike]
  }
}

