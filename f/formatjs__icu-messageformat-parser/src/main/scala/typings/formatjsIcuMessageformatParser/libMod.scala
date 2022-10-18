package typings.formatjsIcuMessageformatParser

import org.scalablytyped.runtime.Instantiable2
import typings.formatjsIcuMessageformatParser.libParserMod.ParserOptions
import typings.formatjsIcuMessageformatParser.libTypesMod.DateTimeSkeleton
import typings.formatjsIcuMessageformatParser.libTypesMod.LiteralElement
import typings.formatjsIcuMessageformatParser.libTypesMod.MessageFormatElement
import typings.formatjsIcuMessageformatParser.libTypesMod.NumberElement
import typings.formatjsIcuMessageformatParser.libTypesMod.NumberSkeleton
import typings.formatjsIcuMessageformatParser.libTypesMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@formatjs/icu-messageformat-parser/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@formatjs/icu-messageformat-parser/lib", "_Parser")
  @js.native
  open class Parser protected ()
    extends typings.formatjsIcuMessageformatParser.libParserMod.Parser {
    def this(message: String) = this()
    def this(message: String, options: ParserOptions) = this()
  }
  
  @JSImport("@formatjs/icu-messageformat-parser/lib", "_Parser")
  @js.native
  val Parser: Instantiable2[
    /* message */ String, 
    /* options */ js.UndefOr[ParserOptions], 
    typings.formatjsIcuMessageformatParser.libParserMod.Parser
  ] = js.native
  
  @JSImport("@formatjs/icu-messageformat-parser/lib", "SKELETON_TYPE")
  @js.native
  object SKELETON_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.formatjsIcuMessageformatParser.libTypesMod.SKELETON_TYPE & Double] = js.native
    
    /* 1 */ val dateTime: typings.formatjsIcuMessageformatParser.libTypesMod.SKELETON_TYPE.dateTime & Double = js.native
    
    /* 0 */ val number: typings.formatjsIcuMessageformatParser.libTypesMod.SKELETON_TYPE.number & Double = js.native
  }
  
  @JSImport("@formatjs/icu-messageformat-parser/lib", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.formatjsIcuMessageformatParser.libTypesMod.TYPE & Double] = js.native
    
    /* 1 */ val argument: typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.argument & Double = js.native
    
    /* 3 */ val date: typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.date & Double = js.native
    
    /* 0 */ val literal: typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.literal & Double = js.native
    
    /* 2 */ val number: typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.number & Double = js.native
    
    /* 6 */ val plural: typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.plural & Double = js.native
    
    /* 7 */ val pound: typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.pound & Double = js.native
    
    /* 5 */ val select: typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.select & Double = js.native
    
    /* 8 */ val tag: typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.tag & Double = js.native
    
    /* 4 */ val time: typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.time & Double = js.native
  }
  
  inline def createLiteralElement(value: String): LiteralElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createLiteralElement")(value.asInstanceOf[js.Any]).asInstanceOf[LiteralElement]
  
  inline def createNumberElement(value: String): NumberElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any]).asInstanceOf[NumberElement]
  inline def createNumberElement(value: String, style: String): NumberElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[NumberElement]
  
  inline def isArgumentElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.ArgumentElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.ArgumentElement */ Boolean]
  
  inline def isDateElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateElement */ Boolean]
  
  inline def isDateTimeSkeleton(): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")().asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean]
  inline def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean]
  inline def isDateTimeSkeleton(el: Skeleton): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean]
  
  inline def isLiteralElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.LiteralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.LiteralElement */ Boolean]
  
  inline def isNumberElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberElement */ Boolean]
  
  inline def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberSkeleton */ Boolean]
  inline def isNumberSkeleton(el: Skeleton): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberSkeleton */ Boolean]
  
  inline def isPluralElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.PluralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPluralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.PluralElement */ Boolean]
  
  inline def isPoundElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.PoundElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoundElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.PoundElement */ Boolean]
  
  inline def isSelectElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.SelectElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.SelectElement */ Boolean]
  
  inline def isTagElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.TagElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTagElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.TagElement */ Boolean]
  
  inline def isTimeElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.TimeElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.TimeElement */ Boolean]
  
  inline def parse(message: String): js.Array[MessageFormatElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[MessageFormatElement]]
  inline def parse(message: String, opts: ParserOptions): js.Array[MessageFormatElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(message.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatElement]]
}
