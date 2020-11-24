package typings.dotenvFlow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dotenv-flow", "parse")
@js.native
object parse extends js.Object {
  
  def apply(filenames: String): DotenvParseOutput = js.native
  def apply(filenames: String, options: DotenvReadFileOptions): DotenvParseOutput = js.native
  def apply(filenames: js.Array[String]): DotenvParseOutput = js.native
  def apply(filenames: js.Array[String], options: DotenvReadFileOptions): DotenvParseOutput = js.native
}
