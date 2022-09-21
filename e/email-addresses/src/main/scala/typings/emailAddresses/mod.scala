package typings.emailAddresses

import typings.emailAddresses.emailAddresses.Options
import typings.emailAddresses.emailAddresses.ParsedGroup
import typings.emailAddresses.emailAddresses.ParsedMailbox
import typings.emailAddresses.emailAddresses.ParsedResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: Options): ParsedResult | Null = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[ParsedResult | Null]
  
  @JSImport("email-addresses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseAddressList(input: String): (js.Array[ParsedMailbox | ParsedGroup]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAddressList")(input.asInstanceOf[js.Any]).asInstanceOf[(js.Array[ParsedMailbox | ParsedGroup]) | Null]
  inline def parseAddressList(input: Options): (js.Array[ParsedMailbox | ParsedGroup]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAddressList")(input.asInstanceOf[js.Any]).asInstanceOf[(js.Array[ParsedMailbox | ParsedGroup]) | Null]
  
  inline def parseFrom(input: String): (js.Array[ParsedMailbox | ParsedGroup]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFrom")(input.asInstanceOf[js.Any]).asInstanceOf[(js.Array[ParsedMailbox | ParsedGroup]) | Null]
  inline def parseFrom(input: Options): (js.Array[ParsedMailbox | ParsedGroup]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFrom")(input.asInstanceOf[js.Any]).asInstanceOf[(js.Array[ParsedMailbox | ParsedGroup]) | Null]
  
  inline def parseOneAddress(input: String): ParsedMailbox | ParsedGroup | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOneAddress")(input.asInstanceOf[js.Any]).asInstanceOf[ParsedMailbox | ParsedGroup | Null]
  inline def parseOneAddress(input: Options): ParsedMailbox | ParsedGroup | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOneAddress")(input.asInstanceOf[js.Any]).asInstanceOf[ParsedMailbox | ParsedGroup | Null]
  
  inline def parseReplyTo(input: String): (js.Array[ParsedMailbox | ParsedGroup]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseReplyTo")(input.asInstanceOf[js.Any]).asInstanceOf[(js.Array[ParsedMailbox | ParsedGroup]) | Null]
  inline def parseReplyTo(input: Options): (js.Array[ParsedMailbox | ParsedGroup]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseReplyTo")(input.asInstanceOf[js.Any]).asInstanceOf[(js.Array[ParsedMailbox | ParsedGroup]) | Null]
  
  inline def parseSender(input: String): ParsedMailbox | ParsedGroup | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSender")(input.asInstanceOf[js.Any]).asInstanceOf[ParsedMailbox | ParsedGroup | Null]
  inline def parseSender(input: Options): ParsedMailbox | ParsedGroup | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSender")(input.asInstanceOf[js.Any]).asInstanceOf[ParsedMailbox | ParsedGroup | Null]
}
