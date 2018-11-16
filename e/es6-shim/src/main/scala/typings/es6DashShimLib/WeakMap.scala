package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  def delete(key: K): scala.Boolean
  def get(key: K): js.UndefOr[V]
  def has(key: K): scala.Boolean
  def set(key: K, value: V): WeakMap[K, V]
}

