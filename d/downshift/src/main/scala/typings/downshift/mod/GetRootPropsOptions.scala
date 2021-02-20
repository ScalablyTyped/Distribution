package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRootPropsOptions extends StObject {
  
  var refKey: String = js.native
}
object GetRootPropsOptions {
  
  @scala.inline
  def apply(refKey: String): GetRootPropsOptions = {
    val __obj = js.Dynamic.literal(refKey = refKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRootPropsOptions]
  }
  
  @scala.inline
  implicit class GetRootPropsOptionsMutableBuilder[Self <: GetRootPropsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
  }
}
