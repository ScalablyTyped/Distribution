package typings.eslint

import typings.estree.estreeMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: Identifier
}

object Anon_Name {
  @scala.inline
  def apply(name: Identifier): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

