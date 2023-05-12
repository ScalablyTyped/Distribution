package typings.embroiderMacros.anon

import org.scalablytyped.runtime.Instantiable1
import typings.babelTraverse.mod.ArrayKeys
import typings.babelTraverse.mod.Hub
import typings.babelTraverse.mod.NodePath
import typings.babelTraverse.mod.NodePathResult
import typings.babelTraverse.mod.NodePaths
import typings.babelTraverse.mod.Scope
import typings.babelTraverse.mod.TraversalContext
import typings.babelTypes.mod.ArgumentPlaceholder_
import typings.babelTypes.mod.CallExpression_
import typings.babelTypes.mod.Comment
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.FlowType
import typings.babelTypes.mod.Function
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.JSXNamespacedName_
import typings.babelTypes.mod.Node
import typings.babelTypes.mod.SourceLocation
import typings.babelTypes.mod.SpreadElement_
import typings.babelTypes.mod.Statement
import typings.babelTypes.mod.Super_
import typings.babelTypes.mod.TSTypeParameterInstantiation_
import typings.babelTypes.mod.TypeParameterInstantiation_
import typings.babelTypes.mod.V8IntrinsicIdentifier_
import typings.embroiderMacros.embroiderMacrosBooleans.`false`
import typings.embroiderMacros.embroiderMacrosBooleans.`true`
import typings.embroiderMacros.embroiderMacrosStrings.CallExpression
import typings.embroiderMacros.embroiderMacrosStrings.`type`
import typings.embroiderMacros.embroiderMacrosStrings.arguments
import typings.embroiderMacros.embroiderMacrosStrings.callee
import typings.embroiderMacros.embroiderMacrosStrings.end
import typings.embroiderMacros.embroiderMacrosStrings.extra
import typings.embroiderMacros.embroiderMacrosStrings.innerComments
import typings.embroiderMacros.embroiderMacrosStrings.leadingComments
import typings.embroiderMacros.embroiderMacrosStrings.loc
import typings.embroiderMacros.embroiderMacrosStrings.optional
import typings.embroiderMacros.embroiderMacrosStrings.start
import typings.embroiderMacros.embroiderMacrosStrings.trailingComments
import typings.embroiderMacros.embroiderMacrosStrings.typeArguments
import typings.embroiderMacros.embroiderMacrosStrings.typeParameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @babel/traverse.@babel/traverse.NodePath<@babel/core.@babel/core.types.CallExpression> & {get (callee : 'callee'): @babel/traverse.@babel/traverse.NodePath<@babel/core.@babel/core.types.Identifier>} */
@js.native
trait NodePathCallExpressionget extends StObject {
  
  def addComment(`type`: String, content: String): Unit = js.native
  def addComment(`type`: String, content: String, line: Boolean): Unit = js.native
  
  /** Give node `comments` of the specified `type`. */
  def addComments(`type`: String, comments: js.Array[Any]): Unit = js.native
  
  //#endregion
  //#region ------------------------- assertXXX -------------------------
  def assertAnyTypeAnnotation(): Unit = js.native
  def assertAnyTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertArrayExpression(): Unit = js.native
  def assertArrayExpression(props: js.Object): Unit = js.native
  
  def assertArrayPattern(): Unit = js.native
  def assertArrayPattern(props: js.Object): Unit = js.native
  
  def assertArrayTypeAnnotation(): Unit = js.native
  def assertArrayTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertArrowFunctionExpression(): Unit = js.native
  def assertArrowFunctionExpression(props: js.Object): Unit = js.native
  
  def assertAssignmentExpression(): Unit = js.native
  def assertAssignmentExpression(props: js.Object): Unit = js.native
  
  def assertAssignmentPattern(): Unit = js.native
  def assertAssignmentPattern(props: js.Object): Unit = js.native
  
  def assertAwaitExpression(): Unit = js.native
  def assertAwaitExpression(props: js.Object): Unit = js.native
  
  def assertBigIntLiteral(): Unit = js.native
  def assertBigIntLiteral(props: js.Object): Unit = js.native
  
  def assertBinary(): Unit = js.native
  def assertBinary(props: js.Object): Unit = js.native
  
  def assertBinaryExpression(): Unit = js.native
  def assertBinaryExpression(props: js.Object): Unit = js.native
  
  def assertBindExpression(): Unit = js.native
  def assertBindExpression(props: js.Object): Unit = js.native
  
  def assertBindingIdentifier(): Unit = js.native
  def assertBindingIdentifier(props: js.Object): Unit = js.native
  
  def assertBlock(): Unit = js.native
  def assertBlock(props: js.Object): Unit = js.native
  
  def assertBlockParent(): Unit = js.native
  def assertBlockParent(props: js.Object): Unit = js.native
  
  def assertBlockScoped(): Unit = js.native
  def assertBlockScoped(props: js.Object): Unit = js.native
  
  def assertBlockStatement(): Unit = js.native
  def assertBlockStatement(props: js.Object): Unit = js.native
  
  def assertBooleanLiteral(): Unit = js.native
  def assertBooleanLiteral(props: js.Object): Unit = js.native
  
  def assertBooleanLiteralTypeAnnotation(): Unit = js.native
  def assertBooleanLiteralTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertBooleanTypeAnnotation(): Unit = js.native
  def assertBooleanTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertBreakStatement(): Unit = js.native
  def assertBreakStatement(props: js.Object): Unit = js.native
  
  def assertCallExpression(): Unit = js.native
  def assertCallExpression(props: js.Object): Unit = js.native
  
  def assertCatchClause(): Unit = js.native
  def assertCatchClause(props: js.Object): Unit = js.native
  
  def assertClass(): Unit = js.native
  def assertClass(props: js.Object): Unit = js.native
  
  def assertClassBody(): Unit = js.native
  def assertClassBody(props: js.Object): Unit = js.native
  
  def assertClassDeclaration(): Unit = js.native
  def assertClassDeclaration(props: js.Object): Unit = js.native
  
  def assertClassExpression(): Unit = js.native
  def assertClassExpression(props: js.Object): Unit = js.native
  
  def assertClassImplements(): Unit = js.native
  def assertClassImplements(props: js.Object): Unit = js.native
  
  def assertClassMethod(): Unit = js.native
  def assertClassMethod(props: js.Object): Unit = js.native
  
  def assertClassPrivateMethod(): Unit = js.native
  def assertClassPrivateMethod(props: js.Object): Unit = js.native
  
  def assertClassPrivateProperty(): Unit = js.native
  def assertClassPrivateProperty(props: js.Object): Unit = js.native
  
  def assertClassProperty(): Unit = js.native
  def assertClassProperty(props: js.Object): Unit = js.native
  
  def assertCompletionStatement(): Unit = js.native
  def assertCompletionStatement(props: js.Object): Unit = js.native
  
  def assertConditional(): Unit = js.native
  def assertConditional(props: js.Object): Unit = js.native
  
  def assertConditionalExpression(): Unit = js.native
  def assertConditionalExpression(props: js.Object): Unit = js.native
  
  def assertContinueStatement(): Unit = js.native
  def assertContinueStatement(props: js.Object): Unit = js.native
  
  def assertDebuggerStatement(): Unit = js.native
  def assertDebuggerStatement(props: js.Object): Unit = js.native
  
  def assertDeclaration(): Unit = js.native
  def assertDeclaration(props: js.Object): Unit = js.native
  
  def assertDeclareClass(): Unit = js.native
  def assertDeclareClass(props: js.Object): Unit = js.native
  
  def assertDeclareExportAllDeclaration(): Unit = js.native
  def assertDeclareExportAllDeclaration(props: js.Object): Unit = js.native
  
  def assertDeclareExportDeclaration(): Unit = js.native
  def assertDeclareExportDeclaration(props: js.Object): Unit = js.native
  
  def assertDeclareFunction(): Unit = js.native
  def assertDeclareFunction(props: js.Object): Unit = js.native
  
  def assertDeclareInterface(): Unit = js.native
  def assertDeclareInterface(props: js.Object): Unit = js.native
  
  def assertDeclareModule(): Unit = js.native
  def assertDeclareModule(props: js.Object): Unit = js.native
  
  def assertDeclareModuleExports(): Unit = js.native
  def assertDeclareModuleExports(props: js.Object): Unit = js.native
  
  def assertDeclareOpaqueType(): Unit = js.native
  def assertDeclareOpaqueType(props: js.Object): Unit = js.native
  
  def assertDeclareTypeAlias(): Unit = js.native
  def assertDeclareTypeAlias(props: js.Object): Unit = js.native
  
  def assertDeclareVariable(): Unit = js.native
  def assertDeclareVariable(props: js.Object): Unit = js.native
  
  def assertDeclaredPredicate(): Unit = js.native
  def assertDeclaredPredicate(props: js.Object): Unit = js.native
  
  def assertDecorator(): Unit = js.native
  def assertDecorator(props: js.Object): Unit = js.native
  
  def assertDirective(): Unit = js.native
  def assertDirective(props: js.Object): Unit = js.native
  
  def assertDirectiveLiteral(): Unit = js.native
  def assertDirectiveLiteral(props: js.Object): Unit = js.native
  
  def assertDoExpression(): Unit = js.native
  def assertDoExpression(props: js.Object): Unit = js.native
  
  def assertDoWhileStatement(): Unit = js.native
  def assertDoWhileStatement(props: js.Object): Unit = js.native
  
  def assertEmptyStatement(): Unit = js.native
  def assertEmptyStatement(props: js.Object): Unit = js.native
  
  def assertEmptyTypeAnnotation(): Unit = js.native
  def assertEmptyTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertExistsTypeAnnotation(): Unit = js.native
  def assertExistsTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertExportAllDeclaration(): Unit = js.native
  def assertExportAllDeclaration(props: js.Object): Unit = js.native
  
  def assertExportDeclaration(): Unit = js.native
  def assertExportDeclaration(props: js.Object): Unit = js.native
  
  def assertExportDefaultDeclaration(): Unit = js.native
  def assertExportDefaultDeclaration(props: js.Object): Unit = js.native
  
  def assertExportDefaultSpecifier(): Unit = js.native
  def assertExportDefaultSpecifier(props: js.Object): Unit = js.native
  
  def assertExportNamedDeclaration(): Unit = js.native
  def assertExportNamedDeclaration(props: js.Object): Unit = js.native
  
  def assertExportNamespaceSpecifier(): Unit = js.native
  def assertExportNamespaceSpecifier(props: js.Object): Unit = js.native
  
  def assertExportSpecifier(): Unit = js.native
  def assertExportSpecifier(props: js.Object): Unit = js.native
  
  def assertExpression(): Unit = js.native
  def assertExpression(props: js.Object): Unit = js.native
  
  def assertExpressionStatement(): Unit = js.native
  def assertExpressionStatement(props: js.Object): Unit = js.native
  
  def assertExpressionWrapper(): Unit = js.native
  def assertExpressionWrapper(props: js.Object): Unit = js.native
  
  def assertFile(): Unit = js.native
  def assertFile(props: js.Object): Unit = js.native
  
  def assertFlow(): Unit = js.native
  def assertFlow(props: js.Object): Unit = js.native
  
  def assertFlowBaseAnnotation(): Unit = js.native
  def assertFlowBaseAnnotation(props: js.Object): Unit = js.native
  
  def assertFlowDeclaration(): Unit = js.native
  def assertFlowDeclaration(props: js.Object): Unit = js.native
  
  def assertFlowPredicate(): Unit = js.native
  def assertFlowPredicate(props: js.Object): Unit = js.native
  
  def assertFlowType(): Unit = js.native
  def assertFlowType(props: js.Object): Unit = js.native
  
  def assertFor(): Unit = js.native
  def assertFor(props: js.Object): Unit = js.native
  
  def assertForInStatement(): Unit = js.native
  def assertForInStatement(props: js.Object): Unit = js.native
  
  def assertForOfStatement(): Unit = js.native
  def assertForOfStatement(props: js.Object): Unit = js.native
  
  def assertForStatement(): Unit = js.native
  def assertForStatement(props: js.Object): Unit = js.native
  
  def assertForXStatement(): Unit = js.native
  def assertForXStatement(props: js.Object): Unit = js.native
  
  def assertFunction(): Unit = js.native
  def assertFunction(props: js.Object): Unit = js.native
  
  def assertFunctionDeclaration(): Unit = js.native
  def assertFunctionDeclaration(props: js.Object): Unit = js.native
  
  def assertFunctionExpression(): Unit = js.native
  def assertFunctionExpression(props: js.Object): Unit = js.native
  
