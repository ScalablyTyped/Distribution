package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphAlignment extends js.Object
/**
  * Lists values specifying the paragraph alignment.
  */
@JSGlobal("ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  
  /**
    * Text is aligned to the center of the paragraph.
    */
  @js.native
  sealed trait Center extends ParagraphAlignment
  
  /**
    * Text is justified to the entire width of the paragraph.
    */
  @js.native
  sealed trait Justify extends ParagraphAlignment
  
  /**
    * Text is aligned to the left of the paragraph.
    */
  @js.native
  sealed trait Left extends ParagraphAlignment
  
  /**
    * Text is aligned to the right of the paragraph.
    */
  @js.native
  sealed trait Right extends ParagraphAlignment
}
