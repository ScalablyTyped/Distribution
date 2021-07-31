package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.ComplexFormatterOptions
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterOptionsMod {
  
  trait ComplexFormatterPreferences[T /* <: FormatterType */] extends StObject {
    
    var options: js.UndefOr[ComplexFormatterOptions[T]] = js.undefined
    
    var `type`: T
  }
  object ComplexFormatterPreferences {
    
    @scala.inline
    def apply[T /* <: FormatterType */](`type`: T): ComplexFormatterPreferences[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComplexFormatterPreferences[T]]
    }
    
    @scala.inline
    implicit class ComplexFormatterPreferencesMutableBuilder[Self <: ComplexFormatterPreferences[?], T /* <: FormatterType */] (val x: Self & ComplexFormatterPreferences[T]) extends AnyVal {
      
      @scala.inline
      def setOptions(value: ComplexFormatterOptions[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatterOptions = FormatterType | ComplexFormatterPreferences[FormatterType]
}
