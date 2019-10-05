package typings.dojo.dojox.atom.io

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.html
  *
  *
  */
@JSName("model")
trait model_ extends js.Object {
  /**
    *
    */
  var util: js.Object
  /**
    *
    */
  def AtomItem(): Unit
  /**
    *
    */
  def Category(): Unit
  /**
    *
    */
  def Collection(): Unit
  /**
    *
    */
  def Content(): Unit
  /**
    *
    */
  def Entry(): Unit
  /**
    *
    */
  def Feed(): Unit
  /**
    *
    */
  def Generator(): Unit
  /**
    *
    */
  def Link(): Unit
  /**
    *
    */
  def Node(): Unit
  /**
    *
    */
  def Person(): Unit
  /**
    *
    */
  def Service(): Unit
  /**
    *
    */
  def Workspace(): Unit
}

object model_ {
  @scala.inline
  def apply(
    AtomItem: () => Unit,
    Category: () => Unit,
    Collection: () => Unit,
    Content: () => Unit,
    Entry: () => Unit,
    Feed: () => Unit,
    Generator: () => Unit,
    Link: () => Unit,
    Node: () => Unit,
    Person: () => Unit,
    Service: () => Unit,
    Workspace: () => Unit,
    util: js.Object
  ): model_ = {
    val __obj = js.Dynamic.literal(AtomItem = js.Any.fromFunction0(AtomItem), Category = js.Any.fromFunction0(Category), Collection = js.Any.fromFunction0(Collection), Content = js.Any.fromFunction0(Content), Entry = js.Any.fromFunction0(Entry), Feed = js.Any.fromFunction0(Feed), Generator = js.Any.fromFunction0(Generator), Link = js.Any.fromFunction0(Link), Node = js.Any.fromFunction0(Node), Person = js.Any.fromFunction0(Person), Service = js.Any.fromFunction0(Service), Workspace = js.Any.fromFunction0(Workspace), util = util)
  
    __obj.asInstanceOf[model_]
  }
}

