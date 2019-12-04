package typings.dojo.dojox.atom.io.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model._actions.html
  *
  * Container for tag handling functions.
  * Container for tag handling functions.  Each child of this container is
  * a handler function for the given type of node. Each accepts two parameters:
  *
  */
trait _actions extends js.Object {
  /**
    * The dom node containing the data
    *
    */
  var node: js.Object
  /**
    * The object to insert data into.
    *
    */
  var obj: js.Object
  /**
    *
    * @param obj
    * @param node
    */
  def author(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def category(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def content(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def contributor(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def email(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def entry(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def generator(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def icon(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def id(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def issued(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def link(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def modified(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def name(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def published(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def rights(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def subtitle(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def summary(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def title(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def updated(obj: js.Any, node: js.Any): Unit
  /**
    *
    * @param obj
    * @param node
    */
  def uri(obj: js.Any, node: js.Any): Unit
}

object _actions {
  @scala.inline
  def apply(
    author: (js.Any, js.Any) => Unit,
    category: (js.Any, js.Any) => Unit,
    content: (js.Any, js.Any) => Unit,
    contributor: (js.Any, js.Any) => Unit,
    email: (js.Any, js.Any) => Unit,
    entry: (js.Any, js.Any) => Unit,
    generator: (js.Any, js.Any) => Unit,
    icon: (js.Any, js.Any) => Unit,
    id: (js.Any, js.Any) => Unit,
    issued: (js.Any, js.Any) => Unit,
    link: (js.Any, js.Any) => Unit,
    modified: (js.Any, js.Any) => Unit,
    name: (js.Any, js.Any) => Unit,
    node: js.Object,
    obj: js.Object,
    published: (js.Any, js.Any) => Unit,
    rights: (js.Any, js.Any) => Unit,
    subtitle: (js.Any, js.Any) => Unit,
    summary: (js.Any, js.Any) => Unit,
    title: (js.Any, js.Any) => Unit,
    updated: (js.Any, js.Any) => Unit,
    uri: (js.Any, js.Any) => Unit
  ): _actions = {
    val __obj = js.Dynamic.literal(author = js.Any.fromFunction2(author), category = js.Any.fromFunction2(category), content = js.Any.fromFunction2(content), contributor = js.Any.fromFunction2(contributor), email = js.Any.fromFunction2(email), entry = js.Any.fromFunction2(entry), generator = js.Any.fromFunction2(generator), icon = js.Any.fromFunction2(icon), id = js.Any.fromFunction2(id), issued = js.Any.fromFunction2(issued), link = js.Any.fromFunction2(link), modified = js.Any.fromFunction2(modified), name = js.Any.fromFunction2(name), node = node.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], published = js.Any.fromFunction2(published), rights = js.Any.fromFunction2(rights), subtitle = js.Any.fromFunction2(subtitle), summary = js.Any.fromFunction2(summary), title = js.Any.fromFunction2(title), updated = js.Any.fromFunction2(updated), uri = js.Any.fromFunction2(uri))
  
    __obj.asInstanceOf[_actions]
  }
}

