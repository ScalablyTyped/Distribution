package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDeveloperComment extends StObject {
  
  /**
    * The last time at which this comment was updated.
    */
  var lastModified: js.UndefOr[SchemaTimestamp] = js.native
  
  /**
    * The content of the comment, i.e. reply body.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaDeveloperComment {
  
  @scala.inline
  def apply(): SchemaDeveloperComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeveloperComment]
  }
  
  @scala.inline
  implicit class SchemaDeveloperCommentMutableBuilder[Self <: SchemaDeveloperComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModified(value: SchemaTimestamp): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
