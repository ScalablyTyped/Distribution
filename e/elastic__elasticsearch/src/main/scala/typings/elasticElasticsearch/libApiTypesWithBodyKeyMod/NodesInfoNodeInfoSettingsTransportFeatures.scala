package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSettingsTransportFeatures extends StObject {
  
  var `x-pack`: String
}
object NodesInfoNodeInfoSettingsTransportFeatures {
  
  inline def apply(`x-pack`: String): NodesInfoNodeInfoSettingsTransportFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-pack")(`x-pack`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSettingsTransportFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoSettingsTransportFeatures] (val x: Self) extends AnyVal {
    
    inline def `setX-pack`(value: String): Self = StObject.set(x, "x-pack", value.asInstanceOf[js.Any])
  }
}
