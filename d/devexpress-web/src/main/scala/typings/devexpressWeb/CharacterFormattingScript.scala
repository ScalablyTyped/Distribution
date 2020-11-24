package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CharacterFormattingScript extends js.Object
/**
  * Lists values specifying character script formatting.
  */
@JSGlobal("CharacterFormattingScript")
@js.native
object CharacterFormattingScript extends js.Object {
  
  /**
    * Specifies that the text is not formatted as subscript or as superscript.
    */
  @js.native
  sealed trait Normal extends CharacterFormattingScript
  
  /**
    * Formats text as subscript.
    */
  @js.native
  sealed trait Subscript extends CharacterFormattingScript
  
  /**
    * Formats text as superscript.
    */
  @js.native
  sealed trait Superscript extends CharacterFormattingScript
}
