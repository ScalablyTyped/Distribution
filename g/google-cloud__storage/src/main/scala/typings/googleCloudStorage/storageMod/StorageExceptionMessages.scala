package typings.googleCloudStorage.storageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StorageExceptionMessages extends StObject
@JSImport("@google-cloud/storage/build/src/storage", "StorageExceptionMessages")
@js.native
object StorageExceptionMessages extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StorageExceptionMessages & String] = js.native
  
  @js.native
  sealed trait BUCKET_NAME_REQUIRED
    extends StObject
       with StorageExceptionMessages
  /* "A bucket name is needed to use Cloud Storage." */ val BUCKET_NAME_REQUIRED: typings.googleCloudStorage.storageMod.StorageExceptionMessages.BUCKET_NAME_REQUIRED & String = js.native
  
  @js.native
  sealed trait BUCKET_NAME_REQUIRED_CREATE
    extends StObject
       with StorageExceptionMessages
  /* "A name is required to create a bucket." */ val BUCKET_NAME_REQUIRED_CREATE: typings.googleCloudStorage.storageMod.StorageExceptionMessages.BUCKET_NAME_REQUIRED_CREATE & String = js.native
  
  @js.native
  sealed trait HMAC_ACCESS_ID
    extends StObject
       with StorageExceptionMessages
  /* "An access ID is needed to create an HmacKey object." */ val HMAC_ACCESS_ID: typings.googleCloudStorage.storageMod.StorageExceptionMessages.HMAC_ACCESS_ID & String = js.native
  
  @js.native
  sealed trait HMAC_SERVICE_ACCOUNT
    extends StObject
       with StorageExceptionMessages
  /* "The first argument must be a service account email to create an HMAC key." */ val HMAC_SERVICE_ACCOUNT: typings.googleCloudStorage.storageMod.StorageExceptionMessages.HMAC_SERVICE_ACCOUNT & String = js.native
}