  def assertFunctionParent(): Unit = js.native
  def assertFunctionParent(props: js.Object): Unit = js.native
  
  def assertFunctionTypeAnnotation(): Unit = js.native
  def assertFunctionTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertFunctionTypeParam(): Unit = js.native
  def assertFunctionTypeParam(props: js.Object): Unit = js.native
  
  def assertGenerated(): Unit = js.native
  def assertGenerated(props: js.Object): Unit = js.native
  
  def assertGenericTypeAnnotation(): Unit = js.native
  def assertGenericTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertIdentifier(): Unit = js.native
  def assertIdentifier(props: js.Object): Unit = js.native
  
  def assertIfStatement(): Unit = js.native
  def assertIfStatement(props: js.Object): Unit = js.native
  
  def assertImmutable(): Unit = js.native
  def assertImmutable(props: js.Object): Unit = js.native
  
  def assertImport(): Unit = js.native
  def assertImport(props: js.Object): Unit = js.native
  
  def assertImportDeclaration(): Unit = js.native
  def assertImportDeclaration(props: js.Object): Unit = js.native
  
  def assertImportDefaultSpecifier(): Unit = js.native
  def assertImportDefaultSpecifier(props: js.Object): Unit = js.native
  
  def assertImportNamespaceSpecifier(): Unit = js.native
  def assertImportNamespaceSpecifier(props: js.Object): Unit = js.native
  
  def assertImportSpecifier(): Unit = js.native
  def assertImportSpecifier(props: js.Object): Unit = js.native
  
  def assertInferredPredicate(): Unit = js.native
  def assertInferredPredicate(props: js.Object): Unit = js.native
  
  def assertInterfaceDeclaration(): Unit = js.native
  def assertInterfaceDeclaration(props: js.Object): Unit = js.native
  
  def assertInterfaceExtends(): Unit = js.native
  def assertInterfaceExtends(props: js.Object): Unit = js.native
  
  def assertInterfaceTypeAnnotation(): Unit = js.native
  def assertInterfaceTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertInterpreterDirective(): Unit = js.native
  def assertInterpreterDirective(props: js.Object): Unit = js.native
  
  def assertIntersectionTypeAnnotation(): Unit = js.native
  def assertIntersectionTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertJSX(): Unit = js.native
  def assertJSX(props: js.Object): Unit = js.native
  
  def assertJSXAttribute(): Unit = js.native
  def assertJSXAttribute(props: js.Object): Unit = js.native
  
  def assertJSXClosingElement(): Unit = js.native
  def assertJSXClosingElement(props: js.Object): Unit = js.native
  
  def assertJSXClosingFragment(): Unit = js.native
  def assertJSXClosingFragment(props: js.Object): Unit = js.native
  
  def assertJSXElement(): Unit = js.native
  def assertJSXElement(props: js.Object): Unit = js.native
  
  def assertJSXEmptyExpression(): Unit = js.native
  def assertJSXEmptyExpression(props: js.Object): Unit = js.native
  
  def assertJSXExpressionContainer(): Unit = js.native
  def assertJSXExpressionContainer(props: js.Object): Unit = js.native
  
  def assertJSXFragment(): Unit = js.native
  def assertJSXFragment(props: js.Object): Unit = js.native
  
  def assertJSXIdentifier(): Unit = js.native
  def assertJSXIdentifier(props: js.Object): Unit = js.native
  
  def assertJSXMemberExpression(): Unit = js.native
  def assertJSXMemberExpression(props: js.Object): Unit = js.native
  
  def assertJSXNamespacedName(): Unit = js.native
  def assertJSXNamespacedName(props: js.Object): Unit = js.native
  
  def assertJSXOpeningElement(): Unit = js.native
  def assertJSXOpeningElement(props: js.Object): Unit = js.native
  
  def assertJSXOpeningFragment(): Unit = js.native
  def assertJSXOpeningFragment(props: js.Object): Unit = js.native
  
  def assertJSXSpreadAttribute(): Unit = js.native
  def assertJSXSpreadAttribute(props: js.Object): Unit = js.native
  
  def assertJSXSpreadChild(): Unit = js.native
  def assertJSXSpreadChild(props: js.Object): Unit = js.native
  
  def assertJSXText(): Unit = js.native
  def assertJSXText(props: js.Object): Unit = js.native
  
  def assertLVal(): Unit = js.native
  def assertLVal(props: js.Object): Unit = js.native
  
  def assertLabeledStatement(): Unit = js.native
  def assertLabeledStatement(props: js.Object): Unit = js.native
  
  def assertLiteral(): Unit = js.native
  def assertLiteral(props: js.Object): Unit = js.native
  
  def assertLogicalExpression(): Unit = js.native
  def assertLogicalExpression(props: js.Object): Unit = js.native
  
  def assertLoop(): Unit = js.native
  def assertLoop(props: js.Object): Unit = js.native
  
  def assertMemberExpression(): Unit = js.native
  def assertMemberExpression(props: js.Object): Unit = js.native
  
  def assertMetaProperty(): Unit = js.native
  def assertMetaProperty(props: js.Object): Unit = js.native
  
  def assertMethod(): Unit = js.native
  def assertMethod(props: js.Object): Unit = js.native
  
  def assertMixedTypeAnnotation(): Unit = js.native
  def assertMixedTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertModuleDeclaration(): Unit = js.native
  def assertModuleDeclaration(props: js.Object): Unit = js.native
  
  def assertModuleSpecifier(): Unit = js.native
  def assertModuleSpecifier(props: js.Object): Unit = js.native
  
  def assertNewExpression(): Unit = js.native
  def assertNewExpression(props: js.Object): Unit = js.native
  
  def assertNoop(): Unit = js.native
  def assertNoop(props: js.Object): Unit = js.native
  
  def assertNullLiteral(): Unit = js.native
  def assertNullLiteral(props: js.Object): Unit = js.native
  
  def assertNullLiteralTypeAnnotation(): Unit = js.native
  def assertNullLiteralTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertNullableTypeAnnotation(): Unit = js.native
  def assertNullableTypeAnnotation(props: js.Object): Unit = js.native
  
  /** @deprecated Use `assertNumericLiteral` */
  def assertNumberLiteral(): Unit = js.native
  def assertNumberLiteral(props: js.Object): Unit = js.native
  
  def assertNumberLiteralTypeAnnotation(): Unit = js.native
  def assertNumberLiteralTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertNumberTypeAnnotation(): Unit = js.native
  def assertNumberTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertNumericLiteral(): Unit = js.native
  def assertNumericLiteral(props: js.Object): Unit = js.native
  
  def assertObjectExpression(): Unit = js.native
  def assertObjectExpression(props: js.Object): Unit = js.native
  
  def assertObjectMember(): Unit = js.native
  def assertObjectMember(props: js.Object): Unit = js.native
  
  def assertObjectMethod(): Unit = js.native
  def assertObjectMethod(props: js.Object): Unit = js.native
  
  def assertObjectPattern(): Unit = js.native
  def assertObjectPattern(props: js.Object): Unit = js.native
  
  def assertObjectProperty(): Unit = js.native
  def assertObjectProperty(props: js.Object): Unit = js.native
  
  def assertObjectTypeAnnotation(): Unit = js.native
  def assertObjectTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertObjectTypeCallProperty(): Unit = js.native
  def assertObjectTypeCallProperty(props: js.Object): Unit = js.native
  
  def assertObjectTypeIndexer(): Unit = js.native
  def assertObjectTypeIndexer(props: js.Object): Unit = js.native
  
  def assertObjectTypeInternalSlot(): Unit = js.native
  def assertObjectTypeInternalSlot(props: js.Object): Unit = js.native
  
  def assertObjectTypeProperty(): Unit = js.native
  def assertObjectTypeProperty(props: js.Object): Unit = js.native
  
  def assertObjectTypeSpreadProperty(): Unit = js.native
  def assertObjectTypeSpreadProperty(props: js.Object): Unit = js.native
  
  def assertOpaqueType(): Unit = js.native
  def assertOpaqueType(props: js.Object): Unit = js.native
  
  def assertOptionalCallExpression(): Unit = js.native
  def assertOptionalCallExpression(props: js.Object): Unit = js.native
  
  def assertOptionalMemberExpression(): Unit = js.native
  def assertOptionalMemberExpression(props: js.Object): Unit = js.native
  
  def assertParenthesizedExpression(): Unit = js.native
  def assertParenthesizedExpression(props: js.Object): Unit = js.native
  
  def assertPattern(): Unit = js.native
  def assertPattern(props: js.Object): Unit = js.native
  
  def assertPatternLike(): Unit = js.native
  def assertPatternLike(props: js.Object): Unit = js.native
  
  def assertPipelineBareFunction(): Unit = js.native
  def assertPipelineBareFunction(props: js.Object): Unit = js.native
  
  def assertPipelinePrimaryTopicReference(): Unit = js.native
  def assertPipelinePrimaryTopicReference(props: js.Object): Unit = js.native
  
  def assertPipelineTopicExpression(): Unit = js.native
  def assertPipelineTopicExpression(props: js.Object): Unit = js.native
  
  def assertPrivate(): Unit = js.native
  def assertPrivate(props: js.Object): Unit = js.native
  
  def assertPrivateName(): Unit = js.native
  def assertPrivateName(props: js.Object): Unit = js.native
  
  def assertProgram(): Unit = js.native
  def assertProgram(props: js.Object): Unit = js.native
  
  def assertProperty(): Unit = js.native
  def assertProperty(props: js.Object): Unit = js.native
  
  def assertPure(): Unit = js.native
  def assertPure(props: js.Object): Unit = js.native
  
  def assertPureish(): Unit = js.native
  def assertPureish(props: js.Object): Unit = js.native
  
  def assertQualifiedTypeIdentifier(): Unit = js.native
  def assertQualifiedTypeIdentifier(props: js.Object): Unit = js.native
  
  def assertReferenced(): Unit = js.native
  def assertReferenced(props: js.Object): Unit = js.native
  
  def assertReferencedIdentifier(): Unit = js.native
  def assertReferencedIdentifier(props: js.Object): Unit = js.native
  
  def assertReferencedMemberExpression(): Unit = js.native
  def assertReferencedMemberExpression(props: js.Object): Unit = js.native
  
  def assertRegExpLiteral(): Unit = js.native
  def assertRegExpLiteral(props: js.Object): Unit = js.native
  
  /** @deprecated Use `assertRegExpLiteral` */
  def assertRegexLiteral(): Unit = js.native
  def assertRegexLiteral(props: js.Object): Unit = js.native
  
  def assertRestElement(): Unit = js.native
  def assertRestElement(props: js.Object): Unit = js.native
  
  /** @deprecated Use `assertRestElement` */
  def assertRestProperty(): Unit = js.native
  def assertRestProperty(props: js.Object): Unit = js.native
  
  def assertReturnStatement(): Unit = js.native
  def assertReturnStatement(props: js.Object): Unit = js.native
  
  def assertScopable(): Unit = js.native
  def assertScopable(props: js.Object): Unit = js.native
  
  def assertScope(): Unit = js.native
  def assertScope(props: js.Object): Unit = js.native
  
  def assertSequenceExpression(): Unit = js.native
  def assertSequenceExpression(props: js.Object): Unit = js.native
  
  def assertSpreadElement(): Unit = js.native
  def assertSpreadElement(props: js.Object): Unit = js.native
  
  /** @deprecated Use `assertSpreadElement` */
  def assertSpreadProperty(): Unit = js.native
  def assertSpreadProperty(props: js.Object): Unit = js.native
  
  def assertStatement(): Unit = js.native
  def assertStatement(props: js.Object): Unit = js.native
  
  def assertStringLiteral(): Unit = js.native
  def assertStringLiteral(props: js.Object): Unit = js.native
  
  def assertStringLiteralTypeAnnotation(): Unit = js.native
  def assertStringLiteralTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertStringTypeAnnotation(): Unit = js.native
  def assertStringTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertSuper(): Unit = js.native
  def assertSuper(props: js.Object): Unit = js.native
  
  def assertSwitchCase(): Unit = js.native
  def assertSwitchCase(props: js.Object): Unit = js.native
  
  def assertSwitchStatement(): Unit = js.native
  def assertSwitchStatement(props: js.Object): Unit = js.native
  
  def assertTSAnyKeyword(): Unit = js.native
  def assertTSAnyKeyword(props: js.Object): Unit = js.native
  
  def assertTSArrayType(): Unit = js.native
  def assertTSArrayType(props: js.Object): Unit = js.native
  
