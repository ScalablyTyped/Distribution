package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.String")
@js.native
class String ()
  extends typings.extjs.Ext.String
/* static members */
object String {
  
  /** [Method] Adds a set of character entity definitions to the set used by htmlEncode and htmlDecode
    * @param entities Object The set of character entities to add to the current definitions.
    */
  @JSGlobal("Ext.String.addCharacterEntities")
  @js.native
  def addCharacterEntities(): Unit = js.native
  @JSGlobal("Ext.String.addCharacterEntities")
  @js.native
  def addCharacterEntities(entities: js.Any): Unit = js.native
  
  /** [Method] Capitalize the given string
    * @param string String
    * @returns String
    */
  @JSGlobal("Ext.String.capitalize")
  @js.native
  def capitalize(): java.lang.String = js.native
  @JSGlobal("Ext.String.capitalize")
  @js.native
  def capitalize(string: java.lang.String): java.lang.String = js.native
  
  /** [Method] Converts a string of characters into a legal parse able JavaScript var name as long as the passed string contains at
    * @param s String A string to be converted into a var name.
    * @returns String A legal JavaScript var name.
    */
  @JSGlobal("Ext.String.createVarName")
  @js.native
  def createVarName(): java.lang.String = js.native
  @JSGlobal("Ext.String.createVarName")
  @js.native
  def createVarName(s: java.lang.String): java.lang.String = js.native
  
