package typings.extjs.Ext.util

import typings.extjs.Ext.data.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGrouper extends ISorter {
  
  /** [Method] Returns the value for grouping to be used
    * @param instance Ext.data.Model The Model instance
    * @returns String The group string for this model
    */
  var getGroupString: js.UndefOr[js.Function1[/* instance */ js.UndefOr[IModel], String]] = js.native
}
object IGrouper {
  
  @scala.inline
  def apply(): IGrouper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrouper]
  }
  
  @scala.inline
  implicit class IGrouperMutableBuilder[Self <: IGrouper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGroupString(value: /* instance */ js.UndefOr[IModel] => String): Self = StObject.set(x, "getGroupString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroupStringUndefined: Self = StObject.set(x, "getGroupString", js.undefined)
  }
}
