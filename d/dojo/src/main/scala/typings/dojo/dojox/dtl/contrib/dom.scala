package typings.dojo.dojox.dtl.contrib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/dom.html
  *
  *
  */
trait dom extends js.Object {
  /**
    *
    * @param nodelist
    * @param options
    */
  def BufferNode(nodelist: js.Any, options: js.Any): Unit
  /**
    *
    * @param styles
    */
  def StyleNode(styles: js.Any): Unit
  /**
    * Buffer large DOM manipulations during re-render.
    * When using DomTemplate, wrap any content
    * that you expect to change often during
    * re-rendering. It will then remove its parent
    * from the main document while it re-renders that
    * section of code. It will only remove it from
    * the main document if a mainpulation of somes sort
    * happens. ie It won't swap out if it diesn't have to.
    *
    * @param parser
    * @param token
    */
  def buffer(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def html(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def style_(parser: js.Any, token: js.Any): js.Any
}

object dom {
  @scala.inline
  def apply(
    BufferNode: (js.Any, js.Any) => Unit,
    StyleNode: js.Any => Unit,
    buffer: (js.Any, js.Any) => js.Any,
    html: (js.Any, js.Any) => js.Any,
    style_ : (js.Any, js.Any) => js.Any
  ): dom = {
    val __obj = js.Dynamic.literal(BufferNode = js.Any.fromFunction2(BufferNode), StyleNode = js.Any.fromFunction1(StyleNode), buffer = js.Any.fromFunction2(buffer), html = js.Any.fromFunction2(html), style_ = js.Any.fromFunction2(style_))
  
    __obj.asInstanceOf[dom]
  }
}

