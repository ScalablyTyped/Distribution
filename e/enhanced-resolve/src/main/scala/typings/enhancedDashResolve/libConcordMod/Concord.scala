package typings.enhancedDashResolve.libConcordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Concord extends js.Object {
  @JSName("[server] main")
  var `LeftsquarebracketserverRightsquarebracket main`: String
  var extensions: js.Array[String]
  var main: String
  var modules: Dictionary[String]
  var types: Dictionary[String]
}

object Concord {
  @scala.inline
  def apply(
    `LeftsquarebracketserverRightsquarebracket main`: String,
    extensions: js.Array[String],
    main: String,
    modules: Dictionary[String],
    types: Dictionary[String]
  ): Concord = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("[server] main")(`LeftsquarebracketserverRightsquarebracket main`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concord]
  }
}

