package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object collections {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/collections/ArrayList.html
    *
    * Returns a new object of type dojox.collections.ArrayList
    *
    * @param arr       Optional
    */
  type ArrayList = js.Function1[/* arr */ js.UndefOr[js.Array[js.Any]], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/collections/BinaryTree.html
    *
    *
    * @param data
    */
  type BinaryTree = js.Function1[/* data */ js.Any, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/collections/Queue.html
    *
    * return an object of type dojox.collections.Queue
    *
    * @param arr       Optional
    */
  type Queue = js.Function1[/* arr */ js.UndefOr[js.Array[js.Any]], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/collections/SortedList.html
    *
    * creates a collection that acts like a dictionary but is also internally sorted.
    * Note that the act of adding any elements forces an internal resort, making this object potentially slow.
    *
    * @param dictionary       Optional
    */
  type SortedList = js.Function1[/* dictionary */ js.UndefOr[js.Object], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/collections/Stack.html
    *
    * returns an object of type dojox.collections.Stack
    *
    * @param arr       Optional
    */
  type Stack = js.Function1[/* arr */ js.UndefOr[js.Array[js.Any]], Unit]
}
