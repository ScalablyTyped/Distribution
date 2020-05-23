package typings.findConfig.mod

import typings.findConfig.anon.Cwd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-config", "obj")
@js.native
object obj extends js.Object {
  def apply(): Cwd | Null = js.native
  def apply(filename: String): Cwd | Null = js.native
  def apply(filename: String, options: Options): Cwd | Null = js.native
}

