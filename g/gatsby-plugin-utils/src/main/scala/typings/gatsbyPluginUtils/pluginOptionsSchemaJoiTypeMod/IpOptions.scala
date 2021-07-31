package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpOptions extends StObject {
  
  /**
    * Used to determine if a CIDR is allowed or not. Valid values: optional, required, forbidden
    */
  var cidr: js.UndefOr[PresenceMode] = js.undefined
  
  /**
    * One or more IP address versions to validate against. Valid values: ipv4, ipv6, ipvfuture
    */
  var version: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IpOptions {
  
  @scala.inline
  def apply(): IpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpOptions]
  }
  
  @scala.inline
  implicit class IpOptionsMutableBuilder[Self <: IpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: PresenceMode): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
    
    @scala.inline
    def setVersion(value: String | js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value :_*))
  }
}
