package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BigQuery API
  *
  * A data platform for customers to create, manage, share and query data.
  *
  * @example
  * const {google} = require('googleapis');
  * const bigquery = google.bigquery('v2');
  *
  * @namespace bigquery
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Bigquery
  */
@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Bigquery")
@js.native
class Bigquery protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var datasets: ResourceDatasets = js.native
  
  var jobs: ResourceJobs = js.native
  
  var models: ResourceModels = js.native
  
  var projects: ResourceProjects = js.native
  
  var tabledata: ResourceTabledata = js.native
  
  var tables: ResourceTables = js.native
}
