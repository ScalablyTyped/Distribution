package typings.dojo.dojox.dtl.contrib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/data.html
  *
  *
  */
trait data extends js.Object {
  /**
    *
    * @param items
    * @param query
    * @param store
    * @param alias
    */
  def BindDataNode(items: js.Any, query: js.Any, store: js.Any, alias: js.Any): Unit
  /**
    * Turns a list of data store items into DTL compatible items
    *
    * @param parser
    * @param token
    */
  def bind_data(parser: js.Any, token: js.Any): js.Any
  /**
    * Queries a data store and makes the returned items DTL compatible
    *
    * @param parser
    * @param token
    */
  def bind_query(parser: js.Any, token: js.Any): js.Any
}

object data {
  @scala.inline
  def apply(
    BindDataNode: (js.Any, js.Any, js.Any, js.Any) => Unit,
    bind_data: (js.Any, js.Any) => js.Any,
    bind_query: (js.Any, js.Any) => js.Any
  ): data = {
    val __obj = js.Dynamic.literal(BindDataNode = js.Any.fromFunction4(BindDataNode), bind_data = js.Any.fromFunction2(bind_data), bind_query = js.Any.fromFunction2(bind_query))
  
    __obj.asInstanceOf[data]
  }
}

