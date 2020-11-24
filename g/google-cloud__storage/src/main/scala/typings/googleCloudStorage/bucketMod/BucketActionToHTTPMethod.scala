package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BucketActionToHTTPMethod extends js.Object
@JSImport("@google-cloud/storage/build/src/bucket", "BucketActionToHTTPMethod")
@js.native
object BucketActionToHTTPMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BucketActionToHTTPMethod with String] = js.native
  
  @js.native
  sealed trait list extends BucketActionToHTTPMethod
  /* "GET" */ @js.native
  object list extends TopLevel[list with String]
}
