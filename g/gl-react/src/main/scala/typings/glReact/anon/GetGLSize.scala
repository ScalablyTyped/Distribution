package typings.glReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGLSize extends js.Object {
  def getGLSize(): js.Tuple2[Double, Double]
}

object GetGLSize {
  @scala.inline
  def apply(getGLSize: () => js.Tuple2[Double, Double]): GetGLSize = {
    val __obj = js.Dynamic.literal(getGLSize = js.Any.fromFunction0(getGLSize))
    __obj.asInstanceOf[GetGLSize]
  }
}

