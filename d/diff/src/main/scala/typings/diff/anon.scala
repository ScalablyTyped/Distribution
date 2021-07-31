package typings.diff

import typings.diff.mod.Callback
import typings.diff.mod.Change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined diff.diff.ArrayOptions<any, any> & std.Partial<diff.diff.CallbackOptions> */
  trait ArrayOptionsanyanyPartial extends StObject {
    
    var callback: js.UndefOr[Callback] = js.undefined
    
    /**
      * Comparator for custom equality checks.
      */
    var comparator: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]] = js.undefined
    
    /**
      * `true` to ignore casing difference.
      * @default false
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
  }
  object ArrayOptionsanyanyPartial {
    
    @scala.inline
    def apply(): ArrayOptionsanyanyPartial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayOptionsanyanyPartial]
    }
    
    @scala.inline
    implicit class ArrayOptionsanyanyPartialMutableBuilder[Self <: ArrayOptionsanyanyPartial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* err */ Unit, /* value */ js.UndefOr[js.Array[Change]]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setComparator(value: (/* left */ js.Any, /* right */ js.Any) => Boolean): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    }
  }
  
  trait Strict extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Strict {
    
    @scala.inline
    def apply(): Strict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Strict]
    }
    
    @scala.inline
    implicit class StrictMutableBuilder[Self <: Strict] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
