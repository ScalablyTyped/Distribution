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
trait Ru extends StObject {
  
  var activeTargetIds: Ee
  
  def dr(t: Any): Unit
  
  /**
    * Converts this entry into a JSON-encoded format we can use for WebStorage.
    * Does not encode `clientId` as it is part of the key in WebStorage.
    */ def hr(): String
  
  def lr(t: Any): Unit
}
object Ru {
  
  inline def apply(activeTargetIds: Ee, dr: Any => Unit, hr: () => String, lr: Any => Unit): Ru = {
    val __obj = js.Dynamic.literal(activeTargetIds = activeTargetIds.asInstanceOf[js.Any], dr = js.Any.fromFunction1(dr), hr = js.Any.fromFunction0(hr), lr = js.Any.fromFunction1(lr))
    __obj.asInstanceOf[Ru]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ru] (val x: Self) extends AnyVal {
    
    inline def setActiveTargetIds(value: Ee): Self = StObject.set(x, "activeTargetIds", value.asInstanceOf[js.Any])
    
    inline def setDr(value: Any => Unit): Self = StObject.set(x, "dr", js.Any.fromFunction1(value))
    
    inline def setHr(value: () => String): Self = StObject.set(x, "hr", js.Any.fromFunction0(value))
    
    inline def setLr(value: Any => Unit): Self = StObject.set(x, "lr", js.Any.fromFunction1(value))
  }
}
