package typings.dockerode.anon

import typings.dockerode.dockerodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  var stream: `true`
}
object Stream {
  
  inline def apply(): Stream = {
    val __obj = js.Dynamic.literal(stream = true)
    __obj.asInstanceOf[Stream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
    
    inline def setStream(value: `true`): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
