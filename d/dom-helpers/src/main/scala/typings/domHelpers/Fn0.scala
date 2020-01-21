package typings.domHelpers

import typings.domHelpers.typesMod.CamelProperty
import typings.domHelpers.typesMod.Property
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn0 extends js.Object {
  def apply(node: HTMLElement, property: Partial[Record[Property, String]]): Unit = js.native
  def apply[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any = js.native
}

