package typings
package dotenvDashFlowLib.dotenvDashFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotenv-flow", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def config(): DotenvLoadOutput = js.native
  def config(options: DotenvConfigOptions): DotenvLoadOutput = js.native
  def listDotenvFiles(dirname: java.lang.String): js.Array[java.lang.String] = js.native
  def listDotenvFiles(dirname: java.lang.String, options: DotenvListFilesOptions): js.Array[java.lang.String] = js.native
  def load(filenames: java.lang.String): DotenvLoadOutput = js.native
  def load(filenames: java.lang.String, options: DotenvReadFileOptions): DotenvLoadOutput = js.native
  def load(filenames: js.Array[java.lang.String]): DotenvLoadOutput = js.native
  def load(filenames: js.Array[java.lang.String], options: DotenvReadFileOptions): DotenvLoadOutput = js.native
  def parse(filenames: java.lang.String): DotenvParseOutput = js.native
  def parse(filenames: java.lang.String, options: DotenvReadFileOptions): DotenvParseOutput = js.native
  def parse(filenames: js.Array[java.lang.String]): DotenvParseOutput = js.native
  def parse(filenames: js.Array[java.lang.String], options: DotenvReadFileOptions): DotenvParseOutput = js.native
  def unload(filenames: java.lang.String): scala.Unit = js.native
  def unload(filenames: java.lang.String, options: DotenvReadFileOptions): scala.Unit = js.native
  def unload(filenames: js.Array[java.lang.String]): scala.Unit = js.native
  def unload(filenames: js.Array[java.lang.String], options: DotenvReadFileOptions): scala.Unit = js.native
}

