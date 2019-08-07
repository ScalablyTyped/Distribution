package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings defining a header or footer in a document.
  */
@JSGlobal("HeaderFooter")
@js.native
class HeaderFooter () extends js.Object {
  /**
    * Provides access to an object implementing the basic document functionality that is common to the header, footer and the main document body.
    */
  val subDocument: SubDocument = js.native
  /**
    * Gets the type of the header (footer).
    */
  val `type`: HeaderFooterType = js.native
}

