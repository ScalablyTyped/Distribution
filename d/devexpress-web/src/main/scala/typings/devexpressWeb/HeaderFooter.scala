package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings defining a header or footer in a document.
  */
@js.native
trait HeaderFooter extends js.Object {
  /**
    * Provides access to an object implementing the basic document functionality that is common to the header, footer and the main document body.
    */
  val subDocument: SubDocument = js.native
  /**
    * Gets the type of the header (footer).
    */
  val `type`: HeaderFooterType = js.native
}

object HeaderFooter {
  @scala.inline
  def apply(subDocument: SubDocument, `type`: HeaderFooterType): HeaderFooter = {
    val __obj = js.Dynamic.literal(subDocument = subDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  @scala.inline
  implicit class HeaderFooterOps[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubDocument(value: SubDocument): Self = this.set("subDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: HeaderFooterType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

