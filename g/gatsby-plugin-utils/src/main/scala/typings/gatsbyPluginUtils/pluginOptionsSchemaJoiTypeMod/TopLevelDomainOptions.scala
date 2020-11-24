package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopLevelDomainOptions extends js.Object {
  
  /**
    * - `true` to use the IANA list of registered TLDs. This is the default value.
    * - `false` to allow any TLD not listed in the `deny` list, if present.
    * - A `Set` or array of the allowed TLDs. Cannot be used together with `deny`.
    */
  var allow: js.UndefOr[Set[String] | js.Array[String] | Boolean] = js.native
  
  /**
    * - A `Set` or array of the forbidden TLDs. Cannot be used together with a custom `allow` list.
    */
  var deny: js.UndefOr[Set[String] | js.Array[String]] = js.native
}
object TopLevelDomainOptions {
  
  @scala.inline
  def apply(): TopLevelDomainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopLevelDomainOptions]
  }
  
  @scala.inline
  implicit class TopLevelDomainOptionsOps[Self <: TopLevelDomainOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowVarargs(value: String*): Self = this.set("allow", js.Array(value :_*))
    
    @scala.inline
    def setAllow(value: Set[String] | js.Array[String] | Boolean): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    
    @scala.inline
    def setDenyVarargs(value: String*): Self = this.set("deny", js.Array(value :_*))
    
    @scala.inline
    def setDeny(value: Set[String] | js.Array[String]): Self = this.set("deny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeny: Self = this.set("deny", js.undefined)
  }
}
