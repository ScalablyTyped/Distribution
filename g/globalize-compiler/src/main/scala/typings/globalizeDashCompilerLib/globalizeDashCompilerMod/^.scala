package typings
package globalizeDashCompilerLib.globalizeDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globalize-compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(formattersAndParsers: js.Array[FormatterOrParserFunction]): java.lang.String = js.native
  def compile(formattersAndParsers: js.Array[FormatterOrParserFunction], options: CompileOptions): java.lang.String = js.native
  def compile(formattersAndParsers: org.scalablytyped.runtime.StringDictionary[FormatterOrParserFunction]): java.lang.String = js.native
  def compile(
    formattersAndParsers: org.scalablytyped.runtime.StringDictionary[FormatterOrParserFunction],
    options: CompileOptions
  ): java.lang.String = js.native
  def compileExtracts(attributes: CompileExtractsAttributes): java.lang.String = js.native
  def extract(input: estreeLib.estreeMod.Program): ExtractFunction = js.native
  def extract(input: java.lang.String): ExtractFunction = js.native
}

