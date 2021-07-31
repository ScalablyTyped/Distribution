package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ExtendedSourceContext is a SourceContext combined with additional
  * details describing the context.
  */
trait SchemaExtendedSourceContext extends StObject {
  
  /**
    * Any source context.
    */
  var context: js.UndefOr[SchemaSourceContext] = js.undefined
  
  /**
    * Labels with user defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaExtendedSourceContext {
  
  @scala.inline
  def apply(): SchemaExtendedSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedSourceContext]
  }
  
  @scala.inline
  implicit class SchemaExtendedSourceContextMutableBuilder[Self <: SchemaExtendedSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: SchemaSourceContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
