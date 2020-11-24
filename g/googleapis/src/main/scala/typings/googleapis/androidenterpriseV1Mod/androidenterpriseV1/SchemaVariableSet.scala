package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

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
trait SchemaVariableSet extends js.Object {
  
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
  implicit class SchemaVariableSetOps[Self <: SchemaVariableSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setUserValue(value: String): Self = this.set("userValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserValue: Self = this.set("userValue", js.undefined)
  }
}
