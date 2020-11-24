package typings.googleProtobuf.typePbMod.Field

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Cardinality extends js.Object
@JSImport("google-protobuf/google/protobuf/type_pb", "Field.Cardinality")
@js.native
object Cardinality extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Cardinality with Double] = js.native
  
  @js.native
  sealed trait CARDINALITY_OPTIONAL extends Cardinality
  /* 1 */ @js.native
  object CARDINALITY_OPTIONAL extends TopLevel[CARDINALITY_OPTIONAL with Double]
  
  @js.native
  sealed trait CARDINALITY_REPEATED extends Cardinality
  /* 3 */ @js.native
  object CARDINALITY_REPEATED extends TopLevel[CARDINALITY_REPEATED with Double]
  
  @js.native
  sealed trait CARDINALITY_REQUIRED extends Cardinality
  /* 2 */ @js.native
  object CARDINALITY_REQUIRED extends TopLevel[CARDINALITY_REQUIRED with Double]
  
  @js.native
  sealed trait CARDINALITY_UNKNOWN extends Cardinality
  /* 0 */ @js.native
  object CARDINALITY_UNKNOWN extends TopLevel[CARDINALITY_UNKNOWN with Double]
}
