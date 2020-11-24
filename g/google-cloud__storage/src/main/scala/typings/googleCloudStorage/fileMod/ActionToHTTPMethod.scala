package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionToHTTPMethod extends js.Object
@JSImport("@google-cloud/storage/build/src/file", "ActionToHTTPMethod")
@js.native
object ActionToHTTPMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionToHTTPMethod with String] = js.native
  
  @js.native
  sealed trait delete extends ActionToHTTPMethod
  /* "DELETE" */ @js.native
  object delete extends TopLevel[delete with String]
  
  @js.native
  sealed trait read extends ActionToHTTPMethod
  /* "GET" */ @js.native
  object read extends TopLevel[read with String]
  
  @js.native
  sealed trait resumable extends ActionToHTTPMethod
  /* "POST" */ @js.native
  object resumable extends TopLevel[resumable with String]
  
  @js.native
  sealed trait write extends ActionToHTTPMethod
  /* "PUT" */ @js.native
  object write extends TopLevel[write with String]
}
