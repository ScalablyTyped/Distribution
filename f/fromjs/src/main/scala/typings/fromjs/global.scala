package typings.fromjs

import typings.fromjs.FromJS.IQueryable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def from[T](results: js.Any): IQueryable[_] = js.native
  def from[T](results: js.Array[T]): IQueryable[T] = js.native
}
