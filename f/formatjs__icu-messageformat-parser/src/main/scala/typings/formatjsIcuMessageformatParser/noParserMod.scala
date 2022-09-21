package typings.formatjsIcuMessageformatParser

import typings.formatjsIcuMessageformatParser.typesMod.DateTimeSkeleton
import typings.formatjsIcuMessageformatParser.typesMod.LiteralElement
import typings.formatjsIcuMessageformatParser.typesMod.MessageFormatElement
import typings.formatjsIcuMessageformatParser.typesMod.NumberElement
import typings.formatjsIcuMessageformatParser.typesMod.NumberSkeleton
import typings.formatjsIcuMessageformatParser.typesMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noParserMod {
  
  @JSImport("@formatjs/icu-messageformat-parser/lib/no-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@formatjs/icu-messageformat-parser/lib/no-parser", "SKELETON_TYPE")
  @js.native
  object SKELETON_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.formatjsIcuMessageformatParser.typesMod.SKELETON_TYPE & Double] = js.native
    
    /* 1 */ val dateTime: typings.formatjsIcuMessageformatParser.typesMod.SKELETON_TYPE.dateTime & Double = js.native
    
    /* 0 */ val number: typings.formatjsIcuMessageformatParser.typesMod.SKELETON_TYPE.number & Double = js.native
  }
  
  @JSImport("@formatjs/icu-messageformat-parser/lib/no-parser", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.formatjsIcuMessageformatParser.typesMod.TYPE & Double] = js.native
    
    /* 1 */ val argument: typings.formatjsIcuMessageformatParser.typesMod.TYPE.argument & Double = js.native
    
    /* 3 */ val date: typings.formatjsIcuMessageformatParser.typesMod.TYPE.date & Double = js.native
    
    /* 0 */ val literal: typings.formatjsIcuMessageformatParser.typesMod.TYPE.literal & Double = js.native
    
    /* 2 */ val number: typings.formatjsIcuMessageformatParser.typesMod.TYPE.number & Double = js.native
    
    /* 6 */ val plural: typings.formatjsIcuMessageformatParser.typesMod.TYPE.plural & Double = js.native
    
    /* 7 */ val pound: typings.formatjsIcuMessageformatParser.typesMod.TYPE.pound & Double = js.native
    
    /* 5 */ val select: typings.formatjsIcuMessageformatParser.typesMod.TYPE.select & Double = js.native
    
    /* 8 */ val tag: typings.formatjsIcuMessageformatParser.typesMod.TYPE.tag & Double = js.native
    
    /* 4 */ val time: typings.formatjsIcuMessageformatParser.typesMod.TYPE.time & Double = js.native
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
  
  inline def parse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Unit]
}
