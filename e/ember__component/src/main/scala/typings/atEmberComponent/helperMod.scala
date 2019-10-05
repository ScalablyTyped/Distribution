package typings.atEmberComponent

import typings.atEmberComponent.helperMod.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/component/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  @js.native
  trait Helper
    extends typings.atEmberObject.atEmberObjectMod.default {
    /**
      * Override this function when writing a class-based helper.
      */
    def compute(params: js.Array[_], hash: js.Object): js.Any = js.native
    /**
      * On a class-based helper, it may be useful to force a recomputation of that
      * helpers value. This is akin to `rerender` on a component.
      */
    def recompute(): js.Any = js.native
  }
  
  @js.native
  class default () extends Helper
  
  def helper(helperFn: js.Function2[/* params */ js.Array[_], /* hash */ js.UndefOr[js.Any], _]): js.Any = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * In many cases, the ceremony of a full `Ember.Helper` class is not required.
      * The `helper` method create pure-function helpers without instances. For
      * example:
      */
    def helper(helper: js.Function2[/* params */ js.Array[_], /* hash */ js.UndefOr[js.Object], _]): Helper = js.native
  }
  
}

