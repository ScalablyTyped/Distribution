package typings.domHelpers

import typings.domHelpers.anon.PartialRecordPropertystri
import typings.domHelpers.typesMod.CamelProperty
import typings.domHelpers.typesMod.HyphenProperty
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/css", JSImport.Namespace)
@js.native
object cssMod extends js.Object {
  def default(node: HTMLElement, property: PartialRecordPropertystri): Unit = js.native
  def default[T /* <: HyphenProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string & {} | 0, string & {}>[T] */ js.Any = js.native
  @JSName("default")
  def default_T_CamelProperty[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string & {} | 0, string & {}>[T] */ js.Any = js.native
}

