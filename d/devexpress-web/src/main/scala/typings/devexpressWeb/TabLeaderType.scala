package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabLeaderType extends StObject
/**
  * Lists repeated characters used to fill in the space created by a tab which ends at the tab stop.
  */
@JSGlobal("TabLeaderType")
@js.native
object TabLeaderType extends StObject {
  
  /**
    * The dot is used as a tab leader character.
    */
  @js.native
  sealed trait Dots
    extends StObject
       with TabLeaderType
  
  /**
    * The equal sign is used as a tab leader character.
    */
  @js.native
  sealed trait EqualSign
    extends StObject
       with TabLeaderType
  
  /**
    * The hyphen is used as a tab leader character.
    */
  @js.native
  sealed trait Hyphens
    extends StObject
       with TabLeaderType
  
  /**
    * The middle dot (interpunct) is used as a tab leader character.
    */
  @js.native
  sealed trait MiddleDots
    extends StObject
       with TabLeaderType
  
  /**
    * No leader characters are used.
    */
  @js.native
  sealed trait None
    extends StObject
       with TabLeaderType
  
  /**
    * The line is used as a tab leader character.
    */
  @js.native
  sealed trait ThickLine
    extends StObject
       with TabLeaderType
  
  /**
    * The underscore is used as a tab leader character.
    */
  @js.native
  sealed trait Underline
    extends StObject
       with TabLeaderType
}
