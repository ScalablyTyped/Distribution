package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.manifestMod.StringBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidautoVerify extends StObject {
  
  @JSName("android:autoVerify")
  var androidColonautoVerify: js.UndefOr[StringBoolean] = js.undefined
  
  var `data-generated`: js.UndefOr[StringBoolean] = js.undefined
}
object AndroidautoVerify {
  
  inline def apply(): AndroidautoVerify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidautoVerify]
  }
  
  extension [Self <: AndroidautoVerify](x: Self) {
    
    inline def setAndroidColonautoVerify(value: StringBoolean): Self = StObject.set(x, "android:autoVerify", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonautoVerifyUndefined: Self = StObject.set(x, "android:autoVerify", js.undefined)
    
    inline def `setData-generated`(value: StringBoolean): Self = StObject.set(x, "data-generated", value.asInstanceOf[js.Any])
    
    inline def `setData-generatedUndefined`: Self = StObject.set(x, "data-generated", js.undefined)
  }
}
