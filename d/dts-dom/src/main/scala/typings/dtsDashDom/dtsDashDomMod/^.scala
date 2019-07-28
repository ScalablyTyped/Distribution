package typings.dtsDashDom.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dts-dom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val reservedWords: js.Array[String] = js.native
  def emit(rootDecl: TopLevelDeclaration): String = js.native
  def emit(
    rootDecl: TopLevelDeclaration,
    hasRootFlagsTripleSlashDirectivesSingleLineJsDocComments: EmitOptions
  ): String = js.native
  def isIdentifier(s: String): Boolean = js.native
  def isIdentifierName(s: String): Boolean = js.native
  def never(x: scala.Nothing, err: String): scala.Nothing = js.native
}

