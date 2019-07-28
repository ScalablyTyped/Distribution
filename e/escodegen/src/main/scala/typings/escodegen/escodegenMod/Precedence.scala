package typings.escodegen.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Precedence extends js.Object

@JSImport("escodegen", "Precedence")
@js.native
object Precedence extends js.Object {
  @js.native
  sealed trait Additive extends Precedence
  
  @js.native
  sealed trait ArrowFunction extends Precedence
  
  @js.native
  sealed trait Assignment extends Precedence
  
  @js.native
  sealed trait Await extends Precedence
  
  @js.native
  sealed trait BitwiseAND extends Precedence
  
  @js.native
  sealed trait BitwiseOR extends Precedence
  
  @js.native
  sealed trait BitwiseSHIFT extends Precedence
  
  @js.native
  sealed trait BitwiseXOR extends Precedence
  
  @js.native
  sealed trait Call extends Precedence
  
  @js.native
  sealed trait Conditional extends Precedence
  
  @js.native
  sealed trait Equality extends Precedence
  
  @js.native
  sealed trait LogicalAND extends Precedence
  
  @js.native
  sealed trait LogicalOR extends Precedence
  
  @js.native
  sealed trait Member extends Precedence
  
  @js.native
  sealed trait Multiplicative extends Precedence
  
  @js.native
  sealed trait New extends Precedence
  
  @js.native
  sealed trait Postfix extends Precedence
  
  @js.native
  sealed trait Primary extends Precedence
  
  @js.native
  sealed trait Relational extends Precedence
  
  @js.native
  sealed trait Sequence extends Precedence
  
  @js.native
  sealed trait TaggedTemplate extends Precedence
  
  @js.native
  sealed trait Unary extends Precedence
  
  @js.native
  sealed trait Yield extends Precedence
  
  /* 14 */ val Additive: typings.escodegen.escodegenMod.Precedence.Additive with Double = js.native
  /* 5 */ val ArrowFunction: typings.escodegen.escodegenMod.Precedence.ArrowFunction with Double = js.native
  /* 3 */ val Assignment: typings.escodegen.escodegenMod.Precedence.Assignment with Double = js.native
  /* 2 */ val Await: typings.escodegen.escodegenMod.Precedence.Await with Double = js.native
  /* 10 */ val BitwiseAND: typings.escodegen.escodegenMod.Precedence.BitwiseAND with Double = js.native
  /* 8 */ val BitwiseOR: typings.escodegen.escodegenMod.Precedence.BitwiseOR with Double = js.native
  /* 13 */ val BitwiseSHIFT: typings.escodegen.escodegenMod.Precedence.BitwiseSHIFT with Double = js.native
  /* 9 */ val BitwiseXOR: typings.escodegen.escodegenMod.Precedence.BitwiseXOR with Double = js.native
  /* 18 */ val Call: typings.escodegen.escodegenMod.Precedence.Call with Double = js.native
  /* 4 */ val Conditional: typings.escodegen.escodegenMod.Precedence.Conditional with Double = js.native
  /* 11 */ val Equality: typings.escodegen.escodegenMod.Precedence.Equality with Double = js.native
  /* 7 */ val LogicalAND: typings.escodegen.escodegenMod.Precedence.LogicalAND with Double = js.native
  /* 6 */ val LogicalOR: typings.escodegen.escodegenMod.Precedence.LogicalOR with Double = js.native
  /* 21 */ val Member: typings.escodegen.escodegenMod.Precedence.Member with Double = js.native
  /* 15 */ val Multiplicative: typings.escodegen.escodegenMod.Precedence.Multiplicative with Double = js.native
  /* 19 */ val New: typings.escodegen.escodegenMod.Precedence.New with Double = js.native
  /* 17 */ val Postfix: typings.escodegen.escodegenMod.Precedence.Postfix with Double = js.native
  /* 22 */ val Primary: typings.escodegen.escodegenMod.Precedence.Primary with Double = js.native
  /* 12 */ val Relational: typings.escodegen.escodegenMod.Precedence.Relational with Double = js.native
  /* 0 */ val Sequence: typings.escodegen.escodegenMod.Precedence.Sequence with Double = js.native
  /* 20 */ val TaggedTemplate: typings.escodegen.escodegenMod.Precedence.TaggedTemplate with Double = js.native
  /* 16 */ val Unary: typings.escodegen.escodegenMod.Precedence.Unary with Double = js.native
  /* 1 */ val Yield: typings.escodegen.escodegenMod.Precedence.Yield with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Precedence with Double] = js.native
}

