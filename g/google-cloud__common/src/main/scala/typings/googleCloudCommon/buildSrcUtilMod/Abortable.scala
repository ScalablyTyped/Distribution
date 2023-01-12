package typings.googleCloudCommon.buildSrcUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abortable extends StObject {
  
  def abort(): Unit
}
object Abortable {
  
  inline def apply(abort: () => Unit): Abortable = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[Abortable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Abortable] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
  }
}
