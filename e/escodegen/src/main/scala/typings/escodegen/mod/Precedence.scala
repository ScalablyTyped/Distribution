package typings.escodegen.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Precedence extends js.Object
@JSImport("escodegen", "Precedence")
@js.native
object Precedence extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Precedence with Double] = js.native
  
  @js.native
  sealed trait Additive extends Precedence
  /* 14 */ @js.native
  object Additive extends TopLevel[Additive with Double]
  
  @js.native
  sealed trait ArrowFunction extends Precedence
  /* 5 */ @js.native
  object ArrowFunction extends TopLevel[ArrowFunction with Double]
  
  @js.native
  sealed trait Assignment extends Precedence
  /* 3 */ @js.native
  object Assignment extends TopLevel[Assignment with Double]
  
  @js.native
  sealed trait Await extends Precedence
  /* 2 */ @js.native
  object Await extends TopLevel[Await with Double]
  
  @js.native
  sealed trait BitwiseAND extends Precedence
  /* 10 */ @js.native
  object BitwiseAND extends TopLevel[BitwiseAND with Double]
  
  @js.native
  sealed trait BitwiseOR extends Precedence
  /* 8 */ @js.native
  object BitwiseOR extends TopLevel[BitwiseOR with Double]
  
  @js.native
  sealed trait BitwiseSHIFT extends Precedence
  /* 13 */ @js.native
  object BitwiseSHIFT extends TopLevel[BitwiseSHIFT with Double]
  
  @js.native
  sealed trait BitwiseXOR extends Precedence
  /* 9 */ @js.native
  object BitwiseXOR extends TopLevel[BitwiseXOR with Double]
  
  @js.native
  sealed trait Call extends Precedence
  /* 18 */ @js.native
  object Call extends TopLevel[Call with Double]
  
  @js.native
  sealed trait Conditional extends Precedence
  /* 4 */ @js.native
  object Conditional extends TopLevel[Conditional with Double]
  
  @js.native
  sealed trait Equality extends Precedence
  /* 11 */ @js.native
  object Equality extends TopLevel[Equality with Double]
  
  @js.native
  sealed trait LogicalAND extends Precedence
  /* 7 */ @js.native
  object LogicalAND extends TopLevel[LogicalAND with Double]
  
  @js.native
  sealed trait LogicalOR extends Precedence
  /* 6 */ @js.native
  object LogicalOR extends TopLevel[LogicalOR with Double]
  
  @js.native
  sealed trait Member extends Precedence
  /* 21 */ @js.native
  object Member extends TopLevel[Member with Double]
  
  @js.native
  sealed trait Multiplicative extends Precedence
  /* 15 */ @js.native
  object Multiplicative extends TopLevel[Multiplicative with Double]
  
  @js.native
  sealed trait New extends Precedence
  /* 19 */ @js.native
  object New extends TopLevel[New with Double]
  
  @js.native
  sealed trait Postfix extends Precedence
  /* 17 */ @js.native
  object Postfix extends TopLevel[Postfix with Double]
  
  @js.native
  sealed trait Primary extends Precedence
  /* 22 */ @js.native
  object Primary extends TopLevel[Primary with Double]
  
  @js.native
  sealed trait Relational extends Precedence
  /* 12 */ @js.native
  object Relational extends TopLevel[Relational with Double]
  
  @js.native
  sealed trait Sequence extends Precedence
  /* 0 */ @js.native
  object Sequence extends TopLevel[Sequence with Double]
  
  @js.native
  sealed trait TaggedTemplate extends Precedence
  /* 20 */ @js.native
  object TaggedTemplate extends TopLevel[TaggedTemplate with Double]
  
  @js.native
  sealed trait Unary extends Precedence
  /* 16 */ @js.native
  object Unary extends TopLevel[Unary with Double]
  
  @js.native
  sealed trait Yield extends Precedence
  /* 1 */ @js.native
  object Yield extends TopLevel[Yield with Double]
}
