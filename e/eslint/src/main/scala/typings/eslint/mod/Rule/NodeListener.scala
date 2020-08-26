package typings.eslint.mod.Rule

import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ T in eslint.eslint.Rule.NodeTypes ]:? (node : estree.estree.Node): void} */
@js.native
trait NodeListener extends js.Object {
  var ArrayExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ArrayPattern: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ArrowFunctionExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var AssignmentExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var AssignmentPattern: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var AwaitExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var BinaryExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var BlockStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var BreakStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var CallExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var CatchClause: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ChainExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ClassBody: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ClassDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ClassExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ConditionalExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ContinueStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var DebuggerStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var DoWhileStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var EmptyStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ExportAllDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ExportDefaultDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ExportNamedDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ExportSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ExpressionStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ForInStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ForOfStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ForStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var FunctionDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var FunctionExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var Identifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var IfStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ImportDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ImportDefaultSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ImportExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ImportNamespaceSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ImportSpecifier: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var LabeledStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var Literal: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var LogicalExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var MemberExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var MetaProperty: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var MethodDefinition: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var NewExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ObjectExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ObjectPattern: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var Program: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var Property: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var RestElement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ReturnStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var SequenceExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var SpreadElement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var Super: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var SwitchCase: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var SwitchStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var TaggedTemplateExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var TemplateElement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var TemplateLiteral: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ThisExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var ThrowStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var TryStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var UnaryExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var UpdateExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var VariableDeclaration: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var VariableDeclarator: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var WhileStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var WithStatement: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var YieldExpression: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
}

