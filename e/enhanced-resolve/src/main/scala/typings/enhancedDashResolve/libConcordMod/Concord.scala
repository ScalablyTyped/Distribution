package typings.enhancedDashResolve.libConcordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Concord extends js.Object {
  var `[server] main`: String
  var extensions: js.Array[String]
  var main: String
  var modules: Dictionary[String]
  var types: Dictionary[String]
}

object Concord {
  @scala.inline
  def apply(
    `[server] main`: String,
    extensions: js.Array[String],
    main: String,
    modules: Dictionary[String],
    types: Dictionary[String]
  ): Concord = {
    val __obj = js.Dynamic.literal(extensions = extensions, main = main, modules = modules, types = types)
    __obj.updateDynamic("[server] main")(`[server] main`)
    __obj.asInstanceOf[Concord]
  }
}

