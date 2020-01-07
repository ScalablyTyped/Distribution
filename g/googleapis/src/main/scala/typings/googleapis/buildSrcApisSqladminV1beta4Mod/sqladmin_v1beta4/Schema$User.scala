package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud SQL user resource.
  */
@js.native
trait Schema$User extends js.Object {
  /**
    * This field is deprecated and will be removed from a future version of the
    * API.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The host name from which the user can connect. For insert operations,
    * host defaults to an empty string. For update operations, host is
    * specified as part of the request URL. The host name cannot be updated
    * after insertion.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The name of the Cloud SQL instance. This does not include the project ID.
    * Can be omitted for update since it is already specified on the URL.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * This is always sql#user.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the user in the Cloud SQL instance. Can be omitted for update
    * since it is already specified in the URL.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The password for the user.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The project ID of the project containing the Cloud SQL database. The
    * Google apps domain is prefixed if applicable. Can be omitted for update
    * since it is already specified on the URL.
    */
  var project: js.UndefOr[String] = js.native
}

object Schema$User {
  @scala.inline
  def apply(
    etag: String = null,
    host: String = null,
    instance: String = null,
    kind: String = null,
    name: String = null,
    password: String = null,
    project: String = null
  ): Schema$User = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$User]
  }
}

