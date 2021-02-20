package typings.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxKeys extends StObject {
  
  var maxKeys: js.UndefOr[Double] = js.native
}
object MaxKeys {
  
  @scala.inline
  def apply(): MaxKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxKeys]
  }
  
  @scala.inline
  implicit class MaxKeysMutableBuilder[Self <: MaxKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
  }
}
