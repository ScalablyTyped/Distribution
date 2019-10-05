package typings.dojo.dojox.string_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.string_.Builder")
@js.native
object Builder extends js.Object {
  /**
    *
    */
  var length: Double = js.native
  /**
    * Append all arguments to the end of the buffer
    *
    * @param s
    */
  type append = js.Function1[/* s */ js.Array[String], Unit]
  /**
    * Append an array of items to the internal buffer.
    *
    * @param strings
    */
  type appendArray = js.Function1[/* strings */ js.Array[js.Any], Unit]
  /**
    * Remove all characters from the buffer.
    *
    */
  type clear = js.Function0[Unit]
  /**
    * Alias for append.
    *
    * @param s
    */
  type concat = js.Function1[/* s */ js.Array[String], Unit]
  /**
    * Insert string str starting at index.
    *
    * @param index
    * @param str
    */
  type insert = js.Function2[/* index */ Double, /* str */ String, Unit]
  /**
    * Remove len characters starting at index start.  If len
    * is not provided, the end of the string is assumed.
    *
    * @param start
    * @param len               Optional
    */
  type remove = js.Function2[/* start */ Double, /* len */ Double, Unit]
  /**
    * Replace instances of one string with another in the buffer.
    *
    * @param oldStr
    * @param newStr
    */
  type replace = js.Function2[/* oldStr */ String, /* newStr */ String, Unit]
  /**
    * Return the string representation of the internal buffer.
    *
    */
  type toString = js.Function0[Unit]
}

