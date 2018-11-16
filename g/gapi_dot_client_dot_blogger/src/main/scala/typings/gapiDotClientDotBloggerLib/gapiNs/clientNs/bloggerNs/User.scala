package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait User extends js.Object {
  /** Profile summary information. */
  var about: js.UndefOr[java.lang.String] = js.undefined
  /** The container of blogs for this user. */
  var blogs: js.UndefOr[gapiDotClientDotBloggerLib.Anon_SelfLinkString] = js.undefined
  /** The timestamp of when this profile was created, in seconds since epoch. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** The display name. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The identifier for this User. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of this entity. Always blogger#user */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** This user's locale */
  var locale: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Country] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The user's profile page. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

