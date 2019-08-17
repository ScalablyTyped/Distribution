package typings.atEmberComponent.helperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/component/helper", JSImport.Default)
@js.native
class default () extends Helper

/* static members */
@JSImport("@ember/component/helper", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * In many cases, the ceremony of a full `Ember.Helper` class is not required.
    * The `helper` method create pure-function helpers without instances. For
    * example:
    */
  def helper(helper: js.Function2[/* params */ js.Array[_], /* hash */ js.UndefOr[js.Object], _]): Helper = js.native
}

