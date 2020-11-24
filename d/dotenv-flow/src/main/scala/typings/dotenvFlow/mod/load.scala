package typings.dotenvFlow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dotenv-flow", "load")
@js.native
object load extends js.Object {
  
  def apply(filenames: String): DotenvLoadOutput = js.native
  def apply(filenames: String, options: DotenvReadFileOptions): DotenvLoadOutput = js.native
  def apply(filenames: js.Array[String]): DotenvLoadOutput = js.native
  def apply(filenames: js.Array[String], options: DotenvReadFileOptions): DotenvLoadOutput = js.native
}
