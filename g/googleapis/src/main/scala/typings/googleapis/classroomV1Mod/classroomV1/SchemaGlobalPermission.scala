package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global user permission description.
  */
@js.native
trait SchemaGlobalPermission extends StObject {
  
  /**
    * Permission value.
    */
  var permission: js.UndefOr[String] = js.native
}
object SchemaGlobalPermission {
  
  @scala.inline
  def apply(): SchemaGlobalPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlobalPermission]
  }
  
  @scala.inline
  implicit class SchemaGlobalPermissionMutableBuilder[Self <: SchemaGlobalPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
