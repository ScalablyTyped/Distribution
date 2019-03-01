package typings
package glDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetGLSize extends js.Object {
  def getGLSize(): js.Tuple2[scala.Double, scala.Double]
}

object Anon_GetGLSize {
  @scala.inline
  def apply(getGLSize: js.Function0[js.Tuple2[scala.Double, scala.Double]]): Anon_GetGLSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGLSize")(getGLSize)
    __obj.asInstanceOf[Anon_GetGLSize]
  }
}

