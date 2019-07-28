package typings.globalizeDashCompiler.globalizeDashCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globalize-compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(formattersAndParsers: js.Array[FormatterOrParserFunction]): String = js.native
  def compile(formattersAndParsers: js.Array[FormatterOrParserFunction], options: CompileOptions): String = js.native
  def compile(formattersAndParsers: StringDictionary[FormatterOrParserFunction]): String = js.native
  def compile(formattersAndParsers: StringDictionary[FormatterOrParserFunction], options: CompileOptions): String = js.native
  def compileExtracts(attributes: CompileExtractsAttributes): String = js.native
  def extract(input: String): ExtractFunction = js.native
  def extract(input: Program): ExtractFunction = js.native
}

