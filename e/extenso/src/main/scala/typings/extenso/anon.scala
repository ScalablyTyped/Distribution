package typings.extenso

import typings.extenso.extensoStrings.BRL
import typings.extenso.extensoStrings.EUR
import typings.extenso.extensoStrings.f
import typings.extenso.extensoStrings.formal
import typings.extenso.extensoStrings.informal
import typings.extenso.extensoStrings.m
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Decimal extends StObject {
    
    var decimal: js.UndefOr[formal | informal] = js.undefined
    
    var gender: js.UndefOr[m | f] = js.undefined
  }
  object Decimal {
    
    @scala.inline
    def apply(): Decimal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Decimal]
    }
    
    @scala.inline
    implicit class DecimalMutableBuilder[Self <: Decimal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimal(value: formal | informal): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setGender(value: m | f): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: js.UndefOr[BRL | EUR] = js.undefined
  }
  object Type {
    
    @scala.inline
    def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: BRL | EUR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
