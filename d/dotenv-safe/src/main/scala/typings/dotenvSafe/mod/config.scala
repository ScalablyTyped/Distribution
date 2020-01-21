package typings.dotenvSafe.mod

import typings.dotenv.mod.DotenvConfigOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotenv-safe", "config")
@js.native
object config extends js.Object {
  def apply(): DotenvConfigOutput = js.native
  def apply(options: DotenvSafeOptions): DotenvConfigOutput = js.native
}

