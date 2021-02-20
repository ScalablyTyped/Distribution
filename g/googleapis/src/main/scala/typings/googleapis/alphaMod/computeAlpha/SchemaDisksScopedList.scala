package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDisksScopedList extends StObject {
  
  /**
    * [Output Only] A list of disks contained in this scope.
    */
  var disks: js.UndefOr[js.Array[SchemaDisk]] = js.native
  
  /**
    * [Output Only] Informational warning which replaces the list of disks when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaDisksScopedList {
  
  @scala.inline
  def apply(): SchemaDisksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisksScopedList]
  }
  
  @scala.inline
  implicit class SchemaDisksScopedListMutableBuilder[Self <: SchemaDisksScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisks(value: js.Array[SchemaDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: SchemaDisk*): Self = StObject.set(x, "disks", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
