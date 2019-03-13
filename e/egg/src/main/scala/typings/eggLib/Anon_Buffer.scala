package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: scala.Boolean
  var dir: java.lang.String | js.Array[java.lang.String]
  // support lazy load
  var dynamic: scala.Boolean
  var maxFiles: scala.Double
  var prefix: java.lang.String
  var preload: scala.Boolean
}

object Anon_Buffer {
  @scala.inline
  def apply(
    buffer: scala.Boolean,
    dir: java.lang.String | js.Array[java.lang.String],
    dynamic: scala.Boolean,
    maxFiles: scala.Double,
    prefix: java.lang.String,
    preload: scala.Boolean
  ): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer, dir = dir.asInstanceOf[js.Any], dynamic = dynamic, maxFiles = maxFiles, prefix = prefix, preload = preload)
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

