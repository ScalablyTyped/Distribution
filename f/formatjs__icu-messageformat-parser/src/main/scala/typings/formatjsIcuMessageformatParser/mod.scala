package typings.formatjsIcuMessageformatParser

import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserParserMod.ParserOptions
import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.DateTimeSkeleton
import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.LiteralElement
import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.MessageFormatElement
import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.NumberElement
import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.NumberSkeleton
import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@formatjs/icu-messageformat-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@formatjs/icu-messageformat-parser", "SKELETON_TYPE")
  @js.native
  object SKELETON_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.SKELETON_TYPE & Double
      ] = js.native
    
    /* 1 */ val dateTime: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.SKELETON_TYPE.dateTime & Double = js.native
    
    /* 0 */ val number: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.SKELETON_TYPE.number & Double = js.native
  }
  
  @JSImport("@formatjs/icu-messageformat-parser", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.TYPE & Double
      ] = js.native
    
    /* 1 */ val argument: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.TYPE.argument & Double = js.native
    
    /* 3 */ val date: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.TYPE.date & Double = js.native
    
    /* 0 */ val literal: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.TYPE.literal & Double = js.native
    
    /* 2 */ val number: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.TYPE.number & Double = js.native
    
    /* 6 */ val plural: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.TYPE.plural & Double = js.native
    
    /* 7 */ val pound: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.TYPE.pound & Double = js.native
    
    /* 5 */ val select: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.TYPE.select & Double = js.native
    
    /* 8 */ val tag: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.TYPE.tag & Double = js.native
    
    /* 4 */ val time: typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.TYPE.time & Double = js.native
  }
  
  inline def createLiteralElement(value: String): LiteralElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createLiteralElement")(value.asInstanceOf[js.Any]).asInstanceOf[LiteralElement]
  
  inline def createNumberElement(value: String): NumberElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any]).asInstanceOf[NumberElement]
  inline def createNumberElement(value: String, style: String): NumberElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[NumberElement]
  
  inline def isArgumentElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.ArgumentElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.ArgumentElement */ Boolean]
  
  inline def isDateElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.DateElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.DateElement */ Boolean]
  
  inline def isDateTimeSkeleton(): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")().asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.DateTimeSkeleton */ Boolean]
  inline def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.DateTimeSkeleton */ Boolean]
  inline def isDateTimeSkeleton(el: Skeleton): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.DateTimeSkeleton */ Boolean]
  
  inline def isLiteralElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.LiteralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.LiteralElement */ Boolean]
  
  inline def isNumberElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.NumberElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.NumberElement */ Boolean]
  
  inline def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.NumberSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.NumberSkeleton */ Boolean]
  inline def isNumberSkeleton(el: Skeleton): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.NumberSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.NumberSkeleton */ Boolean]
  
  inline def isPluralElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.PluralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPluralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.PluralElement */ Boolean]
  
  inline def isPoundElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.PoundElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoundElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.PoundElement */ Boolean]
  
  inline def isSelectElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.SelectElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.SelectElement */ Boolean]
  
  inline def isTagElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.TagElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTagElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.TagElement */ Boolean]
  
  inline def isTimeElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.TimeElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/types.TimeElement */ Boolean]
  
  inline def parse(message: String): js.Array[MessageFormatElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[MessageFormatElement]]
  inline def parse(message: String, opts: ParserOptions): js.Array[MessageFormatElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(message.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatElement]]
}
