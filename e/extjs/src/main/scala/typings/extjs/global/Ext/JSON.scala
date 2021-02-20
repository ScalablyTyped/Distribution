package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.JSON")
@js.native
class JSON ()
  extends typings.extjs.Ext.JSON
/* static members */
object JSON {
  
  /** [Method] Decodes parses a JSON string to an object
    * @param json String The JSON string
    * @param safe Boolean True to return null, false to throw an exception if the JSON is invalid.
    * @returns Object The resulting object
    */
  @JSGlobal("Ext.JSON.decode")
  @js.native
  def decode(): js.Any = js.native
  @JSGlobal("Ext.JSON.decode")
  @js.native
  def decode(json: js.UndefOr[scala.Nothing], safe: Boolean): js.Any = js.native
  @JSGlobal("Ext.JSON.decode")
  @js.native
  def decode(json: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.JSON.decode")
  @js.native
  def decode(json: java.lang.String, safe: Boolean): js.Any = js.native
  
  /** [Method] Encodes an Object Array or other value
    * @param o Object The variable to encode
    * @returns String The JSON string
    */
  @JSGlobal("Ext.JSON.encode")
  @js.native
  def encode(): java.lang.String = js.native
  @JSGlobal("Ext.JSON.encode")
  @js.native
  def encode(o: js.Any): java.lang.String = js.native
  
  /** [Method] Encodes a Date
    * @param d Date The Date to encode
    * @returns String The string literal to use in a JSON string.
    */
  @JSGlobal("Ext.JSON.encodeDate")
  @js.native
  def encodeDate(): java.lang.String = js.native
  @JSGlobal("Ext.JSON.encodeDate")
  @js.native
  def encodeDate(d: js.Any): java.lang.String = js.native
  
  /** [Method] Encodes a String
    * @param s String The String to encode
    * @returns String The string literal to use in a JSON string.
    */
  @JSGlobal("Ext.JSON.encodeString")
  @js.native
  def encodeString(): java.lang.String = js.native
  @JSGlobal("Ext.JSON.encodeString")
  @js.native
  def encodeString(s: java.lang.String): java.lang.String = js.native
  
  /** [Method] The function which encode uses to encode all javascript values to their JSON representations when Ext USE_NATIVE_JSON
    * @param o Object Any javascript value to be converted to its JSON representation
    * @returns String The JSON representation of the passed value.
    */
  @JSGlobal("Ext.JSON.encodeValue")
  @js.native
  def encodeValue(): java.lang.String = js.native
  @JSGlobal("Ext.JSON.encodeValue")
  @js.native
  def encodeValue(o: js.Any): java.lang.String = js.native
}
