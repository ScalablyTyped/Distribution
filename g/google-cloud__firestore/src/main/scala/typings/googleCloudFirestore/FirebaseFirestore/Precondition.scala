package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Precondition extends StObject {
  
  /**
    * If set, the last update time to enforce.
    */
  val lastUpdateTime: js.UndefOr[Timestamp] = js.native
}
object Precondition {
  
  @scala.inline
  def apply(): Precondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Precondition]
  }
  
  @scala.inline
  implicit class PreconditionMutableBuilder[Self <: Precondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
  }
}
