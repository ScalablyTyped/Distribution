package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterableIteratorShim[T]
  extends IterableShim[T]
     with Iterator[T]

