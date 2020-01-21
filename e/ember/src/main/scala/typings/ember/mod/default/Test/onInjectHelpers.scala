package typings.ember.mod.default.Test

import typings.ember.mod.Ember.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Test.onInjectHelpers")
@js.native
object onInjectHelpers extends js.Object {
  /**
    * Used to register callbacks to be fired whenever `App.injectTestHelpers`
    * is called.
    */
  def apply(callback: js.Function1[/* app */ Application, Unit]): Unit = js.native
}

