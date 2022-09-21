package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplicationReportingSettings extends StObject {
  
  /**
    * Whether removed apps are included in application reports.
    */
  var includeRemovedApps: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaApplicationReportingSettings {
  
  inline def apply(): SchemaApplicationReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationReportingSettings]
  }
  
  extension [Self <: SchemaApplicationReportingSettings](x: Self) {
    
    inline def setIncludeRemovedApps(value: Boolean): Self = StObject.set(x, "includeRemovedApps", value.asInstanceOf[js.Any])
    
    inline def setIncludeRemovedAppsNull: Self = StObject.set(x, "includeRemovedApps", null)
    
    inline def setIncludeRemovedAppsUndefined: Self = StObject.set(x, "includeRemovedApps", js.undefined)
  }
}
