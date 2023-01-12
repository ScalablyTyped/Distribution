package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.Android, 'versionCode'> */
trait PickAndroidversionCode extends StObject {
  
  var versionCode: js.UndefOr[Double] = js.undefined
}
object PickAndroidversionCode {
  
  inline def apply(): PickAndroidversionCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAndroidversionCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickAndroidversionCode] (val x: Self) extends AnyVal {
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
