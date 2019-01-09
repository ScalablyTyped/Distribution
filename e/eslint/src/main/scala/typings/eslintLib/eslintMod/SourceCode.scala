package typings
package eslintLib.eslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "SourceCode")
@js.native
class SourceCode protected () extends js.Object {
  def this(config: eslintLib.eslintMod.SourceCodeNs.Config) = this()
  def this(text: java.lang.String, ast: eslintLib.eslintMod.ASTNs.Program) = this()
  var ast: eslintLib.eslintMod.ASTNs.Program = js.native
  var hasBOM: scala.Boolean = js.native
  var lines: js.Array[java.lang.String] = js.native
  var parserServices: eslintLib.eslintMod.SourceCodeNs.ParserServices = js.native
  var scopeManager: eslintLib.eslintMod.ScopeNs.ScopeManager = js.native
  var text: java.lang.String = js.native
  var visitorKeys: eslintLib.eslintMod.SourceCodeNs.VisitorKeys = js.native
  def commentsExistBetween(left: eslintLib.eslintMod.ASTNs.Token, right: eslintLib.eslintMod.ASTNs.Token): scala.Boolean = js.native
  def commentsExistBetween(left: eslintLib.eslintMod.ASTNs.Token, right: estreeLib.estreeMod.Node): scala.Boolean = js.native
  def commentsExistBetween(left: estreeLib.estreeMod.Node, right: eslintLib.eslintMod.ASTNs.Token): scala.Boolean = js.native
  def commentsExistBetween(left: estreeLib.estreeMod.Node, right: estreeLib.estreeMod.Node): scala.Boolean = js.native
  def getAllComments(): js.Array[estreeLib.estreeMod.Comment] = js.native
  def getComments(node: estreeLib.estreeMod.Node): eslintLib.Anon_Leading = js.native
  def getCommentsAfter(nodeOrToken: eslintLib.eslintMod.ASTNs.Token): js.Array[estreeLib.estreeMod.Comment] = js.native
  def getCommentsAfter(nodeOrToken: estreeLib.estreeMod.Node): js.Array[estreeLib.estreeMod.Comment] = js.native
  def getCommentsBefore(nodeOrToken: eslintLib.eslintMod.ASTNs.Token): js.Array[estreeLib.estreeMod.Comment] = js.native
  def getCommentsBefore(nodeOrToken: estreeLib.estreeMod.Node): js.Array[estreeLib.estreeMod.Comment] = js.native
  def getCommentsInside(node: estreeLib.estreeMod.Node): js.Array[estreeLib.estreeMod.Comment] = js.native
  def getFirstToken(node: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstToken(node: estreeLib.estreeMod.Node, options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(left: eslintLib.eslintMod.ASTNs.Token, right: eslintLib.eslintMod.ASTNs.Token): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(left: eslintLib.eslintMod.ASTNs.Token, right: estreeLib.estreeMod.Comment): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(left: eslintLib.eslintMod.ASTNs.Token, right: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(left: estreeLib.estreeMod.Comment, right: eslintLib.eslintMod.ASTNs.Token): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(
    left: estreeLib.estreeMod.Comment,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(left: estreeLib.estreeMod.Comment, right: estreeLib.estreeMod.Comment): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(
    left: estreeLib.estreeMod.Comment,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(left: estreeLib.estreeMod.Comment, right: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(
    left: estreeLib.estreeMod.Comment,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(left: estreeLib.estreeMod.Node, right: eslintLib.eslintMod.ASTNs.Token): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(
    left: estreeLib.estreeMod.Node,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(left: estreeLib.estreeMod.Node, right: estreeLib.estreeMod.Comment): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(
    left: estreeLib.estreeMod.Node,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(left: estreeLib.estreeMod.Node, right: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokenBetween(
    left: estreeLib.estreeMod.Node,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getFirstTokens(node: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokens(node: estreeLib.estreeMod.Node, options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(left: eslintLib.eslintMod.ASTNs.Token, right: eslintLib.eslintMod.ASTNs.Token): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(left: eslintLib.eslintMod.ASTNs.Token, right: estreeLib.estreeMod.Comment): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(left: eslintLib.eslintMod.ASTNs.Token, right: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(left: estreeLib.estreeMod.Comment, right: eslintLib.eslintMod.ASTNs.Token): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(
    left: estreeLib.estreeMod.Comment,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(left: estreeLib.estreeMod.Comment, right: estreeLib.estreeMod.Comment): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(
    left: estreeLib.estreeMod.Comment,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(left: estreeLib.estreeMod.Comment, right: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(
    left: estreeLib.estreeMod.Comment,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(left: estreeLib.estreeMod.Node, right: eslintLib.eslintMod.ASTNs.Token): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(
    left: estreeLib.estreeMod.Node,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(left: estreeLib.estreeMod.Node, right: estreeLib.estreeMod.Comment): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(
    left: estreeLib.estreeMod.Node,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(left: estreeLib.estreeMod.Node, right: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getFirstTokensBetween(
    left: estreeLib.estreeMod.Node,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getIndexFromLoc(location: estreeLib.estreeMod.Position): scala.Double = js.native
  def getJSDocComment(node: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastToken(node: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastToken(node: estreeLib.estreeMod.Node, options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(left: eslintLib.eslintMod.ASTNs.Token, right: eslintLib.eslintMod.ASTNs.Token): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(left: eslintLib.eslintMod.ASTNs.Token, right: estreeLib.estreeMod.Comment): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(left: eslintLib.eslintMod.ASTNs.Token, right: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(left: estreeLib.estreeMod.Comment, right: eslintLib.eslintMod.ASTNs.Token): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(
    left: estreeLib.estreeMod.Comment,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(left: estreeLib.estreeMod.Comment, right: estreeLib.estreeMod.Comment): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(
    left: estreeLib.estreeMod.Comment,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(left: estreeLib.estreeMod.Comment, right: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(
    left: estreeLib.estreeMod.Comment,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(left: estreeLib.estreeMod.Node, right: eslintLib.eslintMod.ASTNs.Token): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(
    left: estreeLib.estreeMod.Node,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(left: estreeLib.estreeMod.Node, right: estreeLib.estreeMod.Comment): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(
    left: estreeLib.estreeMod.Node,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(left: estreeLib.estreeMod.Node, right: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokenBetween(
    left: estreeLib.estreeMod.Node,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getLastTokens(node: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokens(node: estreeLib.estreeMod.Node, options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(left: eslintLib.eslintMod.ASTNs.Token, right: eslintLib.eslintMod.ASTNs.Token): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(left: eslintLib.eslintMod.ASTNs.Token, right: estreeLib.estreeMod.Comment): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(left: eslintLib.eslintMod.ASTNs.Token, right: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(
    left: eslintLib.eslintMod.ASTNs.Token,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(left: estreeLib.estreeMod.Comment, right: eslintLib.eslintMod.ASTNs.Token): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(
    left: estreeLib.estreeMod.Comment,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(left: estreeLib.estreeMod.Comment, right: estreeLib.estreeMod.Comment): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(
    left: estreeLib.estreeMod.Comment,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(left: estreeLib.estreeMod.Comment, right: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(
    left: estreeLib.estreeMod.Comment,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(left: estreeLib.estreeMod.Node, right: eslintLib.eslintMod.ASTNs.Token): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(
    left: estreeLib.estreeMod.Node,
    right: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(left: estreeLib.estreeMod.Node, right: estreeLib.estreeMod.Comment): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(
    left: estreeLib.estreeMod.Node,
    right: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(left: estreeLib.estreeMod.Node, right: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLastTokensBetween(
    left: estreeLib.estreeMod.Node,
    right: estreeLib.estreeMod.Node,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getLines(): js.Array[java.lang.String] = js.native
  def getLocFromIndex(index: scala.Double): estreeLib.estreeMod.Position = js.native
  def getNodeByRangeIndex(index: scala.Double): estreeLib.estreeMod.Node | scala.Null = js.native
  def getText(): java.lang.String = js.native
  def getText(node: estreeLib.estreeMod.Node): java.lang.String = js.native
  def getText(node: estreeLib.estreeMod.Node, beforeCount: scala.Double): java.lang.String = js.native
  def getText(node: estreeLib.estreeMod.Node, beforeCount: scala.Double, afterCount: scala.Double): java.lang.String = js.native
  def getTokenAfter(node: eslintLib.eslintMod.ASTNs.Token): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenAfter(
    node: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenAfter(node: estreeLib.estreeMod.Comment): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenAfter(node: estreeLib.estreeMod.Comment, options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenAfter(node: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenAfter(node: estreeLib.estreeMod.Node, options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenBefore(node: eslintLib.eslintMod.ASTNs.Token): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenBefore(
    node: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions
  ): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenBefore(node: estreeLib.estreeMod.Comment): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenBefore(node: estreeLib.estreeMod.Comment, options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenBefore(node: estreeLib.estreeMod.Node): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenBefore(node: estreeLib.estreeMod.Node, options: eslintLib.eslintMod.SourceCodeNs.CursorWithSkipOptions): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  // Inherited methods from TokenStore
  // ---------------------------------
  def getTokenByRangeStart(offset: scala.Double): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokenByRangeStart(offset: scala.Double, options: eslintLib.Anon_IncludeComments): eslintLib.eslintMod.ASTNs.Token | scala.Null = js.native
  def getTokens(node: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokens(node: estreeLib.estreeMod.Node, beforeCount: scala.Double): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokens(node: estreeLib.estreeMod.Node, beforeCount: scala.Double, afterCount: scala.Double): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokens(node: estreeLib.estreeMod.Node, options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokens(node: estreeLib.estreeMod.Node, options: eslintLib.eslintMod.SourceCodeNs.FilterPredicate): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensAfter(node: eslintLib.eslintMod.ASTNs.Token): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensAfter(
    node: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensAfter(node: estreeLib.estreeMod.Comment): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensAfter(
    node: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensAfter(node: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensAfter(node: estreeLib.estreeMod.Node, options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensBefore(node: eslintLib.eslintMod.ASTNs.Token): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensBefore(
    node: eslintLib.eslintMod.ASTNs.Token,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensBefore(node: estreeLib.estreeMod.Comment): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensBefore(
    node: estreeLib.estreeMod.Comment,
    options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensBefore(node: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensBefore(node: estreeLib.estreeMod.Node, options: eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensBetween(
    left: estreeLib.estreeMod.Node | eslintLib.eslintMod.ASTNs.Token | estreeLib.estreeMod.Comment,
    right: estreeLib.estreeMod.Node | eslintLib.eslintMod.ASTNs.Token | estreeLib.estreeMod.Comment
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def getTokensBetween(
    left: estreeLib.estreeMod.Node | eslintLib.eslintMod.ASTNs.Token | estreeLib.estreeMod.Comment,
    right: estreeLib.estreeMod.Node | eslintLib.eslintMod.ASTNs.Token | estreeLib.estreeMod.Comment,
    padding: scala.Double | eslintLib.eslintMod.SourceCodeNs.FilterPredicate | eslintLib.eslintMod.SourceCodeNs.CursorWithCountOptions
  ): js.Array[eslintLib.eslintMod.ASTNs.Token] = js.native
  def isSpaceBetweenTokens(first: eslintLib.eslintMod.ASTNs.Token, second: eslintLib.eslintMod.ASTNs.Token): scala.Boolean = js.native
}

@JSImport("eslint", "SourceCode")
@js.native
object SourceCode extends js.Object {
  def splitLines(text: java.lang.String): js.Array[java.lang.String] = js.native
}

