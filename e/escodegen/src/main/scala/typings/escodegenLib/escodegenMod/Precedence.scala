package typings
package escodegenLib.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Precedence extends js.Object

@JSImport("escodegen", "Precedence")
@js.native
object Precedence extends js.Object {
  @js.native
  sealed trait Additive
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait ArrowFunction
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Assignment
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Await
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait BitwiseAND
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait BitwiseOR
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait BitwiseSHIFT
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait BitwiseXOR
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Call
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Conditional
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Equality
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait LogicalAND
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait LogicalOR
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Member
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Multiplicative
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait New
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Postfix
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Primary
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Relational
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Sequence
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait TaggedTemplate
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Unary
    extends escodegenLib.escodegenMod.Precedence
  
  @js.native
  sealed trait Yield
    extends escodegenLib.escodegenMod.Precedence
  
  /* 14 */ val Additive: Additive with scala.Double = js.native
  /* 5 */ val ArrowFunction: ArrowFunction with scala.Double = js.native
  /* 3 */ val Assignment: Assignment with scala.Double = js.native
  /* 2 */ val Await: Await with scala.Double = js.native
  /* 10 */ val BitwiseAND: BitwiseAND with scala.Double = js.native
  /* 8 */ val BitwiseOR: BitwiseOR with scala.Double = js.native
  /* 13 */ val BitwiseSHIFT: BitwiseSHIFT with scala.Double = js.native
  /* 9 */ val BitwiseXOR: BitwiseXOR with scala.Double = js.native
  /* 18 */ val Call: Call with scala.Double = js.native
  /* 4 */ val Conditional: Conditional with scala.Double = js.native
  /* 11 */ val Equality: Equality with scala.Double = js.native
  /* 7 */ val LogicalAND: LogicalAND with scala.Double = js.native
  /* 6 */ val LogicalOR: LogicalOR with scala.Double = js.native
  /* 21 */ val Member: Member with scala.Double = js.native
  /* 15 */ val Multiplicative: Multiplicative with scala.Double = js.native
  /* 19 */ val New: New with scala.Double = js.native
  /* 17 */ val Postfix: Postfix with scala.Double = js.native
  /* 22 */ val Primary: Primary with scala.Double = js.native
  /* 12 */ val Relational: Relational with scala.Double = js.native
  /* 0 */ val Sequence: Sequence with scala.Double = js.native
  /* 20 */ val TaggedTemplate: TaggedTemplate with scala.Double = js.native
  /* 16 */ val Unary: Unary with scala.Double = js.native
  /* 1 */ val Yield: Yield with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[escodegenLib.escodegenMod.Precedence with scala.Double] = js.native
}

