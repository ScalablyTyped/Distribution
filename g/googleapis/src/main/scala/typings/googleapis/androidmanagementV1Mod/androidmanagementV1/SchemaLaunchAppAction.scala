package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action to launch an app.
  */
@js.native
trait SchemaLaunchAppAction extends StObject {
  
  /**
    * Package name of app to be launched
    */
  var packageName: js.UndefOr[String] = js.native
}
object SchemaLaunchAppAction {
  
  @scala.inline
  def apply(): SchemaLaunchAppAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchAppAction]
  }
  
  @scala.inline
  implicit class SchemaLaunchAppActionMutableBuilder[Self <: SchemaLaunchAppAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
