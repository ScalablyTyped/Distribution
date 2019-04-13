package typings
package fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-stringify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(schema: ArraySchema | IntegerSchema | NumberSchema | TupleSchema): js.Function1[/* doc */ js.Array[_], java.lang.String] = js.native
  def apply(schema: ArraySchema | IntegerSchema | NumberSchema | TupleSchema, options: Options): js.Function1[/* doc */ js.Array[_], java.lang.String] = js.native
  def apply(schema: BooleanSchema): js.Function1[/* doc */ scala.Boolean, java.lang.String] = js.native
  def apply(schema: BooleanSchema, options: Options): js.Function1[/* doc */ scala.Boolean, java.lang.String] = js.native
  def apply(schema: NullSchema): js.Function1[
    /* doc */ scala.Null, 
    fastDashJsonDashStringifyLib.fastDashJsonDashStringifyLibStrings.`null`
  ] = js.native
  def apply(schema: NullSchema, options: Options): js.Function1[
    /* doc */ scala.Null, 
    fastDashJsonDashStringifyLib.fastDashJsonDashStringifyLibStrings.`null`
  ] = js.native
  def apply(schema: ObjectSchema): js.Function1[/* doc */ js.Object, java.lang.String] = js.native
  def apply(schema: ObjectSchema, options: Options): js.Function1[/* doc */ js.Object, java.lang.String] = js.native
  def apply(schema: Schema): js.Function1[
    /* doc */ js.Object | js.Array[_] | java.lang.String | scala.Double | scala.Boolean | scala.Null, 
    java.lang.String
  ] = js.native
  def apply(schema: Schema, options: Options): js.Function1[
    /* doc */ js.Object | js.Array[_] | java.lang.String | scala.Double | scala.Boolean | scala.Null, 
    java.lang.String
  ] = js.native
  /**
    * Build a stringify function using a schema of the documents that should be stringified
    * @param schema The schema used to stringify values
    * @param options The options to use (optional)
    */
  def apply(schema: StringSchema): js.Function1[/* doc */ java.lang.String, java.lang.String] = js.native
  def apply(schema: StringSchema, options: Options): js.Function1[/* doc */ java.lang.String, java.lang.String] = js.native
}

