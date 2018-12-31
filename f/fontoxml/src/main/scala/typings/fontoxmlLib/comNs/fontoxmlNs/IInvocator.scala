package typings
package fontoxmlLib.comNs.fontoxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvocator extends js.Object {
  //Allow/disallow auto-save functionality.
  var autosave: js.UndefOr[scala.Boolean] = js.undefined
  //The base URL where the CMS endpoints are exposed.
  var cmsBaseUrl: java.lang.String
  //The document id's of the documents to load from the CMS.
  var documentIds: js.Array[java.lang.String]
  //The edit session token to use for accessing the CMS endpoints.
  var editSessionToken: java.lang.String
  //If set to a positive integer, enable the Heartbeat API to send every x seconds.
  var heartbeat: js.UndefOr[scala.Double] = js.undefined
  //User information.
  var user: js.UndefOr[IUserInfo] = js.undefined
  //Workflow information.
  var workflow: js.UndefOr[IWorkflowInfo] = js.undefined
}

