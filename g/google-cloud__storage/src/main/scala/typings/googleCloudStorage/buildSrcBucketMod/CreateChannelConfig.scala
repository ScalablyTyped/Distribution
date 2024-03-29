package typings.googleCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelConfig
  extends StObject
     with WatchAllOptions {
  
  var address: String
}
object CreateChannelConfig {
  
  inline def apply(address: String): CreateChannelConfig = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateChannelConfig] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
  }
}
