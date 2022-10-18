package typings.formatjsIcuMessageformatParser

import typings.formatjsIcuMessageformatParser.libTypesMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorMod {
  
  @js.native
  sealed trait ErrorKind extends StObject
  @JSImport("@formatjs/icu-messageformat-parser/lib/error", "ErrorKind")
  @js.native
  object ErrorKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorKind & Double] = js.native
    
    /**
      * Duplicate selectors in `plural` or `selectordinal` argument.
      * (e.g. {foo, plural, one {#} one {#}})
      */
    @js.native
    sealed trait DUPLICATE_PLURAL_ARGUMENT_SELECTOR
      extends StObject
         with ErrorKind
    /* 20 */ val DUPLICATE_PLURAL_ARGUMENT_SELECTOR: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.DUPLICATE_PLURAL_ARGUMENT_SELECTOR & Double = js.native
    
    /** Duplicate selectors in `select` argument.
      * (e.g. {foo, select, apple {apple} apple {apple}})
      */
    @js.native
    sealed trait DUPLICATE_SELECT_ARGUMENT_SELECTOR
      extends StObject
         with ErrorKind
    /* 21 */ val DUPLICATE_SELECT_ARGUMENT_SELECTOR: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.DUPLICATE_SELECT_ARGUMENT_SELECTOR & Double = js.native
    
    /** Argument is empty (e.g. `{}`). */
    @js.native
    sealed trait EMPTY_ARGUMENT
      extends StObject
         with ErrorKind
    /* 2 */ val EMPTY_ARGUMENT: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EMPTY_ARGUMENT & Double = js.native
    
    /** Argument is unclosed (e.g. `{0`) */
    @js.native
    sealed trait EXPECT_ARGUMENT_CLOSING_BRACE
      extends StObject
         with ErrorKind
    /* 1 */ val EXPECT_ARGUMENT_CLOSING_BRACE: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_ARGUMENT_CLOSING_BRACE & Double = js.native
    
    /** Expect an argument style (e.g. `{foo, number, }`) */
    @js.native
    sealed trait EXPECT_ARGUMENT_STYLE
      extends StObject
         with ErrorKind
    /* 6 */ val EXPECT_ARGUMENT_STYLE: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_ARGUMENT_STYLE & Double = js.native
    
    /** Expect an argument type (e.g. `{foo,}`) */
    @js.native
    sealed trait EXPECT_ARGUMENT_TYPE
      extends StObject
         with ErrorKind
    /* 4 */ val EXPECT_ARGUMENT_TYPE: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_ARGUMENT_TYPE & Double = js.native
    
    /** Exepct a date time skeleton following the `::` (e.g. `{foo, date, ::}`) */
    @js.native
    sealed trait EXPECT_DATE_TIME_SKELETON
      extends StObject
         with ErrorKind
    /* 10 */ val EXPECT_DATE_TIME_SKELETON: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_DATE_TIME_SKELETON & Double = js.native
    
    /** Exepct a number skeleton following the `::` (e.g. `{foo, number, ::}`) */
    @js.native
    sealed trait EXPECT_NUMBER_SKELETON
      extends StObject
         with ErrorKind
    /* 9 */ val EXPECT_NUMBER_SKELETON: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_NUMBER_SKELETON & Double = js.native
    
    /** Expecting an offset value in `plural` or `selectordinal` argument (e.g `{foo, plural, offset}`) */
    @js.native
    sealed trait EXPECT_PLURAL_ARGUMENT_OFFSET_VALUE
      extends StObject
         with ErrorKind
    /* 13 */ val EXPECT_PLURAL_ARGUMENT_OFFSET_VALUE: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_PLURAL_ARGUMENT_OFFSET_VALUE & Double = js.native
    
    /** Expecting a selector in `plural` or `selectordinal` argument (e.g `{foo, plural}`) */
    @js.native
    sealed trait EXPECT_PLURAL_ARGUMENT_SELECTOR
      extends StObject
         with ErrorKind
    /* 16 */ val EXPECT_PLURAL_ARGUMENT_SELECTOR: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_PLURAL_ARGUMENT_SELECTOR & Double = js.native
    
    /**
      * Expecting a message fragment after the `plural` or `selectordinal` selector
      * (e.g. `{foo, plural, one}`)
      */
    @js.native
    sealed trait EXPECT_PLURAL_ARGUMENT_SELECTOR_FRAGMENT
      extends StObject
         with ErrorKind
    /* 18 */ val EXPECT_PLURAL_ARGUMENT_SELECTOR_FRAGMENT: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_PLURAL_ARGUMENT_SELECTOR_FRAGMENT & Double = js.native
    
    /** Missing select argument options (e.g. `{foo, select}`) */
    @js.native
    sealed trait EXPECT_SELECT_ARGUMENT_OPTIONS
      extends StObject
         with ErrorKind
    /* 12 */ val EXPECT_SELECT_ARGUMENT_OPTIONS: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_SELECT_ARGUMENT_OPTIONS & Double = js.native
    
    /** Expecting a selector in `select` argument (e.g `{foo, select}`) */
    @js.native
    sealed trait EXPECT_SELECT_ARGUMENT_SELECTOR
      extends StObject
         with ErrorKind
    /* 15 */ val EXPECT_SELECT_ARGUMENT_SELECTOR: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_SELECT_ARGUMENT_SELECTOR & Double = js.native
    
    /** Expecting a message fragment after the `select` selector (e.g. `{foo, select, apple}`) */
    @js.native
    sealed trait EXPECT_SELECT_ARGUMENT_SELECTOR_FRAGMENT
      extends StObject
         with ErrorKind
    /* 17 */ val EXPECT_SELECT_ARGUMENT_SELECTOR_FRAGMENT: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.EXPECT_SELECT_ARGUMENT_SELECTOR_FRAGMENT & Double = js.native
    
    /** Unsupported argument type (e.g. `{foo,foo}`) */
    @js.native
    sealed trait INVALID_ARGUMENT_TYPE
      extends StObject
         with ErrorKind
    /* 5 */ val INVALID_ARGUMENT_TYPE: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.INVALID_ARGUMENT_TYPE & Double = js.native
    
    /** The date time skeleton is invalid. */
    @js.native
    sealed trait INVALID_DATE_TIME_SKELETON
      extends StObject
         with ErrorKind
    /* 8 */ val INVALID_DATE_TIME_SKELETON: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.INVALID_DATE_TIME_SKELETON & Double = js.native
    
    /** The number skeleton is invalid. */
    @js.native
    sealed trait INVALID_NUMBER_SKELETON
      extends StObject
         with ErrorKind
    /* 7 */ val INVALID_NUMBER_SKELETON: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.INVALID_NUMBER_SKELETON & Double = js.native
    
    /** Offset value in `plural` or `selectordinal` is invalid (e.g. `{foo, plural, offset: x}`) */
    @js.native
    sealed trait INVALID_PLURAL_ARGUMENT_OFFSET_VALUE
      extends StObject
         with ErrorKind
    /* 14 */ val INVALID_PLURAL_ARGUMENT_OFFSET_VALUE: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.INVALID_PLURAL_ARGUMENT_OFFSET_VALUE & Double = js.native
    
    /** Selector in `plural` or `selectordinal` is malformed (e.g. `{foo, plural, =x {#}}`) */
    @js.native
    sealed trait INVALID_PLURAL_ARGUMENT_SELECTOR
      extends StObject
         with ErrorKind
    /* 19 */ val INVALID_PLURAL_ARGUMENT_SELECTOR: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.INVALID_PLURAL_ARGUMENT_SELECTOR & Double = js.native
    
    /** The tag is malformed. (e.g. `<bold!>foo</bold!>) */
    @js.native
    sealed trait INVALID_TAG
      extends StObject
         with ErrorKind
    /* 23 */ val INVALID_TAG: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.INVALID_TAG & Double = js.native
    
    /** The tag name is invalid. (e.g. `<123>foo</123>`) */
    @js.native
    sealed trait INVALID_TAG_NAME
      extends StObject
         with ErrorKind
    /* 25 */ val INVALID_TAG_NAME: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.INVALID_TAG_NAME & Double = js.native
    
    /** Argument is malformed (e.g. `{foo!}``) */
    @js.native
    sealed trait MALFORMED_ARGUMENT
      extends StObject
         with ErrorKind
    /* 3 */ val MALFORMED_ARGUMENT: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.MALFORMED_ARGUMENT & Double = js.native
    
    /** Plural or select argument option must have `other` clause. */
    @js.native
    sealed trait MISSING_OTHER_CLAUSE
      extends StObject
         with ErrorKind
    /* 22 */ val MISSING_OTHER_CLAUSE: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.MISSING_OTHER_CLAUSE & Double = js.native
    
    /** Unmatched apostrophes in the argument style (e.g. `{foo, number, 'test`) */
    @js.native
    sealed trait UNCLOSED_QUOTE_IN_ARGUMENT_STYLE
      extends StObject
         with ErrorKind
    /* 11 */ val UNCLOSED_QUOTE_IN_ARGUMENT_STYLE: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.UNCLOSED_QUOTE_IN_ARGUMENT_STYLE & Double = js.native
    
    /** The opening tag has unmatched closing tag. (e.g. `<bold>foo`) */
    @js.native
    sealed trait UNCLOSED_TAG
      extends StObject
         with ErrorKind
    /* 27 */ val UNCLOSED_TAG: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.UNCLOSED_TAG & Double = js.native
    
    /** The closing tag does not match the opening tag. (e.g. `<bold>foo</italic>`) */
    @js.native
    sealed trait UNMATCHED_CLOSING_TAG
      extends StObject
         with ErrorKind
    /* 26 */ val UNMATCHED_CLOSING_TAG: typings.formatjsIcuMessageformatParser.libErrorMod.ErrorKind.UNMATCHED_CLOSING_TAG & Double = js.native
  }
  
  trait ParserError extends StObject {
    
    var kind: ErrorKind
    
    var location: Location
    
    var message: String
  }
  object ParserError {
    
    inline def apply(kind: ErrorKind, location: Location, message: String): ParserError = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParserError]
    }
    
    extension [Self <: ParserError](x: Self) {
      
      inline def setKind(value: ErrorKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
