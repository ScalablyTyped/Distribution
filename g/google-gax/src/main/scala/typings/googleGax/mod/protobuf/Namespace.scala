package typings.googleGax.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IToJSONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "protobuf.Namespace")
@js.native
class Namespace protected ()
  extends typings.protobufjs.mod.Namespace {
  /**
    * Constructs a new namespace instance.
    * @param name Namespace name
    * @param [options] Declared options
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.Any]) = this()
}
/* static members */
object Namespace {
  
  @JSImport("google-gax", "protobuf.Namespace")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts an array of reflection objects to JSON.
    * @param array Object array
    * @param [toJSONOptions] JSON conversion options
    * @returns JSON object or `undefined` when array is empty
    */
  @scala.inline
  def arrayToJSON(array: js.Array[typings.protobufjs.mod.ReflectionObject]): js.UndefOr[StringDictionary[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToJSON")(array.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[StringDictionary[js.Any]]]
  @scala.inline
  def arrayToJSON(array: js.Array[typings.protobufjs.mod.ReflectionObject], toJSONOptions: IToJSONOptions): js.UndefOr[StringDictionary[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayToJSON")(array.asInstanceOf[js.Any], toJSONOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[StringDictionary[js.Any]]]
  
  /**
    * Constructs a namespace from JSON.
    * @param name Namespace name
    * @param json JSON object
    * @returns Created namespace
    * @throws {TypeError} If arguments are invalid
    */
  @scala.inline
  def fromJSON(name: String, json: StringDictionary[js.Any]): typings.protobufjs.mod.Namespace = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Namespace]
  
  /**
    * Tests if the specified id is reserved.
    * @param reserved Array of reserved ranges and names
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  @scala.inline
  def isReservedId(reserved: js.Array[js.Array[Double] | String], id: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReservedId")(reserved.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isReservedId(reserved: Unit, id: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReservedId")(reserved.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Tests if the specified name is reserved.
    * @param reserved Array of reserved ranges and names
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  @scala.inline
  def isReservedName(reserved: js.Array[js.Array[Double] | String], name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReservedName")(reserved.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isReservedName(reserved: Unit, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReservedName")(reserved.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