  def assertTSAsExpression(): Unit = js.native
  def assertTSAsExpression(props: js.Object): Unit = js.native
  
  def assertTSBooleanKeyword(): Unit = js.native
  def assertTSBooleanKeyword(props: js.Object): Unit = js.native
  
  def assertTSCallSignatureDeclaration(): Unit = js.native
  def assertTSCallSignatureDeclaration(props: js.Object): Unit = js.native
  
  def assertTSConditionalType(): Unit = js.native
  def assertTSConditionalType(props: js.Object): Unit = js.native
  
  def assertTSConstructSignatureDeclaration(): Unit = js.native
  def assertTSConstructSignatureDeclaration(props: js.Object): Unit = js.native
  
  def assertTSConstructorType(): Unit = js.native
  def assertTSConstructorType(props: js.Object): Unit = js.native
  
  def assertTSDeclareFunction(): Unit = js.native
  def assertTSDeclareFunction(props: js.Object): Unit = js.native
  
  def assertTSDeclareMethod(): Unit = js.native
  def assertTSDeclareMethod(props: js.Object): Unit = js.native
  
  def assertTSEntityName(): Unit = js.native
  def assertTSEntityName(props: js.Object): Unit = js.native
  
  def assertTSEnumDeclaration(): Unit = js.native
  def assertTSEnumDeclaration(props: js.Object): Unit = js.native
  
  def assertTSEnumMember(): Unit = js.native
  def assertTSEnumMember(props: js.Object): Unit = js.native
  
  def assertTSExportAssignment(): Unit = js.native
  def assertTSExportAssignment(props: js.Object): Unit = js.native
  
  def assertTSExpressionWithTypeArguments(): Unit = js.native
  def assertTSExpressionWithTypeArguments(props: js.Object): Unit = js.native
  
  def assertTSExternalModuleReference(): Unit = js.native
  def assertTSExternalModuleReference(props: js.Object): Unit = js.native
  
  def assertTSFunctionType(): Unit = js.native
  def assertTSFunctionType(props: js.Object): Unit = js.native
  
  def assertTSImportEqualsDeclaration(): Unit = js.native
  def assertTSImportEqualsDeclaration(props: js.Object): Unit = js.native
  
  def assertTSImportType(): Unit = js.native
  def assertTSImportType(props: js.Object): Unit = js.native
  
  def assertTSIndexSignature(): Unit = js.native
  def assertTSIndexSignature(props: js.Object): Unit = js.native
  
  def assertTSIndexedAccessType(): Unit = js.native
  def assertTSIndexedAccessType(props: js.Object): Unit = js.native
  
  def assertTSInferType(): Unit = js.native
  def assertTSInferType(props: js.Object): Unit = js.native
  
  def assertTSInterfaceBody(): Unit = js.native
  def assertTSInterfaceBody(props: js.Object): Unit = js.native
  
  def assertTSInterfaceDeclaration(): Unit = js.native
  def assertTSInterfaceDeclaration(props: js.Object): Unit = js.native
  
  def assertTSIntersectionType(): Unit = js.native
  def assertTSIntersectionType(props: js.Object): Unit = js.native
  
  def assertTSLiteralType(): Unit = js.native
  def assertTSLiteralType(props: js.Object): Unit = js.native
  
  def assertTSMappedType(): Unit = js.native
  def assertTSMappedType(props: js.Object): Unit = js.native
  
  def assertTSMethodSignature(): Unit = js.native
  def assertTSMethodSignature(props: js.Object): Unit = js.native
  
  def assertTSModuleBlock(): Unit = js.native
  def assertTSModuleBlock(props: js.Object): Unit = js.native
  
  def assertTSModuleDeclaration(): Unit = js.native
  def assertTSModuleDeclaration(props: js.Object): Unit = js.native
  
  def assertTSNamespaceExportDeclaration(): Unit = js.native
  def assertTSNamespaceExportDeclaration(props: js.Object): Unit = js.native
  
  def assertTSNeverKeyword(): Unit = js.native
  def assertTSNeverKeyword(props: js.Object): Unit = js.native
  
  def assertTSNonNullExpression(): Unit = js.native
  def assertTSNonNullExpression(props: js.Object): Unit = js.native
  
  def assertTSNullKeyword(): Unit = js.native
  def assertTSNullKeyword(props: js.Object): Unit = js.native
  
  def assertTSNumberKeyword(): Unit = js.native
  def assertTSNumberKeyword(props: js.Object): Unit = js.native
  
  def assertTSObjectKeyword(): Unit = js.native
  def assertTSObjectKeyword(props: js.Object): Unit = js.native
  
  def assertTSOptionalType(): Unit = js.native
  def assertTSOptionalType(props: js.Object): Unit = js.native
  
  def assertTSParameterProperty(): Unit = js.native
  def assertTSParameterProperty(props: js.Object): Unit = js.native
  
  def assertTSParenthesizedType(): Unit = js.native
  def assertTSParenthesizedType(props: js.Object): Unit = js.native
  
  def assertTSPropertySignature(): Unit = js.native
  def assertTSPropertySignature(props: js.Object): Unit = js.native
  
  def assertTSQualifiedName(): Unit = js.native
  def assertTSQualifiedName(props: js.Object): Unit = js.native
  
  def assertTSRestType(): Unit = js.native
  def assertTSRestType(props: js.Object): Unit = js.native
  
  def assertTSStringKeyword(): Unit = js.native
  def assertTSStringKeyword(props: js.Object): Unit = js.native
  
  def assertTSSymbolKeyword(): Unit = js.native
  def assertTSSymbolKeyword(props: js.Object): Unit = js.native
  
  def assertTSThisType(): Unit = js.native
  def assertTSThisType(props: js.Object): Unit = js.native
  
  def assertTSTupleType(): Unit = js.native
  def assertTSTupleType(props: js.Object): Unit = js.native
  
  def assertTSType(): Unit = js.native
  def assertTSType(props: js.Object): Unit = js.native
  
  def assertTSTypeAliasDeclaration(): Unit = js.native
  def assertTSTypeAliasDeclaration(props: js.Object): Unit = js.native
  
  def assertTSTypeAnnotation(): Unit = js.native
  def assertTSTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertTSTypeAssertion(): Unit = js.native
  def assertTSTypeAssertion(props: js.Object): Unit = js.native
  
  def assertTSTypeElement(): Unit = js.native
  def assertTSTypeElement(props: js.Object): Unit = js.native
  
  def assertTSTypeLiteral(): Unit = js.native
  def assertTSTypeLiteral(props: js.Object): Unit = js.native
  
  def assertTSTypeOperator(): Unit = js.native
  def assertTSTypeOperator(props: js.Object): Unit = js.native
  
  def assertTSTypeParameter(): Unit = js.native
  def assertTSTypeParameter(props: js.Object): Unit = js.native
  
  def assertTSTypeParameterDeclaration(): Unit = js.native
  def assertTSTypeParameterDeclaration(props: js.Object): Unit = js.native
  
  def assertTSTypeParameterInstantiation(): Unit = js.native
  def assertTSTypeParameterInstantiation(props: js.Object): Unit = js.native
  
  def assertTSTypePredicate(): Unit = js.native
  def assertTSTypePredicate(props: js.Object): Unit = js.native
  
  def assertTSTypeQuery(): Unit = js.native
  def assertTSTypeQuery(props: js.Object): Unit = js.native
  
  def assertTSTypeReference(): Unit = js.native
  def assertTSTypeReference(props: js.Object): Unit = js.native
  
  def assertTSUndefinedKeyword(): Unit = js.native
  def assertTSUndefinedKeyword(props: js.Object): Unit = js.native
  
  def assertTSUnionType(): Unit = js.native
  def assertTSUnionType(props: js.Object): Unit = js.native
  
  def assertTSUnknownKeyword(): Unit = js.native
  def assertTSUnknownKeyword(props: js.Object): Unit = js.native
  
  def assertTSVoidKeyword(): Unit = js.native
  def assertTSVoidKeyword(props: js.Object): Unit = js.native
  
  def assertTaggedTemplateExpression(): Unit = js.native
  def assertTaggedTemplateExpression(props: js.Object): Unit = js.native
  
  def assertTemplateElement(): Unit = js.native
  def assertTemplateElement(props: js.Object): Unit = js.native
  
  def assertTemplateLiteral(): Unit = js.native
  def assertTemplateLiteral(props: js.Object): Unit = js.native
  
  def assertTerminatorless(): Unit = js.native
  def assertTerminatorless(props: js.Object): Unit = js.native
  
  def assertThisExpression(): Unit = js.native
  def assertThisExpression(props: js.Object): Unit = js.native
  
  def assertThisTypeAnnotation(): Unit = js.native
  def assertThisTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertThrowStatement(): Unit = js.native
  def assertThrowStatement(props: js.Object): Unit = js.native
  
  def assertTryStatement(): Unit = js.native
  def assertTryStatement(props: js.Object): Unit = js.native
  
  def assertTupleTypeAnnotation(): Unit = js.native
  def assertTupleTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertTypeAlias(): Unit = js.native
  def assertTypeAlias(props: js.Object): Unit = js.native
  
  def assertTypeAnnotation(): Unit = js.native
  def assertTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertTypeCastExpression(): Unit = js.native
  def assertTypeCastExpression(props: js.Object): Unit = js.native
  
  def assertTypeParameter(): Unit = js.native
  def assertTypeParameter(props: js.Object): Unit = js.native
  
  def assertTypeParameterDeclaration(): Unit = js.native
  def assertTypeParameterDeclaration(props: js.Object): Unit = js.native
  
  def assertTypeParameterInstantiation(): Unit = js.native
  def assertTypeParameterInstantiation(props: js.Object): Unit = js.native
  
  def assertTypeofTypeAnnotation(): Unit = js.native
  def assertTypeofTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertUnaryExpression(): Unit = js.native
  def assertUnaryExpression(props: js.Object): Unit = js.native
  
  def assertUnaryLike(): Unit = js.native
  def assertUnaryLike(props: js.Object): Unit = js.native
  
  def assertUnionTypeAnnotation(): Unit = js.native
  def assertUnionTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertUpdateExpression(): Unit = js.native
  def assertUpdateExpression(props: js.Object): Unit = js.native
  
  def assertUser(): Unit = js.native
  def assertUser(props: js.Object): Unit = js.native
  
  def assertUserWhitespacable(): Unit = js.native
  def assertUserWhitespacable(props: js.Object): Unit = js.native
  
  def assertVar(): Unit = js.native
  def assertVar(props: js.Object): Unit = js.native
  
  def assertVariableDeclaration(): Unit = js.native
  def assertVariableDeclaration(props: js.Object): Unit = js.native
  
  def assertVariableDeclarator(): Unit = js.native
  def assertVariableDeclarator(props: js.Object): Unit = js.native
  
  def assertVariance(): Unit = js.native
  def assertVariance(props: js.Object): Unit = js.native
  
  def assertVoidTypeAnnotation(): Unit = js.native
  def assertVoidTypeAnnotation(props: js.Object): Unit = js.native
  
  def assertWhile(): Unit = js.native
  def assertWhile(props: js.Object): Unit = js.native
  
  def assertWhileStatement(): Unit = js.native
  def assertWhileStatement(props: js.Object): Unit = js.native
  
  def assertWithStatement(): Unit = js.native
  def assertWithStatement(props: js.Object): Unit = js.native
  
  def assertYieldExpression(): Unit = js.native
  def assertYieldExpression(props: js.Object): Unit = js.native
  
  def baseTypeStrictlyMatches(right: NodePath[Node]): Boolean = js.native
  
  def buildCodeFrameError[TError /* <: js.Error */](msg: String): TError = js.native
  def buildCodeFrameError[TError /* <: js.Error */](msg: String, Error: Instantiable1[/* msg */ String, TError]): TError = js.native
  
  //#endregion
  //#region ------------------------- context -------------------------
  def call(key: String): Boolean = js.native
  
  /**
    * This checks whether or not we're in one of the following positions:
    *
    *   for (KEY in right);
    *   for (KEY;;);
    *
    * This is because these spots allow VariableDeclarations AND normal expressions so we need
    * to tell the path replacement that it's ok to replace this with an expression.
    */
  def canHaveVariableDeclarationOrExpression(): Boolean = js.native
  
  /**
    * This checks whether we are swapping an arrow function's body between an
    * expression and a block statement (or vice versa).
    *
    * This is because arrow functions may implicitly return an expression, which
    * is the same as containing a block statement.
    */
  def canSwapBetweenExpressionAndStatement(replacement: Node): Boolean = js.native
  
