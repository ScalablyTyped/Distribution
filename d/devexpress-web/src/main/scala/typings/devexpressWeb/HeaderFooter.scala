package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings defining a header or footer in a document.
  */
trait HeaderFooter extends js.Object {
  /**
    * Provides access to an object implementing the basic document functionality that is common to the header, footer and the main document body.
    */
  val subDocument: SubDocument
  /**
    * Gets the type of the header (footer).
    */
  val `type`: HeaderFooterType
}

object HeaderFooter {
  @scala.inline
  def apply(subDocument: SubDocument, `type`: HeaderFooterType): HeaderFooter = {
    val __obj = js.Dynamic.literal(subDocument = subDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
}

