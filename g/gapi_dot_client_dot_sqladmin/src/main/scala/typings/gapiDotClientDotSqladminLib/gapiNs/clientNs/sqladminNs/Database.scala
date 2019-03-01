package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database extends js.Object {
  /** The MySQL charset value. */
  var charset: js.UndefOr[java.lang.String] = js.undefined
  /** The MySQL collation value. */
  var collation: js.UndefOr[java.lang.String] = js.undefined
  /** HTTP 1.1 Entity tag for the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the Cloud SQL instance. This does not include the project ID. */
  var instance: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#database. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the database in the Cloud SQL instance. This does not include the project ID or instance name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable. */
  var project: js.UndefOr[java.lang.String] = js.undefined
  /** The URI of this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object Database {
  @scala.inline
  def apply(
    charset: java.lang.String = null,
    collation: java.lang.String = null,
    etag: java.lang.String = null,
    instance: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    project: java.lang.String = null,
    selfLink: java.lang.String = null
  ): Database = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (project != null) __obj.updateDynamic("project")(project)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[Database]
  }
}

