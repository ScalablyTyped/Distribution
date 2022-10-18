package typings.googleCloudStorage.buildSrcStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExceptionMessages extends StObject
@JSImport("@google-cloud/storage/build/src/storage", "ExceptionMessages")
@js.native
object ExceptionMessages extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ExceptionMessages & String] = js.native
  
  @js.native
  sealed trait EXPIRATION_DATE_INVALID
    extends StObject
       with ExceptionMessages
  /* "The expiration date provided was invalid." */ val EXPIRATION_DATE_INVALID: typings.googleCloudStorage.buildSrcStorageMod.ExceptionMessages.EXPIRATION_DATE_INVALID & String = js.native
  
  @js.native
  sealed trait EXPIRATION_DATE_PAST
    extends StObject
       with ExceptionMessages
  /* "An expiration date cannot be in the past." */ val EXPIRATION_DATE_PAST: typings.googleCloudStorage.buildSrcStorageMod.ExceptionMessages.EXPIRATION_DATE_PAST & String = js.native
  
  @js.native
  sealed trait INVALID_ACTION
    extends StObject
       with ExceptionMessages
  /* "The action is not provided or invalid." */ val INVALID_ACTION: typings.googleCloudStorage.buildSrcStorageMod.ExceptionMessages.INVALID_ACTION & String = js.native
}
