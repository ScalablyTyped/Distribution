package typings.googleapis.appstateV1Mod.appstateV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google App State API
  *
  * The Google App State API.
  *
  * @example
  * const {google} = require('googleapis');
  * const appstate = google.appstate('v1');
  *
  * @namespace appstate
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Appstate
  */
@JSImport("googleapis/build/src/apis/appstate/v1", "appstate_v1.Appstate")
@js.native
class Appstate protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var states: ResourceStates = js.native
}