  /** [Method] Truncate a string and add an ellipsis  to the end if it exceeds the specified length
    * @param value String The string to truncate.
    * @param length Number The maximum length to allow before truncating.
    * @param word Boolean true to try to find a common word break.
    * @returns String The converted text.
    */
  @JSGlobal("Ext.String.ellipsis")
  @js.native
  def ellipsis(): java.lang.String = js.native
  @JSGlobal("Ext.String.ellipsis")
  @js.native
  def ellipsis(value: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], word: Boolean): java.lang.String = js.native
  @JSGlobal("Ext.String.ellipsis")
  @js.native
  def ellipsis(value: js.UndefOr[scala.Nothing], length: Double): java.lang.String = js.native
  @JSGlobal("Ext.String.ellipsis")
  @js.native
  def ellipsis(value: js.UndefOr[scala.Nothing], length: Double, word: Boolean): java.lang.String = js.native
  @JSGlobal("Ext.String.ellipsis")
  @js.native
  def ellipsis(value: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.ellipsis")
  @js.native
  def ellipsis(value: java.lang.String, length: js.UndefOr[scala.Nothing], word: Boolean): java.lang.String = js.native
  @JSGlobal("Ext.String.ellipsis")
  @js.native
  def ellipsis(value: java.lang.String, length: Double): java.lang.String = js.native
  @JSGlobal("Ext.String.ellipsis")
  @js.native
  def ellipsis(value: java.lang.String, length: Double, word: Boolean): java.lang.String = js.native
  
  /** [Method] Checks if a string ends with a substring
    * @param s String The original string
    * @param start String The substring to check
    * @param ignoreCase Boolean True to ignore the case in the comparison
    */
  @JSGlobal("Ext.String.endsWith")
  @js.native
  def endsWith(): Unit = js.native
  @JSGlobal("Ext.String.endsWith")
  @js.native
  def endsWith(s: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], ignoreCase: Boolean): Unit = js.native
  @JSGlobal("Ext.String.endsWith")
  @js.native
  def endsWith(s: js.UndefOr[scala.Nothing], start: java.lang.String): Unit = js.native
  @JSGlobal("Ext.String.endsWith")
  @js.native
  def endsWith(s: js.UndefOr[scala.Nothing], start: java.lang.String, ignoreCase: Boolean): Unit = js.native
  @JSGlobal("Ext.String.endsWith")
  @js.native
  def endsWith(s: java.lang.String): Unit = js.native
  @JSGlobal("Ext.String.endsWith")
  @js.native
  def endsWith(s: java.lang.String, start: js.UndefOr[scala.Nothing], ignoreCase: Boolean): Unit = js.native
  @JSGlobal("Ext.String.endsWith")
  @js.native
  def endsWith(s: java.lang.String, start: java.lang.String): Unit = js.native
  @JSGlobal("Ext.String.endsWith")
  @js.native
  def endsWith(s: java.lang.String, start: java.lang.String, ignoreCase: Boolean): Unit = js.native
  
  /** [Method] Escapes the passed string for  and
    * @param string String The string to escape
    * @returns String The escaped string
    */
  @JSGlobal("Ext.String.escape")
  @js.native
  def escape(): java.lang.String = js.native
  @JSGlobal("Ext.String.escape")
  @js.native
  def escape(string: java.lang.String): java.lang.String = js.native
  
  /** [Method] Escapes the passed string for use in a regular expression
    * @param string String
    * @returns String
    */
  @JSGlobal("Ext.String.escapeRegex")
  @js.native
  def escapeRegex(): java.lang.String = js.native
  @JSGlobal("Ext.String.escapeRegex")
  @js.native
  def escapeRegex(string: java.lang.String): java.lang.String = js.native
  
  /** [Method] Allows you to define a tokenized string and pass an arbitrary number of arguments to replace the tokens
    * @param string String The tokenized string to be formatted.
    * @param values Mixed... The values to replace tokens {0}, {1}, etc in order.
    * @returns String The formatted string.
    */
  @JSGlobal("Ext.String.format")
  @js.native
  def format(string: java.lang.String, values: js.Any*): java.lang.String = js.native
  
  /** [Method] Convert certain characters  amp lt  and from their HTML character equivalents
    * @param value String The string to decode.
    * @returns String The decoded text.
    */
  @JSGlobal("Ext.String.htmlDecode")
  @js.native
  def htmlDecode(): java.lang.String = js.native
  @JSGlobal("Ext.String.htmlDecode")
  @js.native
  def htmlDecode(value: java.lang.String): java.lang.String = js.native
  
  /** [Method] Convert certain characters  amp lt  and to their HTML character equivalents for literal display in web
    * @param value String The string to encode.
    * @returns String The encoded text.
    */
  @JSGlobal("Ext.String.htmlEncode")
  @js.native
  def htmlEncode(): java.lang.String = js.native
  @JSGlobal("Ext.String.htmlEncode")
  @js.native
  def htmlEncode(value: java.lang.String): java.lang.String = js.native
  
  /** [Method] Inserts a substring into a string
    * @param s String The original string.
    * @param value String The substring to insert.
    * @param index Number The index to insert the substring. Negative indexes will insert from the end of the string. Example: Ext.String.insert("abcdefg", "h", -1); // abcdefhg
    * @returns String The value with the inserted substring
    */
  @JSGlobal("Ext.String.insert")
  @js.native
  def insert(): java.lang.String = js.native
  @JSGlobal("Ext.String.insert")
  @js.native
  def insert(s: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], index: Double): java.lang.String = js.native
  @JSGlobal("Ext.String.insert")
  @js.native
  def insert(s: js.UndefOr[scala.Nothing], value: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.insert")
  @js.native
  def insert(s: js.UndefOr[scala.Nothing], value: java.lang.String, index: Double): java.lang.String = js.native
  @JSGlobal("Ext.String.insert")
  @js.native
  def insert(s: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.insert")
  @js.native
  def insert(s: java.lang.String, value: js.UndefOr[scala.Nothing], index: Double): java.lang.String = js.native
  @JSGlobal("Ext.String.insert")
  @js.native
  def insert(s: java.lang.String, value: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.insert")
  @js.native
  def insert(s: java.lang.String, value: java.lang.String, index: Double): java.lang.String = js.native
  
  /** [Method] Pads the left side of a string with a specified character
    * @param string String The original string.
    * @param size Number The total length of the output string.
    * @param character String The character with which to pad the original string.
    * @returns String The padded string.
    */
  @JSGlobal("Ext.String.leftPad")
  @js.native
  def leftPad(): java.lang.String = js.native
  @JSGlobal("Ext.String.leftPad")
  @js.native
  def leftPad(string: js.UndefOr[scala.Nothing], size: js.UndefOr[scala.Nothing], character: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.leftPad")
  @js.native
  def leftPad(string: js.UndefOr[scala.Nothing], size: Double): java.lang.String = js.native
  @JSGlobal("Ext.String.leftPad")
  @js.native
  def leftPad(string: js.UndefOr[scala.Nothing], size: Double, character: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.leftPad")
  @js.native
  def leftPad(string: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.leftPad")
  @js.native
  def leftPad(string: java.lang.String, size: js.UndefOr[scala.Nothing], character: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.leftPad")
  @js.native
  def leftPad(string: java.lang.String, size: Double): java.lang.String = js.native
  @JSGlobal("Ext.String.leftPad")
  @js.native
  def leftPad(string: java.lang.String, size: Double, character: java.lang.String): java.lang.String = js.native
  
  /** [Method] Returns a string with a specified number of repetitions a given string pattern
    * @param pattern String The pattern to repeat.
    * @param count Number The number of times to repeat the pattern (may be 0).
    * @param sep String An option string to separate each pattern.
    */
  @JSGlobal("Ext.String.repeat")
  @js.native
  def repeat(): Unit = js.native
  @JSGlobal("Ext.String.repeat")
  @js.native
  def repeat(pattern: js.UndefOr[scala.Nothing], count: js.UndefOr[scala.Nothing], sep: java.lang.String): Unit = js.native
  @JSGlobal("Ext.String.repeat")
  @js.native
  def repeat(pattern: js.UndefOr[scala.Nothing], count: Double): Unit = js.native
  @JSGlobal("Ext.String.repeat")
  @js.native
  def repeat(pattern: js.UndefOr[scala.Nothing], count: Double, sep: java.lang.String): Unit = js.native
  @JSGlobal("Ext.String.repeat")
  @js.native
  def repeat(pattern: java.lang.String): Unit = js.native
  @JSGlobal("Ext.String.repeat")
  @js.native
  def repeat(pattern: java.lang.String, count: js.UndefOr[scala.Nothing], sep: java.lang.String): Unit = js.native
  @JSGlobal("Ext.String.repeat")
  @js.native
  def repeat(pattern: java.lang.String, count: Double): Unit = js.native
  @JSGlobal("Ext.String.repeat")
  @js.native
  def repeat(pattern: java.lang.String, count: Double, sep: java.lang.String): Unit = js.native
  
  /** [Method] Resets the set of character entity definitions used by htmlEncode and htmlDecode back to the default state  */
  @JSGlobal("Ext.String.resetCharacterEntities")
  @js.native
  def resetCharacterEntities(): Unit = js.native
  
  /** [Method] Splits a string of space separated words into an array trimming as needed
    * @param words String/Array
    */
  @JSGlobal("Ext.String.splitWords")
  @js.native
  def splitWords(): Unit = js.native
  @JSGlobal("Ext.String.splitWords")
  @js.native
  def splitWords(words: js.Any): Unit = js.native
  
  /** [Method] Checks if a string starts with a substring
    * @param s String The original string
    * @param start String The substring to check
    * @param ignoreCase Boolean True to ignore the case in the comparison
    */
  @JSGlobal("Ext.String.startsWith")
  @js.native
  def startsWith(): Unit = js.native
  @JSGlobal("Ext.String.startsWith")
  @js.native
  def startsWith(s: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], ignoreCase: Boolean): Unit = js.native
  @JSGlobal("Ext.String.startsWith")
  @js.native
  def startsWith(s: js.UndefOr[scala.Nothing], start: java.lang.String): Unit = js.native
  @JSGlobal("Ext.String.startsWith")
  @js.native
  def startsWith(s: js.UndefOr[scala.Nothing], start: java.lang.String, ignoreCase: Boolean): Unit = js.native
  @JSGlobal("Ext.String.startsWith")
  @js.native
  def startsWith(s: java.lang.String): Unit = js.native
  @JSGlobal("Ext.String.startsWith")
  @js.native
  def startsWith(s: java.lang.String, start: js.UndefOr[scala.Nothing], ignoreCase: Boolean): Unit = js.native
  @JSGlobal("Ext.String.startsWith")
  @js.native
  def startsWith(s: java.lang.String, start: java.lang.String): Unit = js.native
  @JSGlobal("Ext.String.startsWith")
  @js.native
  def startsWith(s: java.lang.String, start: java.lang.String, ignoreCase: Boolean): Unit = js.native
  
  /** [Method] Utility function that allows you to easily switch a string between two alternating values
    * @param string String The current string.
    * @param value String The value to compare to the current string.
    * @param other String The new value to use if the string already equals the first value passed in.
    * @returns String The new value.
    */
  @JSGlobal("Ext.String.toggle")
  @js.native
  def toggle(): java.lang.String = js.native
  @JSGlobal("Ext.String.toggle")
  @js.native
  def toggle(string: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], other: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.toggle")
  @js.native
  def toggle(string: js.UndefOr[scala.Nothing], value: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.toggle")
  @js.native
  def toggle(string: js.UndefOr[scala.Nothing], value: java.lang.String, other: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.toggle")
  @js.native
  def toggle(string: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.toggle")
  @js.native
  def toggle(string: java.lang.String, value: js.UndefOr[scala.Nothing], other: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.toggle")
  @js.native
  def toggle(string: java.lang.String, value: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.toggle")
  @js.native
  def toggle(string: java.lang.String, value: java.lang.String, other: java.lang.String): java.lang.String = js.native
  
  /** [Method] Trims whitespace from either end of a string leaving spaces within the string intact
    * @param string String The string to trim.
    * @returns String The trimmed string.
    */
  @JSGlobal("Ext.String.trim")
  @js.native
  def trim(): java.lang.String = js.native
  @JSGlobal("Ext.String.trim")
  @js.native
  def trim(string: java.lang.String): java.lang.String = js.native
  
  /** [Method] Uncapitalize the given string
    * @param string String
    * @returns String
    */
  @JSGlobal("Ext.String.uncapitalize")
  @js.native
  def uncapitalize(): java.lang.String = js.native
  @JSGlobal("Ext.String.uncapitalize")
  @js.native
  def uncapitalize(string: java.lang.String): java.lang.String = js.native
  
  /** [Method] Appends content to the query string of a URL handling logic for whether to place a question mark or ampersand
    * @param url String The URL to append to.
    * @param string String The content to append to the URL.
    * @returns String The resulting URL
    */
  @JSGlobal("Ext.String.urlAppend")
  @js.native
  def urlAppend(): java.lang.String = js.native
  @JSGlobal("Ext.String.urlAppend")
  @js.native
  def urlAppend(url: js.UndefOr[scala.Nothing], string: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.urlAppend")
  @js.native
  def urlAppend(url: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.String.urlAppend")
  @js.native
  def urlAppend(url: java.lang.String, string: java.lang.String): java.lang.String = js.native
}
