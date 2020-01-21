package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schemas extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var schemas: js.UndefOr[js.Array[typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema]] = js.undefined
}

object Schemas {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    schemas: js.Array[typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema] = null
  ): Schemas = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schemas]
  }
}

