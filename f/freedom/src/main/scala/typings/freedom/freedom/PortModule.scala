package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortModule[T, T2]
  extends StObject
     with OnAndEmit[T, T2] {
  
  var controlChannel: String
}
object PortModule {
  
  @scala.inline
  def apply[T, T2](
    controlChannel: String,
    emit: (/* eventType */ String, /* value */ js.UndefOr[T2]) => Unit,
    on: (/* eventType */ String, /* handler */ js.Function1[T, Unit]) => Unit
  ): PortModule[T, T2] = {
    val __obj = js.Dynamic.literal(controlChannel = controlChannel.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[PortModule[T, T2]]
  }
  
  @scala.inline
  implicit class PortModuleMutableBuilder[Self <: PortModule[?, ?], T, T2] (val x: Self & (PortModule[T, T2])) extends AnyVal {
    
    @scala.inline
    def setControlChannel(value: String): Self = StObject.set(x, "controlChannel", value.asInstanceOf[js.Any])
  }
}
