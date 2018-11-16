package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAppBuilder[MobileApp]
  extends AdWordsBuilder[MobileApp]
     with hasMobilePreferredBuilder[MobileAppBuilder[MobileApp]]
     with hasStartAndEndDateBuilder[MobileAppBuilder[MobileApp]]
     with hasSchedulesBuilder[MobileAppBuilder[MobileApp]]
     with hasTrackingTemplateBuilder[MobileAppBuilder[MobileApp]]
     with hasFinalUrlBuilder[MobileAppBuilder[MobileApp]] {
  def withAppId(appId: java.lang.String): MobileAppBuilder[MobileApp] = js.native
  def withLinkText(linkText: java.lang.String): MobileAppBuilder[MobileApp] = js.native
  def withStore(store: AppStore): MobileAppBuilder[MobileApp] = js.native
}

