package typings.ember.mod.Ember

import typings.emberObject.typesMod.UnwrapComputedPropertyGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.cacheFor")
@js.native
object cacheFor extends js.Object {
  def apply[T, K /* <: java.lang.String */](obj: T, key: K): js.UndefOr[
    UnwrapComputedPropertyGetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
}

