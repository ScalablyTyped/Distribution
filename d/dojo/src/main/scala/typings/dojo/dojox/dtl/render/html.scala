package typings.dojo.dojox.dtl.render

import typings.dojo.dojox.dtl._DomTemplated
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/render/html.html
  *
  *
  */
trait html extends js.Object {
  /**
    *
    * @param attachPoint               Optional
    * @param tpl               Optional
    */
  def Render(attachPoint: HTMLElement, tpl: _DomTemplated): Unit
}

object html {
  @scala.inline
  def apply(Render: (HTMLElement, _DomTemplated) => Unit): html = {
    val __obj = js.Dynamic.literal(Render = js.Any.fromFunction2(Render))
  
    __obj.asInstanceOf[html]
  }
}

