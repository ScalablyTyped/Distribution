package typings.expoConfigureSplashScreen.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertContent extends StObject {
  
  var insertContent: String
  
  var insertPattern: RegExp | String
}
object InsertContent {
  
  @scala.inline
  def apply(insertContent: String, insertPattern: RegExp | String): InsertContent = {
    val __obj = js.Dynamic.literal(insertContent = insertContent.asInstanceOf[js.Any], insertPattern = insertPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertContent]
  }
  
  @scala.inline
  implicit class InsertContentMutableBuilder[Self <: InsertContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertContent(value: String): Self = StObject.set(x, "insertContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPattern(value: RegExp | String): Self = StObject.set(x, "insertPattern", value.asInstanceOf[js.Any])
  }
}
