package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Namespace
import typings.protobufjs.mod.IToJSONOptions
import typings.protobufjs.mod.ReflectionObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNamespaceArrayToJSON
  extends StObject
     with Instantiable1[/* name */ String, Namespace] {
  
  /**
    * Converts an array of reflection objects to JSON.
    * @param array Object array
    * @param [toJSONOptions] JSON conversion options
    * @returns JSON object or `undefined` when array is empty
    */
  def arrayToJSON(array: js.Array[ReflectionObject]): js.UndefOr[StringDictionary[Any]] = js.native
  def arrayToJSON(array: js.Array[ReflectionObject], toJSONOptions: IToJSONOptions): js.UndefOr[StringDictionary[Any]] = js.native
  
  /**
    * Constructs a namespace from JSON.
    * @param name Namespace name
    * @param json JSON object
    * @returns Created namespace
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: StringDictionary[Any]): typings.protobufjs.mod.Namespace = js.native
  
  /**
    * Tests if the specified id is reserved.
    * @param reserved Array of reserved ranges and names
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedId(reserved: js.Array[js.Array[Double] | String], id: Double): Boolean = js.native
  def isReservedId(reserved: Unit, id: Double): Boolean = js.native
  
  /**
    * Tests if the specified name is reserved.
    * @param reserved Array of reserved ranges and names
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedName(reserved: js.Array[js.Array[Double] | String], name: String): Boolean = js.native
  def isReservedName(reserved: Unit, name: String): Boolean = js.native
}
