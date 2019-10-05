package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object string_ {
  import typings.std.RegExp

  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/string/Builder.html
    *
    * A fast buffer for creating large strings.
    *
    * @param str       Optional
    */
  type Builder = js.Function1[/* str */ js.UndefOr[String], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/string/sprintf.html
    *
    *
    * @param format
    * @param filler
    */
  type sprintf = js.Function2[/* format */ String, /* filler */ js.Any, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/string/tokenize.html
    *
    * Split a string by a regular expression with the ability to capture the delimeters
    *
    * @param str
    * @param re
    * @param parseDelim       OptionalEach group (excluding the 0 group) is passed as a parameter. If the function returnsa value, it's added to the list of tokens.
    * @param instance       OptionalUsed as the "this" instance when calling parseDelim
    */
  type tokenize = js.Function4[
    /* str */ String, 
    /* re */ RegExp, 
    /* parseDelim */ js.UndefOr[js.Function], 
    /* instance */ js.UndefOr[js.Object], 
    Unit
  ]
}
