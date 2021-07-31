package typings.formatjsIntl

import typings.formatjsIntl.anon.DefaultFormats
import typings.formatjsIntl.srcTypesMod.Formatters
import typings.formatjsIntl.srcTypesMod.MessageDescriptor
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformat.srcFormattersMod.PrimitiveType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMessageMod {
  
  @JSImport("@formatjs/intl/src/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatMessage(config: DefaultFormats, state: Formatters): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatMessage(
    config: DefaultFormats,
    state: Formatters,
    messageDescriptor: Unit,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any], messageDescriptor.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatMessage(config: DefaultFormats, state: Formatters, messageDescriptor: MessageDescriptor): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any], messageDescriptor.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatMessage(
    config: DefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(config.asInstanceOf[js.Any], state.asInstanceOf[js.Any], messageDescriptor.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
}
