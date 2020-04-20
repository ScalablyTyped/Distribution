package typings.dojo.dojox.dtl.render

import typings.dojo.dojox.dtl.DomTemplated
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/render/dom.html
  *
  *
  */
trait dom extends js.Object {
  /**
    *
    * @param attachPoint               Optional
    * @param tpl               Optional
    */
  def Render(attachPoint: HTMLElement, tpl: DomTemplated): Unit
}

object dom {
  @scala.inline
  def apply(Render: (HTMLElement, DomTemplated) => Unit): dom = {
    val __obj = js.Dynamic.literal(Render = js.Any.fromFunction2(Render))
    __obj.asInstanceOf[dom]
  }
}

