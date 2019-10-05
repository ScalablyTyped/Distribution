package typings.dojo.dojox.dtl._base

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.dom.html
  *
  *
  */
trait dom extends js.Object {
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

object dom {
  @scala.inline
  def apply(getTemplate: js.Any => js.Object, tokenize: HTMLElement => js.Array[_]): dom = {
    val __obj = js.Dynamic.literal(getTemplate = js.Any.fromFunction1(getTemplate), tokenize = js.Any.fromFunction1(tokenize))
  
    __obj.asInstanceOf[dom]
  }
}

