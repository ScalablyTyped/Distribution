package typings.globalizeCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileExtractsAttributes extends CompileOptions {
  /**
    * an Object with CLDR data (in the JSON format) or a Function taking one argument: locale, a String; returning
    *  an Object with the CLDR data for the passed locale. Defaults to the entire supplemental data plus the entire
    *  main data for the defaultLocale.
    */
  var cldr: js.UndefOr[js.Object | (js.Function1[/* locale */ String, js.Object])] = js.undefined
  /**
    * a locale to be used as Globalize.locale(defaultLocale) when generating the extracted formatters and parsers.
    */
  var defaultLocale: String
  /**
    * an Array of extracts obtained by @see{GlobalizeCompilerStatic.extract}
    */
  var extracts: ExtractFunction | js.Array[ExtractFunction]
  /**
    * an Object with messages data (in the JSON format) or a Function taking one argument: locale, a String; returning
    *  an Object with the messages data for the passed locale. Defaults to {}.
    */
  var messages: js.UndefOr[js.Object | (js.Function1[/* locale */ String, js.Object])] = js.undefined
}

object CompileExtractsAttributes {
  @scala.inline
  def apply(
    defaultLocale: String,
    extracts: ExtractFunction | js.Array[ExtractFunction],
    cldr: js.Object | (js.Function1[/* locale */ String, js.Object]) = null,
    messages: js.Object | (js.Function1[/* locale */ String, js.Object]) = null,
    template: /* options */ CompileTemplateOptions => String = null
  ): CompileExtractsAttributes = {
    val __obj = js.Dynamic.literal(defaultLocale = defaultLocale.asInstanceOf[js.Any], extracts = extracts.asInstanceOf[js.Any])
    if (cldr != null) __obj.updateDynamic("cldr")(cldr.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    __obj.asInstanceOf[CompileExtractsAttributes]
  }
}

