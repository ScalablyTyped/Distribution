package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/authorizedbuyersmarketplace/v1", "authorizedbuyersmarketplace_v1.Authorizedbuyersmarketplace")
@js.native
open class Authorizedbuyersmarketplace protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var bidders: ResourceBidders = js.native
  
  var buyers: ResourceBuyers = js.native
  
  var context: APIRequestContext = js.native
}
