package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allownomatch extends StObject {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
}
object Allownomatch {
  
  inline def apply(): Allownomatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allownomatch]
  }
  
  extension [Self <: Allownomatch](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setTimeout(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
