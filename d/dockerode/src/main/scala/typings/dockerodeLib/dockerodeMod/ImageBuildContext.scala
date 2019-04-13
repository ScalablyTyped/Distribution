package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBuildContext extends js.Object {
  var context: java.lang.String
  var src: js.Array[java.lang.String]
}

object ImageBuildContext {
  @scala.inline
  def apply(context: java.lang.String, src: js.Array[java.lang.String]): ImageBuildContext = {
    val __obj = js.Dynamic.literal(context = context, src = src)
  
    __obj.asInstanceOf[ImageBuildContext]
  }
}

