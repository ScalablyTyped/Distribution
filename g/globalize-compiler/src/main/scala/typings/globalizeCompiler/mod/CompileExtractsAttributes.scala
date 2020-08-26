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
  var extracts: ExtractFunction | js.Array[ExtractFunction] = js.native
  /**
    * an Object with messages data (in the JSON format) or a Function taking one argument: locale, a String; returning
    *  an Object with the messages data for the passed locale. Defaults to {}.
    */
  var messages: js.UndefOr[js.Object | (js.Function1[/* locale */ String, js.Object])] = js.native
}

object CompileExtractsAttributes {
  @scala.inline
  def apply(defaultLocale: String, extracts: ExtractFunction | js.Array[ExtractFunction]): CompileExtractsAttributes = {
    val __obj = js.Dynamic.literal(defaultLocale = defaultLocale.asInstanceOf[js.Any], extracts = extracts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileExtractsAttributes]
  }
  @scala.inline
  implicit class CompileExtractsAttributesOps[Self <: CompileExtractsAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtractsVarargs(value: ExtractFunction*): Self = this.set("extracts", js.Array(value :_*))
    @scala.inline
    def setExtractsFunction1(value: /* globalize */ Static => js.Array[FormatterOrParserFunction]): Self = this.set("extracts", js.Any.fromFunction1(value))
    @scala.inline
    def setExtracts(value: ExtractFunction | js.Array[ExtractFunction]): Self = this.set("extracts", value.asInstanceOf[js.Any])
    @scala.inline
    def setCldrFunction1(value: /* locale */ String => js.Object): Self = this.set("cldr", js.Any.fromFunction1(value))
    @scala.inline
    def setCldr(value: js.Object | (js.Function1[/* locale */ String, js.Object])): Self = this.set("cldr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCldr: Self = this.set("cldr", js.undefined)
    @scala.inline
    def setMessagesFunction1(value: /* locale */ String => js.Object): Self = this.set("messages", js.Any.fromFunction1(value))
    @scala.inline
    def setMessages(value: js.Object | (js.Function1[/* locale */ String, js.Object])): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
  }
  
}

