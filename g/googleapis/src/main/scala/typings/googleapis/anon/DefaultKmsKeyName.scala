package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultKmsKeyName extends StObject {
  
  var defaultKmsKeyName: js.UndefOr[String] = js.native
}
object DefaultKmsKeyName {
  
  @scala.inline
  def apply(): DefaultKmsKeyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultKmsKeyName]
  }
  
  @scala.inline
  implicit class DefaultKmsKeyNameMutableBuilder[Self <: DefaultKmsKeyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultKmsKeyName(value: String): Self = StObject.set(x, "defaultKmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultKmsKeyNameUndefined: Self = StObject.set(x, "defaultKmsKeyName", js.undefined)
  }
}
