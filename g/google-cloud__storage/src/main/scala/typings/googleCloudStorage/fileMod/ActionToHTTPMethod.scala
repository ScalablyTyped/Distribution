package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionToHTTPMethod extends StObject
@JSImport("@google-cloud/storage/build/src/file", "ActionToHTTPMethod")
@js.native
object ActionToHTTPMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionToHTTPMethod & String] = js.native
  
  @js.native
  sealed trait delete
    extends StObject
       with ActionToHTTPMethod
  /* "DELETE" */ val delete: typings.googleCloudStorage.fileMod.ActionToHTTPMethod.delete & String = js.native
  
  @js.native
  sealed trait read
    extends StObject
       with ActionToHTTPMethod
  /* "GET" */ val read: typings.googleCloudStorage.fileMod.ActionToHTTPMethod.read & String = js.native
  
  @js.native
  sealed trait resumable
    extends StObject
       with ActionToHTTPMethod
  /* "POST" */ val resumable: typings.googleCloudStorage.fileMod.ActionToHTTPMethod.resumable & String = js.native
  
  @js.native
  sealed trait write
    extends StObject
       with ActionToHTTPMethod
  /* "PUT" */ val write: typings.googleCloudStorage.fileMod.ActionToHTTPMethod.write & String = js.native
}
