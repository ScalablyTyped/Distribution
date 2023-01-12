package typings.dockerode.anon

import typings.dockerode.dockerodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oneshot extends StObject {
  
  var `one-shot`: js.UndefOr[Boolean] = js.undefined
  
  var stream: js.UndefOr[`false`] = js.undefined
}
object Oneshot {
  
  inline def apply(): Oneshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Oneshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Oneshot] (val x: Self) extends AnyVal {
    
    inline def `setOne-shot`(value: Boolean): Self = StObject.set(x, "one-shot", value.asInstanceOf[js.Any])
    
    inline def `setOne-shotUndefined`: Self = StObject.set(x, "one-shot", js.undefined)
    
    inline def setStream(value: `false`): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
