package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Singleton[T] extends StObject {
  
  def get(id: String): T = js.native
}
object Singleton {
  
  @scala.inline
  def apply[T](get: String => T): Singleton[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Singleton[T]]
  }
  
  @scala.inline
  implicit class SingletonMutableBuilder[Self <: Singleton[_], T] (val x: Self with Singleton[T]) extends AnyVal {
    
    @scala.inline
    def setGet(value: String => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