  var container: js.Object | js.Array[js.Object] = js.native
  
  var context: TraversalContext = js.native
  
  var contexts: js.Array[TraversalContext] = js.native
  
  def couldBeBaseType(name: String): Boolean = js.native
  
  var data: js.Object = js.native
  
  // Example: https://github.com/babel/babel/blob/63204ae51e020d84a5b246312f5eeb4d981ab952/packages/babel-traverse/src/path/modification.js#L83
  def debug(buildMessage: js.Function0[String]): Unit = js.native
  
  /** Check whether the path node `key` strict equals `value`. */
  def equals(key: String, value: Any): Boolean = js.native
  
  /**
    * Walk the input `node` and statically evaluate it.
    *
    * Returns an object in the form `{ confident, value }`. `confident` indicates
    * whether or not we had to drop out of evaluating the expression because of
    * hitting an unknown node that we couldn't confidently find the value of.
    *
    * Example:
    *
    *   t.evaluate(parse("5 + 5")) // { confident: true, value: 10 }
    *   t.evaluate(parse("!true")) // { confident: true, value: false }
    *   t.evaluate(parse("foo + foo")) // { confident: false, value: undefined }
    */
  def evaluate(): typings.babelTraverse.anon.Confident = js.native
  
  //#endregion
  //#region ------------------------- evaluation -------------------------
  /**
    * Walk the input `node` and statically evaluate if it's truthy.
    *
    * Returning `true` when we're sure that the expression will evaluate to a
    * truthy value, `false` if we're sure that it will evaluate to a falsy
    * value and `undefined` if we aren't sure. Because of this please do not
    * rely on coercion when using this method and check with === if it's false.
    */
  def evaluateTruthy(): Boolean = js.native
  
  /**
    * Starting at current `NodePath` and going up the tree, return the first
    * `NodePath` that causes the provided `callback` to return a truthy value,
    * or `null` if the `callback` never returns a truthy value.
    */
  def find(callback: js.Function1[/* path */ NodePath[Node], Boolean]): NodePath[Node] | Null = js.native
  
  //#region ------------------------- ancestry -------------------------
  /**
    * Starting at the parent path of the current `NodePath` and going up the
    * tree, return the first `NodePath` that causes the provided `callback`
    * to return a truthy value, or `null` if the `callback` never returns a
    * truthy value.
    */
  def findParent(callback: js.Function1[/* path */ NodePath[Node], Boolean]): NodePath[Node] | Null = js.native
  
  def get(key: String): NodePath[Node] | js.Array[NodePath[Node]] = js.native
  def get(key: String, context: Boolean): NodePath[Node] | js.Array[NodePath[Node]] = js.native
  def get(key: String, context: TraversalContext): NodePath[Node] | js.Array[NodePath[Node]] = js.native
  
  def getAllNextSiblings(): js.Array[NodePath[Node]] = js.native
  
  def getAllPrevSiblings(): js.Array[NodePath[Node]] = js.native
  
  /**
    * Build an array of node paths containing the entire ancestry of the current node path.
    *
    * NOTE: The current node path is included in this.
    */
  def getAncestry(): Array[this.type | NodePath[Node]] = js.native
  
  def getBindingIdentifierPaths(): Record[String, NodePath[Identifier_]] = js.native
  def getBindingIdentifierPaths(duplicates: Boolean): Record[String, NodePath[Identifier_] | js.Array[NodePath[Identifier_]]] = js.native
  def getBindingIdentifierPaths(duplicates: Boolean, outerOnly: Boolean): Record[String, NodePath[Identifier_] | js.Array[NodePath[Identifier_]]] = js.native
  def getBindingIdentifierPaths(duplicates: Unit, outerOnly: Boolean): Record[String, NodePath[Identifier_]] = js.native
  @JSName("getBindingIdentifierPaths")
  def getBindingIdentifierPaths_false(duplicates: `false`): Record[String, NodePath[Identifier_]] = js.native
  @JSName("getBindingIdentifierPaths")
  def getBindingIdentifierPaths_false(duplicates: `false`, outerOnly: Boolean): Record[String, NodePath[Identifier_]] = js.native
  @JSName("getBindingIdentifierPaths")
  def getBindingIdentifierPaths_true(duplicates: `true`): Record[String, js.Array[NodePath[Identifier_]]] = js.native
  @JSName("getBindingIdentifierPaths")
  def getBindingIdentifierPaths_true(duplicates: `true`, outerOnly: Boolean): Record[String, js.Array[NodePath[Identifier_]]] = js.native
  
  def getBindingIdentifiers(): Record[String, Identifier_] = js.native
  def getBindingIdentifiers(duplicates: Boolean): Record[String, Identifier_ | js.Array[Identifier_]] = js.native
  @JSName("getBindingIdentifiers")
  def getBindingIdentifiers_false(duplicates: `false`): Record[String, Identifier_] = js.native
  @JSName("getBindingIdentifiers")
  def getBindingIdentifiers_true(duplicates: `true`): Record[String, js.Array[Identifier_]] = js.native
  
  def getCompletionRecords(): js.Array[NodePath[Node]] = js.native
  
  def getData(key: String): Any = js.native
  def getData(key: String, `def`: Any): Any = js.native
  
  /** Get the earliest path in the tree where the provided `paths` intersect. */
  def getDeepestCommonAncestorFrom(paths: js.Array[NodePath[Node]]): NodePath[Node] = js.native
  def getDeepestCommonAncestorFrom(
    paths: js.Array[NodePath[Node]],
    filter: js.Function3[
      /* deepest */ Node, 
      /* i */ Double, 
      /* ancestries */ js.Array[NodePath[Node]], 
      NodePath[Node]
    ]
  ): NodePath[Node] = js.native
  
  /**
    * Get the deepest common ancestor and then from it, get the earliest relationship path
    * to that ancestor.
    *
    * Earliest is defined as being "before" all the other nodes in terms of list container
    * position and visiting key.
    */
  def getEarliestCommonAncestorFrom(paths: js.Array[NodePath[Node]]): NodePath[Node] = js.native
  
  /** Get the parent function of the current path. */
  def getFunctionParent(): NodePath[Function] | Null = js.native
  
  def getNextSibling(): NodePath[Node] = js.native
  
  //#endregion
  //#region ------------------------- family -------------------------
  def getOpposite(): NodePath[Node] = js.native
  
  def getOuterBindingIdentifierPaths(): Record[String, NodePath[Identifier_]] = js.native
  def getOuterBindingIdentifierPaths(duplicates: Boolean): Record[String, NodePath[Identifier_] | js.Array[NodePath[Identifier_]]] = js.native
  def getOuterBindingIdentifierPaths(duplicates: Boolean, outerOnly: Boolean): Record[String, NodePath[Identifier_] | js.Array[NodePath[Identifier_]]] = js.native
  def getOuterBindingIdentifierPaths(duplicates: Unit, outerOnly: Boolean): Record[String, NodePath[Identifier_] | js.Array[NodePath[Identifier_]]] = js.native
  @JSName("getOuterBindingIdentifierPaths")
  def getOuterBindingIdentifierPaths_false(duplicates: `false`): Record[String, NodePath[Identifier_]] = js.native
  @JSName("getOuterBindingIdentifierPaths")
  def getOuterBindingIdentifierPaths_true(duplicates: `true`): Record[String, js.Array[NodePath[Identifier_]]] = js.native
  
  def getOuterBindingIdentifiers(): Record[String, Identifier_] = js.native
  def getOuterBindingIdentifiers(duplicates: Boolean): Record[String, Identifier_ | js.Array[Identifier_]] = js.native
  @JSName("getOuterBindingIdentifiers")
  def getOuterBindingIdentifiers_false(duplicates: `false`): Record[String, Identifier_] = js.native
  @JSName("getOuterBindingIdentifiers")
  def getOuterBindingIdentifiers_true(duplicates: `true`): Record[String, js.Array[Identifier_]] = js.native
  
  def getPathLocation(): String = js.native
  
  def getPrevSibling(): NodePath[Node] = js.native
  
  def getScope(scope: Scope): Scope = js.native
  
  def getSibling(key: String): NodePath[Node] = js.native
  def getSibling(key: Double): NodePath[Node] = js.native
  
  /** Get the source code associated with this node. */
  def getSource(): String = js.native
  
  /** Walk up the tree until we hit a parent node path in a list. */
  def getStatementParent(): NodePath[Statement] | Null = js.native
  
  //#endregion
  //#region ------------------------- inference -------------------------
  /** Infer the type of the current `NodePath`. */
  def getTypeAnnotation(): FlowType = js.native
  
  @JSName("get")
  def get_arguments(key: arguments): NodePathResult[
    js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  ] = js.native
  @JSName("get")
  def get_arguments(key: arguments, context: Boolean): NodePathResult[
    js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  ] = js.native
  @JSName("get")
  def get_arguments(key: arguments, context: TraversalContext): NodePathResult[
    js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  ] = js.native
  @JSName("get")
  def get_callee(key: callee): NodePathResult[Expression | Super_ | V8IntrinsicIdentifier_] = js.native
  @JSName("get")
  def get_callee(key: callee, context: Boolean): NodePathResult[Expression | Super_ | V8IntrinsicIdentifier_] = js.native
  @JSName("get")
  def get_callee(key: callee, context: TraversalContext): NodePathResult[Expression | Super_ | V8IntrinsicIdentifier_] = js.native
  @JSName("get")
  def get_callee_NodePath(callee: callee): NodePath[Identifier_] = js.native
  @JSName("get")
  def get_end(key: end): NodePathResult[Double | Null] = js.native
  @JSName("get")
  def get_end(key: end, context: Boolean): NodePathResult[Double | Null] = js.native
  @JSName("get")
  def get_end(key: end, context: TraversalContext): NodePathResult[Double | Null] = js.native
  @JSName("get")
  def get_extra(key: extra): NodePathResult[js.UndefOr[Record[String, Any]]] = js.native
  @JSName("get")
  def get_extra(key: extra, context: Boolean): NodePathResult[js.UndefOr[Record[String, Any]]] = js.native
  @JSName("get")
  def get_extra(key: extra, context: TraversalContext): NodePathResult[js.UndefOr[Record[String, Any]]] = js.native
  @JSName("get")
  def get_innerComments(key: innerComments): NodePathResult[js.Array[Comment] | Null] = js.native
  @JSName("get")
  def get_innerComments(key: innerComments, context: Boolean): NodePathResult[js.Array[Comment] | Null] = js.native
  @JSName("get")
  def get_innerComments(key: innerComments, context: TraversalContext): NodePathResult[js.Array[Comment] | Null] = js.native
  @JSName("get")
  def get_leadingComments(key: leadingComments): NodePathResult[js.Array[Comment] | Null] = js.native
  @JSName("get")
  def get_leadingComments(key: leadingComments, context: Boolean): NodePathResult[js.Array[Comment] | Null] = js.native
  @JSName("get")
  def get_leadingComments(key: leadingComments, context: TraversalContext): NodePathResult[js.Array[Comment] | Null] = js.native
  @JSName("get")
  def get_loc(key: loc): NodePathResult[SourceLocation | Null] = js.native
  @JSName("get")
  def get_loc(key: loc, context: Boolean): NodePathResult[SourceLocation | Null] = js.native
  @JSName("get")
  def get_loc(key: loc, context: TraversalContext): NodePathResult[SourceLocation | Null] = js.native
  @JSName("get")
  def get_optional(key: optional): NodePathResult[`true` | `false` | Null] = js.native
  @JSName("get")
  def get_optional(key: optional, context: Boolean): NodePathResult[`true` | `false` | Null] = js.native
  @JSName("get")
  def get_optional(key: optional, context: TraversalContext): NodePathResult[`true` | `false` | Null] = js.native
  @JSName("get")
  def get_start(key: start): NodePathResult[Double | Null] = js.native
  @JSName("get")
  def get_start(key: start, context: Boolean): NodePathResult[Double | Null] = js.native
  @JSName("get")
  def get_start(key: start, context: TraversalContext): NodePathResult[Double | Null] = js.native
  @JSName("get")
  def get_trailingComments(key: trailingComments): NodePathResult[js.Array[Comment] | Null] = js.native
  @JSName("get")
  def get_trailingComments(key: trailingComments, context: Boolean): NodePathResult[js.Array[Comment] | Null] = js.native
  @JSName("get")
  def get_trailingComments(key: trailingComments, context: TraversalContext): NodePathResult[js.Array[Comment] | Null] = js.native
  @JSName("get")
  def get_type(key: `type`): NodePathResult[CallExpression] = js.native
  @JSName("get")
  def get_type(key: `type`, context: Boolean): NodePathResult[CallExpression] = js.native
  @JSName("get")
  def get_type(key: `type`, context: TraversalContext): NodePathResult[CallExpression] = js.native
  @JSName("get")
  def get_typeArguments(key: typeArguments): NodePathResult[TypeParameterInstantiation_ | Null] = js.native
  @JSName("get")
  def get_typeArguments(key: typeArguments, context: Boolean): NodePathResult[TypeParameterInstantiation_ | Null] = js.native
  @JSName("get")
  def get_typeArguments(key: typeArguments, context: TraversalContext): NodePathResult[TypeParameterInstantiation_ | Null] = js.native
  @JSName("get")
  def get_typeParameters(key: typeParameters): NodePathResult[TSTypeParameterInstantiation_ | Null] = js.native
  @JSName("get")
  def get_typeParameters(key: typeParameters, context: Boolean): NodePathResult[TSTypeParameterInstantiation_ | Null] = js.native
  @JSName("get")
  def get_typeParameters(key: typeParameters, context: TraversalContext): NodePathResult[TSTypeParameterInstantiation_ | Null] = js.native
  
