package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseChain[T] extends js.Object {
  def beginsWith(value: js.Any): T
  def between(value1: js.Any, value2: js.Any): T
  def eq(value: js.Any): T
  def equals(value: js.Any): T
  def exists(): T
  def gt(value: js.Any): T
  def gte(value: js.Any): T
  def lt(value: js.Any): T
  def lte(value: js.Any): T
  def `null`(): T
}

