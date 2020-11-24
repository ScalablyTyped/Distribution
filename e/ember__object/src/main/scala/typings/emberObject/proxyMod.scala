package typings.emberObject

import typings.emberObject.typesMod.UnwrapComputedPropertyGetter
import typings.emberObject.typesMod.UnwrapComputedPropertyGetters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/object/proxy", JSImport.Namespace)
@js.native
object proxyMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : CoreObject.extend(Observable) * / any */ @js.native
  trait ObjectProxy[T /* <: js.Object */] extends js.Object {
    
    /**
      * The object whose properties will be forwarded.
      */
    var content: js.UndefOr[T] = js.native
    
    def get[K /* <: /* keyof this */ String */](key: K): UnwrapComputedPropertyGetter[
        /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
      ] = js.native
    
    def getProperties[K /* <: /* keyof this */ String */](list: K*): Pick[UnwrapComputedPropertyGetters[this.type], K] = js.native
    def getProperties[K /* <: /* keyof this */ String */](list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[this.type], K] = js.native
    
    @JSName("get")
    def get_K_String_Union[K /* <: /* keyof T */ String */](key: K): js.UndefOr[
        UnwrapComputedPropertyGetter[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  class default[T /* <: js.Object */] () extends ObjectProxy[T]
}
