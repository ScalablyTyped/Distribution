package typings.globalizeCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("globalize-compiler", "compile")
@js.native
object compile extends js.Object {
  
  def apply(formattersAndParsers: js.Array[FormatterOrParserFunction]): String = js.native
  def apply(formattersAndParsers: js.Array[FormatterOrParserFunction], options: CompileOptions): String = js.native
  def apply(formattersAndParsers: StringDictionary[FormatterOrParserFunction]): String = js.native
  def apply(formattersAndParsers: StringDictionary[FormatterOrParserFunction], options: CompileOptions): String = js.native
}
