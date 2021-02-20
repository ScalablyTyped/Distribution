package typings.extjs.Ext.grid

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellContext extends IBase {
  
  /** [Property] (Boolean) */
  var isCellContext: js.UndefOr[Boolean] = js.native
}
object ICellContext {
  
  @scala.inline
  def apply(): ICellContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellContext]
  }
  
  @scala.inline
  implicit class ICellContextMutableBuilder[Self <: ICellContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCellContext(value: Boolean): Self = StObject.set(x, "isCellContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCellContextUndefined: Self = StObject.set(x, "isCellContext", js.undefined)
  }
}
