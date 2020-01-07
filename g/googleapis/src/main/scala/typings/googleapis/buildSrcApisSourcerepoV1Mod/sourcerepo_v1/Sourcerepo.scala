package typings.googleapis.buildSrcApisSourcerepoV1Mod.sourcerepo_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Source Repositories API
  *
  * Accesses source code repositories hosted by Google.
  *
  * @example
  * const {google} = require('googleapis');
  * const sourcerepo = google.sourcerepo('v1');
  *
  * @namespace sourcerepo
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Sourcerepo
  */
@JSImport("googleapis/build/src/apis/sourcerepo/v1", "sourcerepo_v1.Sourcerepo")
@js.native
class Sourcerepo protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: Resource$Projects = js.native
}

