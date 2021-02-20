package typings.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typings.forgeDi.argumentsMod.Arguments
import typings.forgeDi.configMod.Config
import typings.forgeDi.inspectorMod.Inspector
import typings.forgeDi.modeMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forgeMod {
  
  @JSImport("forge-di/dist/Forge", JSImport.Default)
  @js.native
  class default () extends Forge {
    def this(config: Config) = this()
  }
  
  @js.native
  trait Forge extends StObject {
    
    def bind(name: String): typings.forgeDi.bindingMod.default = js.native
    
    var bindings: StringDictionary[js.Array[typings.forgeDi.bindingMod.default]] = js.native
    
    def get[T](name: String): T = js.native
    def get[T](name: String, hint: js.UndefOr[scala.Nothing], args: Arguments): T = js.native
    def get[T](name: String, hint: js.Any): T = js.native
    def get[T](name: String, hint: js.Any, args: Arguments): T = js.native
    
    def getAll[T](name: String): js.Array[T] = js.native
    def getAll[T](name: String, args: Arguments): js.Array[T] = js.native
    
    var getMatchingBindings: js.Any = js.native
    
    def getOne[T](name: String): T = js.native
    def getOne[T](name: String, hint: js.UndefOr[scala.Nothing], args: Arguments): T = js.native
    def getOne[T](name: String, hint: js.Any): T = js.native
    def getOne[T](name: String, hint: js.Any, args: Arguments): T = js.native
    
    def inspect(): String = js.native
    
    var inspector: Inspector = js.native
    
    def rebind(name: String): typings.forgeDi.bindingMod.default = js.native
    
    def resolve(name: String, context: typings.forgeDi.contextMod.default, hint: js.Any, args: Arguments): js.Any = js.native
    def resolve(
      name: String,
      context: typings.forgeDi.contextMod.default,
      hint: js.Any,
      args: Arguments,
      mode: Mode
    ): js.Any = js.native
    
    def unbind(name: String): Double = js.native
  }
}
