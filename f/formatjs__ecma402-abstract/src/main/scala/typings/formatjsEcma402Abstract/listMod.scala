package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.coreMod.LocaleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @js.native
  trait ListPattern extends StObject {
    
    var end: String = js.native
    
    var middle: String = js.native
    
    var pair: String = js.native
    
    var start: String = js.native
  }
  object ListPattern {
    
    @scala.inline
    def apply(end: String, middle: String, pair: String, start: String): ListPattern = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], pair = pair.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListPattern]
    }
    
    @scala.inline
    implicit class ListPatternMutableBuilder[Self <: ListPattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddle(value: String): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPair(value: String): Self = StObject.set(x, "pair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListPatternData extends StObject {
    
    var long: ListPattern = js.native
    
    var narrow: js.UndefOr[ListPattern] = js.native
    
    var short: js.UndefOr[ListPattern] = js.native
  }
  object ListPatternData {
    
    @scala.inline
    def apply(long: ListPattern): ListPatternData = {
      val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListPatternData]
    }
    
    @scala.inline
    implicit class ListPatternDataMutableBuilder[Self <: ListPatternData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLong(value: ListPattern): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrow(value: ListPattern): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrowUndefined: Self = StObject.set(x, "narrow", js.undefined)
      
      @scala.inline
      def setShort(value: ListPattern): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    }
  }
  
  @js.native
  trait ListPatternFieldsData extends StObject {
    
    var conjunction: js.UndefOr[ListPatternData] = js.native
    
    var disjunction: js.UndefOr[ListPatternData] = js.native
    
    var unit: js.UndefOr[ListPatternData] = js.native
  }
  object ListPatternFieldsData {
    
    @scala.inline
    def apply(): ListPatternFieldsData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListPatternFieldsData]
    }
    
    @scala.inline
    implicit class ListPatternFieldsDataMutableBuilder[Self <: ListPatternFieldsData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConjunction(value: ListPatternData): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
      
      @scala.inline
      def setDisjunction(value: ListPatternData): Self = StObject.set(x, "disjunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisjunctionUndefined: Self = StObject.set(x, "disjunction", js.undefined)
      
      @scala.inline
      def setUnit(value: ListPatternData): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  type ListPatternLocaleData = LocaleData[ListPatternFieldsData]
}
