package typings.googleCloudSpanner.mod.protos.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DatabaseDialect enum. */
@JSImport("@google-cloud/spanner", "protos.google.spanner.admin.database.v1.DatabaseDialect")
@js.native
object DatabaseDialect extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseDialect & Double
  ] = js.native
  
  /* 0 */ val DATABASE_DIALECT_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseDialect.DATABASE_DIALECT_UNSPECIFIED & Double = js.native
  
  /* 1 */ val GOOGLE_STANDARD_SQL: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseDialect.GOOGLE_STANDARD_SQL & Double = js.native
  
  /* 2 */ val POSTGRESQL: typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseDialect.POSTGRESQL & Double = js.native
}
