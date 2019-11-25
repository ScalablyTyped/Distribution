package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.figmaStrings.DOCUMENT
  - typings.figma.figmaStrings.PAGE
  - typings.figma.figmaStrings.SLICE
  - typings.figma.figmaStrings.FRAME
  - typings.figma.figmaStrings.GROUP
  - typings.figma.figmaStrings.COMPONENT
  - typings.figma.figmaStrings.INSTANCE
  - typings.figma.figmaStrings.BOOLEAN_OPERATION
  - typings.figma.figmaStrings.VECTOR
  - typings.figma.figmaStrings.STAR
  - typings.figma.figmaStrings.LINE
  - typings.figma.figmaStrings.ELLIPSE
  - typings.figma.figmaStrings.POLYGON
  - typings.figma.figmaStrings.RECTANGLE
  - typings.figma.figmaStrings.TEXT
*/
trait NodeType extends js.Object

object NodeType {
  @scala.inline
  def BOOLEAN_OPERATION: typings.figma.figmaStrings.BOOLEAN_OPERATION = this.cast("BOOLEAN_OPERATION")
  @scala.inline
  def COMPONENT: typings.figma.figmaStrings.COMPONENT = this.cast("COMPONENT")
  @scala.inline
  def DOCUMENT: typings.figma.figmaStrings.DOCUMENT = this.cast("DOCUMENT")
  @scala.inline
  def ELLIPSE: typings.figma.figmaStrings.ELLIPSE = this.cast("ELLIPSE")
  @scala.inline
  def FRAME: typings.figma.figmaStrings.FRAME = this.cast("FRAME")
  @scala.inline
  def GROUP: typings.figma.figmaStrings.GROUP = this.cast("GROUP")
  @scala.inline
  def INSTANCE: typings.figma.figmaStrings.INSTANCE = this.cast("INSTANCE")
  @scala.inline
  def LINE: typings.figma.figmaStrings.LINE = this.cast("LINE")
  @scala.inline
  def PAGE: typings.figma.figmaStrings.PAGE = this.cast("PAGE")
  @scala.inline
  def POLYGON: typings.figma.figmaStrings.POLYGON = this.cast("POLYGON")
  @scala.inline
  def RECTANGLE: typings.figma.figmaStrings.RECTANGLE = this.cast("RECTANGLE")
  @scala.inline
  def SLICE: typings.figma.figmaStrings.SLICE = this.cast("SLICE")
  @scala.inline
  def STAR: typings.figma.figmaStrings.STAR = this.cast("STAR")
  @scala.inline
  def TEXT: typings.figma.figmaStrings.TEXT = this.cast("TEXT")
  @scala.inline
  def VECTOR: typings.figma.figmaStrings.VECTOR = this.cast("VECTOR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

