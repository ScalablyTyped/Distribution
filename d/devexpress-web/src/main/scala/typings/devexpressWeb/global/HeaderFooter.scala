package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings defining a header or footer in a document.
  */
@JSGlobal("HeaderFooter")
@js.native
class HeaderFooter ()
  extends typings.devexpressWeb.HeaderFooter {
  /**
    * Provides access to an object implementing the basic document functionality that is common to the header, footer and the main document body.
    */
  /* CompleteClass */
  override val subDocument: typings.devexpressWeb.SubDocument = js.native
  /**
    * Gets the type of the header (footer).
    */
  /* CompleteClass */
  override val `type`: typings.devexpressWeb.HeaderFooterType = js.native
}

