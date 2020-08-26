package typings.distributionsPoissonQuantile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// derived from https://github.com/validate-io/matrix-like
@js.native
trait MatrixLike extends js.Object {
  var data: js.Object = js.native
  var dtype: String = js.native
  var length: Double = js.native
  var offset: Double = js.native
  var shape: js.Object = js.native
  var strides: js.Object = js.native
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixLike]
  }
  @scala.inline
  implicit class MatrixLikeOps[Self <: MatrixLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDtype(value: String): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: js.Object): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrides(value: js.Object): Self = this.set("strides", value.asInstanceOf[js.Any])
  }
  
}

