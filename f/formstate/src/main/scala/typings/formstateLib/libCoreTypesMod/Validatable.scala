package typings
package formstateLib.libCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Validatable[TValue] extends js.Object {
  @JSName("$")
  var $: TValue
  var error: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var hasError: scala.Boolean
  var validating: scala.Boolean
  def enableAutoValidation(): scala.Unit
  def validate(): stdLib.Promise[formstateLib.Anon_HasError | formstateLib.Anon_HasErrorFalseValue[TValue]]
}

