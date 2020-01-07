package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List Schema operation in Directory API.
  */
@js.native
trait Schema$Schemas extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of UserSchema objects.
    */
  var schemas: js.UndefOr[js.Array[Schema$Schema]] = js.native
}

object Schema$Schemas {
  @scala.inline
  def apply(etag: String = null, kind: String = null, schemas: js.Array[Schema$Schema] = null): Schema$Schemas = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Schemas]
  }
}

