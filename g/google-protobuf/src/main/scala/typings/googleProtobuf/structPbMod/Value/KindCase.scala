package typings.googleProtobuf.structPbMod.Value

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KindCase extends js.Object

@JSImport("google-protobuf/google/protobuf/struct_pb", "Value.KindCase")
@js.native
object KindCase extends js.Object {
  @js.native
  sealed trait BOOL_VALUE extends KindCase
  
  @js.native
  sealed trait KIND_NOT_SET extends KindCase
  
  @js.native
  sealed trait LIST_VALUE extends KindCase
  
  @js.native
  sealed trait NULL_VALUE extends KindCase
  
  @js.native
  sealed trait NUMBER_VALUE extends KindCase
  
  @js.native
  sealed trait STRING_VALUE extends KindCase
  
  @js.native
  sealed trait STRUCT_VALUE extends KindCase
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KindCase with Double] = js.native
  /* 4 */ @js.native
  object BOOL_VALUE extends TopLevel[BOOL_VALUE with Double]
  
  /* 0 */ @js.native
  object KIND_NOT_SET extends TopLevel[KIND_NOT_SET with Double]
  
  /* 6 */ @js.native
  object LIST_VALUE extends TopLevel[LIST_VALUE with Double]
  
  /* 1 */ @js.native
  object NULL_VALUE extends TopLevel[NULL_VALUE with Double]
  
  /* 2 */ @js.native
  object NUMBER_VALUE extends TopLevel[NUMBER_VALUE with Double]
  
  /* 3 */ @js.native
  object STRING_VALUE extends TopLevel[STRING_VALUE with Double]
  
  /* 5 */ @js.native
  object STRUCT_VALUE extends TopLevel[STRUCT_VALUE with Double]
  
}

