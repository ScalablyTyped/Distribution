package typings.formatjsIntl.typesMod

import typings.formatjsIntl.errorMod.InvalidConfigError
import typings.formatjsIntl.errorMod.MessageFormatError
import typings.formatjsIntl.errorMod.MissingDataError
import typings.formatjsIntl.errorMod.MissingTranslationError
import typings.formatjsIntl.errorMod.UnsupportedFormatterError
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
