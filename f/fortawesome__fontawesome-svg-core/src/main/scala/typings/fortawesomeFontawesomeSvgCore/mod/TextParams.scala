package typings.fortawesomeFontawesomeSvgCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextParams extends Params {
  
  var transform: js.UndefOr[Transform] = js.native
}
object TextParams {
  
  @scala.inline
  def apply(): TextParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextParams]
  }
  
  @scala.inline
  implicit class TextParamsMutableBuilder[Self <: TextParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
