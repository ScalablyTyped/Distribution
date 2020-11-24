package typings.feathersjsFeathers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feathers extends js.Object {
  
  // tslint:disable-next-line no-unnecessary-generics
  def apply[T](): Application[T] = js.native
  
  var SKIP: SkipSymbol = js.native
  
  // tslint:disable-next-line no-unnecessary-generics
  def default[T](): Application[T] = js.native
  @JSName("default")
  var default_Original: Feathers = js.native
  
  var version: String = js.native
}
