package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UriOptions extends StObject {
  
  /**
    * Allows unencoded square brackets inside the query string.
    * This is NOT RFC 3986 compliant but query strings like abc[]=123&abc[]=456 are very common these days.
    *
    * @default false
    */
  var allowQuerySquareBrackets: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow relative URIs.
    *
    * @default false
    */
  var allowRelative: js.UndefOr[Boolean] = js.native
  
  /**
    * Validate the domain component using the options specified in `string.domain()`.
    */
  var domain: js.UndefOr[DomainOptions] = js.native
  
  /**
    * Restrict only relative URIs.
    *
    * @default false
    */
  var relativeOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies one or more acceptable Schemes, should only include the scheme name.
    * Can be an Array or String (strings are automatically escaped for use in a Regular Expression).
    */
  var scheme: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
}
object UriOptions {
  
  @scala.inline
  def apply(): UriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriOptions]
  }
  
  @scala.inline
  implicit class UriOptionsMutableBuilder[Self <: UriOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowQuerySquareBrackets(value: Boolean): Self = StObject.set(x, "allowQuerySquareBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowQuerySquareBracketsUndefined: Self = StObject.set(x, "allowQuerySquareBrackets", js.undefined)
    
    @scala.inline
    def setAllowRelative(value: Boolean): Self = StObject.set(x, "allowRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRelativeUndefined: Self = StObject.set(x, "allowRelative", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainOptions): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setRelativeOnly(value: Boolean): Self = StObject.set(x, "relativeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeOnlyUndefined: Self = StObject.set(x, "relativeOnly", js.undefined)
    
    @scala.inline
    def setScheme(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    @scala.inline
    def setSchemeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "scheme", js.Array(value :_*))
  }
}
