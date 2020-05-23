package typings.gapiClientIam

import typings.gapiClientIam.gapi.client.iam.OrganizationsResource
import typings.gapiClientIam.gapi.client.iam.PermissionsResource
import typings.gapiClientIam.gapi.client.iam.ProjectsResource
import typings.gapiClientIam.gapi.client.iam.RolesResource
import typings.gapiClientIam.gapiClientIamStrings.iam
import typings.gapiClientIam.gapiClientIamStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val organizations: OrganizationsResource = js.native
      val permissions: PermissionsResource = js.native
      val projects: ProjectsResource = js.native
      val roles: RolesResource = js.native
      /** Load Google Identity and Access Management (IAM) API v1 */
      def load(name: iam, version: v1): js.Thenable[Unit] = js.native
      def load(name: iam, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

