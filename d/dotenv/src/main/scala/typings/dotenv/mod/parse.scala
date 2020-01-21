package typings.dotenv.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotenv", "parse")
@js.native
object parse extends js.Object {
  def apply(src: String): DotenvParseOutput = js.native
  def apply(src: String, options: DotenvParseOptions): DotenvParseOutput = js.native
  def apply(src: Buffer): DotenvParseOutput = js.native
  def apply(src: Buffer, options: DotenvParseOptions): DotenvParseOutput = js.native
}

