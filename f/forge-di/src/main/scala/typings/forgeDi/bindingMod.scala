package typings.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typings.forgeDi.constructorMod.Constructor
import typings.forgeDi.lifecycleMod.Lifecycle
import typings.forgeDi.predicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingMod {
  
  @JSImport("forge-di/dist/framework/Binding", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Binding {
    def this(forge: typings.forgeDi.forgeMod.default, name: String) = this()
  }
  
  @js.native
  trait Binding extends StObject {
    
    var arguments: StringDictionary[Any] = js.native
    
    val as: this.type = js.native
    
    var forge: typings.forgeDi.forgeMod.default = js.native
    
    def function(target: js.Function): this.type = js.native
    
    def instance(target: Any): this.type = js.native
    
    var lifecycle: Lifecycle = js.native
    
    def matches(hint: Any): Boolean = js.native
    
    var name: String = js.native
    
    def predicate(hint: Any): Boolean = js.native
    @JSName("predicate")
    var predicate_Original: Predicate = js.native
    
    def resolve(context: Any, hint: Any): Any = js.native
    def resolve(context: Any, hint: Any, args: js.Object): Any = js.native
    
    var resolver: typings.forgeDi.resolverMod.default = js.native
    
    def singleton(): this.type = js.native
    
    val to: this.type = js.native
    
    def transient(): this.type = js.native
    
    def `type`(target: Constructor): this.type = js.native
    
    def when(condition: Any): this.type = js.native
    def when(condition: Predicate): this.type = js.native
    
    def `with`(args: Any): this.type = js.native
  }
}
