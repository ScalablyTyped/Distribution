package typings.dojo.dojox.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/util.html
  *
  * grid utility library
  *
  */
trait util extends js.Object {
  /**
    *
    */
  var gridViewTag: String
  /**
    *
    */
  var keyEvents: js.Array[_]
  /**
    *
    */
  var mouseEvents: js.Array[_]
  /**
    *
    */
  var na: String
  /**
    *
    */
  var rowIndexTag: String
  /**
    *
    * @param inA
    * @param inB
    */
  def arrayCompare(inA: js.Any, inB: js.Any): Unit
  /**
    *
    * @param inArray
    * @param inIndex
    * @param inValue
    */
  def arrayInsert(inArray: js.Any, inIndex: js.Any, inValue: js.Any): Unit
  /**
    *
    * @param inArray
    * @param inIndex
    */
  def arrayRemove(inArray: js.Any, inIndex: js.Any): Unit
  /**
    *
    * @param inArray
    * @param inI
    * @param inJ
    */
  def arraySwap(inArray: js.Any, inI: js.Any, inJ: js.Any): Unit
  /**
    *
    * @param ob
    * @param ev
    * @param args
    */
  def fire(ob: js.Any, ev: js.Any, args: js.Any): js.Any
  /**
    *
    * @param inNode
    * @param inObject
    * @param inMethod
    * @param inEvents
    */
  def funnelEvents(inNode: js.Any, inObject: js.Any, inMethod: js.Any, inEvents: js.Any): Unit
  /**
    *
    * @param inNode
    */
  def removeNode(inNode: js.Any): js.Any
  /**
    *
    * @param inElement
    * @param inHeight
    */
  def setStyleHeightPx(inElement: js.Any, inHeight: js.Any): Unit
}

object util {
  @scala.inline
  def apply(
    arrayCompare: (js.Any, js.Any) => Unit,
    arrayInsert: (js.Any, js.Any, js.Any) => Unit,
    arrayRemove: (js.Any, js.Any) => Unit,
    arraySwap: (js.Any, js.Any, js.Any) => Unit,
    fire: (js.Any, js.Any, js.Any) => js.Any,
    funnelEvents: (js.Any, js.Any, js.Any, js.Any) => Unit,
    gridViewTag: String,
    keyEvents: js.Array[_],
    mouseEvents: js.Array[_],
    na: String,
    removeNode: js.Any => js.Any,
    rowIndexTag: String,
    setStyleHeightPx: (js.Any, js.Any) => Unit
  ): util = {
    val __obj = js.Dynamic.literal(arrayCompare = js.Any.fromFunction2(arrayCompare), arrayInsert = js.Any.fromFunction3(arrayInsert), arrayRemove = js.Any.fromFunction2(arrayRemove), arraySwap = js.Any.fromFunction3(arraySwap), fire = js.Any.fromFunction3(fire), funnelEvents = js.Any.fromFunction4(funnelEvents), gridViewTag = gridViewTag.asInstanceOf[js.Any], keyEvents = keyEvents.asInstanceOf[js.Any], mouseEvents = mouseEvents.asInstanceOf[js.Any], na = na.asInstanceOf[js.Any], removeNode = js.Any.fromFunction1(removeNode), rowIndexTag = rowIndexTag.asInstanceOf[js.Any], setStyleHeightPx = js.Any.fromFunction2(setStyleHeightPx))
    __obj.asInstanceOf[util]
  }
}

