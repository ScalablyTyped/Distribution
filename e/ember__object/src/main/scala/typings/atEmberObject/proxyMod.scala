package typings.atEmberObject

import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetter
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetters
import typings.atEmberObject.proxyMod.ObjectProxy
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/proxy", JSImport.Namespace)
@js.native
object proxyMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : CoreObject.extend(Observable) * / any */ @js.native
  trait ObjectProxy[T /* <: js.Object */] extends js.Object {
    /**
      * The object whose properties will be forwarded.
      */
    var content: js.UndefOr[T] = js.native
    def get[K /* <: String */](key: K): js.UndefOr[
        UnwrapComputedPropertyGetter[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ] = js.native
    def getProperties[K /* <: String */](list: K*): Pick[UnwrapComputedPropertyGetters[this.type], K] = js.native
    def getProperties[K /* <: String */](list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[this.type], K] = js.native
    @JSName("get")
    def get_K_String_UnwrapComputedPropertyGetter[K /* <: String */](key: K): UnwrapComputedPropertyGetter[
        /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
      ] = js.native
  }
  
  @js.native
  class default[T /* <: js.Object */] () extends ObjectProxy[T]
  
}

