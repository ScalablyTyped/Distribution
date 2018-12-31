package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text node with attribution
  */
trait Annotation extends Element {
  /**
    * Contains extended information for property 'authorString'.
    */
  var _authorString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.undefined
  /**
    * Individual responsible for the annotation
    */
  var authorReference: js.UndefOr[Reference] = js.undefined
  /**
    * Individual responsible for the annotation
    */
  var authorString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The annotation  - text content
    */
  var text: java.lang.String
  /**
    * When the annotation was made
    */
  var time: js.UndefOr[dateTime] = js.undefined
}

