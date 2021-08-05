package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of logging on a NAT.
  */
trait SchemaRouterNatLogConfig extends StObject {
  
  /**
    * Indicates whether or not to export logs. This is false by default.
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the desired filtering of logs on this NAT. If unspecified, logs
    * are exported for all connections handled by this NAT.
    */
  var filter: js.UndefOr[String] = js.undefined
}
object SchemaRouterNatLogConfig {
  
  inline def apply(): SchemaRouterNatLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterNatLogConfig]
  }
  
  extension [Self <: SchemaRouterNatLogConfig](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
