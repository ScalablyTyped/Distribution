package typings.formatjsIntl.libSrcTypesMod

import typings.formatjsIntl.libSrcErrorMod.InvalidConfigError
import typings.formatjsIntl.libSrcErrorMod.MessageFormatError
import typings.formatjsIntl.libSrcErrorMod.MissingDataError
import typings.formatjsIntl.libSrcErrorMod.MissingTranslationError
import typings.formatjsIntl.libSrcErrorMod.UnsupportedFormatterError
import typings.intlMessageformat.mod.FormatError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.IntlConfig extends {  locale :string} ? @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.IntlConfig['locale'] : string
  }}}
  */
type Locale = String

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Message extends {  ids :string} ? @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Message['ids'] : string
  }}}
  */
type MessageIds = String

type OnErrorFn = js.Function1[
/* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError, 
Unit]

type OnWarnFn = js.Function1[/* warning */ String, Unit]
