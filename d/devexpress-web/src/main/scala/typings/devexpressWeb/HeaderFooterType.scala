package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeaderFooterType extends js.Object
/**
  * Lists the header/footer types.
  */
@JSGlobal("HeaderFooterType")
@js.native
object HeaderFooterType extends js.Object {
  
  /**
    * A header/footer displayed on even pages of the section.
    */
  @js.native
  sealed trait Even extends HeaderFooterType
  
  /**
    * A header/footer displayed on the first page of the section.
    */
  @js.native
  sealed trait First extends HeaderFooterType
  
  /**
    * A header/footer displayed on odd pages of the section.
    */
  @js.native
  sealed trait Odd extends HeaderFooterType
  
  /**
    * A header/footer that is displayed on all pages of the section if the document does not distinguish between first, odd and even pages. Actually, this is an alias for the Odd type.
    */
  @js.native
  sealed trait Primary extends HeaderFooterType
}
