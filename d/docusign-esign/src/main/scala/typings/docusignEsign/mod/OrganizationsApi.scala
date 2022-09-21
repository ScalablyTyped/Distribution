package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "OrganizationsApi")
@js.native
open class OrganizationsApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def deleteReport(organizationId: String, reportCorrelationId: String): js.Promise[Unit] = js.native
  def deleteReport(organizationId: String, reportCorrelationId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def getReport(organizationId: String, reportCorrelationId: String): js.Promise[Unit] = js.native
  def getReport(organizationId: String, reportCorrelationId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
}
