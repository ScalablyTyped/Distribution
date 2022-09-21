package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Cloudsearch")
@js.native
open class Cloudsearch protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var debug: ResourceDebug = js.native
  
  var indexing: ResourceIndexing = js.native
  
  var media: ResourceMedia = js.native
  
  var operations: ResourceOperations = js.native
  
  var query: ResourceQuery = js.native
  
  var settings: ResourceSettings = js.native
  
  var stats: ResourceStats = js.native
  
  var v1: ResourceV1 = js.native
}
