package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletionFlag extends StObject {
  
  var deletionFlag: js.UndefOr[Boolean] = js.native
}
object DeletionFlag {
  
  @scala.inline
  def apply(): DeletionFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletionFlag]
  }
  
  @scala.inline
  implicit class DeletionFlagMutableBuilder[Self <: DeletionFlag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletionFlag(value: Boolean): Self = StObject.set(x, "deletionFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionFlagUndefined: Self = StObject.set(x, "deletionFlag", js.undefined)
  }
}
