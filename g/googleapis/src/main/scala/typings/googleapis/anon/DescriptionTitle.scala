package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescriptionTitle extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object DescriptionTitle {
  
  @scala.inline
  def apply(): DescriptionTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionTitle]
  }
  
  @scala.inline
  implicit class DescriptionTitleMutableBuilder[Self <: DescriptionTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
