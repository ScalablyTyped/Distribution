package typings.devexpressUtils

import typings.devexpressUtils.libIntervalsConstMod.ConstInterval
import typings.devexpressUtils.libIntervalsMutableMod.MutableInterval
import typings.std.HTMLScriptElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HtmlScriptElement extends StObject {
    
    var htmlScriptElement: HTMLScriptElement
  }
  object HtmlScriptElement {
    
    inline def apply(htmlScriptElement: HTMLScriptElement): HtmlScriptElement = {
      val __obj = js.Dynamic.literal(htmlScriptElement = htmlScriptElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlScriptElement]
    }
    
    extension [Self <: HtmlScriptElement](x: Self) {
      
      inline def setHtmlScriptElement(value: HTMLScriptElement): Self = StObject.set(x, "htmlScriptElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait Interval[T /* <: MutableInterval */] extends StObject {
    
    var interval: T
  }
  object Interval {
    
    inline def apply[T /* <: MutableInterval */](interval: T): Interval[T] = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interval[T]]
    }
    
    extension [Self <: Interval[?], T /* <: MutableInterval */](x: Self & Interval[T]) {
      
      inline def setInterval(value: T): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntervalConstInterval extends StObject {
    
    var interval: ConstInterval
  }
  object IntervalConstInterval {
    
    inline def apply(interval: ConstInterval): IntervalConstInterval = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntervalConstInterval]
    }
    
    extension [Self <: IntervalConstInterval](x: Self) {
      
      inline def setInterval(value: ConstInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result[TOptions] extends StObject {
    
    var result: TOptions
    
    var set: Any
  }
  object Result {
    
    inline def apply[TOptions](result: TOptions, set: Any): Result[TOptions] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result[TOptions]]
    }
    
    extension [Self <: Result[?], TOptions](x: Self & Result[TOptions]) {
      
      inline def setResult(value: TOptions): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSet(value: Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
  
  trait Set[TOptions] extends StObject {
    
    var result: TOptions
    
    def set[TProperty /* <: /* keyof TOptions */ String */](
      property: TProperty,
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOptions[TProperty] */ js.Any
    ): Result[TOptions]
  }
  object Set {
    
    inline def apply[TOptions](
      result: TOptions,
      set: (Any, /* import warning: importer.ImportType#apply Failed type conversion: TOptions[TProperty] */ js.Any) => Result[TOptions]
    ): Set[TOptions] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Set[TOptions]]
    }
    
    extension [Self <: Set[?], TOptions](x: Self & Set[TOptions]) {
      
      inline def setResult(value: TOptions): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSet(
        value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: TOptions[TProperty] */ js.Any) => Result[TOptions]
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait TwoDigitYearMax extends StObject {
    
    var twoDigitYearMax: Double
  }
  object TwoDigitYearMax {
    
    inline def apply(twoDigitYearMax: Double): TwoDigitYearMax = {
      val __obj = js.Dynamic.literal(twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoDigitYearMax]
    }
    
    extension [Self <: TwoDigitYearMax](x: Self) {
      
      inline def setTwoDigitYearMax(value: Double): Self = StObject.set(x, "twoDigitYearMax", value.asInstanceOf[js.Any])
    }
  }
}