  /**
    * Check whether we have the input `key`. If the `key` references an array then we check
    * if the array has any items, otherwise we just check if it's falsy.
    */
  def has(key: String): Boolean = js.native
  
  def hasNode(): /* is @babel/traverse.@babel/traverse.NodePath<std.NonNullable<this['node']>> */ Boolean = js.native
  
  /** Hoist the current node to the highest scope possible and return a UID referencing it. */
  def hoist(scope: Scope): Unit = js.native
  
  var hub: Hub = js.native
  
  var inList: Boolean = js.native
  
  def inType(candidateTypes: String*): Boolean = js.native
  
  /**
    * Insert the provided nodes after the current one. When inserting nodes after an
    * expression, ensure that the completion record is correct by pushing the current node.
    */
  def insertAfter[Nodes /* <: Node | js.Array[Node] */](nodes: Nodes): NodePaths[Nodes] = js.native
  
  //#endregion
  //#region ------------------------- modification -------------------------
  /** Insert the provided nodes before the current one. */
  def insertBefore[Nodes /* <: Node | js.Array[Node] */](nodes: Nodes): NodePaths[Nodes] = js.native
  
  /** Alias of `has`. */
  def is(key: String): Boolean = js.native
  
  /**
    * A helper to find if `this` path is an ancestor of `maybeDescendant`
    */
  def isAncestor(maybeDescendant: NodePath[Node]): Boolean = js.native
  
  //#endregion
  //#region ------------------------- isXXX -------------------------
  def isAnyTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AnyTypeAnnotation> */ Boolean = js.native
  def isAnyTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AnyTypeAnnotation> */ Boolean = js.native
  
  def isArrayExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayExpression> */ Boolean = js.native
  def isArrayExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayExpression> */ Boolean = js.native
  
