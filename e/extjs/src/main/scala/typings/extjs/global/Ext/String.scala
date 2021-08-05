package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.String")
@js.native
class String ()
  extends StObject
     with typings.extjs.Ext.String
/* static members */
object String {
  
  @JSGlobal("Ext.String")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Adds a set of character entity definitions to the set used by htmlEncode and htmlDecode
    * @param entities Object The set of character entities to add to the current definitions.
    */
  inline def addCharacterEntities(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCharacterEntities")().asInstanceOf[Unit]
  inline def addCharacterEntities(entities: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCharacterEntities")(entities.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Capitalize the given string
    * @param string String
    * @returns String
    */
  inline def capitalize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")().asInstanceOf[java.lang.String]
  inline def capitalize(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Converts a string of characters into a legal parse able JavaScript var name as long as the passed string contains at
    * @param s String A string to be converted into a var name.
    * @returns String A legal JavaScript var name.
    */
  inline def createVarName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createVarName")().asInstanceOf[java.lang.String]
  inline def createVarName(s: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createVarName")(s.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Truncate a string and add an ellipsis  to the end if it exceeds the specified length
    * @param value String The string to truncate.
    * @param length Number The maximum length to allow before truncating.
    * @param word Boolean true to try to find a common word break.
    * @returns String The converted text.
    */
  inline def ellipsis(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")().asInstanceOf[java.lang.String]
  inline def ellipsis(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def ellipsis(value: java.lang.String, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def ellipsis(value: java.lang.String, length: Double, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def ellipsis(value: java.lang.String, length: Unit, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def ellipsis(value: Unit, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def ellipsis(value: Unit, length: Double, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def ellipsis(value: Unit, length: Unit, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Checks if a string ends with a substring
    * @param s String The original string
    * @param start String The substring to check
    * @param ignoreCase Boolean True to ignore the case in the comparison
    */
  inline def endsWith(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")().asInstanceOf[Unit]
  inline def endsWith(s: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def endsWith(s: java.lang.String, start: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def endsWith(s: java.lang.String, start: java.lang.String, ignoreCase: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def endsWith(s: java.lang.String, start: Unit, ignoreCase: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def endsWith(s: Unit, start: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def endsWith(s: Unit, start: java.lang.String, ignoreCase: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def endsWith(s: Unit, start: Unit, ignoreCase: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Escapes the passed string for  and
    * @param string String The string to escape
    * @returns String The escaped string
    */
  inline def escape(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")().asInstanceOf[java.lang.String]
  inline def escape(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Escapes the passed string for use in a regular expression
    * @param string String
    * @returns String
    */
  inline def escapeRegex(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")().asInstanceOf[java.lang.String]
  inline def escapeRegex(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Allows you to define a tokenized string and pass an arbitrary number of arguments to replace the tokens
    * @param string String The tokenized string to be formatted.
    * @param values Mixed... The values to replace tokens {0}, {1}, etc in order.
    * @returns String The formatted string.
    */
  inline def format(string: java.lang.String, values: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(string.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Convert certain characters  amp lt  and from their HTML character equivalents
    * @param value String The string to decode.
    * @returns String The decoded text.
    */
  inline def htmlDecode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlDecode")().asInstanceOf[java.lang.String]
  inline def htmlDecode(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlDecode")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Convert certain characters  amp lt  and to their HTML character equivalents for literal display in web
    * @param value String The string to encode.
    * @returns String The encoded text.
    */
  inline def htmlEncode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncode")().asInstanceOf[java.lang.String]
  inline def htmlEncode(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncode")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Inserts a substring into a string
    * @param s String The original string.
    * @param value String The substring to insert.
    * @param index Number The index to insert the substring. Negative indexes will insert from the end of the string. Example: Ext.String.insert("abcdefg", "h", -1); // abcdefhg
    * @returns String The value with the inserted substring
    */
  inline def insert(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[java.lang.String]
  inline def insert(s: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(s.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def insert(s: java.lang.String, value: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(s.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def insert(s: java.lang.String, value: java.lang.String, index: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(s.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def insert(s: java.lang.String, value: Unit, index: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(s.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def insert(s: Unit, value: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(s.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def insert(s: Unit, value: java.lang.String, index: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(s.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def insert(s: Unit, value: Unit, index: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(s.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Pads the left side of a string with a specified character
    * @param string String The original string.
    * @param size Number The total length of the output string.
    * @param character String The character with which to pad the original string.
    * @returns String The padded string.
    */
  inline def leftPad(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")().asInstanceOf[java.lang.String]
  inline def leftPad(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def leftPad(string: java.lang.String, size: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def leftPad(string: java.lang.String, size: Double, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def leftPad(string: java.lang.String, size: Unit, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def leftPad(string: Unit, size: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def leftPad(string: Unit, size: Double, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def leftPad(string: Unit, size: Unit, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Returns a string with a specified number of repetitions a given string pattern
    * @param pattern String The pattern to repeat.
    * @param count Number The number of times to repeat the pattern (may be 0).
    * @param sep String An option string to separate each pattern.
    */
  inline def repeat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")().asInstanceOf[Unit]
  inline def repeat(pattern: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def repeat(pattern: java.lang.String, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repeat(pattern: java.lang.String, count: Double, sep: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repeat(pattern: java.lang.String, count: Unit, sep: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repeat(pattern: Unit, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repeat(pattern: Unit, count: Double, sep: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repeat(pattern: Unit, count: Unit, sep: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Resets the set of character entity definitions used by htmlEncode and htmlDecode back to the default state  */
  inline def resetCharacterEntities(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCharacterEntities")().asInstanceOf[Unit]
  
  /** [Method] Splits a string of space separated words into an array trimming as needed
    * @param words String/Array
    */
  inline def splitWords(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("splitWords")().asInstanceOf[Unit]
  inline def splitWords(words: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("splitWords")(words.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Checks if a string starts with a substring
    * @param s String The original string
    * @param start String The substring to check
    * @param ignoreCase Boolean True to ignore the case in the comparison
    */
  inline def startsWith(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")().asInstanceOf[Unit]
  inline def startsWith(s: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def startsWith(s: java.lang.String, start: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def startsWith(s: java.lang.String, start: java.lang.String, ignoreCase: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def startsWith(s: java.lang.String, start: Unit, ignoreCase: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def startsWith(s: Unit, start: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def startsWith(s: Unit, start: java.lang.String, ignoreCase: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def startsWith(s: Unit, start: Unit, ignoreCase: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(s.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Utility function that allows you to easily switch a string between two alternating values
    * @param string String The current string.
    * @param value String The value to compare to the current string.
    * @param other String The new value to use if the string already equals the first value passed in.
    * @returns String The new value.
    */
  inline def toggle(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[java.lang.String]
  inline def toggle(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def toggle(string: java.lang.String, value: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def toggle(string: java.lang.String, value: java.lang.String, other: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def toggle(string: java.lang.String, value: Unit, other: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def toggle(string: Unit, value: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def toggle(string: Unit, value: java.lang.String, other: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def toggle(string: Unit, value: Unit, other: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Trims whitespace from either end of a string leaving spaces within the string intact
    * @param string String The string to trim.
    * @returns String The trimmed string.
    */
  inline def trim(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")().asInstanceOf[java.lang.String]
  inline def trim(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Uncapitalize the given string
    * @param string String
    * @returns String
    */
  inline def uncapitalize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("uncapitalize")().asInstanceOf[java.lang.String]
  inline def uncapitalize(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("uncapitalize")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Appends content to the query string of a URL handling logic for whether to place a question mark or ampersand
    * @param url String The URL to append to.
    * @param string String The content to append to the URL.
    * @returns String The resulting URL
    */
  inline def urlAppend(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlAppend")().asInstanceOf[java.lang.String]
  inline def urlAppend(url: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlAppend")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def urlAppend(url: java.lang.String, string: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlAppend")(url.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def urlAppend(url: Unit, string: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlAppend")(url.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
