package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BucketActionToHTTPMethod extends js.Object

@JSImport("@google-cloud/storage/build/src/bucket", "BucketActionToHTTPMethod")
@js.native
object BucketActionToHTTPMethod extends js.Object {
  @js.native
  sealed trait list extends BucketActionToHTTPMethod
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BucketActionToHTTPMethod with String] = js.native
  /* "GET" */ @js.native
  object list extends TopLevel[list with String]
  
}

