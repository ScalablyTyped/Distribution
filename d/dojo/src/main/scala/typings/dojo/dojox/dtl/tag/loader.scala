package typings.dojo.dojox.dtl.tag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/loader.html
  *
  *
  */
trait loader extends js.Object {
  /**
    *
    * @param name
    * @param nodelist
    */
  def BlockNode(name: js.Any, nodelist: js.Any): Unit
  /**
    *
    * @param getTemplate
    * @param nodelist
    * @param shared
    * @param parent
    * @param key
    */
  def ExtendsNode(getTemplate: js.Any, nodelist: js.Any, shared: js.Any, parent: js.Any, key: js.Any): Unit
  /**
    *
    * @param path
    * @param constant
    * @param getTemplate
    * @param text
    * @param parsed
    */
  def IncludeNode(path: js.Any, constant: js.Any, getTemplate: js.Any, text: js.Any, parsed: js.Any): Unit
  /**
    *
    * @param parser
    * @param token
    */
  def block(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def extends_(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def include(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def ssi(parser: js.Any, token: js.Any): js.Any
}

object loader {
  @scala.inline
  def apply(
    BlockNode: (js.Any, js.Any) => Unit,
    ExtendsNode: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    IncludeNode: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    block: (js.Any, js.Any) => js.Any,
    extends_ : (js.Any, js.Any) => js.Any,
    include: (js.Any, js.Any) => js.Any,
    ssi: (js.Any, js.Any) => js.Any
  ): loader = {
    val __obj = js.Dynamic.literal(BlockNode = js.Any.fromFunction2(BlockNode), ExtendsNode = js.Any.fromFunction5(ExtendsNode), IncludeNode = js.Any.fromFunction5(IncludeNode), block = js.Any.fromFunction2(block), extends_ = js.Any.fromFunction2(extends_), include = js.Any.fromFunction2(include), ssi = js.Any.fromFunction2(ssi))
  
    __obj.asInstanceOf[loader]
  }
}

