package typings.emberObject

import typings.emberObject.emberObjectBooleans.`true`
import typings.emberObject.typesMod.UnwrapComputedPropertyGetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalsMod {
  
  @JSImport("@ember/object/internals", "cacheFor")
  @js.native
  def cacheFor[T, K /* <: /* keyof T */ String */](obj: T, key: K): js.UndefOr[
    UnwrapComputedPropertyGetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  
  @JSImport("@ember/object/internals", "copy")
  @js.native
  def copy(obj: js.Any): js.Any = js.native
  @JSImport("@ember/object/internals", "copy")
  @js.native
  def copy(obj: js.Any, deep: Boolean): js.Any = js.native
  @JSImport("@ember/object/internals", "copy")
  @js.native
  def copy_true[T](obj: T, deep: `true`): T = js.native
  
  @JSImport("@ember/object/internals", "guidFor")
  @js.native
  def guidFor(obj: js.Any): String = js.native
}
