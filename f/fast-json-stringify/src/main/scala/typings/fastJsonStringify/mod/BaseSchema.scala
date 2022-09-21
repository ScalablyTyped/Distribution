package typings.fastJsonStringify.mod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSchema extends StObject {
  
  /**
    * Default value to be assigned when no value is given in the document
    */
  var default: js.UndefOr[Any] = js.undefined
  
  /**
    * A comment to be added to the schema
    */
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.undefined
  
  /**
    * Schema id
    */
  @JSName("$id")
  var $id: js.UndefOr[String] = js.undefined
  
  /**
    * A set of schemas which must all match
    */
  var allOf: js.UndefOr[js.Array[Partial[Schema]]] = js.undefined
  
  /**
    * A set of schemas of which at least one must match
    */
  var anyOf: js.UndefOr[js.Array[Partial[Schema]]] = js.undefined
  
  /**
    * Additional schema definition to reference from within the schema
    */
  var definitions: js.UndefOr[Record[String, Schema]] = js.undefined
  
  /**
    * Schema description
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A schema to apply if the conditional schema from `if` fails
    */
  var `else`: js.UndefOr[Partial[Schema]] = js.undefined
  
  /**
    * A list of example values that match this schema
    */
  var examples: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A conditional schema to check, controls schemas defined in `then` and `else`
    */
  var `if`: js.UndefOr[Partial[Schema]] = js.undefined
  
  /**
    * Open API 3.0 spec states that any value that can be null must be declared `nullable`
    * @default false
    */
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A schema to apply if the conditional schema from `if` passes
    */
  var `then`: js.UndefOr[Partial[Schema]] = js.undefined
  
  /**
    * Schema title
    */
  var title: js.UndefOr[String] = js.undefined
}
object BaseSchema {
  
  inline def apply(): BaseSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSchema]
  }
  
  extension [Self <: BaseSchema](x: Self) {
    
    inline def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
    
    inline def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
    
    inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
    
    inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
    
    inline def setAllOf(value: js.Array[Partial[Schema]]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
    
    inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
    
    inline def setAllOfVarargs(value: Partial[Schema]*): Self = StObject.set(x, "allOf", js.Array(value*))
    
    inline def setAnyOf(value: js.Array[Partial[Schema]]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
    
    inline def setAnyOfVarargs(value: Partial[Schema]*): Self = StObject.set(x, "anyOf", js.Array(value*))
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefinitions(value: Record[String, Schema]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setElse(value: Partial[Schema]): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
    
    inline def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
    
    inline def setExamples(value: js.Array[Any]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: Any*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setIf(value: Partial[Schema]): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setThen(value: Partial[Schema]): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
