package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Generics
@js.native
trait AdWordsEntity extends StObject {
  
  var getEntityType: js.UndefOr[js.Function0[String]] = js.native
}
object AdWordsEntity {
  
  @scala.inline
  def apply(): AdWordsEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdWordsEntity]
  }
  
  @scala.inline
  implicit class AdWordsEntityMutableBuilder[Self <: AdWordsEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEntityTypeUndefined: Self = StObject.set(x, "getEntityType", js.undefined)
  }
}
