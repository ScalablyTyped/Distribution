package typings.fhir.r2Mod

import typings.fhir.fhirStrings.anonymous
import typings.fhir.fhirStrings.maiden
import typings.fhir.fhirStrings.nickname
import typings.fhir.fhirStrings.official
import typings.fhir.fhirStrings.old
import typings.fhir.fhirStrings.temp
import typings.fhir.fhirStrings.usual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanName
  extends StObject
     with Element {
  
  var _family: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _given: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _prefix: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _suffix: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.
    */
  var family: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Given name.
    */
  var `given`: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Allows names to be placed in historical context.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name.
    */
  var prefix: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name.
    */
  var suffix: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A renderable, unencoded form.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Allows the appropriate name for a particular context of use to be selected from among a set of names.
    */
  var use: js.UndefOr[usual | official | temp | nickname | anonymous | old | maiden] = js.undefined
}
object HumanName {
  
  inline def apply(): HumanName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HumanName] (val x: Self) extends AnyVal {
    
    inline def setFamily(value: js.Array[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setFamilyVarargs(value: String*): Self = StObject.set(x, "family", js.Array(value*))
    
    inline def setGiven(value: js.Array[String]): Self = StObject.set(x, "given", value.asInstanceOf[js.Any])
    
    inline def setGivenUndefined: Self = StObject.set(x, "given", js.undefined)
    
    inline def setGivenVarargs(value: String*): Self = StObject.set(x, "given", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPrefix(value: js.Array[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPrefixVarargs(value: String*): Self = StObject.set(x, "prefix", js.Array(value*))
    
    inline def setSuffix(value: js.Array[String]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setSuffixVarargs(value: String*): Self = StObject.set(x, "suffix", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUse(value: usual | official | temp | nickname | anonymous | old | maiden): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def set_family(value: js.Array[Element]): Self = StObject.set(x, "_family", value.asInstanceOf[js.Any])
    
    inline def set_familyUndefined: Self = StObject.set(x, "_family", js.undefined)
    
    inline def set_familyVarargs(value: Element*): Self = StObject.set(x, "_family", js.Array(value*))
    
    inline def set_given(value: js.Array[Element]): Self = StObject.set(x, "_given", value.asInstanceOf[js.Any])
    
    inline def set_givenUndefined: Self = StObject.set(x, "_given", js.undefined)
    
    inline def set_givenVarargs(value: Element*): Self = StObject.set(x, "_given", js.Array(value*))
    
    inline def set_prefix(value: js.Array[Element]): Self = StObject.set(x, "_prefix", value.asInstanceOf[js.Any])
    
    inline def set_prefixUndefined: Self = StObject.set(x, "_prefix", js.undefined)
    
    inline def set_prefixVarargs(value: Element*): Self = StObject.set(x, "_prefix", js.Array(value*))
    
    inline def set_suffix(value: js.Array[Element]): Self = StObject.set(x, "_suffix", value.asInstanceOf[js.Any])
    
    inline def set_suffixUndefined: Self = StObject.set(x, "_suffix", js.undefined)
    
    inline def set_suffixVarargs(value: Element*): Self = StObject.set(x, "_suffix", js.Array(value*))
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
