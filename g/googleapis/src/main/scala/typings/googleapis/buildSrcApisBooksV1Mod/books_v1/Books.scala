package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Books API
  *
  * Searches for books and manages your Google Books library.
  *
  * @example
  * const {google} = require('googleapis');
  * const books = google.books('v1');
  *
  * @namespace books
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Books
  */
@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Books")
@js.native
class Books protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var bookshelves: Resource$Bookshelves = js.native
  var cloudloading: Resource$Cloudloading = js.native
  var context: APIRequestContext = js.native
  var dictionary: Resource$Dictionary = js.native
  var familysharing: Resource$Familysharing = js.native
  var layers: Resource$Layers = js.native
  var myconfig: Resource$Myconfig = js.native
  var mylibrary: Resource$Mylibrary = js.native
  var notification: Resource$Notification = js.native
  var onboarding: Resource$Onboarding = js.native
  var personalizedstream: Resource$Personalizedstream = js.native
  var promooffer: Resource$Promooffer = js.native
  var series: Resource$Series = js.native
  var volumes: Resource$Volumes = js.native
}

