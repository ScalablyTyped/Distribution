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
  
  val Additive: Additive with java.lang.String = js.native
  val ArrowFunction: ArrowFunction with java.lang.String = js.native
  val Assignment: Assignment with java.lang.String = js.native
  val Await: Await with java.lang.String = js.native
  val BitwiseAND: BitwiseAND with java.lang.String = js.native
  val BitwiseOR: BitwiseOR with java.lang.String = js.native
  val BitwiseSHIFT: BitwiseSHIFT with java.lang.String = js.native
  val BitwiseXOR: BitwiseXOR with java.lang.String = js.native
  val Call: Call with java.lang.String = js.native
  val Conditional: Conditional with java.lang.String = js.native
  val Equality: Equality with java.lang.String = js.native
  val LogicalAND: LogicalAND with java.lang.String = js.native
  val LogicalOR: LogicalOR with java.lang.String = js.native
  val Member: Member with java.lang.String = js.native
  val Multiplicative: Multiplicative with java.lang.String = js.native
  val New: New with java.lang.String = js.native
  val Postfix: Postfix with java.lang.String = js.native
  val Primary: Primary with java.lang.String = js.native
  val Relational: Relational with java.lang.String = js.native
  val Sequence: Sequence with java.lang.String = js.native
  val TaggedTemplate: TaggedTemplate with java.lang.String = js.native
  val Unary: Unary with java.lang.String = js.native
  val Yield: Yield with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[escodegenLib.escodegenMod.Precedence with java.lang.String] = js.native
}

