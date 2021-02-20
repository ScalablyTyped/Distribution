package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterData extends StObject {
  
  var masterData: js.UndefOr[Double] = js.native
}
object MasterData {
  
  @scala.inline
  def apply(): MasterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterData]
  }
  
  @scala.inline
  implicit class MasterDataMutableBuilder[Self <: MasterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasterData(value: Double): Self = StObject.set(x, "masterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterDataUndefined: Self = StObject.set(x, "masterData", js.undefined)
  }
}
