package typings.flowdoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.flowdoc.flowdocStrings.DOCUMENT
  - typings.flowdoc.flowdocStrings.PAGE
  - typings.flowdoc.flowdocStrings.SCREEN
  - typings.flowdoc.flowdocStrings.IMAGE
  - typings.flowdoc.flowdocStrings.RECT
  - typings.flowdoc.flowdocStrings.ELLIPSE
  - typings.flowdoc.flowdocStrings.DIAMOND
  - typings.flowdoc.flowdocStrings.HOTSPOT
  - typings.flowdoc.flowdocStrings.LAYER
*/
trait NodeType extends js.Object

object NodeType {
  @scala.inline
  def DIAMOND: typings.flowdoc.flowdocStrings.DIAMOND = this.cast("DIAMOND")
  @scala.inline
  def DOCUMENT: typings.flowdoc.flowdocStrings.DOCUMENT = this.cast("DOCUMENT")
  @scala.inline
  def ELLIPSE: typings.flowdoc.flowdocStrings.ELLIPSE = this.cast("ELLIPSE")
  @scala.inline
  def HOTSPOT: typings.flowdoc.flowdocStrings.HOTSPOT = this.cast("HOTSPOT")
  @scala.inline
  def IMAGE: typings.flowdoc.flowdocStrings.IMAGE = this.cast("IMAGE")
  @scala.inline
  def LAYER: typings.flowdoc.flowdocStrings.LAYER = this.cast("LAYER")
  @scala.inline
  def PAGE: typings.flowdoc.flowdocStrings.PAGE = this.cast("PAGE")
  @scala.inline
  def RECT: typings.flowdoc.flowdocStrings.RECT = this.cast("RECT")
  @scala.inline
  def SCREEN: typings.flowdoc.flowdocStrings.SCREEN = this.cast("SCREEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

