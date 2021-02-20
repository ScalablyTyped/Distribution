package typings.formatjsIntl

import typings.formatjsIntl.anon.DefaultLocale
import typings.formatjsIntl.typesMod.Formatters
import typings.formatjsIntl.typesMod.MessageDescriptor
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformat.srcFormattersMod.PrimitiveType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  def formatMessage(config: DefaultLocale, state: Formatters): String = js.native
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  def formatMessage(
    config: DefaultLocale,
    state: Formatters,
    messageDescriptor: js.UndefOr[scala.Nothing],
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  def formatMessage(config: DefaultLocale, state: Formatters, messageDescriptor: MessageDescriptor): String = js.native
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  def formatMessage(
    config: DefaultLocale,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
}
