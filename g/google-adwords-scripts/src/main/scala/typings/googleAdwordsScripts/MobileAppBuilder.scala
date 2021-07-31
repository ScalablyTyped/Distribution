package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileAppBuilder[MobileApp]
  extends StObject
     with AdWordsBuilder[MobileApp]
     with hasMobilePreferredBuilder[MobileAppBuilder[MobileApp]]
     with hasStartAndEndDateBuilder[MobileAppBuilder[MobileApp]]
     with hasSchedulesBuilder[MobileAppBuilder[MobileApp]]
     with hasTrackingTemplateBuilder[MobileAppBuilder[MobileApp]]
     with hasFinalUrlBuilder[MobileAppBuilder[MobileApp]] {
  
  def withAppId(appId: String): MobileAppBuilder[MobileApp] = js.native
  
  def withLinkText(linkText: String): MobileAppBuilder[MobileApp] = js.native
  
  def withStore(store: AppStore): MobileAppBuilder[MobileApp] = js.native
}
