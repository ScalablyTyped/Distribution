package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeTemplatesScopedList extends StObject {
  
  /**
    * [Output Only] A list of node templates contained in this scope.
    */
  var nodeTemplates: js.UndefOr[js.Array[SchemaNodeTemplate]] = js.undefined
  
  /**
    * [Output Only] An informational warning that appears when the node
    * templates list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaNodeTemplatesScopedList {
  
  @scala.inline
  def apply(): SchemaNodeTemplatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTemplatesScopedList]
  }
  
  @scala.inline
  implicit class SchemaNodeTemplatesScopedListMutableBuilder[Self <: SchemaNodeTemplatesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeTemplates(value: js.Array[SchemaNodeTemplate]): Self = StObject.set(x, "nodeTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTemplatesUndefined: Self = StObject.set(x, "nodeTemplates", js.undefined)
    
    @scala.inline
    def setNodeTemplatesVarargs(value: SchemaNodeTemplate*): Self = StObject.set(x, "nodeTemplates", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
