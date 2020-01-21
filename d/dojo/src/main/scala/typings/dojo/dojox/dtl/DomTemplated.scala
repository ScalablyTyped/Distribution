package typings.dojo.dojox.dtl

import typings.dojo.dojo.base.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.dtl._DomTemplated")
@js.native
object DomTemplated extends js.Object {
  /**
    * Quickly switch between templated by location
    *
    * @param template The new template.
    * @param context               OptionalThe runtime context.
    */
  @js.native
  trait setTemplate extends js.Object {
    def apply(template: String, context: Context): Unit = js.native
    def apply(template: url, context: Context): Unit = js.native
  }
  
  /**
    * Constructs the DOM representation.
    *
    */
  type buildRendering = js.Function0[Unit]
  /**
    * Renders this template.
    *
    * @param context               OptionalThe runtime context.
    * @param tpl               OptionalThe template to render. Optional.
    */
  type render = js.Function2[/* context */ Context, /* tpl */ DomTemplated, Unit]
}

