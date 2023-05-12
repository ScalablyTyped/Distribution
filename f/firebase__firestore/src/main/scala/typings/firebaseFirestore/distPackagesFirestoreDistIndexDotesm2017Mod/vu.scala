package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata state of the local client. Unlike `RemoteClientState`, this class is
  * mutable and keeps track of all pending mutations, which allows us to
  * update the range of pending mutation batch IDs as new mutations are added or
  * removed.
  *
  * The data in `LocalClientState` is not read from WebStorage and instead
  * updated via its instance methods. The updated state can be serialized via
  * `toWebStorageJSON()`.
  */
trait vu extends StObject {
  
  var activeTargetIds: Ee
  
  /**
    * Converts this entry into a JSON-encoded format we can use for WebStorage.
    * Does not encode `clientId` as it is part of the key in WebStorage.
    */ def ar(): String
  
  def hr(t: Any): Unit
  
  def lr(t: Any): Unit
}
object vu {
  
  inline def apply(activeTargetIds: Ee, ar: () => String, hr: Any => Unit, lr: Any => Unit): vu = {
    val __obj = js.Dynamic.literal(activeTargetIds = activeTargetIds.asInstanceOf[js.Any], ar = js.Any.fromFunction0(ar), hr = js.Any.fromFunction1(hr), lr = js.Any.fromFunction1(lr))
    __obj.asInstanceOf[vu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vu] (val x: Self) extends AnyVal {
    
    inline def setActiveTargetIds(value: Ee): Self = StObject.set(x, "activeTargetIds", value.asInstanceOf[js.Any])
    
    inline def setAr(value: () => String): Self = StObject.set(x, "ar", js.Any.fromFunction0(value))
    
    inline def setHr(value: Any => Unit): Self = StObject.set(x, "hr", js.Any.fromFunction1(value))
    
    inline def setLr(value: Any => Unit): Self = StObject.set(x, "lr", js.Any.fromFunction1(value))
  }
}
