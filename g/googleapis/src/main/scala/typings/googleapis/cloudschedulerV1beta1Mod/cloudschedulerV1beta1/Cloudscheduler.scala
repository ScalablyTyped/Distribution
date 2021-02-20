package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Scheduler API
  *
  * Creates and manages jobs run on a regular recurring schedule.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudscheduler = google.cloudscheduler('v1beta1');
  *
  * @namespace cloudscheduler
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Cloudscheduler
  */
@JSImport("googleapis/build/src/apis/cloudscheduler/v1beta1", "cloudscheduler_v1beta1.Cloudscheduler")
@js.native
class Cloudscheduler protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
