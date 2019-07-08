package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dts-dom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val reservedWords: js.Array[java.lang.String] = js.native
  def emit(rootDecl: TopLevelDeclaration): java.lang.String = js.native
  def emit(
    rootDecl: TopLevelDeclaration,
    hasRootFlagsTripleSlashDirectivesSingleLineJsDocComments: EmitOptions
  ): java.lang.String = js.native
  def isIdentifier(s: java.lang.String): scala.Boolean = js.native
  def isIdentifierName(s: java.lang.String): scala.Boolean = js.native
  def never(x: scala.Nothing, err: java.lang.String): scala.Nothing = js.native
}

