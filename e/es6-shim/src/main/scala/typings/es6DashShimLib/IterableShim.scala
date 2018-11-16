package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IterableShim[T] extends js.Object {
  /**
        * Shim for an ES6 iterable. Not intended for direct use by user code.
        */
  def `_es6-shim iterator_`(): Iterator[T]
}

