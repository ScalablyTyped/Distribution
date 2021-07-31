package typings.formatjsIntlDatetimeformat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Full extends StObject {
    
    var full: String
    
    var long: String
    
    var medium: String
    
    var short: String
  }
  object Full {
    
    @scala.inline
    def apply(full: String, long: String, medium: String, short: String): Full = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Full]
    }
    
    @scala.inline
    implicit class FullMutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  trait Long extends StObject {
    
    var long: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var short: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  }
  object Long {
    
    @scala.inline
    def apply(): Long = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Long]
    }
    
    @scala.inline
    implicit class LongMutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLong(value: js.Tuple2[String, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
      
      @scala.inline
      def setShort(value: js.Tuple2[String, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract.DateTimeFormatOptions, 'localeMatcher'> */
  trait PickDateTimeFormatOptions extends StObject {
    
    var localeMatcher: js.UndefOr[String] = js.undefined
  }
  object PickDateTimeFormatOptions {
    
    @scala.inline
    def apply(): PickDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickDateTimeFormatOptions]
    }
    
    @scala.inline
    implicit class PickDateTimeFormatOptionsMutableBuilder[Self <: PickDateTimeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    }
  }
}
