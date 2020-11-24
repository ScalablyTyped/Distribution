package typings.globalizeCompiler.mod

import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("globalize-compiler", "extract")
@js.native
object extract extends js.Object {
  
  def apply(input: String): ExtractFunction = js.native
  def apply(input: Program): ExtractFunction = js.native
}
