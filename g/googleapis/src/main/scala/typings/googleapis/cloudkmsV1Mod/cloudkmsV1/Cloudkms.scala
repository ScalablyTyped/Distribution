package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Key Management Service (KMS) API
  *
  * Manages keys and performs cryptographic operations in a central cloud
  * service, for direct use by other cloud resources and applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudkms = google.cloudkms('v1');
  *
  * @namespace cloudkms
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudkms
  */
@JSImport("googleapis/build/src/apis/cloudkms/v1", "cloudkms_v1.Cloudkms")
@js.native
class Cloudkms protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
