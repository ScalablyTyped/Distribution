package typings.forkTsCheckerWebpackPlugin.vueProgramMod

import typings.typescript.mod.ScriptKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedScript extends js.Object {
  var content: String
  var scriptKind: ScriptKind
}

object ResolvedScript {
  @scala.inline
  def apply(content: String, scriptKind: ScriptKind): ResolvedScript = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], scriptKind = scriptKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedScript]
  }
}

