package typings.domBackgroundSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("SyncEvent")
  @js.native
  open class SyncEvent protected ()
    extends StObject
       with typings.domBackgroundSync.SyncEvent {
    def this(`type`: String) = this()
    def this(`type`: String, init: SyncEventInit) = this()
    
    /* CompleteClass */
    override val lastChance: Boolean = js.native
    
    /* CompleteClass */
    override val tag: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("SyncManager")
  @js.native
  open class SyncManager ()
    extends StObject
       with typings.domBackgroundSync.SyncManager {
    
    /* CompleteClass */
    override def getTags(): js.Promise[js.Array[String]] = js.native
    
    /* CompleteClass */
    override def register(tag: String): js.Promise[Unit] = js.native
  }
}
