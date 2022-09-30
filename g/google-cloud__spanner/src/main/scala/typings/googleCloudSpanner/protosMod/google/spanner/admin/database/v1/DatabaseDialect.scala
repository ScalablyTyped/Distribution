package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DatabaseDialect extends StObject
/** DatabaseDialect enum. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.DatabaseDialect")
@js.native
object DatabaseDialect extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DatabaseDialect & Double] = js.native
  
  @js.native
  sealed trait DATABASE_DIALECT_UNSPECIFIED
    extends StObject
       with DatabaseDialect
  /* 0 */ val DATABASE_DIALECT_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseDialect.DATABASE_DIALECT_UNSPECIFIED & Double = js.native
  
  @js.native
  sealed trait GOOGLE_STANDARD_SQL
    extends StObject
       with DatabaseDialect
  /* 1 */ val GOOGLE_STANDARD_SQL: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseDialect.GOOGLE_STANDARD_SQL & Double = js.native
  
  @js.native
  sealed trait POSTGRESQL
    extends StObject
       with DatabaseDialect
  /* 2 */ val POSTGRESQL: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseDialect.POSTGRESQL & Double = js.native
}
