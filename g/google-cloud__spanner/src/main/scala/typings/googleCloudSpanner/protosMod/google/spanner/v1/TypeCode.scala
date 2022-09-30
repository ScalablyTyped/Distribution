package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeCode extends StObject
/** TypeCode enum. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TypeCode")
@js.native
object TypeCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeCode & Double] = js.native
  
  @js.native
  sealed trait ARRAY
    extends StObject
       with TypeCode
  /* 8 */ val ARRAY: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.ARRAY & Double = js.native
  
  @js.native
  sealed trait BOOL
    extends StObject
       with TypeCode
  /* 1 */ val BOOL: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.BOOL & Double = js.native
  
  @js.native
  sealed trait BYTES
    extends StObject
       with TypeCode
  /* 7 */ val BYTES: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.BYTES & Double = js.native
  
  @js.native
  sealed trait DATE
    extends StObject
       with TypeCode
  /* 5 */ val DATE: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.DATE & Double = js.native
  
  @js.native
  sealed trait FLOAT64
    extends StObject
       with TypeCode
  /* 3 */ val FLOAT64: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.FLOAT64 & Double = js.native
  
  @js.native
  sealed trait INT64
    extends StObject
       with TypeCode
  /* 2 */ val INT64: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.INT64 & Double = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with TypeCode
  /* 11 */ val JSON: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.JSON & Double = js.native
  
  @js.native
  sealed trait NUMERIC
    extends StObject
       with TypeCode
  /* 10 */ val NUMERIC: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.NUMERIC & Double = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with TypeCode
  /* 6 */ val STRING: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.STRING & Double = js.native
  
  @js.native
  sealed trait STRUCT
    extends StObject
       with TypeCode
  /* 9 */ val STRUCT: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.STRUCT & Double = js.native
  
  @js.native
  sealed trait TIMESTAMP
    extends StObject
       with TypeCode
  /* 4 */ val TIMESTAMP: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.TIMESTAMP & Double = js.native
  
  @js.native
  sealed trait TYPE_CODE_UNSPECIFIED
    extends StObject
       with TypeCode
  /* 0 */ val TYPE_CODE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeCode.TYPE_CODE_UNSPECIFIED & Double = js.native
}
