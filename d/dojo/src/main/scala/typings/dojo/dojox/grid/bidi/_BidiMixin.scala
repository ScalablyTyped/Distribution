package typings.dojo.dojox.grid.bidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/bidi/_BidiMixin.html
  *
  * Module that deals with BIDI for Grid
  * There's a special need for displaying BIDI text in rtl direction in ltr GUI, or sometimes needed auto support.
  * "textDir" attribute should be set on Grid so that this class can be activated and responsible for text direction
  * Allowed values:
  * 1. "ltr"
  * 2. "rtl"
  * 3. "auto" - contextual the direction of a text defined by first strong letter.
  * By default the same as the page direction.
  *
  */
trait _BidiMixin extends js.Object

