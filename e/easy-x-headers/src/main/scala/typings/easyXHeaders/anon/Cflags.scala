package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cflags extends js.Object {
  var cflags: js.Array[_]
  var default_configuration: String
  var defines: js.Array[String]
  var include_dirs: js.Array[String]
  var libraries: js.Array[String]
}

object Cflags {
  @scala.inline
  def apply(
    cflags: js.Array[_],
    default_configuration: String,
    defines: js.Array[String],
    include_dirs: js.Array[String],
    libraries: js.Array[String]
  ): Cflags = {
    val __obj = js.Dynamic.literal(cflags = cflags.asInstanceOf[js.Any], default_configuration = default_configuration.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], include_dirs = include_dirs.asInstanceOf[js.Any], libraries = libraries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cflags]
  }
}

