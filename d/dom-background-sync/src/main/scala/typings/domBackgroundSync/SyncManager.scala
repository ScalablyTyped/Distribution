package typings.domBackgroundSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://wicg.github.io/background-sync/spec/#syncmanager
trait SyncManager extends StObject {
  
  def getTags(): js.Promise[js.Array[String]]
  
  def register(tag: String): js.Promise[Unit]
}
object SyncManager {
  
  inline def apply(getTags: () => js.Promise[js.Array[String]], register: String => js.Promise[Unit]): SyncManager = {
    val __obj = js.Dynamic.literal(getTags = js.Any.fromFunction0(getTags), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[SyncManager]
  }
  
  extension [Self <: SyncManager](x: Self) {
    
    inline def setGetTags(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getTags", js.Any.fromFunction0(value))
    
    inline def setRegister(value: String => js.Promise[Unit]): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
  }
}
