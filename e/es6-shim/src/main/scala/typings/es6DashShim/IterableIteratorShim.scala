package typings.es6DashShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterableIteratorShim[T]
  extends IterableShim[T]
     with Iterator[T]

