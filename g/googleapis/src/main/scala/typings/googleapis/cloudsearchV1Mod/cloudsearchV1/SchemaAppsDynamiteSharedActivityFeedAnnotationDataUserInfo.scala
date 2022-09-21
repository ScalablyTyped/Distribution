package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedActivityFeedAnnotationDataUserInfo extends StObject {
  
  /**
    * Describes how updater_count_to_show should be used.
    */
  var updaterCountDisplayType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of updaters for clients to show, currently set to the total number of updaters minus the one set in updater_to_show.
    */
  var updaterCountToShow: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The updater for clients to show.
    */
  var updaterToShow: js.UndefOr[SchemaUserId] = js.undefined
}
object SchemaAppsDynamiteSharedActivityFeedAnnotationDataUserInfo {
  
  inline def apply(): SchemaAppsDynamiteSharedActivityFeedAnnotationDataUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedActivityFeedAnnotationDataUserInfo]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedActivityFeedAnnotationDataUserInfo](x: Self) {
    
    inline def setUpdaterCountDisplayType(value: String): Self = StObject.set(x, "updaterCountDisplayType", value.asInstanceOf[js.Any])
    
    inline def setUpdaterCountDisplayTypeNull: Self = StObject.set(x, "updaterCountDisplayType", null)
    
    inline def setUpdaterCountDisplayTypeUndefined: Self = StObject.set(x, "updaterCountDisplayType", js.undefined)
    
    inline def setUpdaterCountToShow(value: Double): Self = StObject.set(x, "updaterCountToShow", value.asInstanceOf[js.Any])
    
    inline def setUpdaterCountToShowNull: Self = StObject.set(x, "updaterCountToShow", null)
    
    inline def setUpdaterCountToShowUndefined: Self = StObject.set(x, "updaterCountToShow", js.undefined)
    
    inline def setUpdaterToShow(value: SchemaUserId): Self = StObject.set(x, "updaterToShow", value.asInstanceOf[js.Any])
    
    inline def setUpdaterToShowUndefined: Self = StObject.set(x, "updaterToShow", js.undefined)
  }
}
