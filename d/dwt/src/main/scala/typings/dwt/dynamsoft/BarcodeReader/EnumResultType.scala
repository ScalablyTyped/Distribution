package typings.dwt.dynamsoft.BarcodeReader

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumResultType extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumResultType")
@js.native
object EnumResultType extends js.Object {
  @js.native
  sealed trait EDT_CandidateText extends EnumResultType
  
  @js.native
  sealed trait EDT_PartialText extends EnumResultType
  
  @js.native
  sealed trait EDT_RawText extends EnumResultType
  
  @js.native
  sealed trait EDT_StandardText extends EnumResultType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumResultType with Double] = js.native
  /* 2 */ @js.native
  object EDT_CandidateText extends TopLevel[EDT_CandidateText with Double]
  
  /* 3 */ @js.native
  object EDT_PartialText extends TopLevel[EDT_PartialText with Double]
  
  /* 1 */ @js.native
  object EDT_RawText extends TopLevel[EDT_RawText with Double]
  
  /* 0 */ @js.native
  object EDT_StandardText extends TopLevel[EDT_StandardText with Double]
  
}

