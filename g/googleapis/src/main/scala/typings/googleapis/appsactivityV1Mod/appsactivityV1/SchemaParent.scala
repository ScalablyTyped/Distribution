package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a parent object. For example, a folder in Drive
  * is a parent for all files within it.
  */
@js.native
trait SchemaParent extends StObject {
  
  /**
    * The parent&#39;s ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether this is the root folder.
    */
  var isRoot: js.UndefOr[Boolean] = js.native
  
  /**
    * The parent&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaParent {
  
  @scala.inline
  def apply(): SchemaParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParent]
  }
  
  @scala.inline
  implicit class SchemaParentMutableBuilder[Self <: SchemaParent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
