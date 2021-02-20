package typings.googleCloudCommon.utilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abortable extends StObject {
  
  def abort(): Unit = js.native
}
object Abortable {
  
  @scala.inline
  def apply(abort: () => Unit): Abortable = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[Abortable]
  }
  
  @scala.inline
  implicit class AbortableMutableBuilder[Self <: Abortable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
  }
}
