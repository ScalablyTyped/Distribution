package typings.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisregardComments extends StObject {
  
  var disregardComments: js.UndefOr[Boolean] = js.native
}
object DisregardComments {
  
  @scala.inline
  def apply(): DisregardComments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisregardComments]
  }
  
  @scala.inline
  implicit class DisregardCommentsMutableBuilder[Self <: DisregardComments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisregardComments(value: Boolean): Self = StObject.set(x, "disregardComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisregardCommentsUndefined: Self = StObject.set(x, "disregardComments", js.undefined)
  }
}
