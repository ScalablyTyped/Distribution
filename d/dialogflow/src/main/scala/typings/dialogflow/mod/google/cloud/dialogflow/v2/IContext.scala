package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IStruct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Context. */
@js.native
trait IContext extends StObject {
  
  /** Context lifespanCount */
  var lifespanCount: js.UndefOr[Double | Null] = js.native
  
  /** Context name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** Context parameters */
  var parameters: js.UndefOr[IStruct | Null] = js.native
}
object IContext {
  
  @scala.inline
  def apply(): IContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContext]
  }
  
  @scala.inline
  implicit class IContextMutableBuilder[Self <: IContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifespanCount(value: Double): Self = StObject.set(x, "lifespanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifespanCountNull: Self = StObject.set(x, "lifespanCount", null)
    
    @scala.inline
    def setLifespanCountUndefined: Self = StObject.set(x, "lifespanCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: IStruct): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
