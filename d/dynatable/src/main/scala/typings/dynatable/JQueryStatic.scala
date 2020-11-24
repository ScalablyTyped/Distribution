package typings.dynatable

import typings.dynatable.JQueryDynatable.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static members of jQuery (those on $ and jQuery themselves) */
@js.native
trait JQueryStatic extends js.Object {
  
  /**
    * Global dynatable plugin setting defaults
    *
    * @param options The configuration options to be set globally
    */
  def dynatableSetup(options: Options): Unit = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(dynatableSetup: Options => Unit): JQueryStatic = {
    val __obj = js.Dynamic.literal(dynatableSetup = js.Any.fromFunction1(dynatableSetup))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDynatableSetup(value: Options => Unit): Self = this.set("dynatableSetup", js.Any.fromFunction1(value))
  }
}
