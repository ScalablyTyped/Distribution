package typings.googleCloudSpanner.anon

import typings.googleCloudSpanner.buildSrcDatabaseMod.IRestoreInfoTranslatedEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreInfo extends StObject {
  
  var restoreInfo: js.UndefOr[IRestoreInfoTranslatedEnum | Null] = js.undefined
}
object RestoreInfo {
  
  inline def apply(): RestoreInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreInfo]
  }
  
  extension [Self <: RestoreInfo](x: Self) {
    
    inline def setRestoreInfo(value: IRestoreInfoTranslatedEnum): Self = StObject.set(x, "restoreInfo", value.asInstanceOf[js.Any])
    
    inline def setRestoreInfoNull: Self = StObject.set(x, "restoreInfo", null)
    
    inline def setRestoreInfoUndefined: Self = StObject.set(x, "restoreInfo", js.undefined)
  }
}
