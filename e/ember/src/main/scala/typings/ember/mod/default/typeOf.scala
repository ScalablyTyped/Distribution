package typings.ember.mod.default

import typings.ember.emberStrings.undefined
import typings.emberUtils.typesMod.TypeLookup
import typings.emberUtils.typesMod.TypeOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember", "typeOf")
@js.native
object typeOf extends js.Object {
  
  def apply(): undefined = js.native
  def apply(item: js.Any): java.lang.String = js.native
  def apply[T](value: T): TypeOf[TypeLookup, T] = js.native
}
