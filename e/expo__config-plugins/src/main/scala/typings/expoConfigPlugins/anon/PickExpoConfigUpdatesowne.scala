package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.anon.CheckAutomatically
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-plugins.@expo/config-plugins/build/utils/Updates.ExpoConfigUpdates, 'owner' | 'slug' | 'updates'> */
trait PickExpoConfigUpdatesowne extends StObject {
  
  var owner: js.UndefOr[String] = js.undefined
  
  var slug: String
  
  var updates: js.UndefOr[CheckAutomatically] = js.undefined
}
object PickExpoConfigUpdatesowne {
  
  inline def apply(slug: String): PickExpoConfigUpdatesowne = {
    val __obj = js.Dynamic.literal(slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickExpoConfigUpdatesowne]
  }
  
  extension [Self <: PickExpoConfigUpdatesowne](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: CheckAutomatically): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
  }
}
