package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import typings.devexpressUtils.mutableMod.MutableInterval
import typings.std.HTMLScriptElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait HtmlScriptElement extends StObject {
    
    var htmlScriptElement: HTMLScriptElement = js.native
  }
  object HtmlScriptElement {
    
    @scala.inline
    def apply(htmlScriptElement: HTMLScriptElement): HtmlScriptElement = {
      val __obj = js.Dynamic.literal(htmlScriptElement = htmlScriptElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlScriptElement]
    }
    
    @scala.inline
    implicit class HtmlScriptElementMutableBuilder[Self <: HtmlScriptElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtmlScriptElement(value: HTMLScriptElement): Self = StObject.set(x, "htmlScriptElement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Interval[T /* <: MutableInterval */] extends StObject {
    
    var interval: T = js.native
  }
  object Interval {
    
    @scala.inline
    def apply[T /* <: MutableInterval */](interval: T): Interval[T] = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interval[T]]
    }
    
    @scala.inline
    implicit class IntervalMutableBuilder[Self <: Interval[_], T /* <: MutableInterval */] (val x: Self with Interval[T]) extends AnyVal {
      
      @scala.inline
      def setInterval(value: T): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntervalConstInterval extends StObject {
    
    var interval: ConstInterval = js.native
  }
  object IntervalConstInterval {
    
    @scala.inline
    def apply(interval: ConstInterval): IntervalConstInterval = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntervalConstInterval]
    }
    
    @scala.inline
    implicit class IntervalConstIntervalMutableBuilder[Self <: IntervalConstInterval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: ConstInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Result[TOptions] extends StObject {
    
    var result: TOptions = js.native
    
    var set: js.Any = js.native
  }
  object Result {
    
    @scala.inline
    def apply[TOptions](result: TOptions, set: js.Any): Result[TOptions] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result[TOptions]]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result[_], TOptions] (val x: Self with Result[TOptions]) extends AnyVal {
      
      @scala.inline
      def setResult(value: TOptions): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: js.Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Set[TOptions] extends StObject {
    
    var result: TOptions = js.native
    
    def set[TProperty /* <: /* keyof TOptions */ String */](
      property: TProperty,
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOptions[TProperty] */ js.Any
    ): Result[TOptions] = js.native
  }
  object Set {
    
    @scala.inline
    def apply[TOptions](
      result: TOptions,
      set: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: TOptions[TProperty] */ js.Any) => Result[TOptions]
    ): Set[TOptions] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Set[TOptions]]
    }
    
    @scala.inline
    implicit class SetMutableBuilder[Self <: Set[_], TOptions] (val x: Self with Set[TOptions]) extends AnyVal {
      
      @scala.inline
      def setResult(value: TOptions): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(
        value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: TOptions[TProperty] */ js.Any) => Result[TOptions]
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait TwoDigitYearMax extends StObject {
    
    var twoDigitYearMax: Double = js.native
  }
  object TwoDigitYearMax {
    
    @scala.inline
    def apply(twoDigitYearMax: Double): TwoDigitYearMax = {
      val __obj = js.Dynamic.literal(twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoDigitYearMax]
    }
    
    @scala.inline
    implicit class TwoDigitYearMaxMutableBuilder[Self <: TwoDigitYearMax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTwoDigitYearMax(value: Double): Self = StObject.set(x, "twoDigitYearMax", value.asInstanceOf[js.Any])
    }
  }
}
