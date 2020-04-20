package typings.glReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetGLSize extends js.Object {
  def getGLSize(): js.Tuple2[Double, Double]
}

object AnonGetGLSize {
  @scala.inline
  def apply(getGLSize: () => js.Tuple2[Double, Double]): AnonGetGLSize = {
    val __obj = js.Dynamic.literal(getGLSize = js.Any.fromFunction0(getGLSize))
    __obj.asInstanceOf[AnonGetGLSize]
  }
}

