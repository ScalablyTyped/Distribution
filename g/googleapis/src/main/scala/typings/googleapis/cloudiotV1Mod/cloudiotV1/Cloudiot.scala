package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud IoT API
  *
  * Registers and manages IoT (Internet of Things) devices that connect to the
  * Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudiot = google.cloudiot('v1');
  *
  * @namespace cloudiot
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudiot
  */
@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Cloudiot")
@js.native
class Cloudiot protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
