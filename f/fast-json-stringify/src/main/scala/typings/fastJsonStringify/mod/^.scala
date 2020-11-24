package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.`null`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-json-stringify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(schema: ArraySchema): js.Function1[/* doc */ js.Array[_], String] = js.native
  def apply(schema: ArraySchema, options: Options): js.Function1[/* doc */ js.Array[_], String] = js.native
  def apply(schema: BooleanSchema): js.Function1[/* doc */ Boolean, String] = js.native
  def apply(schema: BooleanSchema, options: Options): js.Function1[/* doc */ Boolean, String] = js.native
  def apply(schema: IntegerSchema): js.Function1[/* doc */ Double, String] = js.native
  def apply(schema: IntegerSchema, options: Options): js.Function1[/* doc */ Double, String] = js.native
  def apply(schema: NullSchema): js.Function1[/* doc */ Null, `null`] = js.native
  def apply(schema: NullSchema, options: Options): js.Function1[/* doc */ Null, `null`] = js.native
  def apply(schema: NumberSchema): js.Function1[/* doc */ Double, String] = js.native
  def apply(schema: NumberSchema, options: Options): js.Function1[/* doc */ Double, String] = js.native
  def apply(schema: ObjectSchema): js.Function1[/* doc */ js.Object, String] = js.native
  def apply(schema: ObjectSchema, options: Options): js.Function1[/* doc */ js.Object, String] = js.native
  def apply(schema: Schema): js.Function1[/* doc */ js.Object | js.Array[_] | String | Double | Boolean | Null, String] = js.native
  def apply(schema: Schema, options: Options): js.Function1[/* doc */ js.Object | js.Array[_] | String | Double | Boolean | Null, String] = js.native
  /**
    * Build a stringify function using a schema of the documents that should be stringified
    * @param schema The schema used to stringify values
    * @param options The options to use (optional)
    */
  def apply(schema: StringSchema): js.Function1[/* doc */ String, String] = js.native
  def apply(schema: StringSchema, options: Options): js.Function1[/* doc */ String, String] = js.native
  def apply(schema: TupleSchema): js.Function1[/* doc */ js.Array[_], String] = js.native
  def apply(schema: TupleSchema, options: Options): js.Function1[/* doc */ js.Array[_], String] = js.native
}
