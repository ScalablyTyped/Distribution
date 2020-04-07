package typings.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleListener
  extends NodeListener
     with /* key */ StringDictionary[
      js.UndefOr[
        (js.Function2[(/* codePath */ CodePath) | (/* segment */ CodePathSegment), /* node */ Node, Unit]) | (js.Function3[
          /* fromSegment */ CodePathSegment, 
          /* toSegment */ CodePathSegment, 
          /* node */ Node, 
          Unit
        ]) | (js.Function1[/* node */ Node, Unit])
      ]
    ] {
  var onCodePathEnd: js.UndefOr[js.Function2[/* codePath */ CodePath, /* node */ Node, Unit]] = js.undefined
  var onCodePathSegmentEnd: js.UndefOr[js.Function2[/* segment */ CodePathSegment, /* node */ Node, Unit]] = js.undefined
  var onCodePathSegmentLoop: js.UndefOr[
    js.Function3[
      /* fromSegment */ CodePathSegment, 
      /* toSegment */ CodePathSegment, 
      /* node */ Node, 
      Unit
    ]
  ] = js.undefined
  var onCodePathSegmentStart: js.UndefOr[js.Function2[/* segment */ CodePathSegment, /* node */ Node, Unit]] = js.undefined
  var onCodePathStart: js.UndefOr[js.Function2[/* codePath */ CodePath, /* node */ Node, Unit]] = js.undefined
}

