package typings.emberRouting

import typings.emberRouting.anon.As
import typings.emberRouting.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerDslMod {
  
  @JSImport("@ember/routing/-private/router-dsl", JSImport.Default)
  @js.native
  class default protected () extends RouterDSL {
    def this(name: String, options: js.Object) = this()
  }
  
  @js.native
  trait RouterDSL extends StObject {
    
    def mount(name: String): Unit = js.native
    def mount(name: String, options: As): Unit = js.native
    
    def route(name: String): Unit = js.native
    def route(name: String, callback: js.ThisFunction0[/* this */ this.type, Unit]): Unit = js.native
    def route(
      name: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.ThisFunction0[/* this */ this.type, Unit]
    ): Unit = js.native
    def route(name: String, options: Path): Unit = js.native
    def route(name: String, options: Path, callback: js.ThisFunction0[/* this */ this.type, Unit]): Unit = js.native
  }
}
