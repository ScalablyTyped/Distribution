package typings.flatpickr

import typings.flatpickr.flatpickrNumbers.`0`
import typings.flatpickr.flatpickrNumbers.`1`
import typings.flatpickr.flatpickrStrings.increment
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("flatpickr/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayify[T](obj: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def arrayify[T](obj: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def debounce[F /* <: js.Function */](func: F, wait: Double): js.ThisFunction0[/* this */ js.Function, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ js.Function, Unit]]
  @scala.inline
  def debounce[F /* <: js.Function */](func: F, wait: Double, immediate: Boolean): js.ThisFunction0[/* this */ js.Function, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ js.Function, Unit]]
  
  @scala.inline
  def int(bool: Boolean): `1` | `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("int")(bool.asInstanceOf[js.Any]).asInstanceOf[`1` | `0`]
  
  @scala.inline
  def pad(number: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def pad(number: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pad(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def pad(number: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait IncrementEvent
    extends StObject
       with MouseEvent {
    
    var delta: Double = js.native
    
    @JSName("type")
    var type_IncrementEvent: increment = js.native
  }
}
