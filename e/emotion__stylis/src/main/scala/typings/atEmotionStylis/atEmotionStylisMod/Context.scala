package typings.atEmotionStylis.atEmotionStylisMod

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
    extends Context
       with PrefixContext
  
  @js.native
  sealed trait BLCKS
    extends Context
       with PrefixContext
  
  @js.native
  sealed trait POSTS extends Context
  
  @js.native
  sealed trait PREPS extends Context
  
  @js.native
  sealed trait PROPS
    extends Context
       with PrefixContext
  
  @js.native
  sealed trait UNKWN extends Context
  
  /* 3 */ val ATRUL: typings.atEmotionStylis.atEmotionStylisMod.Context.ATRUL with Double = js.native
  /* 2 */ val BLCKS: typings.atEmotionStylis.atEmotionStylisMod.Context.BLCKS with Double = js.native
  /* -2 */ val POSTS: typings.atEmotionStylis.atEmotionStylisMod.Context.POSTS with Double = js.native
  /* -1 */ val PREPS: typings.atEmotionStylis.atEmotionStylisMod.Context.PREPS with Double = js.native
  /* 1 */ val PROPS: typings.atEmotionStylis.atEmotionStylisMod.Context.PROPS with Double = js.native
  /* 0 */ val UNKWN: typings.atEmotionStylis.atEmotionStylisMod.Context.UNKWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Context with Double] = js.native
}

