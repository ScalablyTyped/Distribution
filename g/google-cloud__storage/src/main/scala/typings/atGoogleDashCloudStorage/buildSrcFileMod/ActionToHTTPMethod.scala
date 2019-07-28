package typings.atGoogleDashCloudStorage.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionToHTTPMethod extends js.Object

@JSImport("@google-cloud/storage/build/src/file", "ActionToHTTPMethod")
@js.native
object ActionToHTTPMethod extends js.Object {
  @js.native
  sealed trait delete extends ActionToHTTPMethod
  
  @js.native
  sealed trait read extends ActionToHTTPMethod
  
  @js.native
  sealed trait resumable extends ActionToHTTPMethod
  
  @js.native
  sealed trait write extends ActionToHTTPMethod
  
  /* "DELETE" */ val delete: typings.atGoogleDashCloudStorage.buildSrcFileMod.ActionToHTTPMethod.delete with String = js.native
  /* "GET" */ val read: typings.atGoogleDashCloudStorage.buildSrcFileMod.ActionToHTTPMethod.read with String = js.native
  /* "POST" */ val resumable: typings.atGoogleDashCloudStorage.buildSrcFileMod.ActionToHTTPMethod.resumable with String = js.native
  /* "PUT" */ val write: typings.atGoogleDashCloudStorage.buildSrcFileMod.ActionToHTTPMethod.write with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionToHTTPMethod with String] = js.native
}

