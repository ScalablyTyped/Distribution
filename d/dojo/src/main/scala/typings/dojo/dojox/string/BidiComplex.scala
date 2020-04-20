package typings.dojo.dojox.string

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/string/BidiComplex.html
  *
  *
  */
trait BidiComplex extends js.Object {
  /**
    * Attach key listeners to the INPUT field to accomodate dynamic complex BiDi expressions
    *
    * @param field
    * @param pattern
    */
  def attachInput(field: HTMLElement, pattern: String): Unit
  /**
    * Create the display string by adding the Unicode direction Markers
    *
    * @param str
    * @param pattern
    */
  def createDisplayString(str: String, pattern: String): Unit
  /**
    * removes all Unicode directional markers from the string
    *
    * @param str
    */
  def stripSpecialCharacters(str: js.Any): Unit
}

object BidiComplex {
  @scala.inline
  def apply(
    attachInput: (HTMLElement, String) => Unit,
    createDisplayString: (String, String) => Unit,
    stripSpecialCharacters: js.Any => Unit
  ): BidiComplex = {
    val __obj = js.Dynamic.literal(attachInput = js.Any.fromFunction2(attachInput), createDisplayString = js.Any.fromFunction2(createDisplayString), stripSpecialCharacters = js.Any.fromFunction1(stripSpecialCharacters))
    __obj.asInstanceOf[BidiComplex]
  }
}

