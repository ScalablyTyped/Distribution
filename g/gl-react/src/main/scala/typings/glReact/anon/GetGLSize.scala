package typings.glReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGLSize extends js.Object {
  def getGLSize(): js.Tuple2[Double, Double] = js.native
}

object GetGLSize {
  @scala.inline
  def apply(getGLSize: () => js.Tuple2[Double, Double]): GetGLSize = {
    val __obj = js.Dynamic.literal(getGLSize = js.Any.fromFunction0(getGLSize))
    __obj.asInstanceOf[GetGLSize]
  }
  @scala.inline
  implicit class GetGLSizeOps[Self <: GetGLSize] (val x: Self) extends AnyVal {
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
    def setGetGLSize(value: () => js.Tuple2[Double, Double]): Self = this.set("getGLSize", js.Any.fromFunction0(value))
  }
  
}

