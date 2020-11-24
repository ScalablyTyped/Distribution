package typings.emberObject.mod

import typings.emberObject.typesMod.UnwrapComputedPropertyGetter
import typings.emberObject.typesMod.UnwrapComputedPropertySetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/object", "set")
@js.native
object set extends js.Object {
  
  def apply[T, K /* <: /* keyof T */ String */](
    obj: T,
    key: K,
    value: UnwrapComputedPropertySetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
}
