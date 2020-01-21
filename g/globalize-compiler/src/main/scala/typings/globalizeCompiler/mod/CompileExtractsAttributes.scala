package typings.globalizeCompiler.mod

import typings.globalize.globalizeMod.Static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileExtractsAttributes extends CompileOptions {
  /**
    * an Object with CLDR data (in the JSON format) or a Function taking one argument: locale, a String; returning
    *  an Object with the CLDR data for the passed locale. Defaults to the entire supplemental data plus the entire
    *  main data for the defaultLocale.
    */
  var cldr: js.UndefOr[js.Object | (js.Function1[/* locale */ String, js.Object])] = js.native
  /**
    * a locale to be used as Globalize.locale(defaultLocale) when generating the extracted formatters and parsers.
    */
  var defaultLocale: String = js.native
  /**
    * an Array of extracts obtained by @see{GlobalizeCompilerStatic.extract}
    */
  @JSName("extracts")
  var extracts_Original: ExtractFunction = js.native
  /**
    * an Object with messages data (in the JSON format) or a Function taking one argument: locale, a String; returning
    *  an Object with the messages data for the passed locale. Defaults to {}.
    */
  var messages: js.UndefOr[js.Object | (js.Function1[/* locale */ String, js.Object])] = js.native
  /**
    * an Array of extracts obtained by @see{GlobalizeCompilerStatic.extract}
    */
  def extracts(globalize: Static): js.Array[FormatterOrParserFunction] = js.native
}

