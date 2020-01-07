package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The template that returns individual ASP (Access Code) data.
  */
@js.native
trait Schema$Asp extends js.Object {
  /**
    * The unique ID of the ASP.
    */
  var codeId: js.UndefOr[Double] = js.native
  /**
    * The time when the ASP was created. Expressed in Unix time format.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * ETag of the ASP.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The type of the API resource. This is always admin#directory#asp.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time when the ASP was last used. Expressed in Unix time format.
    */
  var lastTimeUsed: js.UndefOr[String] = js.native
  /**
    * The name of the application that the user, represented by their userId,
    * entered when the ASP was created.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The unique ID of the user who issued the ASP.
    */
  var userKey: js.UndefOr[String] = js.native
}

object Schema$Asp {
  @scala.inline
  def apply(
    codeId: Int | Double = null,
    creationTime: String = null,
    etag: String = null,
    kind: String = null,
    lastTimeUsed: String = null,
    name: String = null,
    userKey: String = null
  ): Schema$Asp = {
    val __obj = js.Dynamic.literal()
    if (codeId != null) __obj.updateDynamic("codeId")(codeId.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastTimeUsed != null) __obj.updateDynamic("lastTimeUsed")(lastTimeUsed.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (userKey != null) __obj.updateDynamic("userKey")(userKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Asp]
  }
}

