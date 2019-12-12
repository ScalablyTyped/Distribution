package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType

import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_LIST
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_MAP
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_REGEXP
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.EntityType.Kind.KIND_UNSPECIFIED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Kind extends js.Object

/** Kind enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityType.Kind")
@js.native
object Kind extends js.Object {
  @js.native
  sealed trait KIND_LIST extends Kind
  
  @js.native
  sealed trait KIND_MAP extends Kind
  
  @js.native
  sealed trait KIND_REGEXP extends Kind
  
  @js.native
  sealed trait KIND_UNSPECIFIED extends Kind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Kind with Double] = js.native
  /* 2 */ @js.native
  object KIND_LIST extends TopLevel[KIND_LIST with Double]
  
  /* 1 */ @js.native
  object KIND_MAP extends TopLevel[KIND_MAP with Double]
  
  /* 3 */ @js.native
  object KIND_REGEXP extends TopLevel[KIND_REGEXP with Double]
  
  /* 0 */ @js.native
  object KIND_UNSPECIFIED extends TopLevel[KIND_UNSPECIFIED with Double]
  
}

