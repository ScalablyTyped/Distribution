package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubDocumentType with Double] = js.native
  /* 2 */ @js.native
  object Footer extends TopLevel[Footer with Double]
  
  /* 1 */ @js.native
  object Header extends TopLevel[Header with Double]
  
  /* 0 */ @js.native
  object Main extends TopLevel[Main with Double]
  
  /* 3 */ @js.native
  object TextBox extends TopLevel[TextBox with Double]
  
}

