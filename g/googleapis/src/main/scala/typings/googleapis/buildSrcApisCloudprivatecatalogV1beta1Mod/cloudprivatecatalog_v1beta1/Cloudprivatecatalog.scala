package typings.googleapis.buildSrcApisCloudprivatecatalogV1beta1Mod.cloudprivatecatalog_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Private Catalog API
  *
  * Enable cloud users to discover enterprise catalogs and products in their
  * organizations.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudprivatecatalog = google.cloudprivatecatalog('v1beta1');
  *
  * @namespace cloudprivatecatalog
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Cloudprivatecatalog
  */
@JSImport("googleapis/build/src/apis/cloudprivatecatalog/v1beta1", "cloudprivatecatalog_v1beta1.Cloudprivatecatalog")
@js.native
class Cloudprivatecatalog protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var folders: Resource$Folders = js.native
  var organizations: Resource$Organizations = js.native
  var projects: Resource$Projects = js.native
}

