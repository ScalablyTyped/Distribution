package typings.fastJsonStringify

import typings.fastJsonStringify.anon.AllOf
import typings.fastJsonStringify.fastJsonStringifyStrings.`null`
import typings.fastJsonStringify.fastJsonStringifyStrings.`object`
import typings.fastJsonStringify.fastJsonStringifyStrings.array
import typings.fastJsonStringify.fastJsonStringifyStrings.boolean
import typings.fastJsonStringify.fastJsonStringifyStrings.integer
import typings.fastJsonStringify.fastJsonStringifyStrings.number
import typings.fastJsonStringify.fastJsonStringifyStrings.string
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: ArraySchema): js.Function1[/* doc */ js.Array[_], String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: ArraySchema, options: Options): js.Function1[/* doc */ js.Array[_], String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: BooleanSchema): js.Function1[/* doc */ Boolean, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: BooleanSchema, options: Options): js.Function1[/* doc */ Boolean, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: IntegerSchema): js.Function1[/* doc */ Double, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: IntegerSchema, options: Options): js.Function1[/* doc */ Double, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: NullSchema): js.Function1[/* doc */ Null, `null`] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: NullSchema, options: Options): js.Function1[/* doc */ Null, `null`] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: NumberSchema): js.Function1[/* doc */ Double, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: NumberSchema, options: Options): js.Function1[/* doc */ Double, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: ObjectSchema): js.Function1[/* doc */ js.Object, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: ObjectSchema, options: Options): js.Function1[/* doc */ js.Object, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: Schema): js.Function1[/* doc */ js.Object | js.Array[_] | String | Double | Boolean | Null, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: Schema, options: Options): js.Function1[/* doc */ js.Object | js.Array[_] | String | Double | Boolean | Null, String] = js.native
  /**
    * Build a stringify function using a schema of the documents that should be stringified
    * @param schema The schema used to stringify values
    * @param options The options to use (optional)
    */
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: StringSchema): js.Function1[/* doc */ String, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: StringSchema, options: Options): js.Function1[/* doc */ String, String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: TupleSchema): js.Function1[/* doc */ js.Array[_], String] = js.native
  @JSImport("fast-json-stringify", JSImport.Namespace)
  @js.native
  def apply(schema: TupleSchema, options: Options): js.Function1[/* doc */ js.Array[_], String] = js.native
  
  @js.native
  trait ArraySchema
    extends BaseSchema
       with Schema {
    
    /**
      * The schema for the items in the array
      */
    var items: Schema | js.Object = js.native
    
    var `type`: array = js.native
  }
  object ArraySchema {
    
    @scala.inline
    def apply(items: Schema | js.Object, `type`: array): ArraySchema = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArraySchema]
    }
    
    @scala.inline
    implicit class ArraySchemaMutableBuilder[Self <: ArraySchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: Schema | js.Object): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaseSchema extends StObject {
    
    /**
      * Default value to be assigned when no value is given in the document
      */
    var default: js.UndefOr[js.Any] = js.native
    
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
    implicit class BaseSchemaMutableBuilder[Self <: BaseSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
      
      @scala.inline
      def setAllOf(value: js.Array[Partial[Schema]]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      @scala.inline
      def setAllOfVarargs(value: Partial[Schema]*): Self = StObject.set(x, "allOf", js.Array(value :_*))
      
      @scala.inline
      def setAnyOf(value: js.Array[Partial[Schema]]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      @scala.inline
      def setAnyOfVarargs(value: Partial[Schema]*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefinitions(value: Record[String, Schema]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setElse(value: Partial[Schema]): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
      
      @scala.inline
      def setExamples(value: js.Array[_]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
      
      @scala.inline
      def setExamplesVarargs(value: js.Any*): Self = StObject.set(x, "examples", js.Array(value :_*))
      
      @scala.inline
      def setIf(value: Partial[Schema]): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      @scala.inline
      def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      @scala.inline
      def setThen(value: Partial[Schema]): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait BooleanSchema
    extends BaseSchema
       with Schema {
    
    var `type`: boolean = js.native
  }
  object BooleanSchema {
    
    @scala.inline
    def apply(`type`: boolean): BooleanSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BooleanSchema]
    }
    
    @scala.inline
    implicit class BooleanSchemaMutableBuilder[Self <: BooleanSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntegerSchema
    extends BaseSchema
       with Schema {
    
    var `type`: integer = js.native
  }
  object IntegerSchema {
    
    @scala.inline
    def apply(`type`: integer): IntegerSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntegerSchema]
    }
    
    @scala.inline
    implicit class IntegerSchemaMutableBuilder[Self <: IntegerSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NullSchema
    extends BaseSchema
       with Schema {
    
    var `type`: `null` = js.native
  }
  object NullSchema {
    
    @scala.inline
    def apply(`type`: `null`): NullSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NullSchema]
    }
    
    @scala.inline
    implicit class NullSchemaMutableBuilder[Self <: NullSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: `null`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NumberSchema
    extends BaseSchema
       with Schema {
    
    var `type`: number = js.native
  }
  object NumberSchema {
    
    @scala.inline
    def apply(`type`: number): NumberSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberSchema]
    }
    
    @scala.inline
    implicit class NumberSchemaMutableBuilder[Self <: NumberSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ObjectProperties = (Record[String, Partial[Schema]]) with AllOf
  
  @js.native
  trait ObjectSchema
    extends BaseSchema
       with Schema {
    
    /**
      * Specifies whether additional properties on the object are allowed, and optionally what schema they should
      * adhere to
      * @default false
      */
    var additionalProperties: js.UndefOr[Schema | Boolean] = js.native
    
    /**
      * Describe properties that have keys following a given pattern
      */
    var patternProperties: js.UndefOr[ObjectProperties] = js.native
    
    /**
      * Describe the properties of the object
      */
    var properties: js.UndefOr[ObjectProperties] = js.native
    
    /**
      * The required properties of the object
      */
    var required: js.UndefOr[js.Array[String]] = js.native
    
    var `type`: `object` = js.native
  }
  object ObjectSchema {
    
    @scala.inline
    def apply(`type`: `object`): ObjectSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectSchema]
    }
    
    @scala.inline
    implicit class ObjectSchemaMutableBuilder[Self <: ObjectSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProperties(value: Schema | Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setPatternProperties(value: ObjectProperties): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      @scala.inline
      def setProperties(value: ObjectProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      @scala.inline
      def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Configure Ajv, which is used to evaluate conditional schemas and combined (anyOf) schemas
      */
    var ajv: js.UndefOr[typings.ajv.mod.Options] = js.native
    
    /**
      * Optionally add an external definition to reference from your schema
      */
    var schema: js.UndefOr[Record[String, Schema]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjv(value: typings.ajv.mod.Options): Self = StObject.set(x, "ajv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjvUndefined: Self = StObject.set(x, "ajv", js.undefined)
      
      @scala.inline
      def setSchema(value: Record[String, Schema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  @js.native
  trait RefSchema extends Schema {
    
    /**
      * A json-pointer to a schema to use as a reference
      */
    @JSName("$ref")
    var $ref: String = js.native
  }
  object RefSchema {
    
    @scala.inline
    def apply($ref: String): RefSchema = {
      val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefSchema]
    }
    
    @scala.inline
    implicit class RefSchemaMutableBuilder[Self <: RefSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastJsonStringify.mod.RefSchema
    - typings.fastJsonStringify.mod.StringSchema
    - typings.fastJsonStringify.mod.IntegerSchema
    - typings.fastJsonStringify.mod.NumberSchema
    - typings.fastJsonStringify.mod.NullSchema
    - typings.fastJsonStringify.mod.BooleanSchema
    - typings.fastJsonStringify.mod.ArraySchema
    - typings.fastJsonStringify.mod.TupleSchema
    - typings.fastJsonStringify.mod.ObjectSchema
  */
  trait Schema extends StObject
  object Schema {
    
    @scala.inline
    def ArraySchema(items: Schema | js.Object, `type`: array): typings.fastJsonStringify.mod.ArraySchema = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonStringify.mod.ArraySchema]
    }
    
    @scala.inline
    def BooleanSchema(`type`: boolean): typings.fastJsonStringify.mod.BooleanSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonStringify.mod.BooleanSchema]
    }
    
    @scala.inline
    def IntegerSchema(`type`: integer): typings.fastJsonStringify.mod.IntegerSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonStringify.mod.IntegerSchema]
    }
    
    @scala.inline
    def NullSchema(`type`: `null`): typings.fastJsonStringify.mod.NullSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonStringify.mod.NullSchema]
    }
    
    @scala.inline
    def NumberSchema(`type`: number): typings.fastJsonStringify.mod.NumberSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonStringify.mod.NumberSchema]
    }
    
    @scala.inline
    def ObjectSchema(`type`: `object`): typings.fastJsonStringify.mod.ObjectSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonStringify.mod.ObjectSchema]
    }
    
    @scala.inline
    def RefSchema($ref: String): typings.fastJsonStringify.mod.RefSchema = {
      val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonStringify.mod.RefSchema]
    }
    
    @scala.inline
    def StringSchema(`type`: string): typings.fastJsonStringify.mod.StringSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonStringify.mod.StringSchema]
    }
    
    @scala.inline
    def TupleSchema(items: js.Array[Schema], `type`: array): typings.fastJsonStringify.mod.TupleSchema = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonStringify.mod.TupleSchema]
    }
  }
  
  @js.native
  trait StringSchema
    extends BaseSchema
       with Schema {
    
    var `type`: string = js.native
  }
  object StringSchema {
    
    @scala.inline
    def apply(`type`: string): StringSchema = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringSchema]
    }
    
    @scala.inline
    implicit class StringSchemaMutableBuilder[Self <: StringSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TupleSchema
    extends BaseSchema
       with Schema {
    
    /**
      * The schemas for the items in the tuple
      */
    var items: js.Array[Schema] = js.native
    
    var `type`: array = js.native
  }
  object TupleSchema {
    
    @scala.inline
    def apply(items: js.Array[Schema], `type`: array): TupleSchema = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TupleSchema]
    }
    
    @scala.inline
    implicit class TupleSchemaMutableBuilder[Self <: TupleSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[Schema]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Schema*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
