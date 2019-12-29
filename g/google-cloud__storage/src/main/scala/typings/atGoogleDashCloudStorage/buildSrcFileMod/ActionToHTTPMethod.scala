package typings.atGoogleDashCloudStorage.buildSrcFileMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionToHTTPMethod with String] = js.native
  /* "DELETE" */ @js.native
  object delete extends TopLevel[delete with String]
  
  /* "GET" */ @js.native
  object read extends TopLevel[read with String]
  
  /* "POST" */ @js.native
  object resumable extends TopLevel[resumable with String]
  
  /* "PUT" */ @js.native
  object write extends TopLevel[write with String]
  
}

