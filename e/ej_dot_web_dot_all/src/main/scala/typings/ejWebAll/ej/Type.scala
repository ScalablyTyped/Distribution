package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait Overlay extends Type
  
  @js.native
  sealed trait Slide extends Type
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  /* 0 */ @js.native
  object Overlay extends TopLevel[Overlay with Double]
  
  /* 1 */ @js.native
  object Slide extends TopLevel[Slide with Double]
  
}

