package typings.enhancedResolve.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paths extends js.Object {
  var paths: js.Array[String]
  var seqments: js.Array[String]
}

object Paths {
  @scala.inline
  def apply(paths: js.Array[String], seqments: js.Array[String]): Paths = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], seqments = seqments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
}

