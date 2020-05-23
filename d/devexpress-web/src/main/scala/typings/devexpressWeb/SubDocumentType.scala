package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubDocumentType extends js.Object

/**
  * Lists values specifying the sub-document type.
  */
@JSGlobal("SubDocumentType")
@js.native
object SubDocumentType extends js.Object {
  /**
    * A footer.
    */
  @js.native
  sealed trait Footer extends SubDocumentType
  
  /**
    * A header.
    */
  @js.native
  sealed trait Header extends SubDocumentType
  
  /**
    * The main document body.
    */
  @js.native
  sealed trait Main extends SubDocumentType
  
  /**
    * A text box.
    */
  @js.native
  sealed trait TextBox extends SubDocumentType
  
}

