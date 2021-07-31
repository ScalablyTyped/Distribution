package typings.eyes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All extends StObject {
    
    /** Overall base style applied to everything */
    var all: js.UndefOr[String] = js.undefined
    
    /** Style when printing booleans */
    var bool: js.UndefOr[String] = js.undefined
    
    /** Style when printing the keys in object literals, like 'a' in `{a: 1}` */
    var key: js.UndefOr[String] = js.undefined
    
    /** Style when printing inspection labels, like 'array' in `array: [1, 2, 3]` */
    var label: js.UndefOr[String] = js.undefined
    
    /** Style when printing numbers */
    var number: js.UndefOr[String] = js.undefined
    
    /** Style when printing objects which don't have a literal representation, such as functions */
    var other: js.UndefOr[String] = js.undefined
    
    /** Style when printing RegExps */
    var regexp: js.UndefOr[String] = js.undefined
    
    /** Style when printing `null`, `undefined`, etc. */
    var special: js.UndefOr[String] = js.undefined
    
    /** Style when printing strings */
    var string: js.UndefOr[String] = js.undefined
  }
  object All {
    
    @scala.inline
    def apply(): All = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[All]
    }
    
    @scala.inline
    implicit class AllMutableBuilder[Self <: All] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setBool(value: String): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoolUndefined: Self = StObject.set(x, "bool", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
      
      @scala.inline
      def setSpecial(value: String): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecialUndefined: Self = StObject.set(x, "special", js.undefined)
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
}
