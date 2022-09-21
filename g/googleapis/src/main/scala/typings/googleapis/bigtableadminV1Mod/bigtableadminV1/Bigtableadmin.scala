package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Bigtable Admin API
  *
  * Administer your Cloud Bigtable tables and instances.
  *
  * @example
  * ```js
  * const {google} = require('googleapis');
  * const bigtableadmin = google.bigtableadmin('v1');
  * ```
  */
@JSImport("googleapis/build/src/apis/bigtableadmin/v1", "bigtableadmin_v1.Bigtableadmin")
@js.native
open class Bigtableadmin protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
}
