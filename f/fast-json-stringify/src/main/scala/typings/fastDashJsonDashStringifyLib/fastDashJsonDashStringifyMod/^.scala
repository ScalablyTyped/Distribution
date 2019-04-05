package typings
package fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-stringify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.ArraySchema | fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.IntegerSchema | fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.NumberSchema | fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.TupleSchema
  ): js.Function1[/* doc */ js.Array[_], java.lang.String] = js.native
  def apply(
    schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.ArraySchema | fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.IntegerSchema | fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.NumberSchema | fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.TupleSchema,
    options: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.Options
  ): js.Function1[/* doc */ js.Array[_], java.lang.String] = js.native
  def apply(schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.BooleanSchema): js.Function1[/* doc */ scala.Boolean, java.lang.String] = js.native
  def apply(
    schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.BooleanSchema,
    options: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.Options
  ): js.Function1[/* doc */ scala.Boolean, java.lang.String] = js.native
  def apply(schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.NullSchema): js.Function1[
    /* doc */ scala.Null, 
    fastDashJsonDashStringifyLib.fastDashJsonDashStringifyLibStrings.`null`
  ] = js.native
  def apply(
    schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.NullSchema,
    options: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.Options
  ): js.Function1[
    /* doc */ scala.Null, 
    fastDashJsonDashStringifyLib.fastDashJsonDashStringifyLibStrings.`null`
  ] = js.native
  def apply(schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.ObjectSchema): js.Function1[/* doc */ js.Object, java.lang.String] = js.native
  def apply(
    schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.ObjectSchema,
    options: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.Options
  ): js.Function1[/* doc */ js.Object, java.lang.String] = js.native
  def apply(schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.Schema): js.Function1[
    /* doc */ js.Object | js.Array[_] | java.lang.String | scala.Double | scala.Boolean | scala.Null, 
    java.lang.String
  ] = js.native
  def apply(
    schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.Schema,
    options: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.Options
  ): js.Function1[
    /* doc */ js.Object | js.Array[_] | java.lang.String | scala.Double | scala.Boolean | scala.Null, 
    java.lang.String
  ] = js.native
  /**
    * Build a stringify function using a schema of the documents that should be stringified
    * @param schema The schema used to stringify values
    * @param options The options to use (optional)
    */
  def apply(schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.StringSchema): js.Function1[/* doc */ java.lang.String, java.lang.String] = js.native
  def apply(
    schema: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.StringSchema,
    options: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs.Options
  ): js.Function1[/* doc */ java.lang.String, java.lang.String] = js.native
}

