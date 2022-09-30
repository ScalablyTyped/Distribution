package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RestoreSourceType extends StObject
/** RestoreSourceType enum. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.RestoreSourceType")
@js.native
object RestoreSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RestoreSourceType & Double] = js.native
  
  @js.native
  sealed trait BACKUP
    extends StObject
       with RestoreSourceType
  /* 1 */ val BACKUP: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.RestoreSourceType.BACKUP & Double = js.native
  
  @js.native
  sealed trait TYPE_UNSPECIFIED
    extends StObject
       with RestoreSourceType
  /* 0 */ val TYPE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.RestoreSourceType.TYPE_UNSPECIFIED & Double = js.native
}
