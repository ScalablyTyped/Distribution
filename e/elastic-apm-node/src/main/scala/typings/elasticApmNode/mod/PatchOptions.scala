package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchOptions extends StObject {
  
  var enabled: Boolean
  
  var version: js.UndefOr[String] = js.undefined
}
object PatchOptions {
  
  @scala.inline
  def apply(enabled: Boolean): PatchOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchOptions]
  }
  
  @scala.inline
  implicit class PatchOptionsMutableBuilder[Self <: PatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
