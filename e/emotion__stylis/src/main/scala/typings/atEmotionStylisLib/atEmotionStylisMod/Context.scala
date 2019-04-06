package typings
package atEmotionStylisLib.atEmotionStylisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Context extends js.Object

@JSImport("@emotion/stylis", "Context")
@js.native
object Context extends js.Object {
  @js.native
  sealed trait ATRUL
    extends atEmotionStylisLib.atEmotionStylisMod.Context
  
  @js.native
  sealed trait BLCKS
    extends atEmotionStylisLib.atEmotionStylisMod.Context
  
  @js.native
  sealed trait POSTS
    extends atEmotionStylisLib.atEmotionStylisMod.Context
  
  @js.native
  sealed trait PREPS
    extends atEmotionStylisLib.atEmotionStylisMod.Context
  
  @js.native
  sealed trait PROPS
    extends atEmotionStylisLib.atEmotionStylisMod.Context
  
  @js.native
  sealed trait UNKWN
    extends atEmotionStylisLib.atEmotionStylisMod.Context
  
  /* 3 */ val ATRUL: ATRUL with scala.Double = js.native
  /* 2 */ val BLCKS: BLCKS with scala.Double = js.native
  /* -2 */ val POSTS: POSTS with scala.Double = js.native
  /* -1 */ val PREPS: PREPS with scala.Double = js.native
  /* 1 */ val PROPS: PROPS with scala.Double = js.native
  /* 0 */ val UNKWN: UNKWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atEmotionStylisLib.atEmotionStylisMod.Context with scala.Double] = js.native
}

