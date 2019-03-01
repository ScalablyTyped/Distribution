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
    val __obj = js.Dynamic.literal(`[server] main` = `[server] main`)
    __obj.updateDynamic("extensions")(extensions)
    __obj.updateDynamic("main")(main)
    __obj.updateDynamic("modules")(modules)
    __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[Concord]
  }
}

