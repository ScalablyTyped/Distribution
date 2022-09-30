package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeAnnotationCode extends StObject
/** TypeAnnotationCode enum. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TypeAnnotationCode")
@js.native
object TypeAnnotationCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeAnnotationCode & Double] = js.native
  
  @js.native
  sealed trait PG_NUMERIC
    extends StObject
       with TypeAnnotationCode
  /* 2 */ val PG_NUMERIC: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeAnnotationCode.PG_NUMERIC & Double = js.native
  
  @js.native
  sealed trait TYPE_ANNOTATION_CODE_UNSPECIFIED
    extends StObject
       with TypeAnnotationCode
  /* 0 */ val TYPE_ANNOTATION_CODE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.v1.TypeAnnotationCode.TYPE_ANNOTATION_CODE_UNSPECIFIED & Double = js.native
}
