package typings.dojo.dojox.dtl

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/dom.html
  *
  *
  */
trait dom_ extends js.Object {
  /**
    *
    * @param text
    */
  def getTemplate(text: js.Any): js.Object
  /**
    *
    * @param nodes
    */
  def tokenize(nodes: HTMLElement): js.Array[_]
}

object dom_ {
  @scala.inline
  def apply(getTemplate: js.Any => js.Object, tokenize: HTMLElement => js.Array[_]): dom_ = {
    val __obj = js.Dynamic.literal(getTemplate = js.Any.fromFunction1(getTemplate), tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[dom_]
  }
}

