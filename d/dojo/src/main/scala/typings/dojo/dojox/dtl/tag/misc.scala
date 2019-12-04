package typings.dojo.dojox.dtl.tag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/misc.html
  *
  *
  */
trait misc extends js.Object {
  /**
    *
    * @param text
    */
  def DebugNode(text: js.Any): Unit
  /**
    *
    * @param varnode
    * @param nodelist
    */
  def FilterNode(varnode: js.Any, nodelist: js.Any): Unit
  /**
    *
    * @param vars
    * @param text
    */
  def FirstOfNode(vars: js.Any, text: js.Any): Unit
  /**
    *
    * @param nodelist
    * @param text
    */
  def SpacelessNode(nodelist: js.Any, text: js.Any): Unit
  /**
    *
    * @param tag
    * @param text
    */
  def TemplateTagNode(tag: js.Any, text: js.Any): Unit
  /**
    *
    * @param current
    * @param max
    * @param width
    * @param text
    */
  def WidthRatioNode(current: js.Any, max: js.Any, width: js.Any, text: js.Any): Unit
  /**
    *
    * @param target
    * @param alias
    * @param nodelist
    */
  def WithNode(target: js.Any, alias: js.Any, nodelist: js.Any): Unit
  /**
    * Ignore everything between {% comment %} and {% endcomment %}
    *
    * @param parser
    * @param token
    */
  def comment(parser: js.Any, token: js.Any): js.Any
  /**
    * Output the current context, maybe add more stuff later.
    *
    * @param parser
    * @param token
    */
  def debug(parser: js.Any, token: js.Any): js.Any
  /**
    * Filter the contents of the blog through variable filters.
    *
    * @param parser
    * @param token
    */
  def filter(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def firstof(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def spaceless(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def templatetag(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def widthratio(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def with_(parser: js.Any, token: js.Any): js.Any
}

object misc {
  @scala.inline
  def apply(
    DebugNode: js.Any => Unit,
    FilterNode: (js.Any, js.Any) => Unit,
    FirstOfNode: (js.Any, js.Any) => Unit,
    SpacelessNode: (js.Any, js.Any) => Unit,
    TemplateTagNode: (js.Any, js.Any) => Unit,
    WidthRatioNode: (js.Any, js.Any, js.Any, js.Any) => Unit,
    WithNode: (js.Any, js.Any, js.Any) => Unit,
    comment: (js.Any, js.Any) => js.Any,
    debug: (js.Any, js.Any) => js.Any,
    filter: (js.Any, js.Any) => js.Any,
    firstof: (js.Any, js.Any) => js.Any,
    spaceless: (js.Any, js.Any) => js.Any,
    templatetag: (js.Any, js.Any) => js.Any,
    widthratio: (js.Any, js.Any) => js.Any,
    with_ : (js.Any, js.Any) => js.Any
  ): misc = {
    val __obj = js.Dynamic.literal(DebugNode = js.Any.fromFunction1(DebugNode), FilterNode = js.Any.fromFunction2(FilterNode), FirstOfNode = js.Any.fromFunction2(FirstOfNode), SpacelessNode = js.Any.fromFunction2(SpacelessNode), TemplateTagNode = js.Any.fromFunction2(TemplateTagNode), WidthRatioNode = js.Any.fromFunction4(WidthRatioNode), WithNode = js.Any.fromFunction3(WithNode), comment = js.Any.fromFunction2(comment), debug = js.Any.fromFunction2(debug), filter = js.Any.fromFunction2(filter), firstof = js.Any.fromFunction2(firstof), spaceless = js.Any.fromFunction2(spaceless), templatetag = js.Any.fromFunction2(templatetag), widthratio = js.Any.fromFunction2(widthratio), with_ = js.Any.fromFunction2(with_))
  
    __obj.asInstanceOf[misc]
  }
}

