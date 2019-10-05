package typings.es6DashCollections

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakSet[T] extends js.Object {
  def add(value: T): WeakSet[T]
  def clear(): Unit
  def delete(value: T): Boolean
  def has(value: T): Boolean
}

@JSGlobal("WeakSet")
@js.native
object WeakSet extends TopLevel[WeakSetConstructor]

