package typings
package enhancedDashResolveLib.libConcordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Concord extends js.Object {
  var `[server] main`: java.lang.String
  var extensions: js.Array[java.lang.String]
  var main: java.lang.String
  var modules: Dictionary[java.lang.String]
  var types: Dictionary[java.lang.String]
}

object Concord {
  @scala.inline
  def apply(
    `[server] main`: java.lang.String,
    extensions: js.Array[java.lang.String],
    main: java.lang.String,
    modules: Dictionary[java.lang.String],
    types: Dictionary[java.lang.String]
  ): Concord = {
    val __obj = js.Dynamic.literal(extensions = extensions, main = main, modules = modules, types = types)
    __obj.updateDynamic("[server] main")(`[server] main`)
    __obj.asInstanceOf[Concord]
  }
}

