package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access Context Manager API
  *
  * An API for setting attribute based access control to requests to GCP
  * services.
  *
  * @example
  * const {google} = require('googleapis');
  * const accesscontextmanager = google.accesscontextmanager('v1');
  *
  * @namespace accesscontextmanager
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Accesscontextmanager
  */
@JSImport("googleapis/build/src/apis/accesscontextmanager/v1", "accesscontextmanager_v1.Accesscontextmanager")
@js.native
class Accesscontextmanager protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accessPolicies: ResourceAccesspolicies = js.native
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceOperations = js.native
}