object RuleListener {
  @scala.inline
  def apply(
    ArrayExpression: /* node */ Node => Unit = null,
    ArrayPattern: /* node */ Node => Unit = null,
    ArrowFunctionExpression: /* node */ Node => Unit = null,
    AssignmentExpression: /* node */ Node => Unit = null,
    AssignmentPattern: /* node */ Node => Unit = null,
    AwaitExpression: /* node */ Node => Unit = null,
    BinaryExpression: /* node */ Node => Unit = null,
    BlockStatement: /* node */ Node => Unit = null,
    BreakStatement: /* node */ Node => Unit = null,
    CallExpression: /* node */ Node => Unit = null,
    CatchClause: /* node */ Node => Unit = null,
    ClassBody: /* node */ Node => Unit = null,
    ClassDeclaration: /* node */ Node => Unit = null,
    ClassExpression: /* node */ Node => Unit = null,
    ConditionalExpression: /* node */ Node => Unit = null,
    ContinueStatement: /* node */ Node => Unit = null,
    DebuggerStatement: /* node */ Node => Unit = null,
    DoWhileStatement: /* node */ Node => Unit = null,
    EmptyStatement: /* node */ Node => Unit = null,
    ExportAllDeclaration: /* node */ Node => Unit = null,
    ExportDefaultDeclaration: /* node */ Node => Unit = null,
    ExportNamedDeclaration: /* node */ Node => Unit = null,
    ExportSpecifier: /* node */ Node => Unit = null,
    ExpressionStatement: /* node */ Node => Unit = null,
    ForInStatement: /* node */ Node => Unit = null,
    ForOfStatement: /* node */ Node => Unit = null,
    ForStatement: /* node */ Node => Unit = null,
    FunctionDeclaration: /* node */ Node => Unit = null,
    FunctionExpression: /* node */ Node => Unit = null,
    Identifier: /* node */ Node => Unit = null,
    IfStatement: /* node */ Node => Unit = null,
    ImportDeclaration: /* node */ Node => Unit = null,
    ImportDefaultSpecifier: /* node */ Node => Unit = null,
    ImportExpression: /* node */ Node => Unit = null,
    ImportNamespaceSpecifier: /* node */ Node => Unit = null,
    ImportSpecifier: /* node */ Node => Unit = null,
    LabeledStatement: /* node */ Node => Unit = null,
    Literal: /* node */ Node => Unit = null,
    LogicalExpression: /* node */ Node => Unit = null,
    MemberExpression: /* node */ Node => Unit = null,
    MetaProperty: /* node */ Node => Unit = null,
    MethodDefinition: /* node */ Node => Unit = null,
    NewExpression: /* node */ Node => Unit = null,
    ObjectExpression: /* node */ Node => Unit = null,
    ObjectPattern: /* node */ Node => Unit = null,
    Program: /* node */ Node => Unit = null,
    Property: /* node */ Node => Unit = null,
    RestElement: /* node */ Node => Unit = null,
    ReturnStatement: /* node */ Node => Unit = null,
    SequenceExpression: /* node */ Node => Unit = null,
    SpreadElement: /* node */ Node => Unit = null,
    StringDictionary: /* key */ StringDictionary[
      js.UndefOr[
        (js.Function2[(/* codePath */ CodePath) | (/* segment */ CodePathSegment), /* node */ Node, Unit]) | (js.Function3[
          /* fromSegment */ CodePathSegment, 
          /* toSegment */ CodePathSegment, 
          /* node */ Node, 
          Unit
        ]) | (js.Function1[/* node */ Node, Unit])
      ]
    ] = null,
    Super: /* node */ Node => Unit = null,
    SwitchCase: /* node */ Node => Unit = null,
    SwitchStatement: /* node */ Node => Unit = null,
    TaggedTemplateExpression: /* node */ Node => Unit = null,
    TemplateElement: /* node */ Node => Unit = null,
    TemplateLiteral: /* node */ Node => Unit = null,
    ThisExpression: /* node */ Node => Unit = null,
    ThrowStatement: /* node */ Node => Unit = null,
    TryStatement: /* node */ Node => Unit = null,
    UnaryExpression: /* node */ Node => Unit = null,
    UpdateExpression: /* node */ Node => Unit = null,
    VariableDeclaration: /* node */ Node => Unit = null,
    VariableDeclarator: /* node */ Node => Unit = null,
    WhileStatement: /* node */ Node => Unit = null,
    WithStatement: /* node */ Node => Unit = null,
    YieldExpression: /* node */ Node => Unit = null,
    onCodePathEnd: (/* codePath */ CodePath, /* node */ Node) => Unit = null,
    onCodePathSegmentEnd: (/* segment */ CodePathSegment, /* node */ Node) => Unit = null,
    onCodePathSegmentLoop: (/* fromSegment */ CodePathSegment, /* toSegment */ CodePathSegment, /* node */ Node) => Unit = null,
    onCodePathSegmentStart: (/* segment */ CodePathSegment, /* node */ Node) => Unit = null,
    onCodePathStart: (/* codePath */ CodePath, /* node */ Node) => Unit = null
  ): RuleListener = {
    val __obj = js.Dynamic.literal()
    if (ArrayExpression != null) __obj.updateDynamic("ArrayExpression")(js.Any.fromFunction1(ArrayExpression))
    if (ArrayPattern != null) __obj.updateDynamic("ArrayPattern")(js.Any.fromFunction1(ArrayPattern))
    if (ArrowFunctionExpression != null) __obj.updateDynamic("ArrowFunctionExpression")(js.Any.fromFunction1(ArrowFunctionExpression))
    if (AssignmentExpression != null) __obj.updateDynamic("AssignmentExpression")(js.Any.fromFunction1(AssignmentExpression))
    if (AssignmentPattern != null) __obj.updateDynamic("AssignmentPattern")(js.Any.fromFunction1(AssignmentPattern))
    if (AwaitExpression != null) __obj.updateDynamic("AwaitExpression")(js.Any.fromFunction1(AwaitExpression))
    if (BinaryExpression != null) __obj.updateDynamic("BinaryExpression")(js.Any.fromFunction1(BinaryExpression))
    if (BlockStatement != null) __obj.updateDynamic("BlockStatement")(js.Any.fromFunction1(BlockStatement))
    if (BreakStatement != null) __obj.updateDynamic("BreakStatement")(js.Any.fromFunction1(BreakStatement))
    if (CallExpression != null) __obj.updateDynamic("CallExpression")(js.Any.fromFunction1(CallExpression))
    if (CatchClause != null) __obj.updateDynamic("CatchClause")(js.Any.fromFunction1(CatchClause))
    if (ClassBody != null) __obj.updateDynamic("ClassBody")(js.Any.fromFunction1(ClassBody))
    if (ClassDeclaration != null) __obj.updateDynamic("ClassDeclaration")(js.Any.fromFunction1(ClassDeclaration))
    if (ClassExpression != null) __obj.updateDynamic("ClassExpression")(js.Any.fromFunction1(ClassExpression))
    if (ConditionalExpression != null) __obj.updateDynamic("ConditionalExpression")(js.Any.fromFunction1(ConditionalExpression))
    if (ContinueStatement != null) __obj.updateDynamic("ContinueStatement")(js.Any.fromFunction1(ContinueStatement))
    if (DebuggerStatement != null) __obj.updateDynamic("DebuggerStatement")(js.Any.fromFunction1(DebuggerStatement))
    if (DoWhileStatement != null) __obj.updateDynamic("DoWhileStatement")(js.Any.fromFunction1(DoWhileStatement))
    if (EmptyStatement != null) __obj.updateDynamic("EmptyStatement")(js.Any.fromFunction1(EmptyStatement))
    if (ExportAllDeclaration != null) __obj.updateDynamic("ExportAllDeclaration")(js.Any.fromFunction1(ExportAllDeclaration))
    if (ExportDefaultDeclaration != null) __obj.updateDynamic("ExportDefaultDeclaration")(js.Any.fromFunction1(ExportDefaultDeclaration))
    if (ExportNamedDeclaration != null) __obj.updateDynamic("ExportNamedDeclaration")(js.Any.fromFunction1(ExportNamedDeclaration))
    if (ExportSpecifier != null) __obj.updateDynamic("ExportSpecifier")(js.Any.fromFunction1(ExportSpecifier))
    if (ExpressionStatement != null) __obj.updateDynamic("ExpressionStatement")(js.Any.fromFunction1(ExpressionStatement))
    if (ForInStatement != null) __obj.updateDynamic("ForInStatement")(js.Any.fromFunction1(ForInStatement))
    if (ForOfStatement != null) __obj.updateDynamic("ForOfStatement")(js.Any.fromFunction1(ForOfStatement))
    if (ForStatement != null) __obj.updateDynamic("ForStatement")(js.Any.fromFunction1(ForStatement))
    if (FunctionDeclaration != null) __obj.updateDynamic("FunctionDeclaration")(js.Any.fromFunction1(FunctionDeclaration))
    if (FunctionExpression != null) __obj.updateDynamic("FunctionExpression")(js.Any.fromFunction1(FunctionExpression))
    if (Identifier != null) __obj.updateDynamic("Identifier")(js.Any.fromFunction1(Identifier))
    if (IfStatement != null) __obj.updateDynamic("IfStatement")(js.Any.fromFunction1(IfStatement))
    if (ImportDeclaration != null) __obj.updateDynamic("ImportDeclaration")(js.Any.fromFunction1(ImportDeclaration))
    if (ImportDefaultSpecifier != null) __obj.updateDynamic("ImportDefaultSpecifier")(js.Any.fromFunction1(ImportDefaultSpecifier))
    if (ImportExpression != null) __obj.updateDynamic("ImportExpression")(js.Any.fromFunction1(ImportExpression))
    if (ImportNamespaceSpecifier != null) __obj.updateDynamic("ImportNamespaceSpecifier")(js.Any.fromFunction1(ImportNamespaceSpecifier))
    if (ImportSpecifier != null) __obj.updateDynamic("ImportSpecifier")(js.Any.fromFunction1(ImportSpecifier))
    if (LabeledStatement != null) __obj.updateDynamic("LabeledStatement")(js.Any.fromFunction1(LabeledStatement))
    if (Literal != null) __obj.updateDynamic("Literal")(js.Any.fromFunction1(Literal))
    if (LogicalExpression != null) __obj.updateDynamic("LogicalExpression")(js.Any.fromFunction1(LogicalExpression))
    if (MemberExpression != null) __obj.updateDynamic("MemberExpression")(js.Any.fromFunction1(MemberExpression))
    if (MetaProperty != null) __obj.updateDynamic("MetaProperty")(js.Any.fromFunction1(MetaProperty))
    if (MethodDefinition != null) __obj.updateDynamic("MethodDefinition")(js.Any.fromFunction1(MethodDefinition))
    if (NewExpression != null) __obj.updateDynamic("NewExpression")(js.Any.fromFunction1(NewExpression))
    if (ObjectExpression != null) __obj.updateDynamic("ObjectExpression")(js.Any.fromFunction1(ObjectExpression))
    if (ObjectPattern != null) __obj.updateDynamic("ObjectPattern")(js.Any.fromFunction1(ObjectPattern))
    if (Program != null) __obj.updateDynamic("Program")(js.Any.fromFunction1(Program))
    if (Property != null) __obj.updateDynamic("Property")(js.Any.fromFunction1(Property))
    if (RestElement != null) __obj.updateDynamic("RestElement")(js.Any.fromFunction1(RestElement))
    if (ReturnStatement != null) __obj.updateDynamic("ReturnStatement")(js.Any.fromFunction1(ReturnStatement))
    if (SequenceExpression != null) __obj.updateDynamic("SequenceExpression")(js.Any.fromFunction1(SequenceExpression))
    if (SpreadElement != null) __obj.updateDynamic("SpreadElement")(js.Any.fromFunction1(SpreadElement))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (Super != null) __obj.updateDynamic("Super")(js.Any.fromFunction1(Super))
    if (SwitchCase != null) __obj.updateDynamic("SwitchCase")(js.Any.fromFunction1(SwitchCase))
    if (SwitchStatement != null) __obj.updateDynamic("SwitchStatement")(js.Any.fromFunction1(SwitchStatement))
    if (TaggedTemplateExpression != null) __obj.updateDynamic("TaggedTemplateExpression")(js.Any.fromFunction1(TaggedTemplateExpression))
    if (TemplateElement != null) __obj.updateDynamic("TemplateElement")(js.Any.fromFunction1(TemplateElement))
    if (TemplateLiteral != null) __obj.updateDynamic("TemplateLiteral")(js.Any.fromFunction1(TemplateLiteral))
    if (ThisExpression != null) __obj.updateDynamic("ThisExpression")(js.Any.fromFunction1(ThisExpression))
    if (ThrowStatement != null) __obj.updateDynamic("ThrowStatement")(js.Any.fromFunction1(ThrowStatement))
    if (TryStatement != null) __obj.updateDynamic("TryStatement")(js.Any.fromFunction1(TryStatement))
    if (UnaryExpression != null) __obj.updateDynamic("UnaryExpression")(js.Any.fromFunction1(UnaryExpression))
    if (UpdateExpression != null) __obj.updateDynamic("UpdateExpression")(js.Any.fromFunction1(UpdateExpression))
    if (VariableDeclaration != null) __obj.updateDynamic("VariableDeclaration")(js.Any.fromFunction1(VariableDeclaration))
    if (VariableDeclarator != null) __obj.updateDynamic("VariableDeclarator")(js.Any.fromFunction1(VariableDeclarator))
    if (WhileStatement != null) __obj.updateDynamic("WhileStatement")(js.Any.fromFunction1(WhileStatement))
    if (WithStatement != null) __obj.updateDynamic("WithStatement")(js.Any.fromFunction1(WithStatement))
    if (YieldExpression != null) __obj.updateDynamic("YieldExpression")(js.Any.fromFunction1(YieldExpression))
    if (onCodePathEnd != null) __obj.updateDynamic("onCodePathEnd")(js.Any.fromFunction2(onCodePathEnd))
    if (onCodePathSegmentEnd != null) __obj.updateDynamic("onCodePathSegmentEnd")(js.Any.fromFunction2(onCodePathSegmentEnd))
    if (onCodePathSegmentLoop != null) __obj.updateDynamic("onCodePathSegmentLoop")(js.Any.fromFunction3(onCodePathSegmentLoop))
    if (onCodePathSegmentStart != null) __obj.updateDynamic("onCodePathSegmentStart")(js.Any.fromFunction2(onCodePathSegmentStart))
    if (onCodePathStart != null) __obj.updateDynamic("onCodePathStart")(js.Any.fromFunction2(onCodePathStart))
    __obj.asInstanceOf[RuleListener]
  }
}

