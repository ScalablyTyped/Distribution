package typings.domDashHelpers

import typings.domDashHelpers.cjsTypesMod.CamelProperty
import typings.domDashHelpers.cjsTypesMod.HyphenProperty
import typings.domDashHelpers.cjsTypesMod.Property
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/css", JSImport.Namespace)
@js.native
object cjsCssMod extends js.Object {
  def default(node: HTMLElement, property: Partial[Record[Property, String]]): Unit = js.native
  def default[T /* <: HyphenProperty */](node: HTMLElement, property: T): /* import warning: ImportType.apply Failed type conversion: csstype.csstype.PropertiesHyphen<string | 0>[T] */ js.Any = js.native
  @JSName("default")
  def default_T_CamelProperty[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: ImportType.apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any = js.native
}

