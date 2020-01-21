package typings.googleProtobuf.typePbMod.Field

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Cardinality extends js.Object

@JSImport("google-protobuf/google/protobuf/type_pb", "Field.Cardinality")
@js.native
object Cardinality extends js.Object {
  @js.native
  sealed trait CARDINALITY_OPTIONAL extends Cardinality
  
  @js.native
  sealed trait CARDINALITY_REPEATED extends Cardinality
  
  @js.native
  sealed trait CARDINALITY_REQUIRED extends Cardinality
  
  @js.native
  sealed trait CARDINALITY_UNKNOWN extends Cardinality
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Cardinality with Double] = js.native
  /* 1 */ @js.native
  object CARDINALITY_OPTIONAL extends TopLevel[CARDINALITY_OPTIONAL with Double]
  
  /* 3 */ @js.native
  object CARDINALITY_REPEATED extends TopLevel[CARDINALITY_REPEATED with Double]
  
  /* 2 */ @js.native
  object CARDINALITY_REQUIRED extends TopLevel[CARDINALITY_REQUIRED with Double]
  
  /* 0 */ @js.native
  object CARDINALITY_UNKNOWN extends TopLevel[CARDINALITY_UNKNOWN with Double]
  
}

