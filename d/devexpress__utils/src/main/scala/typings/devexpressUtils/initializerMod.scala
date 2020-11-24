package typings.devexpressUtils

import typings.devexpressUtils.anon.Set
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/class/initializer", JSImport.Namespace)
@js.native
object initializerMod extends js.Object {
  
  def Initialize[TOptions](options: TOptions): Set[TOptions] = js.native
  
  @js.native
  class Initializer () extends js.Object {
    
    def set[TProp /* <: Exclude[/* keyof this */ String, typings.devexpressUtils.devexpressUtilsStrings.set] */](
      property: TProp,
      value: /* import warning: importer.ImportType#apply Failed type conversion: this[TProp] */ js.Any
    ): this.type = js.native
  }
}
