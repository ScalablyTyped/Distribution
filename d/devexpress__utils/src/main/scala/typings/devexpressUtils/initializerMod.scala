package typings.devexpressUtils

import typings.devexpressUtils.anon.Set
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializerMod {
  
  @JSImport("@devexpress/utils/lib/class/initializer", "Initialize")
  @js.native
  def Initialize[TOptions](options: TOptions): Set[TOptions] = js.native
  
  @JSImport("@devexpress/utils/lib/class/initializer", "Initializer")
  @js.native
  class Initializer () extends StObject {
    
    def set[TProp /* <: Exclude[/* keyof this */ String, typings.devexpressUtils.devexpressUtilsStrings.set] */](
      property: TProp,
      value: /* import warning: importer.ImportType#apply Failed type conversion: this[TProp] */ js.Any
    ): this.type = js.native
  }
}
