package typings.formDashSerialize.formDashSerializeMod

import typings.formDashSerialize.formDashSerializeNumbers.`false`
import typings.formDashSerialize.formDashSerializeNumbers.`true`
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("form-serialize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(form: HTMLFormElement): String = js.native
  def apply(form: HTMLFormElement, options: OptionsHash): ResultHash = js.native
  def apply(form: HTMLFormElement, options: OptionsString): String = js.native
  def apply(form: HTMLFormElement, options: `false`): String = js.native
  def apply(form: HTMLFormElement, options: `true`): ResultHash = js.native
  def apply[Result](form: HTMLFormElement, options: Boolean): Result = js.native
  def apply[Result](form: HTMLFormElement, options: Options[Result]): Result = js.native
}

