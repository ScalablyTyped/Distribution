package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKindModule extends js.Object {
  var kind: String
  var module: String
  var name: String
}

object AnonKindModule {
  @scala.inline
  def apply(kind: String, module: String, name: String): AnonKindModule = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKindModule]
  }
}

