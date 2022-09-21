package typings.formatjsIntl.srcTypesMod

import typings.formatjsIntl.srcErrorMod.InvalidConfigError
import typings.formatjsIntl.srcErrorMod.MessageFormatError
import typings.formatjsIntl.srcErrorMod.MissingDataError
import typings.formatjsIntl.srcErrorMod.MissingTranslationError
import typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typings.intlMessageformat.mod.FormatError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Locale = String | (/* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.IntlConfig['locale'] */ js.Any)

type MessageIds = String | (/* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Message['ids'] */ js.Any)

type OnErrorFn = js.Function1[
/* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError, 
Unit]

type OnWarnFn = js.Function1[/* warning */ String, Unit]
