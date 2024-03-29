package typings.googleapis.booksV1Mod.booksV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Books")
@js.native
open class Books protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var bookshelves: ResourceBookshelves = js.native
  
  var cloudloading: ResourceCloudloading = js.native
  
  var context: APIRequestContext = js.native
  
  var dictionary: ResourceDictionary = js.native
  
  var familysharing: ResourceFamilysharing = js.native
  
  var layers: ResourceLayers = js.native
  
  var myconfig: ResourceMyconfig = js.native
  
  var mylibrary: ResourceMylibrary = js.native
  
  var notification: ResourceNotification = js.native
  
  var onboarding: ResourceOnboarding = js.native
  
  var personalizedstream: ResourcePersonalizedstream = js.native
  
  var promooffer: ResourcePromooffer = js.native
  
  var series: ResourceSeries = js.native
  
  var volumes: ResourceVolumes = js.native
}
