package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VM extends StObject {
  
  /**
    * Gets a wrapper for the current thread's `JNIEnv`.
    *
    * Throws an exception if the current thread is not attached to the VM.
    */
  def getEnv(): Env
  
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * @param fn Function to run while attached to the VM.
    */
  def perform(fn: js.Function0[Unit]): Unit
  
  /**
    * Tries to get a wrapper for the current thread's `JNIEnv`.
    *
    * Returns `null` if the current thread is not attached to the VM.
    */
  def tryGetEnv(): Env | Null
}
object VM {
  
  inline def apply(getEnv: () => Env, perform: js.Function0[Unit] => Unit, tryGetEnv: () => Env | Null): VM = {
    val __obj = js.Dynamic.literal(getEnv = js.Any.fromFunction0(getEnv), perform = js.Any.fromFunction1(perform), tryGetEnv = js.Any.fromFunction0(tryGetEnv))
    __obj.asInstanceOf[VM]
  }
  
  extension [Self <: VM](x: Self) {
    
    inline def setGetEnv(value: () => Env): Self = StObject.set(x, "getEnv", js.Any.fromFunction0(value))
    
    inline def setPerform(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "perform", js.Any.fromFunction1(value))
    
    inline def setTryGetEnv(value: () => Env | Null): Self = StObject.set(x, "tryGetEnv", js.Any.fromFunction0(value))
  }
}
