package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of logging on a NAT.
  */
@js.native
trait SchemaRouterNatLogConfig extends StObject {
  
  /**
    * Indicates whether or not to export logs. This is false by default.
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the desired filtering of logs on this NAT. If unspecified, logs
    * are exported for all connections handled by this NAT.
    */
  var filter: js.UndefOr[String] = js.native
}
object SchemaRouterNatLogConfig {
  
  @scala.inline
  def apply(): SchemaRouterNatLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterNatLogConfig]
  }
  
  @scala.inline
  implicit class SchemaRouterNatLogConfigMutableBuilder[Self <: SchemaRouterNatLogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
