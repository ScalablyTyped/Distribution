package typings.googleapis.adminMod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminReportsV1 {
  
  @JSImport("googleapis/build/src/apis/admin", "admin_reports_v1.Admin")
  @js.native
  open class Admin protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.Admin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/admin", "admin_reports_v1.Resource$Activities")
  @js.native
  open class ResourceActivities protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.ResourceActivities {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/admin", "admin_reports_v1.Resource$Channels")
  @js.native
  open class ResourceChannels protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.ResourceChannels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/admin", "admin_reports_v1.Resource$Customerusagereports")
  @js.native
  open class ResourceCustomerusagereports protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.ResourceCustomerusagereports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/admin", "admin_reports_v1.Resource$Entityusagereports")
  @js.native
  open class ResourceEntityusagereports protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.ResourceEntityusagereports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/admin", "admin_reports_v1.Resource$Userusagereport")
  @js.native
  open class ResourceUserusagereport protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.ResourceUserusagereport {
    def this(context: APIRequestContext) = this()
  }
}
