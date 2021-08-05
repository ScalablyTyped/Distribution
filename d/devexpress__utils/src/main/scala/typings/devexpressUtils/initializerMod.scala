package typings.devexpressUtils

import typings.devexpressUtils.anon.Set
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializerMod {
  
  @JSImport("@devexpress/utils/lib/class/initializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Initialize[TOptions](options: TOptions): Set[TOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("Initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Set[TOptions]]
  
  @JSImport("@devexpress/utils/lib/class/initializer", "Initializer")
  @js.native
  class Initializer () extends StObject {
    
    def set[TProp /* <: Exclude[/* keyof this */ String, typings.devexpressUtils.devexpressUtilsStrings.set] */](
      property: TProp,
      value: /* import warning: importer.ImportType#apply Failed type conversion: this[TProp] */ js.Any
    ): this.type = js.native
  }
}
