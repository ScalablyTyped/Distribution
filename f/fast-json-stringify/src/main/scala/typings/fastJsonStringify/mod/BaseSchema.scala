package typings.fastJsonStringify.mod

import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseSchema extends js.Object {
  
  /**
    * A comment to be added to the schema
    */
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  
  /**
    * A set of schemas which must all match
    */
  var allOf: js.UndefOr[js.Array[Partial[Schema]]] = js.native
  
  /**
    * A set of schemas of which at least one must match
    */
  var anyOf: js.UndefOr[js.Array[Partial[Schema]]] = js.native
  
  /**
    * Default value to be assigned when no value is given in the document
    */
  var default: js.UndefOr[js.Any] = js.native
  
  /**
    * Additional schema definition to reference from within the schema
    */
  var definitions: js.UndefOr[Record[String, Schema]] = js.native
  
  /**
    * Schema description
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A schema to apply if the conditional schema from `if` fails
    */
  var `else`: js.UndefOr[Partial[Schema]] = js.native
  
  /**
    * A list of example values that match this schema
    */
  var examples: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * A conditional schema to check, controls schemas defined in `then` and `else`
    */
  var `if`: js.UndefOr[Partial[Schema]] = js.native
  
  /**
    * Open API 3.0 spec states that any value that can be null must be declared `nullable`
    * @default false
    */
  var nullable: js.UndefOr[Boolean] = js.native
  
  /**
    * A schema to apply if the conditional schema from `if` passes
    */
  var `then`: js.UndefOr[Partial[Schema]] = js.native
  
  /**
    * Schema title
    */
  var title: js.UndefOr[String] = js.native
}
object BaseSchema {
  
  @scala.inline
  def apply(): BaseSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSchema]
  }
  
  @scala.inline
  implicit class BaseSchemaOps[Self <: BaseSchema] (val x: Self) extends AnyVal {
    
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
    def set$comment(value: String): Self = this.set("$comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$comment: Self = this.set("$comment", js.undefined)
    
    @scala.inline
    def setAllOfVarargs(value: Partial[Schema]*): Self = this.set("allOf", js.Array(value :_*))
    
    @scala.inline
    def setAllOf(value: js.Array[Partial[Schema]]): Self = this.set("allOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllOf: Self = this.set("allOf", js.undefined)
    
    @scala.inline
    def setAnyOfVarargs(value: Partial[Schema]*): Self = this.set("anyOf", js.Array(value :_*))
    
    @scala.inline
    def setAnyOf(value: js.Array[Partial[Schema]]): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyOf: Self = this.set("anyOf", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDefinitions(value: Record[String, Schema]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setElse(value: Partial[Schema]): Self = this.set("else", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElse: Self = this.set("else", js.undefined)
    
    @scala.inline
    def setExamplesVarargs(value: js.Any*): Self = this.set("examples", js.Array(value :_*))
    
    @scala.inline
    def setExamples(value: js.Array[_]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    
    @scala.inline
    def setIf(value: Partial[Schema]): Self = this.set("if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf: Self = this.set("if", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    
    @scala.inline
    def setThen(value: Partial[Schema]): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
