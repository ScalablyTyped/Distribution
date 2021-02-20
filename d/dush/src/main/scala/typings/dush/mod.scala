package typings.dush

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.dush.dushStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("dush", JSImport.Namespace)
  @js.native
  val ^ : DushStatic = js.native
  
  type DushStatic = js.Function0[Emitter]
  
  @js.native
  trait Emitter extends StObject {
    
    var _allEvents: js.Array[StringDictionary[js.Array[Handler]]] = js.native
    
    def emit(`type`: String, event: js.Any*): Emitter = js.native
    
    def off(`type`: String): Emitter = js.native
    def off(`type`: String, handler: Handler): Emitter = js.native
    def off(`type`: Asterisk): Emitter = js.native
    def off(`type`: Asterisk, handler: WildcardHandler): Emitter = js.native
    
    def on(`type`: String, handler: Handler): Emitter = js.native
    def on(`type`: Asterisk, handler: WildcardHandler): Emitter = js.native
    
    def once(`type`: String, handler: Handler): Emitter = js.native
    def once(`type`: Asterisk, handler: WildcardHandler): Emitter = js.native
    
    def use(plugin: js.Function2[/* app */ this.type, /* options */ js.Any, Unit]): Emitter = js.native
    def use(plugin: js.Function2[/* app */ this.type, /* options */ js.Any, Unit], options: js.Any): Emitter = js.native
  }
  
  type Handler = js.Function1[/* repeated */ js.Any, Unit]
  
  type WildcardHandler = js.Function2[/* type */ js.UndefOr[String], /* repeated */ js.Any, Unit]
  
  type _To = DushStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DushStatic = ^
}
