package typings.googleapis.adminMod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminDatatransferV1 {
  
  @JSImport("googleapis/build/src/apis/admin", "admin_datatransfer_v1.Admin")
  @js.native
  open class Admin protected ()
    extends typings.googleapis.datatransferV1Mod.adminDatatransferV1.Admin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/admin", "admin_datatransfer_v1.Resource$Applications")
  @js.native
  open class ResourceApplications protected ()
    extends typings.googleapis.datatransferV1Mod.adminDatatransferV1.ResourceApplications {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/admin", "admin_datatransfer_v1.Resource$Transfers")
  @js.native
  open class ResourceTransfers protected ()
    extends typings.googleapis.datatransferV1Mod.adminDatatransferV1.ResourceTransfers {
    def this(context: APIRequestContext) = this()
  }
}
