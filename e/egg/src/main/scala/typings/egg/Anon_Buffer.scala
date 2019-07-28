package typings.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: Boolean
  var dir: String | js.Array[String]
  // support lazy load
  var dynamic: Boolean
  var maxFiles: Double
  var prefix: String
  var preload: Boolean
}

object Anon_Buffer {
  @scala.inline
  def apply(
    buffer: Boolean,
    dir: String | js.Array[String],
    dynamic: Boolean,
    maxFiles: Double,
    prefix: String,
    preload: Boolean
  ): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer, dir = dir.asInstanceOf[js.Any], dynamic = dynamic, maxFiles = maxFiles, prefix = prefix, preload = preload)
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

