package typings.googleCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BucketActionToHTTPMethod extends StObject
@JSImport("@google-cloud/storage/build/src/bucket", "BucketActionToHTTPMethod")
@js.native
object BucketActionToHTTPMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BucketActionToHTTPMethod & String] = js.native
  
  @js.native
  sealed trait list
    extends StObject
       with BucketActionToHTTPMethod
  /* "GET" */ val list: typings.googleCloudStorage.buildSrcBucketMod.BucketActionToHTTPMethod.list & String = js.native
}
