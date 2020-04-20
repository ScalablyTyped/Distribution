package typings.emberObject

import typings.emberObject.emberObjectBooleans.`true`
import typings.emberObject.typesMod.UnwrapComputedPropertyGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/internals", JSImport.Namespace)
@js.native
object internalsMod extends js.Object {
  def cacheFor[T, K /* <: /* keyof T */ String */](obj: T, key: K): js.UndefOr[
    UnwrapComputedPropertyGetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  def copy(obj: js.Any): js.Any = js.native
  def copy(obj: js.Any, deep: Boolean): js.Any = js.native
  @JSName("copy")
  def copy_true[T](obj: T, deep: `true`): T = js.native
  def guidFor(obj: js.Any): String = js.native
}

