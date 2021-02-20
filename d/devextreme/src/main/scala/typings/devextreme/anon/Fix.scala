package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fix extends StObject {
  
  var fix: js.UndefOr[String] = js.native
  
  var leftPosition: js.UndefOr[String] = js.native
  
  var rightPosition: js.UndefOr[String] = js.native
  
  var unfix: js.UndefOr[String] = js.native
}
object Fix {
  
  @scala.inline
  def apply(): Fix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fix]
  }
  
  @scala.inline
  implicit class FixMutableBuilder[Self <: Fix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFix(value: String): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
    
    @scala.inline
    def setLeftPosition(value: String): Self = StObject.set(x, "leftPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftPositionUndefined: Self = StObject.set(x, "leftPosition", js.undefined)
    
    @scala.inline
    def setRightPosition(value: String): Self = StObject.set(x, "rightPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightPositionUndefined: Self = StObject.set(x, "rightPosition", js.undefined)
    
    @scala.inline
    def setUnfix(value: String): Self = StObject.set(x, "unfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfixUndefined: Self = StObject.set(x, "unfix", js.undefined)
  }
}
