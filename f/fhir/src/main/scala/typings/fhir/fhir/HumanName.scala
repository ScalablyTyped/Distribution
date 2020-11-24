package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Name of a human - parts and usage
  */
@js.native
trait HumanName extends Element {
  
  /**
    * Contains extended information for property 'family'.
    */
  var _family: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'given'.
    */
  var _given: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'prefix'.
    */
  var _prefix: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'suffix'.
    */
  var _suffix: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  
  /**
    * Family name (often called 'Surname')
    */
  var family: js.UndefOr[String] = js.native
  
  /**
    * Given names (not always 'first'). Includes middle names
    */
  var given: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Time period when name was/is in use
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Parts that come before the name
    */
  var prefix: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Parts that come after the name
    */
  var suffix: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Text representation of the full name
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * usual | official | temp | nickname | anonymous | old | maiden
    */
  var use: js.UndefOr[code] = js.native
}
object HumanName {
  
  @scala.inline
  def apply(): HumanName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanName]
  }
  
  @scala.inline
  implicit class HumanNameOps[Self <: HumanName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_family(value: Element): Self = this.set("_family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_family: Self = this.set("_family", js.undefined)
    
    @scala.inline
    def set_givenVarargs(value: Element*): Self = this.set("_given", js.Array(value :_*))
    
    @scala.inline
    def set_given(value: js.Array[Element]): Self = this.set("_given", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_given: Self = this.set("_given", js.undefined)
    
    @scala.inline
    def set_prefixVarargs(value: Element*): Self = this.set("_prefix", js.Array(value :_*))
    
    @scala.inline
    def set_prefix(value: js.Array[Element]): Self = this.set("_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_prefix: Self = this.set("_prefix", js.undefined)
    
    @scala.inline
    def set_suffixVarargs(value: Element*): Self = this.set("_suffix", js.Array(value :_*))
    
    @scala.inline
    def set_suffix(value: js.Array[Element]): Self = this.set("_suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_suffix: Self = this.set("_suffix", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    
    @scala.inline
    def set_use(value: Element): Self = this.set("_use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_use: Self = this.set("_use", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setGivenVarargs(value: String*): Self = this.set("given", js.Array(value :_*))
    
    @scala.inline
    def setGiven(value: js.Array[String]): Self = this.set("given", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGiven: Self = this.set("given", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPrefixVarargs(value: String*): Self = this.set("prefix", js.Array(value :_*))
    
    @scala.inline
    def setPrefix(value: js.Array[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSuffixVarargs(value: String*): Self = this.set("suffix", js.Array(value :_*))
    
    @scala.inline
    def setSuffix(value: js.Array[String]): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setUse(value: code): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
}
