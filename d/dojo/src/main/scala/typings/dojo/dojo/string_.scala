package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/string.html
  *
  * String utilities for Dojo
  *
  */
@js.native
trait string_ extends js.Object {
  /**
    * Pad a string to guarantee that it is at least size length by
    * filling with the character ch at either the start or end of the
    * string. Pads at the start, by default.
    *
    * @param text the string to pad
    * @param size length to provide padding
    * @param ch               Optionalcharacter to pad, defaults to '0'
    * @param end               Optionaladds padding at the end if true, otherwise pads at start
    */
  def pad(text: String, size: Double): Double = js.native
  def pad(text: String, size: Double, ch: String): Double = js.native
  def pad(text: String, size: Double, ch: String, end: Boolean): Double = js.native
  /**
    * Efficiently replicate a string n times.
    *
    * @param str the string to replicate
    * @param num number of times to replicate the string
    */
  def rep(str: String, num: Double): String = js.native
  /**
    * Performs parameterized substitutions on a string. Throws an
    * exception if any parameter is unmatched.
    *
    * @param template a string with expressions in the form ${key} to be replaced or${key:format} which specifies a format function. keys are case-sensitive.
    * @param map hash to search for substitutions
    * @param transform               Optionala function to process all parameters before substitution takesplace, e.g. mylib.encodeXML
    * @param thisObject               Optionalwhere to look for optional format function; default to the globalnamespace
    */
  def substitute(template: String, map: js.Array[_]): js.Any = js.native
  def substitute(template: String, map: js.Array[_], transform: js.Function): js.Any = js.native
  def substitute(template: String, map: js.Array[_], transform: js.Function, thisObject: js.Object): js.Any = js.native
  /**
    * Performs parameterized substitutions on a string. Throws an
    * exception if any parameter is unmatched.
    *
    * @param template a string with expressions in the form ${key} to be replaced or${key:format} which specifies a format function. keys are case-sensitive.
    * @param map hash to search for substitutions
    * @param transform               Optionala function to process all parameters before substitution takesplace, e.g. mylib.encodeXML
    * @param thisObject               Optionalwhere to look for optional format function; default to the globalnamespace
    */
  def substitute(template: String, map: js.Object): js.Any = js.native
  def substitute(template: String, map: js.Object, transform: js.Function): js.Any = js.native
  def substitute(template: String, map: js.Object, transform: js.Function, thisObject: js.Object): js.Any = js.native
  /**
    * Trims whitespace from both sides of the string
    * This version of trim() was taken from Steven Levithan's blog.
    * The short yet performant version of this function is dojo/_base/lang.trim(),
    * which is part of Dojo base.  Uses String.prototype.trim instead, if available.
    *
    * @param str String to be trimmed
    */
  def trim(str: String): String = js.native
}

