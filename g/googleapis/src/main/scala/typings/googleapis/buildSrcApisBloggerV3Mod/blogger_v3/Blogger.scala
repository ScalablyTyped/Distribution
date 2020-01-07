package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

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
  * const blogger = google.blogger('v3');
  *
  * @namespace blogger
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Blogger
  */
@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Blogger")
@js.native
class Blogger protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var blogUserInfos: Resource$Bloguserinfos = js.native
  var blogs: Resource$Blogs = js.native
  var comments: Resource$Comments = js.native
  var context: APIRequestContext = js.native
  var pageViews: Resource$Pageviews = js.native
  var pages: Resource$Pages = js.native
  var postUserInfos: Resource$Postuserinfos = js.native
  var posts: Resource$Posts = js.native
  var users: Resource$Users = js.native
}

