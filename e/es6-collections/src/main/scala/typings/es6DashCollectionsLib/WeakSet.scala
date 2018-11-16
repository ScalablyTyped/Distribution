package typings
package es6DashCollectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WeakSet[T] extends js.Object {
  def add(value: T): WeakSet[T]
  def clear(): scala.Unit
  def delete(value: T): scala.Boolean
  def has(value: T): scala.Boolean
}

