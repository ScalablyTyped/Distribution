package typings.glDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetGLSize extends js.Object {
  def getGLSize(): js.Tuple2[Double, Double]
}

object Anon_GetGLSize {
  @scala.inline
  def apply(getGLSize: () => js.Tuple2[Double, Double]): Anon_GetGLSize = {
    val __obj = js.Dynamic.literal(getGLSize = js.Any.fromFunction0(getGLSize))
  
    __obj.asInstanceOf[Anon_GetGLSize]
  }
}

