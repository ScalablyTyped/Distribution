package typings
package atFrctlFractalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.Array[java.lang.String]
  var command: java.lang.String
  var opts: js.Any
}

object Anon_Args {
  @scala.inline
  def apply(args: js.Array[java.lang.String], command: java.lang.String, opts: js.Any): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("opts")(opts)
    __obj.asInstanceOf[Anon_Args]
  }
}

