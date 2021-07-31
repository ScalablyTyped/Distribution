package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BigQuery Data Transfer API
  *
  * Schedule queries or transfer external data from SaaS applications to Google
  * BigQuery on a regular basis.
  *
  * @example
  * const {google} = require('googleapis');
  * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
  *
  * @namespace bigquerydatatransfer
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Bigquerydatatransfer
  */
@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Bigquerydatatransfer")
@js.native
class Bigquerydatatransfer protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
