package typings.googleCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AvailableServiceObjectMethods extends StObject
@JSImport("@google-cloud/storage/build/src/bucket", "AvailableServiceObjectMethods")
@js.native
object AvailableServiceObjectMethods extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AvailableServiceObjectMethods & Double] = js.native
  
  @js.native
  sealed trait delete
    extends StObject
       with AvailableServiceObjectMethods
  /* 1 */ val delete: typings.googleCloudStorage.buildSrcBucketMod.AvailableServiceObjectMethods.delete & Double = js.native
  
  @js.native
  sealed trait setMetadata
    extends StObject
       with AvailableServiceObjectMethods
  /* 0 */ val setMetadata: typings.googleCloudStorage.buildSrcBucketMod.AvailableServiceObjectMethods.setMetadata & Double = js.native
}
