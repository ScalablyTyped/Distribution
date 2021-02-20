package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.gatsbyPluginUtils.gatsbyPluginUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailOptions extends StObject {
  
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.native
  
  /**
    * if `true`, ignore invalid email length errors.
    *
    * @default false
    */
  var ignoreLength: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of segments required for the domain. Be careful since some domains, such as `io`, directly allow email.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[Double] = js.native
  
  /**
    * if true, allows multiple email addresses in a single string, separated by , or the separator characters.
    *
    * @default false
    */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /**
    * when multiple is true, overrides the default , separator. String can be a single character or multiple separator characters.
    *
    * @default ','
    */
  var separator: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[TopLevelDomainOptions | `false`] = js.native
}
object EmailOptions {
  
  @scala.inline
  def apply(): EmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOptions]
  }
  
  @scala.inline
  implicit class EmailOptionsMutableBuilder[Self <: EmailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnicode(value: Boolean): Self = StObject.set(x, "allowUnicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnicodeUndefined: Self = StObject.set(x, "allowUnicode", js.undefined)
    
    @scala.inline
    def setIgnoreLength(value: Boolean): Self = StObject.set(x, "ignoreLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreLengthUndefined: Self = StObject.set(x, "ignoreLength", js.undefined)
    
    @scala.inline
    def setMinDomainSegments(value: Double): Self = StObject.set(x, "minDomainSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDomainSegmentsUndefined: Self = StObject.set(x, "minDomainSegments", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setSeparator(value: String | js.Array[String]): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setSeparatorVarargs(value: String*): Self = StObject.set(x, "separator", js.Array(value :_*))
    
    @scala.inline
    def setTlds(value: TopLevelDomainOptions | `false`): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTldsUndefined: Self = StObject.set(x, "tlds", js.undefined)
  }
}
