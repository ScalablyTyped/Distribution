package typings.enhancedResolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaths extends js.Object {
  var paths: js.Array[String]
  var seqments: js.Array[String]
}

object AnonPaths {
  @scala.inline
  def apply(paths: js.Array[String], seqments: js.Array[String]): AnonPaths = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], seqments = seqments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPaths]
  }
}

