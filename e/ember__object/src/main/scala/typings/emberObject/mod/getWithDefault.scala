package typings.emberObject.mod

import typings.emberObject.typesMod.UnwrapComputedPropertyGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", "getWithDefault")
@js.native
object getWithDefault extends js.Object {
  def apply[T, K /* <: /* keyof T */ String */](
    obj: T,
    key: K,
    defaultValue: UnwrapComputedPropertyGetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
}

