package typings.embroiderSharedInternals.anon

import typings.babelTraverse.anon.FnCall
import typings.babelTraverse.anon.Typeofvisitors
import typings.babelTraverse.mod.NodePath
import typings.babelTraverse.mod.Scope
import typings.babelTraverse.mod.TraverseOptions
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftraverse extends StObject {
  
  def apply(
    parent: js.UndefOr[Node | js.Array[Node] | Null],
    opts: js.UndefOr[TraverseOptions[Node]],
    scope: js.UndefOr[Scope],
    state: js.UndefOr[Any],
    parentPath: js.UndefOr[NodePath[Node]]
  ): Unit = js.native
  def apply[S](parent: js.Array[Node], opts: TraverseOptions[S], scope: Unit, state: S): Unit = js.native
  def apply[S](
    parent: js.Array[Node],
    opts: TraverseOptions[S],
    scope: Unit,
    state: S,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def apply[S](parent: js.Array[Node], opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  def apply[S](
    parent: js.Array[Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def apply[S](parent: Null, opts: TraverseOptions[S], scope: Unit, state: S): Unit = js.native
  def apply[S](parent: Null, opts: TraverseOptions[S], scope: Unit, state: S, parentPath: NodePath[Node]): Unit = js.native
  def apply[S](parent: Null, opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  def apply[S](parent: Null, opts: TraverseOptions[S], scope: Scope, state: S, parentPath: NodePath[Node]): Unit = js.native
  def apply[S](parent: Unit, opts: TraverseOptions[S], scope: Unit, state: S): Unit = js.native
  def apply[S](parent: Unit, opts: TraverseOptions[S], scope: Unit, state: S, parentPath: NodePath[Node]): Unit = js.native
  def apply[S](parent: Unit, opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  def apply[S](parent: Unit, opts: TraverseOptions[S], scope: Scope, state: S, parentPath: NodePath[Node]): Unit = js.native
  def apply[S](parent: Node, opts: TraverseOptions[S], scope: Unit, state: S): Unit = js.native
  def apply[S](parent: Node, opts: TraverseOptions[S], scope: Unit, state: S, parentPath: NodePath[Node]): Unit = js.native
  def apply[S](parent: Node, opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  def apply[S](parent: Node, opts: TraverseOptions[S], scope: Scope, state: S, parentPath: NodePath[Node]): Unit = js.native
  
  def explode[S](visitor: typings.babelTraverse.mod.Visitor[S]): /* import warning: importer.ImportType#apply Failed type conversion: {[ Type in 'ClassAccessorProperty' | 'AnyTypeAnnotation' | 'ArgumentPlaceholder' | 'ArrayExpression' | 'ArrayPattern' | 'ArrayTypeAnnotation' | 'ArrowFunctionExpression' | 'AssignmentExpression' | 'AssignmentPattern' | 'AwaitExpression' | 'BigIntLiteral' | 'BinaryExpression' | 'LogicalExpression' | 'BindExpression' | 'BlockStatement' | 'Program' | 'TSModuleBlock' | 'CatchClause' | 'DoWhileStatement' | 'ForInStatement' | 'ForStatement' | 'FunctionDeclaration' | 'FunctionExpression' | 'ObjectMethod' | 'SwitchStatement' | 'WhileStatement' | 'ForOfStatement' | 'ClassMethod' | 'ClassPrivateMethod' | 'StaticBlock' | 'BooleanLiteral' | 'BooleanLiteralTypeAnnotation' | 'BooleanTypeAnnotation' | 'BreakStatement' | 'CallExpression' | 'ClassExpression' | 'ClassDeclaration' | 'ClassBody' | 'ClassImplements' | 'ClassPrivateProperty' | 'ClassProperty' | 'ContinueStatement' | 'ReturnStatement' | 'ThrowStatement' | 'ConditionalExpression' | 'IfStatement' | 'DebuggerStatement' | 'DecimalLiteral' | 'VariableDeclaration' | 'ExportAllDeclaration' | 'ExportDefaultDeclaration' | 'ExportNamedDeclaration' | 'ImportDeclaration' | 'DeclareClass' | 'DeclareFunction' | 'DeclareInterface' | 'DeclareModule' | 'DeclareModuleExports' | 'DeclareTypeAlias' | 'DeclareOpaqueType' | 'DeclareVariable' | 'DeclareExportDeclaration' | 'DeclareExportAllDeclaration' | 'InterfaceDeclaration' | 'OpaqueType' | 'TypeAlias' | 'EnumDeclaration' | 'TSDeclareFunction' | 'TSInterfaceDeclaration' | 'TSTypeAliasDeclaration' | 'TSEnumDeclaration' | 'TSModuleDeclaration' | 'DeclaredPredicate' | 'Decorator' | 'Directive' | 'DirectiveLiteral' | 'DoExpression' | 'EmptyStatement' | 'EmptyTypeAnnotation' | 'EnumBooleanBody' | 'EnumNumberBody' | 'EnumStringBody' | 'EnumSymbolBody' | 'EnumBooleanMember' | 'EnumDefaultedMember' | 'EnumNumberMember' | 'EnumStringMember' | 'ExistsTypeAnnotation' | 'ExportDefaultSpecifier' | 'ExportNamespaceSpecifier' | 'ExportSpecifier' | 'Identifier' | 'StringLiteral' | 'NumericLiteral' | 'NullLiteral' | 'RegExpLiteral' | 'MemberExpression' | 'NewExpression' | 'ObjectExpression' | 'SequenceExpression' | 'ParenthesizedExpression' | 'ThisExpression' | 'UnaryExpression' | 'UpdateExpression' | 'MetaProperty' | 'Super' | 'TaggedTemplateExpression' | 'TemplateLiteral' | 'YieldExpression' | 'Import' | 'OptionalMemberExpression' | 'OptionalCallExpression' | 'TypeCastExpression' | 'JSXElement' | 'JSXFragment' | 'RecordExpression' | 'TupleExpression' | 'ModuleExpression' | 'TopicReference' | 'PipelineTopicExpression' | 'PipelineBareFunction' | 'PipelinePrimaryTopicReference' | 'TSInstantiationExpression' | 'TSAsExpression' | 'TSSatisfiesExpression' | 'TSTypeAssertion' | 'TSNonNullExpression' | 'ExpressionStatement' | 'File' | 'NullLiteralTypeAnnotation' | 'FunctionTypeAnnotation' | 'FunctionTypeParam' | 'GenericTypeAnnotation' | 'InferredPredicate' | 'InterfaceExtends' | 'InterfaceTypeAnnotation' | 'IntersectionTypeAnnotation' | 'MixedTypeAnnotation' | 'NullableTypeAnnotation' | 'NumberLiteralTypeAnnotation' | 'NumberTypeAnnotation' | 'ObjectTypeAnnotation' | 'ObjectTypeInternalSlot' | 'ObjectTypeCallProperty' | 'ObjectTypeIndexer' | 'ObjectTypeProperty' | 'ObjectTypeSpreadProperty' | 'QualifiedTypeIdentifier' | 'StringLiteralTypeAnnotation' | 'StringTypeAnnotation' | 'SymbolTypeAnnotation' | 'ThisTypeAnnotation' | 'TupleTypeAnnotation' | 'TypeofTypeAnnotation' | 'TypeAnnotation' | 'TypeParameter' | 'TypeParameterDeclaration' | 'TypeParameterInstantiation' | 'UnionTypeAnnotation' | 'Variance' | 'VoidTypeAnnotation' | 'IndexedAccessType' | 'OptionalIndexedAccessType' | 'JSXAttribute' | 'JSXClosingElement' | 'JSXExpressionContainer' | 'JSXSpreadChild' | 'JSXOpeningElement' | 'JSXText' | 'JSXOpeningFragment' | 'JSXClosingFragment' | 'ImportAttribute' | 'ImportDefaultSpecifier' | 'ImportNamespaceSpecifier' | 'ImportSpecifier' | 'InterpreterDirective' | 'JSXEmptyExpression' | 'JSXIdentifier' | 'JSXMemberExpression' | 'JSXNamespacedName' | 'JSXSpreadAttribute' | 'RestElement' | 'ObjectPattern' | 'TSParameterProperty' | 'LabeledStatement' | 'Noop' | 'Placeholder' | 'V8IntrinsicIdentifier' | 'ObjectProperty' | 'PrivateName' | 'SpreadElement' | 'SwitchCase' | 'TryStatement' | 'VariableDeclarator' | 'WithStatement' | 'TemplateElement' | 'TSImportEqualsDeclaration' | 'TSExportAssignment' | 'TSNamespaceExportDeclaration' | 'TSAnyKeyword' | 'TSArrayType' | 'TSBooleanKeyword' | 'TSBigIntKeyword' | 'TSIntrinsicKeyword' | 'TSNeverKeyword' | 'TSNullKeyword' | 'TSNumberKeyword' | 'TSObjectKeyword' | 'TSStringKeyword' | 'TSSymbolKeyword' | 'TSUndefinedKeyword' | 'TSUnknownKeyword' | 'TSVoidKeyword' | 'TSThisType' | 'TSLiteralType' | 'TSCallSignatureDeclaration' | 'TSConditionalType' | 'TSConstructSignatureDeclaration' | 'TSConstructorType' | 'TSDeclareMethod' | 'TSQualifiedName' | 'TSEnumMember' | 'TSExpressionWithTypeArguments' | 'TSExternalModuleReference' | 'TSFunctionType' | 'TSImportType' | 'TSIndexSignature' | 'TSIndexedAccessType' | 'TSInferType' | 'TSInterfaceBody' | 'TSIntersectionType' | 'TSMappedType' | 'TSMethodSignature' | 'TSNamedTupleMember' | 'TSOptionalType' | 'TSParenthesizedType' | 'TSPropertySignature' | 'TSRestType' | 'TSTupleType' | 'TSTypeReference' | 'TSTypePredicate' | 'TSTypeQuery' | 'TSTypeLiteral' | 'TSUnionType' | 'TSTypeOperator' | 'TSTypeAnnotation' | 'TSTypeParameter' | 'TSTypeParameterDeclaration' | 'TSTypeParameterInstantiation' ]:? @babel/traverse.@babel/traverse.VisitNodeObject<S, std.Extract<@babel/types.@babel/types.Node, {  type :Type}>>} */ js.Any = js.native
  @JSName("explode")
  var explode_Original: FnCall = js.native
  
  def verify(visitor: typings.babelTraverse.mod.Visitor[js.Object]): Unit = js.native
  @JSName("verify")
  var verify_Original: js.Function1[/* visitor */ typings.babelTraverse.mod.Visitor[js.Object], Unit] = js.native
  
  var visitors: Typeofvisitors = js.native
}
