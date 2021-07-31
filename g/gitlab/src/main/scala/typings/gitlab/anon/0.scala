package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var projectId: String | Double
}
object `0` {
  
  @scala.inline
  def apply(projectId: String | Double): `0` = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String | Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
