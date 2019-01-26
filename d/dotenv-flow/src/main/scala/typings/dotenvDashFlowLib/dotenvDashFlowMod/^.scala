package typings
package dotenvDashFlowLib.dotenvDashFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotenv-flow", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val load: js.Function1[
    /* options */ js.UndefOr[dotenvDashFlowLib.dotenvDashFlowMod.DotenvConfigOptions], 
    dotenvDashFlowLib.dotenvDashFlowMod.DotenvConfigOutput
  ] = js.native
  def config(): dotenvDashFlowLib.dotenvDashFlowMod.DotenvConfigOutput = js.native
  def config(options: dotenvDashFlowLib.dotenvDashFlowMod.DotenvConfigOptions): dotenvDashFlowLib.dotenvDashFlowMod.DotenvConfigOutput = js.native
  def parse(src: java.lang.String): dotenvDashFlowLib.dotenvDashFlowMod.DotenvParseOutput = js.native
  def parse(src: java.lang.String, options: dotenvDashFlowLib.dotenvDashFlowMod.DotenvParseOptions): dotenvDashFlowLib.dotenvDashFlowMod.DotenvParseOutput = js.native
  def parse(src: nodeLib.Buffer): dotenvDashFlowLib.dotenvDashFlowMod.DotenvParseOutput = js.native
  def parse(src: nodeLib.Buffer, options: dotenvDashFlowLib.dotenvDashFlowMod.DotenvParseOptions): dotenvDashFlowLib.dotenvDashFlowMod.DotenvParseOutput = js.native
}

