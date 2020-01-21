package typings.emotionStylis.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Context with Double] = js.native
  /* 3 */ @js.native
  object ATRUL extends TopLevel[ATRUL with Double]
  
  /* 2 */ @js.native
  object BLCKS extends TopLevel[BLCKS with Double]
  
  /* -2 */ @js.native
  object POSTS extends TopLevel[POSTS with Double]
  
  /* -1 */ @js.native
  object PREPS extends TopLevel[PREPS with Double]
  
  /* 1 */ @js.native
  object PROPS extends TopLevel[PROPS with Double]
  
  /* 0 */ @js.native
  object UNKWN extends TopLevel[UNKWN with Double]
  
}

