package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionToHTTPMethod extends js.Object

@JSImport("@google-cloud/storage/build/src/file", "ActionToHTTPMethod")
@js.native
object ActionToHTTPMethod extends js.Object {
  @js.native
  sealed trait delete
    extends atGoogleDashCloudStorageLib.buildSrcFileMod.ActionToHTTPMethod
  
  @js.native
  sealed trait read
    extends atGoogleDashCloudStorageLib.buildSrcFileMod.ActionToHTTPMethod
  
  @js.native
  sealed trait resumable
    extends atGoogleDashCloudStorageLib.buildSrcFileMod.ActionToHTTPMethod
  
  @js.native
  sealed trait write
    extends atGoogleDashCloudStorageLib.buildSrcFileMod.ActionToHTTPMethod
  
  /* "DELETE" */ val delete: delete with java.lang.String = js.native
  /* "GET" */ val read: read with java.lang.String = js.native
  /* "POST" */ val resumable: resumable with java.lang.String = js.native
  /* "PUT" */ val write: write with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    atGoogleDashCloudStorageLib.buildSrcFileMod.ActionToHTTPMethod with java.lang.String
  ] = js.native
}

