package typings.expoXcpretty.anon

import typings.expoXcpretty.buildUtilsParsePodfileLockMod.ExternalSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var pod: String
  
  var source: ExternalSource
}
object Source {
  
  inline def apply(pod: String, source: ExternalSource): Source = {
    val __obj = js.Dynamic.literal(pod = pod.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setPod(value: String): Self = StObject.set(x, "pod", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ExternalSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
