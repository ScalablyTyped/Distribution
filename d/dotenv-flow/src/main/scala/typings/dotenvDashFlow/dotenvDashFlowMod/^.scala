package typings.dotenvDashFlow.dotenvDashFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dotenv-flow", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def config(): DotenvLoadOutput = js.native
  def config(options: DotenvConfigOptions): DotenvLoadOutput = js.native
  def listDotenvFiles(dirname: String): js.Array[String] = js.native
  def listDotenvFiles(dirname: String, options: DotenvListFilesOptions): js.Array[String] = js.native
  def load(filenames: String): DotenvLoadOutput = js.native
  def load(filenames: String, options: DotenvReadFileOptions): DotenvLoadOutput = js.native
  def load(filenames: js.Array[String]): DotenvLoadOutput = js.native
  def load(filenames: js.Array[String], options: DotenvReadFileOptions): DotenvLoadOutput = js.native
  def parse(filenames: String): DotenvParseOutput = js.native
  def parse(filenames: String, options: DotenvReadFileOptions): DotenvParseOutput = js.native
  def parse(filenames: js.Array[String]): DotenvParseOutput = js.native
  def parse(filenames: js.Array[String], options: DotenvReadFileOptions): DotenvParseOutput = js.native
  def unload(filenames: String): Unit = js.native
  def unload(filenames: String, options: DotenvReadFileOptions): Unit = js.native
  def unload(filenames: js.Array[String]): Unit = js.native
  def unload(filenames: js.Array[String], options: DotenvReadFileOptions): Unit = js.native
}

