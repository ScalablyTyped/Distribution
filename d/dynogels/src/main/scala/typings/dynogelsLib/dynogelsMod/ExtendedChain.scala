package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExtendedChain[T] extends BaseChain[T] {
  def contains(value: js.Any): T
  def in(values: js.Array[_]): T
  def ne(value: js.Any): T
  def notContains(value: js.Any): T
}

