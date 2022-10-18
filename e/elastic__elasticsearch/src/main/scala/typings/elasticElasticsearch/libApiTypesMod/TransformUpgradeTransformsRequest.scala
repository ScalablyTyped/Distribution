package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformUpgradeTransformsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var dry_run: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object TransformUpgradeTransformsRequest {
  
  inline def apply(): TransformUpgradeTransformsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformUpgradeTransformsRequest]
  }
  
  extension [Self <: TransformUpgradeTransformsRequest](x: Self) {
    
    inline def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    inline def setDry_runUndefined: Self = StObject.set(x, "dry_run", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
