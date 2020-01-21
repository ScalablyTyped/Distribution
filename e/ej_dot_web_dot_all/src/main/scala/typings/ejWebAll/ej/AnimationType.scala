package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationType extends js.Object

@JSGlobal("ej.AnimationType")
@js.native
object AnimationType extends js.Object {
  //string
  @js.native
  sealed trait Default extends AnimationType
  
  //string
  @js.native
  sealed trait None extends AnimationType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationType with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
}

