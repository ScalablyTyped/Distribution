package typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blogger API
  *
  * API for access to the data within Blogger.
  *
  * @example
  * const {google} = require('googleapis');
  * const blogger = google.blogger('v2');
  *
  * @namespace blogger
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Blogger
  */
@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Blogger")
@js.native
class Blogger protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var blogs: Resource$Blogs = js.native
  var comments: Resource$Comments = js.native
  var context: APIRequestContext = js.native
  var pages: Resource$Pages = js.native
  var posts: Resource$Posts = js.native
  var users: Resource$Users = js.native
}

