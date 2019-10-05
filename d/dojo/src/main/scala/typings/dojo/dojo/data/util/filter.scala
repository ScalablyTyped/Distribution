package typings.dojo.dojo.data.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/data/util/filter.html
  *
  *
  */
@js.native
trait filter extends js.Object {
  /**
    * Helper function to convert a simple pattern to a regular expression for matching.
    * Returns a regular expression object that conforms to the defined conversion rules.
    * For example:
    *
    * ca   -> /^ca.$/
    * ca  -> /^.ca.$/
    * c\a  -> /^.c*a.*$/
    * c\a?  -> /^.c*a..*$/
    * and so on.
    *
    * @param pattern A simple matching pattern to convert that follows basic rules:Means match anything, so ca* means match anything starting with ca? Means match single character.  So, b?b will match to bob and bab, and so on.\ is an escape character.  So for example, * means do not treat  as a match, but literal character .To use a \ as a character in the string, it must be escaped.  So in the pattern it should berepresented by \ to be treated as an ordinary \ character instead of an escape.
    * @param ignoreCase               OptionalAn optional flag to indicate if the pattern matching should be treated as case-sensitive or not when comparingBy default, it is assumed case sensitive.
    */
  def patternToRegExp(pattern: String): js.Any = js.native
  def patternToRegExp(pattern: String, ignoreCase: Boolean): js.Any = js.native
}

