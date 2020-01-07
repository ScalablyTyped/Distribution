package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tag Manager API
  *
  * Accesses Tag Manager accounts and containers.
  *
  * @example
  * const {google} = require('googleapis');
  * const tagmanager = google.tagmanager('v2');
  *
  * @namespace tagmanager
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Tagmanager
  */
@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Tagmanager")
@js.native
class Tagmanager protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: Resource$Accounts = js.native
  var context: APIRequestContext = js.native
}

