package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lien extends js.Object {
  /** The creation time of this Lien. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A system-generated unique identifier for this Lien.
    *
    * Example: `liens/1234abcd`
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A stable, user-visible/meaningful string identifying the origin of the
    * Lien, intended to be inspected programmatically. Maximum length of 200
    * characters.
    *
    * Example: 'compute.googleapis.com'
    */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A reference to the resource this Lien is attached to. The server will
    * validate the parent against those for which Liens are supported.
    *
    * Example: `projects/1234`
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Concise user-visible strings indicating why an action cannot be performed
    * on a resource. Maximum lenth of 200 characters.
    *
    * Example: 'Holds production API key'
    */
  var reason: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The types of operations which should be blocked as a result of this Lien.
    * Each value should correspond to an IAM permission. The server will
    * validate the permissions against those for which Liens are supported.
    *
    * An empty list is meaningless and will be rejected.
    *
    * Example: ['resourcemanager.projects.delete']
    */
  var restrictions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

