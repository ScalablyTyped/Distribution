package typings
package dotenvLib.dotenvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotenv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val load: js.Function1[
    /* options */ js.UndefOr[dotenvLib.dotenvMod.DotenvConfigOptions], 
    dotenvLib.dotenvMod.DotenvConfigOutput
  ] = js.native
  def config(): dotenvLib.dotenvMod.DotenvConfigOutput = js.native
  def config(options: dotenvLib.dotenvMod.DotenvConfigOptions): dotenvLib.dotenvMod.DotenvConfigOutput = js.native
  def parse(src: java.lang.String): dotenvLib.dotenvMod.DotenvParseOutput = js.native
  def parse(src: java.lang.String, options: dotenvLib.dotenvMod.DotenvParseOptions): dotenvLib.dotenvMod.DotenvParseOutput = js.native
  def parse(src: nodeLib.Buffer): dotenvLib.dotenvMod.DotenvParseOutput = js.native
  def parse(src: nodeLib.Buffer, options: dotenvLib.dotenvMod.DotenvParseOptions): dotenvLib.dotenvMod.DotenvParseOutput = js.native
}

