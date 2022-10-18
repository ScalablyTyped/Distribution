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


type OnErrorFn = js.Function1[
/* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError, 
Unit]

type OnWarnFn = js.Function1[/* warning */ String, Unit]
