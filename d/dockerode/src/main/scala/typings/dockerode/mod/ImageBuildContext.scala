package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBuildContext extends StObject {
  
  var context: String
  
  var src: js.Array[String]
}
object ImageBuildContext {
  
  @scala.inline
  def apply(context: String, src: js.Array[String]): ImageBuildContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBuildContext]
  }
  
  @scala.inline
  implicit class ImageBuildContextMutableBuilder[Self <: ImageBuildContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
  }
}
