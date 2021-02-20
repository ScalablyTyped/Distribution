package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubDocumentType extends StObject
/**
  * Lists values specifying the sub-document type.
  */
@JSGlobal("SubDocumentType")
@js.native
object SubDocumentType extends StObject {
  
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
