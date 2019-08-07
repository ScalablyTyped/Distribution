package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabLeaderType extends js.Object

/**
  * Lists repeated characters used to fill in the space created by a tab which ends at the tab stop.
  */
@JSGlobal("TabLeaderType")
@js.native
object TabLeaderType extends js.Object {
  /**
    * The dot is used as a tab leader character.
    */
  @js.native
  sealed trait Dots extends TabLeaderType
  
  /**
    * The equal sign is used as a tab leader character.
    */
  @js.native
  sealed trait EqualSign extends TabLeaderType
  
  /**
    * The hyphen is used as a tab leader character.
    */
  @js.native
  sealed trait Hyphens extends TabLeaderType
  
  /**
    * The middle dot (interpunct) is used as a tab leader character.
    */
  @js.native
  sealed trait MiddleDots extends TabLeaderType
  
  /**
    * No leader characters are used.
    */
  @js.native
  sealed trait None extends TabLeaderType
  
  /**
    * The line is used as a tab leader character.
    */
  @js.native
  sealed trait ThickLine extends TabLeaderType
  
  /**
    * The underscore is used as a tab leader character.
    */
  @js.native
  sealed trait Underline extends TabLeaderType
  
  /* 1 */ val Dots: typings.devexpressDashWeb.TabLeaderType.Dots with Double = js.native
  /* 6 */ val EqualSign: typings.devexpressDashWeb.TabLeaderType.EqualSign with Double = js.native
  /* 3 */ val Hyphens: typings.devexpressDashWeb.TabLeaderType.Hyphens with Double = js.native
  /* 2 */ val MiddleDots: typings.devexpressDashWeb.TabLeaderType.MiddleDots with Double = js.native
  /* 0 */ val None: typings.devexpressDashWeb.TabLeaderType.None with Double = js.native
  /* 5 */ val ThickLine: typings.devexpressDashWeb.TabLeaderType.ThickLine with Double = js.native
  /* 4 */ val Underline: typings.devexpressDashWeb.TabLeaderType.Underline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabLeaderType with Double] = js.native
}