object NodeListener {
  @scala.inline
  def apply(): NodeListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeListener]
  }
  @scala.inline
  implicit class NodeListenerOps[Self <: NodeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArrayExpression(value: /* node */ Node => Unit): Self = this.set("ArrayExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteArrayExpression: Self = this.set("ArrayExpression", js.undefined)
    @scala.inline
    def setArrayPattern(value: /* node */ Node => Unit): Self = this.set("ArrayPattern", js.Any.fromFunction1(value))
    @scala.inline
    def deleteArrayPattern: Self = this.set("ArrayPattern", js.undefined)
    @scala.inline
    def setArrowFunctionExpression(value: /* node */ Node => Unit): Self = this.set("ArrowFunctionExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteArrowFunctionExpression: Self = this.set("ArrowFunctionExpression", js.undefined)
    @scala.inline
    def setAssignmentExpression(value: /* node */ Node => Unit): Self = this.set("AssignmentExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAssignmentExpression: Self = this.set("AssignmentExpression", js.undefined)
    @scala.inline
    def setAssignmentPattern(value: /* node */ Node => Unit): Self = this.set("AssignmentPattern", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAssignmentPattern: Self = this.set("AssignmentPattern", js.undefined)
    @scala.inline
    def setAwaitExpression(value: /* node */ Node => Unit): Self = this.set("AwaitExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAwaitExpression: Self = this.set("AwaitExpression", js.undefined)
    @scala.inline
    def setBinaryExpression(value: /* node */ Node => Unit): Self = this.set("BinaryExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBinaryExpression: Self = this.set("BinaryExpression", js.undefined)
    @scala.inline
    def setBlockStatement(value: /* node */ Node => Unit): Self = this.set("BlockStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBlockStatement: Self = this.set("BlockStatement", js.undefined)
    @scala.inline
    def setBreakStatement(value: /* node */ Node => Unit): Self = this.set("BreakStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBreakStatement: Self = this.set("BreakStatement", js.undefined)
    @scala.inline
    def setCallExpression(value: /* node */ Node => Unit): Self = this.set("CallExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallExpression: Self = this.set("CallExpression", js.undefined)
    @scala.inline
    def setCatchClause(value: /* node */ Node => Unit): Self = this.set("CatchClause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCatchClause: Self = this.set("CatchClause", js.undefined)
    @scala.inline
    def setChainExpression(value: /* node */ Node => Unit): Self = this.set("ChainExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChainExpression: Self = this.set("ChainExpression", js.undefined)
    @scala.inline
    def setClassBody(value: /* node */ Node => Unit): Self = this.set("ClassBody", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClassBody: Self = this.set("ClassBody", js.undefined)
    @scala.inline
    def setClassDeclaration(value: /* node */ Node => Unit): Self = this.set("ClassDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClassDeclaration: Self = this.set("ClassDeclaration", js.undefined)
    @scala.inline
    def setClassExpression(value: /* node */ Node => Unit): Self = this.set("ClassExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClassExpression: Self = this.set("ClassExpression", js.undefined)
    @scala.inline
    def setConditionalExpression(value: /* node */ Node => Unit): Self = this.set("ConditionalExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConditionalExpression: Self = this.set("ConditionalExpression", js.undefined)
    @scala.inline
    def setContinueStatement(value: /* node */ Node => Unit): Self = this.set("ContinueStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContinueStatement: Self = this.set("ContinueStatement", js.undefined)
    @scala.inline
    def setDebuggerStatement(value: /* node */ Node => Unit): Self = this.set("DebuggerStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDebuggerStatement: Self = this.set("DebuggerStatement", js.undefined)
    @scala.inline
    def setDoWhileStatement(value: /* node */ Node => Unit): Self = this.set("DoWhileStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoWhileStatement: Self = this.set("DoWhileStatement", js.undefined)
    @scala.inline
    def setEmptyStatement(value: /* node */ Node => Unit): Self = this.set("EmptyStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEmptyStatement: Self = this.set("EmptyStatement", js.undefined)
    @scala.inline
    def setExportAllDeclaration(value: /* node */ Node => Unit): Self = this.set("ExportAllDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExportAllDeclaration: Self = this.set("ExportAllDeclaration", js.undefined)
    @scala.inline
    def setExportDefaultDeclaration(value: /* node */ Node => Unit): Self = this.set("ExportDefaultDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExportDefaultDeclaration: Self = this.set("ExportDefaultDeclaration", js.undefined)
    @scala.inline
    def setExportNamedDeclaration(value: /* node */ Node => Unit): Self = this.set("ExportNamedDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExportNamedDeclaration: Self = this.set("ExportNamedDeclaration", js.undefined)
    @scala.inline
    def setExportSpecifier(value: /* node */ Node => Unit): Self = this.set("ExportSpecifier", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExportSpecifier: Self = this.set("ExportSpecifier", js.undefined)
    @scala.inline
    def setExpressionStatement(value: /* node */ Node => Unit): Self = this.set("ExpressionStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpressionStatement: Self = this.set("ExpressionStatement", js.undefined)
    @scala.inline
    def setForInStatement(value: /* node */ Node => Unit): Self = this.set("ForInStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteForInStatement: Self = this.set("ForInStatement", js.undefined)
    @scala.inline
    def setForOfStatement(value: /* node */ Node => Unit): Self = this.set("ForOfStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteForOfStatement: Self = this.set("ForOfStatement", js.undefined)
    @scala.inline
    def setForStatement(value: /* node */ Node => Unit): Self = this.set("ForStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteForStatement: Self = this.set("ForStatement", js.undefined)
    @scala.inline
    def setFunctionDeclaration(value: /* node */ Node => Unit): Self = this.set("FunctionDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFunctionDeclaration: Self = this.set("FunctionDeclaration", js.undefined)
    @scala.inline
    def setFunctionExpression(value: /* node */ Node => Unit): Self = this.set("FunctionExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFunctionExpression: Self = this.set("FunctionExpression", js.undefined)
    @scala.inline
    def setIdentifier(value: /* node */ Node => Unit): Self = this.set("Identifier", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIdentifier: Self = this.set("Identifier", js.undefined)
    @scala.inline
    def setIfStatement(value: /* node */ Node => Unit): Self = this.set("IfStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIfStatement: Self = this.set("IfStatement", js.undefined)
    @scala.inline
    def setImportDeclaration(value: /* node */ Node => Unit): Self = this.set("ImportDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteImportDeclaration: Self = this.set("ImportDeclaration", js.undefined)
    @scala.inline
    def setImportDefaultSpecifier(value: /* node */ Node => Unit): Self = this.set("ImportDefaultSpecifier", js.Any.fromFunction1(value))
    @scala.inline
    def deleteImportDefaultSpecifier: Self = this.set("ImportDefaultSpecifier", js.undefined)
    @scala.inline
    def setImportExpression(value: /* node */ Node => Unit): Self = this.set("ImportExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteImportExpression: Self = this.set("ImportExpression", js.undefined)
    @scala.inline
    def setImportNamespaceSpecifier(value: /* node */ Node => Unit): Self = this.set("ImportNamespaceSpecifier", js.Any.fromFunction1(value))
    @scala.inline
    def deleteImportNamespaceSpecifier: Self = this.set("ImportNamespaceSpecifier", js.undefined)
    @scala.inline
    def setImportSpecifier(value: /* node */ Node => Unit): Self = this.set("ImportSpecifier", js.Any.fromFunction1(value))
    @scala.inline
    def deleteImportSpecifier: Self = this.set("ImportSpecifier", js.undefined)
    @scala.inline
    def setLabeledStatement(value: /* node */ Node => Unit): Self = this.set("LabeledStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLabeledStatement: Self = this.set("LabeledStatement", js.undefined)
    @scala.inline
    def setLiteral(value: /* node */ Node => Unit): Self = this.set("Literal", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLiteral: Self = this.set("Literal", js.undefined)
    @scala.inline
    def setLogicalExpression(value: /* node */ Node => Unit): Self = this.set("LogicalExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogicalExpression: Self = this.set("LogicalExpression", js.undefined)
    @scala.inline
    def setMemberExpression(value: /* node */ Node => Unit): Self = this.set("MemberExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMemberExpression: Self = this.set("MemberExpression", js.undefined)
    @scala.inline
    def setMetaProperty(value: /* node */ Node => Unit): Self = this.set("MetaProperty", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMetaProperty: Self = this.set("MetaProperty", js.undefined)
    @scala.inline
    def setMethodDefinition(value: /* node */ Node => Unit): Self = this.set("MethodDefinition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMethodDefinition: Self = this.set("MethodDefinition", js.undefined)
    @scala.inline
    def setNewExpression(value: /* node */ Node => Unit): Self = this.set("NewExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNewExpression: Self = this.set("NewExpression", js.undefined)
    @scala.inline
    def setObjectExpression(value: /* node */ Node => Unit): Self = this.set("ObjectExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteObjectExpression: Self = this.set("ObjectExpression", js.undefined)
    @scala.inline
    def setObjectPattern(value: /* node */ Node => Unit): Self = this.set("ObjectPattern", js.Any.fromFunction1(value))
    @scala.inline
    def deleteObjectPattern: Self = this.set("ObjectPattern", js.undefined)
    @scala.inline
    def setProgram(value: /* node */ Node => Unit): Self = this.set("Program", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProgram: Self = this.set("Program", js.undefined)
    @scala.inline
    def setProperty(value: /* node */ Node => Unit): Self = this.set("Property", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProperty: Self = this.set("Property", js.undefined)
    @scala.inline
    def setRestElement(value: /* node */ Node => Unit): Self = this.set("RestElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRestElement: Self = this.set("RestElement", js.undefined)
    @scala.inline
    def setReturnStatement(value: /* node */ Node => Unit): Self = this.set("ReturnStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReturnStatement: Self = this.set("ReturnStatement", js.undefined)
    @scala.inline
    def setSequenceExpression(value: /* node */ Node => Unit): Self = this.set("SequenceExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSequenceExpression: Self = this.set("SequenceExpression", js.undefined)
    @scala.inline
    def setSpreadElement(value: /* node */ Node => Unit): Self = this.set("SpreadElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSpreadElement: Self = this.set("SpreadElement", js.undefined)
    @scala.inline
    def setSuper(value: /* node */ Node => Unit): Self = this.set("Super", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuper: Self = this.set("Super", js.undefined)
    @scala.inline
    def setSwitchCase(value: /* node */ Node => Unit): Self = this.set("SwitchCase", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSwitchCase: Self = this.set("SwitchCase", js.undefined)
    @scala.inline
    def setSwitchStatement(value: /* node */ Node => Unit): Self = this.set("SwitchStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSwitchStatement: Self = this.set("SwitchStatement", js.undefined)
    @scala.inline
    def setTaggedTemplateExpression(value: /* node */ Node => Unit): Self = this.set("TaggedTemplateExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTaggedTemplateExpression: Self = this.set("TaggedTemplateExpression", js.undefined)
    @scala.inline
    def setTemplateElement(value: /* node */ Node => Unit): Self = this.set("TemplateElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateElement: Self = this.set("TemplateElement", js.undefined)
    @scala.inline
    def setTemplateLiteral(value: /* node */ Node => Unit): Self = this.set("TemplateLiteral", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateLiteral: Self = this.set("TemplateLiteral", js.undefined)
    @scala.inline
    def setThisExpression(value: /* node */ Node => Unit): Self = this.set("ThisExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteThisExpression: Self = this.set("ThisExpression", js.undefined)
    @scala.inline
    def setThrowStatement(value: /* node */ Node => Unit): Self = this.set("ThrowStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteThrowStatement: Self = this.set("ThrowStatement", js.undefined)
    @scala.inline
    def setTryStatement(value: /* node */ Node => Unit): Self = this.set("TryStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTryStatement: Self = this.set("TryStatement", js.undefined)
    @scala.inline
    def setUnaryExpression(value: /* node */ Node => Unit): Self = this.set("UnaryExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnaryExpression: Self = this.set("UnaryExpression", js.undefined)
    @scala.inline
    def setUpdateExpression(value: /* node */ Node => Unit): Self = this.set("UpdateExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateExpression: Self = this.set("UpdateExpression", js.undefined)
    @scala.inline
    def setVariableDeclaration(value: /* node */ Node => Unit): Self = this.set("VariableDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteVariableDeclaration: Self = this.set("VariableDeclaration", js.undefined)
    @scala.inline
    def setVariableDeclarator(value: /* node */ Node => Unit): Self = this.set("VariableDeclarator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteVariableDeclarator: Self = this.set("VariableDeclarator", js.undefined)
    @scala.inline
    def setWhileStatement(value: /* node */ Node => Unit): Self = this.set("WhileStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWhileStatement: Self = this.set("WhileStatement", js.undefined)
    @scala.inline
    def setWithStatement(value: /* node */ Node => Unit): Self = this.set("WithStatement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWithStatement: Self = this.set("WithStatement", js.undefined)
    @scala.inline
    def setYieldExpression(value: /* node */ Node => Unit): Self = this.set("YieldExpression", js.Any.fromFunction1(value))
    @scala.inline
    def deleteYieldExpression: Self = this.set("YieldExpression", js.undefined)
  }
  
}

