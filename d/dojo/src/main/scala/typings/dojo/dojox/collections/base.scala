package typings.dojo.dojox.collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/collections/_base.html
  *
  *
  */
trait base extends js.Object {
  /**
    *
    */
  var Set: js.Object
  /**
    * Returns a new object of type dojox.collections.ArrayList
    *
    * @param arr               Optional
    */
  def ArrayList(arr: js.Array[_]): Unit
  /**
    *
    * @param data
    */
  def BinaryTree(data: js.Any): Unit
  /**
    * Returns an object of type dojox.collections.Dictionary
    *
    * @param dictionary               Optional
    */
  def Dictionary(dictionary: typings.dojo.dojox.collections.Dictionary): Unit
  /**
    * return an object of type dojox.collections.DictionaryEntry
    *
    * @param k
    * @param v
    */
  def DictionaryEntry(k: String, v: js.Object): Unit
  /**
    * return an object of type dojox.collections.DictionaryIterator
    *
    * @param obj
    */
  def DictionaryIterator(obj: js.Object): Unit
  /**
    * return an object of type dojox.collections.Iterator
    *
    * @param a
    */
  def Iterator(a: js.Array[_]): Unit
  /**
    * return an object of type dojox.collections.Queue
    *
    * @param arr               Optional
    */
  def Queue(arr: js.Array[_]): Unit
  /**
    * creates a collection that acts like a dictionary but is also internally sorted.
    * Note that the act of adding any elements forces an internal resort, making this object potentially slow.
    *
    * @param dictionary               Optional
    */
  def SortedList(dictionary: js.Object): Unit
  /**
    * returns an object of type dojox.collections.Stack
    *
    * @param arr               Optional
    */
  def Stack(arr: js.Array[_]): Unit
}

object base {
  @scala.inline
  def apply(
    ArrayList: js.Array[_] => Unit,
    BinaryTree: js.Any => Unit,
    Dictionary: Dictionary => Unit,
    DictionaryEntry: (String, js.Object) => Unit,
    DictionaryIterator: js.Object => Unit,
    Iterator: js.Array[_] => Unit,
    Queue: js.Array[_] => Unit,
    Set: js.Object,
    SortedList: js.Object => Unit,
    Stack: js.Array[_] => Unit
  ): base = {
    val __obj = js.Dynamic.literal(ArrayList = js.Any.fromFunction1(ArrayList), BinaryTree = js.Any.fromFunction1(BinaryTree), Dictionary = js.Any.fromFunction1(Dictionary), DictionaryEntry = js.Any.fromFunction2(DictionaryEntry), DictionaryIterator = js.Any.fromFunction1(DictionaryIterator), Iterator = js.Any.fromFunction1(Iterator), Queue = js.Any.fromFunction1(Queue), Set = Set.asInstanceOf[js.Any], SortedList = js.Any.fromFunction1(SortedList), Stack = js.Any.fromFunction1(Stack))
  
    __obj.asInstanceOf[base]
  }
}

