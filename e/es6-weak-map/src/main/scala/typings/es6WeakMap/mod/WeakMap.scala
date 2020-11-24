package typings.es6WeakMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeakMap[K, V] extends js.Object {
  
  def delete(key: K): Boolean = js.native
  
  def get(key: K): V = js.native
  
  def has(key: K): Boolean = js.native
  
  def set(key: K): WeakMap[K, V] = js.native
  def set(key: K, value: V): WeakMap[K, V] = js.native
}
