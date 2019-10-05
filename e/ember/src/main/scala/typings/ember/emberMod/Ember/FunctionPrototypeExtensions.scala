package typings.ember.emberMod.Ember

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionPrototypeExtensions extends js.Object {
  /**
    * The `observes` extension of Javascript's Function prototype is available
    * when `EmberENV.EXTEND_PROTOTYPES` or `EmberENV.EXTEND_PROTOTYPES.Function` is
    * true, which is the default.
    */
  def observes(args: String*): this.type
  /**
    * The `on` extension of Javascript's Function prototype is available
    * when `EmberENV.EXTEND_PROTOTYPES` or `EmberENV.EXTEND_PROTOTYPES.Function` is
    * true, which is the default.
    */
  def on(args: String*): this.type
  /**
    * The `property` extension of Javascript's Function prototype is available
    * when `EmberENV.EXTEND_PROTOTYPES` or `EmberENV.EXTEND_PROTOTYPES.Function` is
    * `true`, which is the default.
    */
  def property(args: String*): ComputedProperty[_, _]
}

object FunctionPrototypeExtensions {
  @scala.inline
  def apply(
    observes: /* repeated */ String => FunctionPrototypeExtensions,
    on: /* repeated */ String => FunctionPrototypeExtensions,
    property: /* repeated */ String => ComputedProperty[_, _]
  ): FunctionPrototypeExtensions = {
    val __obj = js.Dynamic.literal(observes = js.Any.fromFunction1(observes), on = js.Any.fromFunction1(on), property = js.Any.fromFunction1(property))
  
    __obj.asInstanceOf[FunctionPrototypeExtensions]
  }
}

