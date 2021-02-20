package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A variable set is a key-value pair of EMM-provided placeholders and its
  * corresponding value, which is attributed to a user. For example, $FIRSTNAME
  * could be a placeholder, and its value could be Alice. Placeholders should
  * start with a &#39;$&#39; sign and should be alphanumeric only.
  */
@js.native
trait SchemaVariableSet extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#variableSet&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The placeholder string; defined by EMM.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * The value of the placeholder, specific to the user.
    */
  var userValue: js.UndefOr[String] = js.native
}
object SchemaVariableSet {
  
  @scala.inline
  def apply(): SchemaVariableSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariableSet]
  }
  
  @scala.inline
  implicit class SchemaVariableSetMutableBuilder[Self <: SchemaVariableSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setUserValue(value: String): Self = StObject.set(x, "userValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserValueUndefined: Self = StObject.set(x, "userValue", js.undefined)
  }
}
