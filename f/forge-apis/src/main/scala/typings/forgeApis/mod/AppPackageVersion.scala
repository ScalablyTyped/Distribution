package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppPackageVersion extends StObject {
  
  var version: js.UndefOr[Double] = js.undefined
}
object AppPackageVersion {
  
  @scala.inline
  def apply(): AppPackageVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppPackageVersion]
  }
  
  @scala.inline
  implicit class AppPackageVersionMutableBuilder[Self <: AppPackageVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
