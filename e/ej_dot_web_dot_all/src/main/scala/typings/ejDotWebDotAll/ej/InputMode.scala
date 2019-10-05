package typings.ejDotWebDotAll.ej

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
  
  /* 0 */ val Password: typings.ejDotWebDotAll.ej.InputMode.Password with Double = js.native
  /* 1 */ val Text: typings.ejDotWebDotAll.ej.InputMode.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputMode with Double] = js.native
}

