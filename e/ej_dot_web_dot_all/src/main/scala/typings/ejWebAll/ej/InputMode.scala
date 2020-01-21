package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputMode extends js.Object

@JSGlobal("ej.InputMode")
@js.native
object InputMode extends js.Object {
  //string
  @js.native
  sealed trait Password extends InputMode
  
  //string
  @js.native
  sealed trait Text extends InputMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputMode with Double] = js.native
  /* 0 */ @js.native
  object Password extends TopLevel[Password with Double]
  
  /* 1 */ @js.native
  object Text extends TopLevel[Text with Double]
  
}