  def isArrayPattern(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayPattern> */ Boolean = js.native
  def isArrayPattern(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayPattern> */ Boolean = js.native
  
  def isArrayTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayTypeAnnotation> */ Boolean = js.native
  def isArrayTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayTypeAnnotation> */ Boolean = js.native
  
  def isArrowFunctionExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrowFunctionExpression> */ Boolean = js.native
  def isArrowFunctionExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrowFunctionExpression> */ Boolean = js.native
  
  def isAssignmentExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AssignmentExpression> */ Boolean = js.native
  def isAssignmentExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AssignmentExpression> */ Boolean = js.native
  
  def isAssignmentPattern(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AssignmentPattern> */ Boolean = js.native
  def isAssignmentPattern(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AssignmentPattern> */ Boolean = js.native
  
  def isAwaitExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AwaitExpression> */ Boolean = js.native
  def isAwaitExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AwaitExpression> */ Boolean = js.native
  
  def isBaseType(baseName: String): Boolean = js.native
  def isBaseType(baseName: String, soft: Boolean): Boolean = js.native
  
  def isBigIntLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BigIntLiteral> */ Boolean = js.native
  def isBigIntLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BigIntLiteral> */ Boolean = js.native
  
  def isBinary(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Binary> */ Boolean = js.native
  def isBinary(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Binary> */ Boolean = js.native
  
  def isBinaryExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BinaryExpression> */ Boolean = js.native
  def isBinaryExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BinaryExpression> */ Boolean = js.native
  
  def isBindExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BindExpression> */ Boolean = js.native
  def isBindExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BindExpression> */ Boolean = js.native
  
  def isBindingIdentifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier> */ Boolean = js.native
  def isBindingIdentifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier> */ Boolean = js.native
  
  def isBlacklisted(): Boolean = js.native
  
  def isBlock(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Block> */ Boolean = js.native
  def isBlock(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Block> */ Boolean = js.native
  
  def isBlockParent(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BlockParent> */ Boolean = js.native
  def isBlockParent(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BlockParent> */ Boolean = js.native
  
  def isBlockScoped(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionDeclaration | @babel/types.@babel/types.ClassDeclaration | @babel/types.@babel/types.VariableDeclaration> */ Boolean = js.native
  def isBlockScoped(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionDeclaration | @babel/types.@babel/types.ClassDeclaration | @babel/types.@babel/types.VariableDeclaration> */ Boolean = js.native
  
  def isBlockStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BlockStatement> */ Boolean = js.native
  def isBlockStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BlockStatement> */ Boolean = js.native
  
  def isBooleanLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanLiteral> */ Boolean = js.native
  def isBooleanLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanLiteral> */ Boolean = js.native
  
  def isBooleanLiteralTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanLiteralTypeAnnotation> */ Boolean = js.native
  def isBooleanLiteralTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanLiteralTypeAnnotation> */ Boolean = js.native
  
  def isBooleanTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanTypeAnnotation> */ Boolean = js.native
  def isBooleanTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanTypeAnnotation> */ Boolean = js.native
  
  def isBreakStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BreakStatement> */ Boolean = js.native
  def isBreakStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BreakStatement> */ Boolean = js.native
  
  def isCallExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CallExpression> */ Boolean = js.native
  def isCallExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CallExpression> */ Boolean = js.native
  
  def isCatchClause(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CatchClause> */ Boolean = js.native
  def isCatchClause(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CatchClause> */ Boolean = js.native
  
  def isClass(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Class> */ Boolean = js.native
  def isClass(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Class> */ Boolean = js.native
  
  def isClassBody(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassBody> */ Boolean = js.native
  def isClassBody(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassBody> */ Boolean = js.native
  
  def isClassDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassDeclaration> */ Boolean = js.native
  def isClassDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassDeclaration> */ Boolean = js.native
  
  def isClassExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassExpression> */ Boolean = js.native
  def isClassExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassExpression> */ Boolean = js.native
  
  def isClassImplements(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassImplements> */ Boolean = js.native
  def isClassImplements(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassImplements> */ Boolean = js.native
  
  def isClassMethod(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassMethod> */ Boolean = js.native
  def isClassMethod(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassMethod> */ Boolean = js.native
  
  def isClassPrivateMethod(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassPrivateMethod> */ Boolean = js.native
  def isClassPrivateMethod(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassPrivateMethod> */ Boolean = js.native
  
  def isClassPrivateProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassPrivateProperty> */ Boolean = js.native
  def isClassPrivateProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassPrivateProperty> */ Boolean = js.native
  
  def isClassProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassProperty> */ Boolean = js.native
  def isClassProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassProperty> */ Boolean = js.native
  
  /** Check whether the current path references a completion record */
  def isCompletionRecord(): Boolean = js.native
  def isCompletionRecord(allowInsideFunction: Boolean): Boolean = js.native
  
  def isCompletionStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CompletionStatement> */ Boolean = js.native
  def isCompletionStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CompletionStatement> */ Boolean = js.native
  
  def isConditional(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Conditional> */ Boolean = js.native
  def isConditional(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Conditional> */ Boolean = js.native
  
  def isConditionalExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ConditionalExpression> */ Boolean = js.native
  def isConditionalExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ConditionalExpression> */ Boolean = js.native
  
  def isContinueStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ContinueStatement> */ Boolean = js.native
  def isContinueStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ContinueStatement> */ Boolean = js.native
  
  def isDebuggerStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DebuggerStatement> */ Boolean = js.native
  def isDebuggerStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DebuggerStatement> */ Boolean = js.native
  
  def isDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Declaration> */ Boolean = js.native
  def isDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Declaration> */ Boolean = js.native
  
  def isDeclareClass(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareClass> */ Boolean = js.native
  def isDeclareClass(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareClass> */ Boolean = js.native
  
  def isDeclareExportAllDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareExportAllDeclaration> */ Boolean = js.native
  def isDeclareExportAllDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareExportAllDeclaration> */ Boolean = js.native
  
  def isDeclareExportDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareExportDeclaration> */ Boolean = js.native
  def isDeclareExportDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareExportDeclaration> */ Boolean = js.native
  
  def isDeclareFunction(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareFunction> */ Boolean = js.native
  def isDeclareFunction(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareFunction> */ Boolean = js.native
  
  def isDeclareInterface(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareInterface> */ Boolean = js.native
  def isDeclareInterface(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareInterface> */ Boolean = js.native
  
  def isDeclareModule(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareModule> */ Boolean = js.native
  def isDeclareModule(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareModule> */ Boolean = js.native
  
  def isDeclareModuleExports(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareModuleExports> */ Boolean = js.native
  def isDeclareModuleExports(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareModuleExports> */ Boolean = js.native
  
  def isDeclareOpaqueType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareOpaqueType> */ Boolean = js.native
  def isDeclareOpaqueType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareOpaqueType> */ Boolean = js.native
  
  def isDeclareTypeAlias(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareTypeAlias> */ Boolean = js.native
  def isDeclareTypeAlias(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareTypeAlias> */ Boolean = js.native
  
  def isDeclareVariable(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareVariable> */ Boolean = js.native
  def isDeclareVariable(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareVariable> */ Boolean = js.native
  
  def isDeclaredPredicate(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclaredPredicate> */ Boolean = js.native
  def isDeclaredPredicate(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclaredPredicate> */ Boolean = js.native
  
  def isDecorator(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Decorator> */ Boolean = js.native
  def isDecorator(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Decorator> */ Boolean = js.native
  
  /**
    * A helper to find if `this` path is a descendant of `maybeAncestor`
    */
  def isDescendant(maybeAncestor: NodePath[Node]): Boolean = js.native
  
  def isDirective(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Directive> */ Boolean = js.native
  def isDirective(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Directive> */ Boolean = js.native
  
  def isDirectiveLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DirectiveLiteral> */ Boolean = js.native
  def isDirectiveLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DirectiveLiteral> */ Boolean = js.native
  
  def isDoExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DoExpression> */ Boolean = js.native
  def isDoExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DoExpression> */ Boolean = js.native
  
  def isDoWhileStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DoWhileStatement> */ Boolean = js.native
  def isDoWhileStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DoWhileStatement> */ Boolean = js.native
  
  def isEmptyStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.EmptyStatement> */ Boolean = js.native
  def isEmptyStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.EmptyStatement> */ Boolean = js.native
  
  def isEmptyTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.EmptyTypeAnnotation> */ Boolean = js.native
  def isEmptyTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.EmptyTypeAnnotation> */ Boolean = js.native
  
  def isExistsTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExistsTypeAnnotation> */ Boolean = js.native
  def isExistsTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExistsTypeAnnotation> */ Boolean = js.native
  
  def isExportAllDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportAllDeclaration> */ Boolean = js.native
  def isExportAllDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportAllDeclaration> */ Boolean = js.native
  
  def isExportDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDeclaration> */ Boolean = js.native
  def isExportDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDeclaration> */ Boolean = js.native
  
  def isExportDefaultDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDefaultDeclaration> */ Boolean = js.native
  def isExportDefaultDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDefaultDeclaration> */ Boolean = js.native
  
  def isExportDefaultSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDefaultSpecifier> */ Boolean = js.native
  def isExportDefaultSpecifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDefaultSpecifier> */ Boolean = js.native
  
  def isExportNamedDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportNamedDeclaration> */ Boolean = js.native
  def isExportNamedDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportNamedDeclaration> */ Boolean = js.native
  
  def isExportNamespaceSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportNamespaceSpecifier> */ Boolean = js.native
  def isExportNamespaceSpecifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportNamespaceSpecifier> */ Boolean = js.native
  
  def isExportSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportSpecifier> */ Boolean = js.native
  def isExportSpecifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportSpecifier> */ Boolean = js.native
  
  def isExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Expression> */ Boolean = js.native
  def isExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Expression> */ Boolean = js.native
  
  def isExpressionStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExpressionStatement> */ Boolean = js.native
  def isExpressionStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExpressionStatement> */ Boolean = js.native
  
  def isExpressionWrapper(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExpressionWrapper> */ Boolean = js.native
  def isExpressionWrapper(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExpressionWrapper> */ Boolean = js.native
  
  def isFile(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.File> */ Boolean = js.native
  def isFile(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.File> */ Boolean = js.native
  
  def isFlow(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Flow> */ Boolean = js.native
  def isFlow(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Flow> */ Boolean = js.native
  
  def isFlowBaseAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowBaseAnnotation> */ Boolean = js.native
  def isFlowBaseAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowBaseAnnotation> */ Boolean = js.native
  
  def isFlowDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowDeclaration> */ Boolean = js.native
  def isFlowDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowDeclaration> */ Boolean = js.native
  
  def isFlowPredicate(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowPredicate> */ Boolean = js.native
  def isFlowPredicate(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowPredicate> */ Boolean = js.native
  
  def isFlowType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowType> */ Boolean = js.native
  def isFlowType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowType> */ Boolean = js.native
  
  def isFor(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.For> */ Boolean = js.native
  def isFor(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.For> */ Boolean = js.native
  
  def isForInStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForInStatement> */ Boolean = js.native
  def isForInStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForInStatement> */ Boolean = js.native
  
  def isForOfStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForOfStatement> */ Boolean = js.native
  def isForOfStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForOfStatement> */ Boolean = js.native
  
  def isForStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForStatement> */ Boolean = js.native
  def isForStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForStatement> */ Boolean = js.native
  
  def isForXStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForXStatement> */ Boolean = js.native
  def isForXStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForXStatement> */ Boolean = js.native
  
  def isFunction(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Function> */ Boolean = js.native
  def isFunction(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Function> */ Boolean = js.native
  
  def isFunctionDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionDeclaration> */ Boolean = js.native
  def isFunctionDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionDeclaration> */ Boolean = js.native
  
  def isFunctionExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionExpression> */ Boolean = js.native
  def isFunctionExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionExpression> */ Boolean = js.native
  
  def isFunctionParent(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionParent> */ Boolean = js.native
  def isFunctionParent(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionParent> */ Boolean = js.native
  
  def isFunctionTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionTypeAnnotation> */ Boolean = js.native
  def isFunctionTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionTypeAnnotation> */ Boolean = js.native
  
  def isFunctionTypeParam(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionTypeParam> */ Boolean = js.native
  def isFunctionTypeParam(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionTypeParam> */ Boolean = js.native
  
  def isGenerated(): Boolean = js.native
  def isGenerated(props: js.Object): Boolean = js.native
  
  def isGenericType(genericName: String): Boolean = js.native
  
  def isGenericTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.GenericTypeAnnotation> */ Boolean = js.native
  def isGenericTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.GenericTypeAnnotation> */ Boolean = js.native
  
  def isIdentifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier> */ Boolean = js.native
  def isIdentifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier> */ Boolean = js.native
  
  def isIfStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.IfStatement> */ Boolean = js.native
  def isIfStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.IfStatement> */ Boolean = js.native
  
  def isImmutable(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Immutable> */ Boolean = js.native
  def isImmutable(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Immutable> */ Boolean = js.native
  
  def isImport(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Import> */ Boolean = js.native
  def isImport(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Import> */ Boolean = js.native
  
  def isImportDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportDeclaration> */ Boolean = js.native
  def isImportDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportDeclaration> */ Boolean = js.native
  
  def isImportDefaultSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportDefaultSpecifier> */ Boolean = js.native
  def isImportDefaultSpecifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportDefaultSpecifier> */ Boolean = js.native
  
  def isImportNamespaceSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportNamespaceSpecifier> */ Boolean = js.native
  def isImportNamespaceSpecifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportNamespaceSpecifier> */ Boolean = js.native
  
  def isImportSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportSpecifier> */ Boolean = js.native
  def isImportSpecifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportSpecifier> */ Boolean = js.native
  
  def isInferredPredicate(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InferredPredicate> */ Boolean = js.native
  def isInferredPredicate(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InferredPredicate> */ Boolean = js.native
  
  def isInterfaceDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterfaceDeclaration> */ Boolean = js.native
  def isInterfaceDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterfaceDeclaration> */ Boolean = js.native
  
  def isInterfaceExtends(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterfaceExtends> */ Boolean = js.native
  def isInterfaceExtends(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterfaceExtends> */ Boolean = js.native
  
  def isInterfaceTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterfaceTypeAnnotation> */ Boolean = js.native
  def isInterfaceTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterfaceTypeAnnotation> */ Boolean = js.native
  
  def isInterpreterDirective(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterpreterDirective> */ Boolean = js.native
  def isInterpreterDirective(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterpreterDirective> */ Boolean = js.native
  
  def isIntersectionTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.IntersectionTypeAnnotation> */ Boolean = js.native
  def isIntersectionTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.IntersectionTypeAnnotation> */ Boolean = js.native
  
  def isJSX(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSX> */ Boolean = js.native
  def isJSX(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSX> */ Boolean = js.native
  
  def isJSXAttribute(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXAttribute> */ Boolean = js.native
  def isJSXAttribute(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXAttribute> */ Boolean = js.native
  
  def isJSXClosingElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXClosingElement> */ Boolean = js.native
  def isJSXClosingElement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXClosingElement> */ Boolean = js.native
  
  def isJSXClosingFragment(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXClosingFragment> */ Boolean = js.native
  def isJSXClosingFragment(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXClosingFragment> */ Boolean = js.native
  
  def isJSXElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXElement> */ Boolean = js.native
  def isJSXElement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXElement> */ Boolean = js.native
  
  def isJSXEmptyExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXEmptyExpression> */ Boolean = js.native
  def isJSXEmptyExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXEmptyExpression> */ Boolean = js.native
  
  def isJSXExpressionContainer(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXExpressionContainer> */ Boolean = js.native
  def isJSXExpressionContainer(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXExpressionContainer> */ Boolean = js.native
  
  def isJSXFragment(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXFragment> */ Boolean = js.native
  def isJSXFragment(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXFragment> */ Boolean = js.native
  
  def isJSXIdentifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXIdentifier> */ Boolean = js.native
  def isJSXIdentifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXIdentifier> */ Boolean = js.native
  
  def isJSXMemberExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXMemberExpression> */ Boolean = js.native
  def isJSXMemberExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXMemberExpression> */ Boolean = js.native
  
  def isJSXNamespacedName(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXNamespacedName> */ Boolean = js.native
  def isJSXNamespacedName(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXNamespacedName> */ Boolean = js.native
  
  def isJSXOpeningElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXOpeningElement> */ Boolean = js.native
  def isJSXOpeningElement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXOpeningElement> */ Boolean = js.native
  
  def isJSXOpeningFragment(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXOpeningFragment> */ Boolean = js.native
  def isJSXOpeningFragment(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXOpeningFragment> */ Boolean = js.native
  
  def isJSXSpreadAttribute(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXSpreadAttribute> */ Boolean = js.native
  def isJSXSpreadAttribute(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXSpreadAttribute> */ Boolean = js.native
  
  def isJSXSpreadChild(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXSpreadChild> */ Boolean = js.native
  def isJSXSpreadChild(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXSpreadChild> */ Boolean = js.native
  
  def isJSXText(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXText> */ Boolean = js.native
  def isJSXText(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXText> */ Boolean = js.native
  
  def isLVal(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LVal> */ Boolean = js.native
  def isLVal(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LVal> */ Boolean = js.native
  
  def isLabeledStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LabeledStatement> */ Boolean = js.native
  def isLabeledStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LabeledStatement> */ Boolean = js.native
  
  def isLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Literal> */ Boolean = js.native
  def isLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Literal> */ Boolean = js.native
  
  def isLogicalExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LogicalExpression> */ Boolean = js.native
  def isLogicalExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LogicalExpression> */ Boolean = js.native
  
  def isLoop(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Loop> */ Boolean = js.native
  def isLoop(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Loop> */ Boolean = js.native
  
  def isMemberExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MemberExpression> */ Boolean = js.native
  def isMemberExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MemberExpression> */ Boolean = js.native
  
  def isMetaProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MetaProperty> */ Boolean = js.native
  def isMetaProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MetaProperty> */ Boolean = js.native
  
  def isMethod(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Method> */ Boolean = js.native
  def isMethod(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Method> */ Boolean = js.native
  
  def isMixedTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MixedTypeAnnotation> */ Boolean = js.native
  def isMixedTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MixedTypeAnnotation> */ Boolean = js.native
  
  def isModuleDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ModuleDeclaration> */ Boolean = js.native
  def isModuleDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ModuleDeclaration> */ Boolean = js.native
  
  def isModuleSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ModuleSpecifier> */ Boolean = js.native
  def isModuleSpecifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ModuleSpecifier> */ Boolean = js.native
  
  def isNewExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NewExpression> */ Boolean = js.native
  def isNewExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NewExpression> */ Boolean = js.native
  
  /**
    * Check the type against our stored internal type of the node. This is handy when a node has
    * been removed yet we still internally know the type and need it to calculate node replacement.
    */
  def isNodeType(`type`: String): Boolean = js.native
  
  def isNoop(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Noop> */ Boolean = js.native
  def isNoop(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Noop> */ Boolean = js.native
  
  def isNullLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullLiteral> */ Boolean = js.native
  def isNullLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullLiteral> */ Boolean = js.native
  
  def isNullLiteralTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullLiteralTypeAnnotation> */ Boolean = js.native
  def isNullLiteralTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullLiteralTypeAnnotation> */ Boolean = js.native
  
  def isNullableTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullableTypeAnnotation> */ Boolean = js.native
  def isNullableTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullableTypeAnnotation> */ Boolean = js.native
  
  /** @deprecated Use `isNumericLiteral` */
  def isNumberLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumericLiteral> */ Boolean = js.native
  def isNumberLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumericLiteral> */ Boolean = js.native
  
  def isNumberLiteralTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumberLiteralTypeAnnotation> */ Boolean = js.native
  def isNumberLiteralTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumberLiteralTypeAnnotation> */ Boolean = js.native
  
  def isNumberTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumberTypeAnnotation> */ Boolean = js.native
  def isNumberTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumberTypeAnnotation> */ Boolean = js.native
  
  def isNumericLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumericLiteral> */ Boolean = js.native
  def isNumericLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumericLiteral> */ Boolean = js.native
  
  def isObjectExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectExpression> */ Boolean = js.native
  def isObjectExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectExpression> */ Boolean = js.native
  
  def isObjectMember(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectMember> */ Boolean = js.native
  def isObjectMember(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectMember> */ Boolean = js.native
  
  def isObjectMethod(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectMethod> */ Boolean = js.native
  def isObjectMethod(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectMethod> */ Boolean = js.native
  
  def isObjectPattern(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectPattern> */ Boolean = js.native
  def isObjectPattern(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectPattern> */ Boolean = js.native
  
  def isObjectProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectProperty> */ Boolean = js.native
  def isObjectProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectProperty> */ Boolean = js.native
  
  def isObjectTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeAnnotation> */ Boolean = js.native
  def isObjectTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeAnnotation> */ Boolean = js.native
  
  def isObjectTypeCallProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeCallProperty> */ Boolean = js.native
  def isObjectTypeCallProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeCallProperty> */ Boolean = js.native
  
  def isObjectTypeIndexer(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeIndexer> */ Boolean = js.native
  def isObjectTypeIndexer(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeIndexer> */ Boolean = js.native
  
  def isObjectTypeInternalSlot(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeInternalSlot> */ Boolean = js.native
  def isObjectTypeInternalSlot(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeInternalSlot> */ Boolean = js.native
  
  def isObjectTypeProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeProperty> */ Boolean = js.native
  def isObjectTypeProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeProperty> */ Boolean = js.native
  
  def isObjectTypeSpreadProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeSpreadProperty> */ Boolean = js.native
  def isObjectTypeSpreadProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeSpreadProperty> */ Boolean = js.native
  
  def isOpaqueType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.OpaqueType> */ Boolean = js.native
  def isOpaqueType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.OpaqueType> */ Boolean = js.native
  
  def isOptionalCallExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.OptionalCallExpression> */ Boolean = js.native
  def isOptionalCallExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.OptionalCallExpression> */ Boolean = js.native
  
  def isOptionalMemberExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.OptionalMemberExpression> */ Boolean = js.native
  def isOptionalMemberExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.OptionalMemberExpression> */ Boolean = js.native
  
  def isParenthesizedExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ParenthesizedExpression> */ Boolean = js.native
  def isParenthesizedExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ParenthesizedExpression> */ Boolean = js.native
  
  def isPattern(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Pattern> */ Boolean = js.native
  def isPattern(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Pattern> */ Boolean = js.native
  
  def isPatternLike(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.PatternLike> */ Boolean = js.native
  def isPatternLike(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.PatternLike> */ Boolean = js.native
  
  def isPipelineBareFunction(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.PipelineBareFunction> */ Boolean = js.native
  def isPipelineBareFunction(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.PipelineBareFunction> */ Boolean = js.native
  
  def isPipelinePrimaryTopicReference(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.PipelinePrimaryTopicReference> */ Boolean = js.native
  def isPipelinePrimaryTopicReference(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.PipelinePrimaryTopicReference> */ Boolean = js.native
  
  def isPipelineTopicExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.PipelineTopicExpression> */ Boolean = js.native
  def isPipelineTopicExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.PipelineTopicExpression> */ Boolean = js.native
  
  def isPrivate(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Private> */ Boolean = js.native
  def isPrivate(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Private> */ Boolean = js.native
  
  def isPrivateName(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.PrivateName> */ Boolean = js.native
  def isPrivateName(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.PrivateName> */ Boolean = js.native
  
  def isProgram(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Program> */ Boolean = js.native
  def isProgram(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Program> */ Boolean = js.native
  
  def isProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Property> */ Boolean = js.native
  def isProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Property> */ Boolean = js.native
  
  def isPure(): Boolean = js.native
  def isPure(props: js.Object): Boolean = js.native
  
  def isPureish(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Pureish> */ Boolean = js.native
  def isPureish(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Pureish> */ Boolean = js.native
  
  def isQualifiedTypeIdentifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.QualifiedTypeIdentifier> */ Boolean = js.native
  def isQualifiedTypeIdentifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.QualifiedTypeIdentifier> */ Boolean = js.native
  
  def isReferenced(): Boolean = js.native
  def isReferenced(props: js.Object): Boolean = js.native
  
  def isReferencedIdentifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier | @babel/types.@babel/types.JSXIdentifier> */ Boolean = js.native
  def isReferencedIdentifier(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier | @babel/types.@babel/types.JSXIdentifier> */ Boolean = js.native
  
  def isReferencedMemberExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MemberExpression> */ Boolean = js.native
  def isReferencedMemberExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MemberExpression> */ Boolean = js.native
  
  def isRegExpLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RegExpLiteral> */ Boolean = js.native
  def isRegExpLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RegExpLiteral> */ Boolean = js.native
  
  /** @deprecated Use `isRegExpLiteral` */
  def isRegexLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RegExpLiteral> */ Boolean = js.native
  def isRegexLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RegExpLiteral> */ Boolean = js.native
  
  def isRestElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RestElement> */ Boolean = js.native
  def isRestElement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RestElement> */ Boolean = js.native
  
  /** @deprecated Use `isRestElement` */
  def isRestProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RestElement> */ Boolean = js.native
  def isRestProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RestElement> */ Boolean = js.native
  
  def isReturnStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ReturnStatement> */ Boolean = js.native
  def isReturnStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ReturnStatement> */ Boolean = js.native
  
  def isScopable(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Scopable> */ Boolean = js.native
  def isScopable(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Scopable> */ Boolean = js.native
  
  def isScope(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Scopable> */ Boolean = js.native
  def isScope(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Scopable> */ Boolean = js.native
  
  def isSequenceExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SequenceExpression> */ Boolean = js.native
  def isSequenceExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SequenceExpression> */ Boolean = js.native
  
  def isSpreadElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SpreadElement> */ Boolean = js.native
  def isSpreadElement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SpreadElement> */ Boolean = js.native
  
  /** @deprecated Use `isSpreadElement` */
  def isSpreadProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SpreadElement> */ Boolean = js.native
  def isSpreadProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SpreadElement> */ Boolean = js.native
  
  def isStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Statement> */ Boolean = js.native
  def isStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Statement> */ Boolean = js.native
  
  /**
    * Check whether or not the current `key` allows either a single statement or block statement
    * so we can explode it if necessary.
    */
  def isStatementOrBlock(): Boolean = js.native
  
  def isStatic(): Boolean = js.native
  
  def isStringLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringLiteral> */ Boolean = js.native
  def isStringLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringLiteral> */ Boolean = js.native
  
  def isStringLiteralTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringLiteralTypeAnnotation> */ Boolean = js.native
  def isStringLiteralTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringLiteralTypeAnnotation> */ Boolean = js.native
  
  def isStringTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringTypeAnnotation> */ Boolean = js.native
  def isStringTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringTypeAnnotation> */ Boolean = js.native
  
  def isSuper(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Super> */ Boolean = js.native
  def isSuper(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Super> */ Boolean = js.native
  
  def isSwitchCase(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SwitchCase> */ Boolean = js.native
  def isSwitchCase(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SwitchCase> */ Boolean = js.native
  
  def isSwitchStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SwitchStatement> */ Boolean = js.native
  def isSwitchStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SwitchStatement> */ Boolean = js.native
  
  def isTSAnyKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSAnyKeyword> */ Boolean = js.native
  def isTSAnyKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSAnyKeyword> */ Boolean = js.native
  
  def isTSArrayType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSArrayType> */ Boolean = js.native
  def isTSArrayType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSArrayType> */ Boolean = js.native
  
  def isTSAsExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSAsExpression> */ Boolean = js.native
  def isTSAsExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSAsExpression> */ Boolean = js.native
  
  def isTSBooleanKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSBooleanKeyword> */ Boolean = js.native
  def isTSBooleanKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSBooleanKeyword> */ Boolean = js.native
  
  def isTSCallSignatureDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSCallSignatureDeclaration> */ Boolean = js.native
  def isTSCallSignatureDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSCallSignatureDeclaration> */ Boolean = js.native
  
  def isTSConditionalType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSConditionalType> */ Boolean = js.native
  def isTSConditionalType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSConditionalType> */ Boolean = js.native
  
  def isTSConstructSignatureDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSConstructSignatureDeclaration> */ Boolean = js.native
  def isTSConstructSignatureDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSConstructSignatureDeclaration> */ Boolean = js.native
  
  def isTSConstructorType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSConstructorType> */ Boolean = js.native
  def isTSConstructorType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSConstructorType> */ Boolean = js.native
  
  def isTSDeclareFunction(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSDeclareFunction> */ Boolean = js.native
  def isTSDeclareFunction(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSDeclareFunction> */ Boolean = js.native
  
  def isTSDeclareMethod(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSDeclareMethod> */ Boolean = js.native
  def isTSDeclareMethod(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSDeclareMethod> */ Boolean = js.native
  
  def isTSEntityName(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSEntityName> */ Boolean = js.native
  def isTSEntityName(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSEntityName> */ Boolean = js.native
  
  def isTSEnumDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSEnumDeclaration> */ Boolean = js.native
  def isTSEnumDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSEnumDeclaration> */ Boolean = js.native
  
  def isTSEnumMember(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSEnumMember> */ Boolean = js.native
  def isTSEnumMember(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSEnumMember> */ Boolean = js.native
  
  def isTSExportAssignment(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSExportAssignment> */ Boolean = js.native
  def isTSExportAssignment(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSExportAssignment> */ Boolean = js.native
  
  def isTSExpressionWithTypeArguments(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSExpressionWithTypeArguments> */ Boolean = js.native
  def isTSExpressionWithTypeArguments(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSExpressionWithTypeArguments> */ Boolean = js.native
  
  def isTSExternalModuleReference(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSExternalModuleReference> */ Boolean = js.native
  def isTSExternalModuleReference(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSExternalModuleReference> */ Boolean = js.native
  
  def isTSFunctionType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSFunctionType> */ Boolean = js.native
  def isTSFunctionType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSFunctionType> */ Boolean = js.native
  
  def isTSImportEqualsDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSImportEqualsDeclaration> */ Boolean = js.native
  def isTSImportEqualsDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSImportEqualsDeclaration> */ Boolean = js.native
  
  def isTSImportType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSImportType> */ Boolean = js.native
  def isTSImportType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSImportType> */ Boolean = js.native
  
  def isTSIndexSignature(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSIndexSignature> */ Boolean = js.native
  def isTSIndexSignature(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSIndexSignature> */ Boolean = js.native
  
  def isTSIndexedAccessType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSIndexedAccessType> */ Boolean = js.native
  def isTSIndexedAccessType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSIndexedAccessType> */ Boolean = js.native
  
  def isTSInferType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSInferType> */ Boolean = js.native
  def isTSInferType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSInferType> */ Boolean = js.native
  
  def isTSInterfaceBody(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSInterfaceBody> */ Boolean = js.native
  def isTSInterfaceBody(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSInterfaceBody> */ Boolean = js.native
  
  def isTSInterfaceDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSInterfaceDeclaration> */ Boolean = js.native
  def isTSInterfaceDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSInterfaceDeclaration> */ Boolean = js.native
  
  def isTSIntersectionType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSIntersectionType> */ Boolean = js.native
  def isTSIntersectionType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSIntersectionType> */ Boolean = js.native
  
  def isTSLiteralType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSLiteralType> */ Boolean = js.native
  def isTSLiteralType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSLiteralType> */ Boolean = js.native
  
  def isTSMappedType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSMappedType> */ Boolean = js.native
  def isTSMappedType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSMappedType> */ Boolean = js.native
  
  def isTSMethodSignature(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSMethodSignature> */ Boolean = js.native
  def isTSMethodSignature(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSMethodSignature> */ Boolean = js.native
  
  def isTSModuleBlock(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSModuleBlock> */ Boolean = js.native
  def isTSModuleBlock(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSModuleBlock> */ Boolean = js.native
  
  def isTSModuleDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSModuleDeclaration> */ Boolean = js.native
  def isTSModuleDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSModuleDeclaration> */ Boolean = js.native
  
  def isTSNamespaceExportDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSNamespaceExportDeclaration> */ Boolean = js.native
  def isTSNamespaceExportDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSNamespaceExportDeclaration> */ Boolean = js.native
  
  def isTSNeverKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSNeverKeyword> */ Boolean = js.native
  def isTSNeverKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSNeverKeyword> */ Boolean = js.native
  
  def isTSNonNullExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSNonNullExpression> */ Boolean = js.native
  def isTSNonNullExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSNonNullExpression> */ Boolean = js.native
  
  def isTSNullKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSNullKeyword> */ Boolean = js.native
  def isTSNullKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSNullKeyword> */ Boolean = js.native
  
  def isTSNumberKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSNumberKeyword> */ Boolean = js.native
  def isTSNumberKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSNumberKeyword> */ Boolean = js.native
  
  def isTSObjectKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSObjectKeyword> */ Boolean = js.native
  def isTSObjectKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSObjectKeyword> */ Boolean = js.native
  
  def isTSOptionalType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSOptionalType> */ Boolean = js.native
  def isTSOptionalType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSOptionalType> */ Boolean = js.native
  
  def isTSParameterProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSParameterProperty> */ Boolean = js.native
  def isTSParameterProperty(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSParameterProperty> */ Boolean = js.native
  
  def isTSParenthesizedType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSParenthesizedType> */ Boolean = js.native
  def isTSParenthesizedType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSParenthesizedType> */ Boolean = js.native
  
  def isTSPropertySignature(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSPropertySignature> */ Boolean = js.native
  def isTSPropertySignature(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSPropertySignature> */ Boolean = js.native
  
  def isTSQualifiedName(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSQualifiedName> */ Boolean = js.native
  def isTSQualifiedName(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSQualifiedName> */ Boolean = js.native
  
  def isTSRestType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSRestType> */ Boolean = js.native
  def isTSRestType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSRestType> */ Boolean = js.native
  
  def isTSStringKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSStringKeyword> */ Boolean = js.native
  def isTSStringKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSStringKeyword> */ Boolean = js.native
  
  def isTSSymbolKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSSymbolKeyword> */ Boolean = js.native
  def isTSSymbolKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSSymbolKeyword> */ Boolean = js.native
  
  def isTSThisType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSThisType> */ Boolean = js.native
  def isTSThisType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSThisType> */ Boolean = js.native
  
  def isTSTupleType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTupleType> */ Boolean = js.native
  def isTSTupleType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTupleType> */ Boolean = js.native
  
  def isTSType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSType> */ Boolean = js.native
  def isTSType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSType> */ Boolean = js.native
  
  def isTSTypeAliasDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeAliasDeclaration> */ Boolean = js.native
  def isTSTypeAliasDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeAliasDeclaration> */ Boolean = js.native
  
  def isTSTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeAnnotation> */ Boolean = js.native
  def isTSTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeAnnotation> */ Boolean = js.native
  
  def isTSTypeAssertion(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeAssertion> */ Boolean = js.native
  def isTSTypeAssertion(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeAssertion> */ Boolean = js.native
  
  def isTSTypeElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeElement> */ Boolean = js.native
  def isTSTypeElement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeElement> */ Boolean = js.native
  
  def isTSTypeLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeLiteral> */ Boolean = js.native
  def isTSTypeLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeLiteral> */ Boolean = js.native
  
  def isTSTypeOperator(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeOperator> */ Boolean = js.native
  def isTSTypeOperator(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeOperator> */ Boolean = js.native
  
  def isTSTypeParameter(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeParameter> */ Boolean = js.native
  def isTSTypeParameter(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeParameter> */ Boolean = js.native
  
  def isTSTypeParameterDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeParameterDeclaration> */ Boolean = js.native
  def isTSTypeParameterDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeParameterDeclaration> */ Boolean = js.native
  
  def isTSTypeParameterInstantiation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeParameterInstantiation> */ Boolean = js.native
  def isTSTypeParameterInstantiation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeParameterInstantiation> */ Boolean = js.native
  
  def isTSTypePredicate(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypePredicate> */ Boolean = js.native
  def isTSTypePredicate(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypePredicate> */ Boolean = js.native
  
  def isTSTypeQuery(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeQuery> */ Boolean = js.native
  def isTSTypeQuery(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeQuery> */ Boolean = js.native
  
  def isTSTypeReference(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeReference> */ Boolean = js.native
  def isTSTypeReference(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSTypeReference> */ Boolean = js.native
  
  def isTSUndefinedKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSUndefinedKeyword> */ Boolean = js.native
  def isTSUndefinedKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSUndefinedKeyword> */ Boolean = js.native
  
  def isTSUnionType(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSUnionType> */ Boolean = js.native
  def isTSUnionType(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSUnionType> */ Boolean = js.native
  
  def isTSUnknownKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSUnknownKeyword> */ Boolean = js.native
  def isTSUnknownKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSUnknownKeyword> */ Boolean = js.native
  
  def isTSVoidKeyword(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSVoidKeyword> */ Boolean = js.native
  def isTSVoidKeyword(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TSVoidKeyword> */ Boolean = js.native
  
  def isTaggedTemplateExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TaggedTemplateExpression> */ Boolean = js.native
  def isTaggedTemplateExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TaggedTemplateExpression> */ Boolean = js.native
  
  def isTemplateElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TemplateElement> */ Boolean = js.native
  def isTemplateElement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TemplateElement> */ Boolean = js.native
  
  def isTemplateLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TemplateLiteral> */ Boolean = js.native
  def isTemplateLiteral(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TemplateLiteral> */ Boolean = js.native
  
  def isTerminatorless(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Terminatorless> */ Boolean = js.native
  def isTerminatorless(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Terminatorless> */ Boolean = js.native
  
  def isThisExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThisExpression> */ Boolean = js.native
  def isThisExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThisExpression> */ Boolean = js.native
  
  def isThisTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThisTypeAnnotation> */ Boolean = js.native
  def isThisTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThisTypeAnnotation> */ Boolean = js.native
  
  def isThrowStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThrowStatement> */ Boolean = js.native
  def isThrowStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThrowStatement> */ Boolean = js.native
  
  def isTryStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TryStatement> */ Boolean = js.native
  def isTryStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TryStatement> */ Boolean = js.native
  
  def isTupleTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TupleTypeAnnotation> */ Boolean = js.native
  def isTupleTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TupleTypeAnnotation> */ Boolean = js.native
  
  def isTypeAlias(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeAlias> */ Boolean = js.native
  def isTypeAlias(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeAlias> */ Boolean = js.native
  
  def isTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeAnnotation> */ Boolean = js.native
  def isTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeAnnotation> */ Boolean = js.native
  
  def isTypeCastExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeCastExpression> */ Boolean = js.native
  def isTypeCastExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeCastExpression> */ Boolean = js.native
  
  def isTypeParameter(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeParameter> */ Boolean = js.native
  def isTypeParameter(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeParameter> */ Boolean = js.native
  
  def isTypeParameterDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeParameterDeclaration> */ Boolean = js.native
  def isTypeParameterDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeParameterDeclaration> */ Boolean = js.native
  
  def isTypeParameterInstantiation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeParameterInstantiation> */ Boolean = js.native
  def isTypeParameterInstantiation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeParameterInstantiation> */ Boolean = js.native
  
  def isTypeofTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeofTypeAnnotation> */ Boolean = js.native
  def isTypeofTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeofTypeAnnotation> */ Boolean = js.native
  
  def isUnaryExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnaryExpression> */ Boolean = js.native
  def isUnaryExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnaryExpression> */ Boolean = js.native
  
  def isUnaryLike(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnaryLike> */ Boolean = js.native
  def isUnaryLike(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnaryLike> */ Boolean = js.native
  
  def isUnionTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnionTypeAnnotation> */ Boolean = js.native
  def isUnionTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnionTypeAnnotation> */ Boolean = js.native
  
  def isUpdateExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UpdateExpression> */ Boolean = js.native
  def isUpdateExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UpdateExpression> */ Boolean = js.native
  
  def isUser(): Boolean = js.native
  def isUser(props: js.Object): Boolean = js.native
  
  def isUserWhitespacable(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UserWhitespacable> */ Boolean = js.native
  def isUserWhitespacable(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UserWhitespacable> */ Boolean = js.native
  
  def isVar(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclaration> */ Boolean = js.native
  def isVar(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclaration> */ Boolean = js.native
  
  def isVariableDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclaration> */ Boolean = js.native
  def isVariableDeclaration(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclaration> */ Boolean = js.native
  
  def isVariableDeclarator(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclarator> */ Boolean = js.native
  def isVariableDeclarator(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclarator> */ Boolean = js.native
  
  def isVariance(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Variance> */ Boolean = js.native
  def isVariance(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Variance> */ Boolean = js.native
  
  def isVoidTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VoidTypeAnnotation> */ Boolean = js.native
  def isVoidTypeAnnotation(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VoidTypeAnnotation> */ Boolean = js.native
  
  def isWhile(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.While> */ Boolean = js.native
  def isWhile(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.While> */ Boolean = js.native
  
  def isWhileStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.WhileStatement> */ Boolean = js.native
  def isWhileStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.WhileStatement> */ Boolean = js.native
  
  def isWithStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.WithStatement> */ Boolean = js.native
  def isWithStatement(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.WithStatement> */ Boolean = js.native
  
  def isYieldExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.YieldExpression> */ Boolean = js.native
  def isYieldExpression(props: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.YieldExpression> */ Boolean = js.native
  
  /** Opposite of `has`. */
  def isnt(key: String): Boolean = js.native
  
  var key: String | Double = js.native
  
  var listKey: String = js.native
  
  //#endregion
  //#region ------------------------- introspection -------------------------
  /**
    * Match the current node if it matches the provided `pattern`.
    *
    * For example, given the match `React.createClass` it would match the
    * parsed nodes of `React.createClass` and `React["createClass"]`.
    */
  def matchesPattern(pattern: String): Boolean = js.native
  def matchesPattern(pattern: String, allowPartial: Boolean): Boolean = js.native
  
  var node: CallExpression_ = js.native
  
  var opts: js.Object = js.native
  
  var parent: Node = js.native
  
  var parentKey: String = js.native
  
  var parentPath: /* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.CallExpression extends @babel/types.@babel/types.Program ? null : @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Node> */ js.Any = js.native
  
  def popContext(): Unit = js.native
  
  /**
    * Insert child nodes at the end of the current node.
    * @param listKey - The key at which the child nodes are stored (usually body).
    * @param nodes - the nodes to insert.
    */
  def pushContainer[Nodes /* <: Node | js.Array[Node] */](listKey: ArrayKeys[CallExpression_], nodes: Nodes): NodePaths[Nodes] = js.native
  
  def pushContext(context: TraversalContext): Unit = js.native
  
  /** Check if the currently assigned path references the `importName` of `moduleSource`. */
  def referencesImport(moduleSource: String, importName: String): Boolean = js.native
  
  //#endregion
  //#region ------------------------- removal -------------------------
  def remove(): Unit = js.native
  
  var removed: Boolean = js.native
  
  /**
    * This method takes an array of statements nodes and then explodes it
    * into expressions. This method retains completion records which is
    * extremely important to retain original semantics.
    */
  def replaceExpressionWithStatements[Nodes /* <: js.Array[Node] */](nodes: Nodes): NodePaths[Nodes] = js.native
  
  def replaceInline[Nodes /* <: Node | js.Array[Node] */](nodes: Nodes): NodePaths[Nodes] = js.native
  
  /** Replace the current node with another. */
  def replaceWith[T /* <: Node */](replacement: T): js.Array[NodePath[T]] = js.native
  def replaceWith[T /* <: Node */](replacement: NodePath[T]): js.Array[NodePath[T]] = js.native
  
  //#endregion
  //#region ------------------------- replacement -------------------------
  /**
    * Replace a node with an array of multiple. This method performs the following steps:
    *
    *  - Inherit the comments of first provided node with that of the current node.
    *  - Insert the provided nodes after the current node.
    *  - Remove the current node.
    */
  def replaceWithMultiple[Nodes /* <: js.Array[Node] */](nodes: Nodes): NodePaths[Nodes] = js.native
  
  /**
    * Parse a string as an expression and replace the current node with the result.
    *
    * NOTE: This is typically not a good idea to use. Building source strings when
    * transforming ASTs is an antipattern and SHOULD NOT be encouraged. Even if it's
    * easier to use, your transforms will be extremely brittle.
    */
  def replaceWithSourceString(replacement: Any): js.Array[NodePath[Node]] = js.native
  
  var scope: Scope = js.native
  
  def set(key: String, node: Node): Unit = js.native
  
  def setContext(): this.type = js.native
  def setContext(context: TraversalContext): this.type = js.native
  
  def setData(key: String, `val`: Any): Any = js.native
  
  def setScope(): Unit = js.native
  
  //#endregion
  //#region ------------------------- comments -------------------------
  /** Share comments amongst siblings. */
  def shareCommentsWithSiblings(): Unit = js.native
  
  var shouldSkip: Boolean = js.native
  
  var shouldStop: Boolean = js.native
  
  def skip(): Unit = js.native
  
  def skipKey(key: String): Unit = js.native
  
  var skipKeys: js.Object = js.native
  
  var state: Any = js.native
  
  def stop(): Unit = js.native
  
  def traverse(visitor: typings.babelTraverse.mod.Visitor[js.Object]): Unit = js.native
  def traverse[T](visitor: typings.babelTraverse.mod.Visitor[T], state: T): Unit = js.native
  
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.CallExpression extends null | undefined ? undefined : @babel/types.@babel/types.CallExpression extends @babel/types.@babel/types.Node ? 'CallExpression' : string | undefined */ js.Any = js.native
  
  var typeAnnotation: js.Object = js.native
  
  /**
    * Insert child nodes at the start of the current node.
    * @param listKey - The key at which the child nodes are stored (usually body).
    * @param nodes - the nodes to insert.
    */
  def unshiftContainer[Nodes /* <: Node | js.Array[Node] */](listKey: ArrayKeys[CallExpression_], nodes: Nodes): NodePaths[Nodes] = js.native
  
  /** Update all sibling node paths after `fromIndex` by `incrementBy`. */
  def updateSiblingKeys(fromIndex: Double, incrementBy: Double): Unit = js.native
  
  def visit(): Boolean = js.native
  
  /** Check if the current path will maybe execute before another path */
  def willIMaybeExecuteBefore(path: NodePath[Node]): Boolean = js.native
}
