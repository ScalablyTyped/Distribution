package typings
package dotenvLib.dotenvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotenv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val load: js.Function1[/* options */ js.UndefOr[DotenvConfigOptions], DotenvConfigOutput] = js.native
  def config(): DotenvConfigOutput = js.native
  def config(options: DotenvConfigOptions): DotenvConfigOutput = js.native
  def parse(src: java.lang.String): DotenvParseOutput = js.native
  def parse(src: java.lang.String, options: DotenvParseOptions): DotenvParseOutput = js.native
  def parse(src: nodeLib.Buffer): DotenvParseOutput = js.native
  def parse(src: nodeLib.Buffer, options: DotenvParseOptions): DotenvParseOutput = js.native
}

