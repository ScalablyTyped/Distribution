package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BucketActionToHTTPMethod extends StObject
@JSImport("@google-cloud/storage/build/src/bucket", "BucketActionToHTTPMethod")
@js.native
object BucketActionToHTTPMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BucketActionToHTTPMethod with String] = js.native
  
  @js.native
  sealed trait list extends BucketActionToHTTPMethod
  /* "GET" */ val list: typings.googleCloudStorage.bucketMod.BucketActionToHTTPMethod.list with String = js.native
}
