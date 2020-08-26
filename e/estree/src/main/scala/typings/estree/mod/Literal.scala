package typings.estree.mod

import typings.estree.anon.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.SimpleLiteral
  - typings.estree.mod.RegExpLiteral
*/
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.estree.mod.Node because Already inherited */ trait Literal extends Expression

object Literal {
  @scala.inline
  def SimpleLiteral(`type`: typings.estree.estreeStrings.Literal): Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def RegExpLiteral(regex: Flags, `type`: typings.estree.estreeStrings.Literal): Literal = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

