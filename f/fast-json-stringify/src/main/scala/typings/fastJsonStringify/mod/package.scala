package typings.fastJsonStringify.mod

import typings.fastJsonStringify.anon.Ajv
import typings.fastJsonStringify.anon.AllOf
import typings.fastJsonStringify.fastJsonStringifyStrings.`null`
import typings.fastJsonStringify.mod.^
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(schema: AnySchema): js.Function1[/* doc */ Any, Any] = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* doc */ Any, Any]]
/**
  * Build a stringify function using a schema of the documents that should be stringified
  * @param schema The schema used to stringify values
  * @param options The options to use (optional)
  */
inline def apply(schema: AnySchema, options: DebugOption): Ajv = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Ajv]
inline def apply(schema: AnySchema, options: DeprecateDebugOption): Ajv = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Ajv]
inline def apply(schema: AnySchema, options: Options): js.Function1[/* doc */ Any, Any] = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* doc */ Any, Any]]
inline def apply(schema: AnySchema, options: StandaloneOption): String = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def apply(schema: ArraySchema): js.Function1[/* doc */ js.Array[Any], String] = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* doc */ js.Array[Any], String]]
inline def apply(schema: ArraySchema, options: Options): js.Function1[/* doc */ js.Array[Any], String] = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* doc */ js.Array[Any], String]]
inline def apply(schema: BooleanSchema): js.Function1[/* doc */ Boolean, String] = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* doc */ Boolean, String]]
inline def apply(schema: BooleanSchema, options: Options): js.Function1[/* doc */ Boolean, String] = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* doc */ Boolean, String]]
inline def apply(schema: IntegerSchema): js.Function1[/* doc */ Double, String] = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* doc */ Double, String]]
inline def apply(schema: IntegerSchema, options: Options): js.Function1[/* doc */ Double, String] = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* doc */ Double, String]]
inline def apply(schema: NullSchema): js.Function1[/* doc */ Null, `null`] = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* doc */ Null, `null`]]
inline def apply(schema: NullSchema, options: Options): js.Function1[/* doc */ Null, `null`] = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* doc */ Null, `null`]]
inline def apply(schema: NumberSchema): js.Function1[/* doc */ Double, String] = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* doc */ Double, String]]
inline def apply(schema: NumberSchema, options: Options): js.Function1[/* doc */ Double, String] = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* doc */ Double, String]]
inline def apply(schema: ObjectSchema): js.Function1[/* doc */ js.Object, String] = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* doc */ js.Object, String]]
inline def apply(schema: ObjectSchema, options: Options): js.Function1[/* doc */ js.Object, String] = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* doc */ js.Object, String]]
inline def apply(schema: Schema): js.Function1[/* doc */ js.Object | js.Array[Any] | String | Double | Boolean | Null, String] = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* doc */ js.Object | js.Array[Any] | String | Double | Boolean | Null, String]]
inline def apply(schema: Schema, options: Options): js.Function1[/* doc */ js.Object | js.Array[Any] | String | Double | Boolean | Null, String] = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* doc */ js.Object | js.Array[Any] | String | Double | Boolean | Null, String]]
inline def apply(schema: StringSchema): js.Function1[/* doc */ String, String] = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* doc */ String, String]]
inline def apply(schema: StringSchema, options: Options): js.Function1[/* doc */ String, String] = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* doc */ String, String]]
inline def apply(schema: TupleSchema): js.Function1[/* doc */ js.Array[Any], String] = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* doc */ js.Array[Any], String]]
inline def apply(schema: TupleSchema, options: Options): js.Function1[/* doc */ js.Array[Any], String] = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* doc */ js.Array[Any], String]]

type AnySchema = BaseSchema

type ObjectProperties = (Record[String, Partial[Schema]]) & AllOf
