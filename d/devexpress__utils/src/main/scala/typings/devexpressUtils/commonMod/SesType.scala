package typings.devexpressUtils.commonMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SesType extends js.Object
@JSImport("@devexpress/utils/lib/sequence-comparison/common", "SesType")
@js.native
object SesType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SesType with Double] = js.native
  
  @js.native
  sealed trait Add extends SesType
  /* 1 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  @js.native
  sealed trait Common extends SesType
  /* 0 */ @js.native
  object Common extends TopLevel[Common with Double]
  
  @js.native
  sealed trait Delete extends SesType
  /* -1 */ @js.native
  object Delete extends TopLevel[Delete with Double]
}
