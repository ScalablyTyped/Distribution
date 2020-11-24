package typings.ember.mod.Ember

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionPrototypeExtensions extends js.Object {
  
  /**
    * The `observes` extension of Javascript's Function prototype is available
    * when `EmberENV.EXTEND_PROTOTYPES` or `EmberENV.EXTEND_PROTOTYPES.Function` is
    * true, which is the default.
    */
  def observes(args: java.lang.String*): this.type = js.native
  
  /**
    * The `on` extension of Javascript's Function prototype is available
    * when `EmberENV.EXTEND_PROTOTYPES` or `EmberENV.EXTEND_PROTOTYPES.Function` is
    * true, which is the default.
    */
  def on(args: java.lang.String*): this.type = js.native
  
  /**
    * The `property` extension of Javascript's Function prototype is available
    * when `EmberENV.EXTEND_PROTOTYPES` or `EmberENV.EXTEND_PROTOTYPES.Function` is
    * `true`, which is the default.
    */
  def property(args: java.lang.String*): ComputedProperty[_, _] = js.native
}
object FunctionPrototypeExtensions {
  
  @scala.inline
  def apply(
    observes: /* repeated */ java.lang.String => FunctionPrototypeExtensions,
    on: /* repeated */ java.lang.String => FunctionPrototypeExtensions,
    property: /* repeated */ java.lang.String => ComputedProperty[_, _]
  ): FunctionPrototypeExtensions = {
    val __obj = js.Dynamic.literal(observes = js.Any.fromFunction1(observes), on = js.Any.fromFunction1(on), property = js.Any.fromFunction1(property))
    __obj.asInstanceOf[FunctionPrototypeExtensions]
  }
  
  @scala.inline
  implicit class FunctionPrototypeExtensionsOps[Self <: FunctionPrototypeExtensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObserves(value: /* repeated */ java.lang.String => FunctionPrototypeExtensions): Self = this.set("observes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: /* repeated */ java.lang.String => FunctionPrototypeExtensions): Self = this.set("on", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProperty(value: /* repeated */ java.lang.String => ComputedProperty[_, _]): Self = this.set("property", js.Any.fromFunction1(value))
  }
}
