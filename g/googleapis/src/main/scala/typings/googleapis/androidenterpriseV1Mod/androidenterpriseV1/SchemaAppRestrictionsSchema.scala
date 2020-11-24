package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the list of app restrictions available to be pre-configured for
  * the product.
  */
@js.native
trait SchemaAppRestrictionsSchema extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#appRestrictionsSchema&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The set of restrictions that make up this schema.
    */
  var restrictions: js.UndefOr[js.Array[SchemaAppRestrictionsSchemaRestriction]] = js.native
}
object SchemaAppRestrictionsSchema {
  
  @scala.inline
  def apply(): SchemaAppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppRestrictionsSchema]
  }
  
  @scala.inline
  implicit class SchemaAppRestrictionsSchemaOps[Self <: SchemaAppRestrictionsSchema] (val x: Self) extends AnyVal {
    
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
    def setRestrictionsVarargs(value: SchemaAppRestrictionsSchemaRestriction*): Self = this.set("restrictions", js.Array(value :_*))
    
    @scala.inline
    def setRestrictions(value: js.Array[SchemaAppRestrictionsSchemaRestriction]): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
  }
}
