package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.gatsbyPluginUtils.gatsbyPluginUtilsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailOptions extends js.Object {
  
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
  implicit class EmailOptionsOps[Self <: EmailOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowUnicode(value: Boolean): Self = this.set("allowUnicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnicode: Self = this.set("allowUnicode", js.undefined)
    
    @scala.inline
    def setIgnoreLength(value: Boolean): Self = this.set("ignoreLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreLength: Self = this.set("ignoreLength", js.undefined)
    
    @scala.inline
    def setMinDomainSegments(value: Double): Self = this.set("minDomainSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDomainSegments: Self = this.set("minDomainSegments", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setSeparatorVarargs(value: String*): Self = this.set("separator", js.Array(value :_*))
    
    @scala.inline
    def setSeparator(value: String | js.Array[String]): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setTlds(value: TopLevelDomainOptions | `false`): Self = this.set("tlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlds: Self = this.set("tlds", js.undefined)
  }
}
