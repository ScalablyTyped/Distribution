package typings.goodStorage

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("good-storage", JSImport.Namespace)
  @js.native
  val ^ : Storage = js.native
  
  @js.native
  trait Storage extends StObject {
    
    def clear(): Unit = js.native
    
    def forEach(callback: js.Function0[Unit]): Unit = js.native
    
    def get(key: String): js.Any = js.native
    def get(key: String, `def`: js.Any): js.Any = js.native
    
    def getAll(): js.Any = js.native
    
    def has(key: String): Boolean = js.native
    
    def remove(key: String): Unit = js.native
    
    var session: Storage = js.native
    
    def set(key: String): js.Any = js.native
    def set(key: String, `val`: js.Any): js.Any = js.native
  }
  
  type _To = Storage
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Storage = ^
}
