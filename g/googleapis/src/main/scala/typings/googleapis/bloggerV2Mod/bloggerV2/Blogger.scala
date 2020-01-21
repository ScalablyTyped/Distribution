package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
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
  var blogs: ResourceBlogs = js.native
  var comments: ResourceComments = js.native
  var context: APIRequestContext = js.native
  var pages: ResourcePages = js.native
  var posts: ResourcePosts = js.native
  var users: ResourceUsers = js.native
}

