package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogsResource extends js.Object {
  /** Gets one blog by ID. */
  def get(request: gapiDotClientDotBloggerLib.Anon_AltBlogId): gapiDotClientLib.gapiNs.clientNs.Request[Blog]
  /** Retrieve a Blog by URL. */
  def getByUrl(request: gapiDotClientDotBloggerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Blog]
  /** Retrieves a list of blogs, possibly filtered. */
  def listByUser(request: gapiDotClientDotBloggerLib.Anon_AltFetchUserInfo): gapiDotClientLib.gapiNs.clientNs.Request[BlogList]
}

object BlogsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Blog]
    ],
    getByUrl: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Blog]
    ],
    listByUser: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltFetchUserInfo, 
      gapiDotClientLib.gapiNs.clientNs.Request[BlogList]
    ]
  ): BlogsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getByUrl")(getByUrl)
    __obj.updateDynamic("listByUser")(listByUser)
    __obj.asInstanceOf[BlogsResource]
  }
}

