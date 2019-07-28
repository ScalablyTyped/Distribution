package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBuildContext extends js.Object {
  var context: String
  var src: js.Array[String]
}

object ImageBuildContext {
  @scala.inline
  def apply(context: String, src: js.Array[String]): ImageBuildContext = {
    val __obj = js.Dynamic.literal(context = context, src = src)
  
    __obj.asInstanceOf[ImageBuildContext]
  }
}

