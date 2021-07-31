package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Name of a human - parts and usage
  */
trait HumanName
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'family'.
    */
  var _family: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'given'.
    */
  var _given: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'prefix'.
    */
  var _prefix: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'suffix'.
    */
  var _suffix: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * Family name (often called 'Surname')
    */
  var family: js.UndefOr[String] = js.undefined
  
  /**
    * Given names (not always 'first'). Includes middle names
    */
  var `given`: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Time period when name was/is in use
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Parts that come before the name
    */
  var prefix: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Parts that come after the name
    */
  var suffix: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Text representation of the full name
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * usual | official | temp | nickname | anonymous | old | maiden
    */
  var use: js.UndefOr[code] = js.undefined
}
object HumanName {
  
  @scala.inline
  def apply(): HumanName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanName]
  }
  
  @scala.inline
  implicit class HumanNameMutableBuilder[Self <: HumanName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setGiven(value: js.Array[String]): Self = StObject.set(x, "given", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenUndefined: Self = StObject.set(x, "given", js.undefined)
    
    @scala.inline
    def setGivenVarargs(value: String*): Self = StObject.set(x, "given", js.Array(value :_*))
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setPrefix(value: js.Array[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setPrefixVarargs(value: String*): Self = StObject.set(x, "prefix", js.Array(value :_*))
    
    @scala.inline
    def setSuffix(value: js.Array[String]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setSuffixVarargs(value: String*): Self = StObject.set(x, "suffix", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUse(value: code): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    @scala.inline
    def set_family(value: Element): Self = StObject.set(x, "_family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_familyUndefined: Self = StObject.set(x, "_family", js.undefined)
    
    @scala.inline
    def set_given(value: js.Array[Element]): Self = StObject.set(x, "_given", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_givenUndefined: Self = StObject.set(x, "_given", js.undefined)
    
    @scala.inline
    def set_givenVarargs(value: Element*): Self = StObject.set(x, "_given", js.Array(value :_*))
    
    @scala.inline
    def set_prefix(value: js.Array[Element]): Self = StObject.set(x, "_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_prefixUndefined: Self = StObject.set(x, "_prefix", js.undefined)
    
    @scala.inline
    def set_prefixVarargs(value: Element*): Self = StObject.set(x, "_prefix", js.Array(value :_*))
    
    @scala.inline
    def set_suffix(value: js.Array[Element]): Self = StObject.set(x, "_suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_suffixUndefined: Self = StObject.set(x, "_suffix", js.undefined)
    
    @scala.inline
    def set_suffixVarargs(value: Element*): Self = StObject.set(x, "_suffix", js.Array(value :_*))
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    @scala.inline
    def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
