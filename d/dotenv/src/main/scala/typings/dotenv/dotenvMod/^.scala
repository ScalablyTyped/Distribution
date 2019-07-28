package typings.dotenv.dotenvMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotenv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val load: js.Function1[/* options */ js.UndefOr[DotenvConfigOptions], DotenvConfigOutput] = js.native
  def config(): DotenvConfigOutput = js.native
  def config(options: DotenvConfigOptions): DotenvConfigOutput = js.native
  def parse(src: String): DotenvParseOutput = js.native
  def parse(src: String, options: DotenvParseOptions): DotenvParseOutput = js.native
  def parse(src: Buffer): DotenvParseOutput = js.native
  def parse(src: Buffer, options: DotenvParseOptions): DotenvParseOutput = js.native
}

