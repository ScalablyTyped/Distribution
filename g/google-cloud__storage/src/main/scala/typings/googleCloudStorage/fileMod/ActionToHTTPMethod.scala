package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionToHTTPMethod extends StObject
@JSImport("@google-cloud/storage/build/src/file", "ActionToHTTPMethod")
@js.native
object ActionToHTTPMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionToHTTPMethod with String] = js.native
  
  @js.native
  sealed trait delete extends ActionToHTTPMethod
  /* "DELETE" */ val delete: typings.googleCloudStorage.fileMod.ActionToHTTPMethod.delete with String = js.native
  
  @js.native
  sealed trait read extends ActionToHTTPMethod
  /* "GET" */ val read: typings.googleCloudStorage.fileMod.ActionToHTTPMethod.read with String = js.native
  
  @js.native
  sealed trait resumable extends ActionToHTTPMethod
  /* "POST" */ val resumable: typings.googleCloudStorage.fileMod.ActionToHTTPMethod.resumable with String = js.native
  
  @js.native
  sealed trait write extends ActionToHTTPMethod
  /* "PUT" */ val write: typings.googleCloudStorage.fileMod.ActionToHTTPMethod.write with String = js.native
}
