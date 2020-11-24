package typings.errorStackParser.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("error-stack-parser", "parse")
@js.native
object parse extends js.Object {
  
  def apply(error: Error): js.Array[StackFrame] = js.native
}
