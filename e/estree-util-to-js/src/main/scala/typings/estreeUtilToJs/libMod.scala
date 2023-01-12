package typings.estreeUtilToJs

import org.scalablytyped.runtime.Instantiable0
import typings.estreeUtilToJs.anon.PartialGenerator
import typings.estreeUtilToJs.libTypesMod.Handler
import typings.sourceMap.mod.SourceMapConsumer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("estree-util-to-js/lib", "toJs")
  @js.native
  val toJs: (js.Function2[
    /* value */ Program, 
    /* options */ OptionsWithSourceMapGenerator, 
    ResultWithSourceMapGenerator
  ]) & (js.Function2[
    /* value */ Program, 
    /* options */ js.UndefOr[OptionsWithoutSourceMapGenerator], 
    ResultWithoutSourceMapGenerator
  ]) = js.native
  
  trait BaseFields extends StObject {
    
    /**
      * Object mapping node types to functions handling the corresponding nodes.
      */
    var handlers: js.UndefOr[PartialGenerator] = js.undefined
  }
  object BaseFields {
    
    inline def apply(): BaseFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseFields] (val x: Self) extends AnyVal {
      
      inline def setHandlers(value: PartialGenerator): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    }
  }
  
  trait BaseResultFields extends StObject {
    
    /**
      * Serialized JavaScript.
      */
    var value: String
  }
  object BaseResultFields {
    
    inline def apply(value: String): BaseResultFields = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResultFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseResultFields] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined estree-util-to-js.estree-util-to-js/lib/types.Handlers */
  trait Handlers extends StObject {
    
    var ArrayExpression: js.UndefOr[Handler] = js.undefined
    
    var ArrayPattern: js.UndefOr[Handler] = js.undefined
    
    var ArrowFunctionExpression: js.UndefOr[Handler] = js.undefined
    
    var AssignmentExpression: js.UndefOr[Handler] = js.undefined
    
    var AssignmentPattern: js.UndefOr[Handler] = js.undefined
    
    var AwaitExpression: js.UndefOr[Handler] = js.undefined
    
    var BinaryExpression: js.UndefOr[Handler] = js.undefined
    
    var BlockStatement: js.UndefOr[Handler] = js.undefined
    
    var BreakStatement: js.UndefOr[Handler] = js.undefined
    
    var CallExpression: js.UndefOr[Handler] = js.undefined
    
    var CatchClause: js.UndefOr[Handler] = js.undefined
    
    var ChainExpression: js.UndefOr[Handler] = js.undefined
    
    var ClassBody: js.UndefOr[Handler] = js.undefined
    
    var ClassDeclaration: js.UndefOr[Handler] = js.undefined
    
    var ClassExpression: js.UndefOr[Handler] = js.undefined
    
    var ConditionalExpression: js.UndefOr[Handler] = js.undefined
    
    var ContinueStatement: js.UndefOr[Handler] = js.undefined
    
    var DebuggerStatement: js.UndefOr[Handler] = js.undefined
    
    var DoWhileStatement: js.UndefOr[Handler] = js.undefined
    
    var EmptyStatement: js.UndefOr[Handler] = js.undefined
    
    var ExportAllDeclaration: js.UndefOr[Handler] = js.undefined
    
    var ExportDefaultDeclaration: js.UndefOr[Handler] = js.undefined
    
    var ExportNamedDeclaration: js.UndefOr[Handler] = js.undefined
    
    var ExportSpecifier: js.UndefOr[Handler] = js.undefined
    
    var ExpressionStatement: js.UndefOr[Handler] = js.undefined
    
    var ForInStatement: js.UndefOr[Handler] = js.undefined
    
    var ForOfStatement: js.UndefOr[Handler] = js.undefined
    
    var ForStatement: js.UndefOr[Handler] = js.undefined
    
    var FunctionDeclaration: js.UndefOr[Handler] = js.undefined
    
    var FunctionExpression: js.UndefOr[Handler] = js.undefined
    
    var Identifier: js.UndefOr[Handler] = js.undefined
    
    var IfStatement: js.UndefOr[Handler] = js.undefined
    
    var ImportDeclaration: js.UndefOr[Handler] = js.undefined
    
    var ImportDefaultSpecifier: js.UndefOr[Handler] = js.undefined
    
    var ImportExpression: js.UndefOr[Handler] = js.undefined
    
    var ImportNamespaceSpecifier: js.UndefOr[Handler] = js.undefined
    
    var ImportSpecifier: js.UndefOr[Handler] = js.undefined
    
    var JSXAttribute: js.UndefOr[Handler] = js.undefined
    
    var JSXClosingElement: js.UndefOr[Handler] = js.undefined
    
    var JSXClosingFragment: js.UndefOr[Handler] = js.undefined
    
    var JSXElement: js.UndefOr[Handler] = js.undefined
    
    var JSXEmptyExpression: js.UndefOr[Handler] = js.undefined
    
    var JSXExpressionContainer: js.UndefOr[Handler] = js.undefined
    
    var JSXFragment: js.UndefOr[Handler] = js.undefined
    
    var JSXIdentifier: js.UndefOr[Handler] = js.undefined
    
    var JSXMemberExpression: js.UndefOr[Handler] = js.undefined
    
    var JSXNamespacedName: js.UndefOr[Handler] = js.undefined
    
    var JSXOpeningElement: js.UndefOr[Handler] = js.undefined
    
    var JSXOpeningFragment: js.UndefOr[Handler] = js.undefined
    
    var JSXSpreadAttribute: js.UndefOr[Handler] = js.undefined
    
    var JSXText: js.UndefOr[Handler] = js.undefined
    
    var LabeledStatement: js.UndefOr[Handler] = js.undefined
    
    var Literal: js.UndefOr[Handler] = js.undefined
    
    var LogicalExpression: js.UndefOr[Handler] = js.undefined
    
    var MemberExpression: js.UndefOr[Handler] = js.undefined
    
    var MetaProperty: js.UndefOr[Handler] = js.undefined
    
    var MethodDefinition: js.UndefOr[Handler] = js.undefined
    
    var NewExpression: js.UndefOr[Handler] = js.undefined
    
    var ObjectExpression: js.UndefOr[Handler] = js.undefined
    
    var ObjectPattern: js.UndefOr[Handler] = js.undefined
    
    var PrivateIdentifier: js.UndefOr[Handler] = js.undefined
    
    var Program: js.UndefOr[Handler] = js.undefined
    
    var Property: js.UndefOr[Handler] = js.undefined
    
    var PropertyDefinition: js.UndefOr[Handler] = js.undefined
    
    var RestElement: js.UndefOr[Handler] = js.undefined
    
    var ReturnStatement: js.UndefOr[Handler] = js.undefined
    
    var SequenceExpression: js.UndefOr[Handler] = js.undefined
    
    var SpreadElement: js.UndefOr[Handler] = js.undefined
    
    var StaticBlock: js.UndefOr[Handler] = js.undefined
    
    var Super: js.UndefOr[Handler] = js.undefined
    
    var SwitchCase: js.UndefOr[Handler] = js.undefined
    
    var SwitchStatement: js.UndefOr[Handler] = js.undefined
    
    var TaggedTemplateExpression: js.UndefOr[Handler] = js.undefined
    
    var TemplateElement: js.UndefOr[Handler] = js.undefined
    
    var TemplateLiteral: js.UndefOr[Handler] = js.undefined
    
    var ThisExpression: js.UndefOr[Handler] = js.undefined
    
    var ThrowStatement: js.UndefOr[Handler] = js.undefined
    
    var TryStatement: js.UndefOr[Handler] = js.undefined
    
    var UnaryExpression: js.UndefOr[Handler] = js.undefined
    
    var UpdateExpression: js.UndefOr[Handler] = js.undefined
    
    var VariableDeclaration: js.UndefOr[Handler] = js.undefined
    
    var VariableDeclarator: js.UndefOr[Handler] = js.undefined
    
    var WhileStatement: js.UndefOr[Handler] = js.undefined
    
    var WithStatement: js.UndefOr[Handler] = js.undefined
    
    var YieldExpression: js.UndefOr[Handler] = js.undefined
  }
  object Handlers {
    
    inline def apply(): Handlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Handlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Handlers] (val x: Self) extends AnyVal {
      
      inline def setArrayExpression(value: Handler): Self = StObject.set(x, "ArrayExpression", value.asInstanceOf[js.Any])
      
      inline def setArrayExpressionUndefined: Self = StObject.set(x, "ArrayExpression", js.undefined)
      
      inline def setArrayPattern(value: Handler): Self = StObject.set(x, "ArrayPattern", value.asInstanceOf[js.Any])
      
      inline def setArrayPatternUndefined: Self = StObject.set(x, "ArrayPattern", js.undefined)
      
      inline def setArrowFunctionExpression(value: Handler): Self = StObject.set(x, "ArrowFunctionExpression", value.asInstanceOf[js.Any])
      
      inline def setArrowFunctionExpressionUndefined: Self = StObject.set(x, "ArrowFunctionExpression", js.undefined)
      
      inline def setAssignmentExpression(value: Handler): Self = StObject.set(x, "AssignmentExpression", value.asInstanceOf[js.Any])
      
      inline def setAssignmentExpressionUndefined: Self = StObject.set(x, "AssignmentExpression", js.undefined)
      
      inline def setAssignmentPattern(value: Handler): Self = StObject.set(x, "AssignmentPattern", value.asInstanceOf[js.Any])
      
      inline def setAssignmentPatternUndefined: Self = StObject.set(x, "AssignmentPattern", js.undefined)
      
      inline def setAwaitExpression(value: Handler): Self = StObject.set(x, "AwaitExpression", value.asInstanceOf[js.Any])
      
      inline def setAwaitExpressionUndefined: Self = StObject.set(x, "AwaitExpression", js.undefined)
      
      inline def setBinaryExpression(value: Handler): Self = StObject.set(x, "BinaryExpression", value.asInstanceOf[js.Any])
      
      inline def setBinaryExpressionUndefined: Self = StObject.set(x, "BinaryExpression", js.undefined)
      
      inline def setBlockStatement(value: Handler): Self = StObject.set(x, "BlockStatement", value.asInstanceOf[js.Any])
      
      inline def setBlockStatementUndefined: Self = StObject.set(x, "BlockStatement", js.undefined)
      
      inline def setBreakStatement(value: Handler): Self = StObject.set(x, "BreakStatement", value.asInstanceOf[js.Any])
      
      inline def setBreakStatementUndefined: Self = StObject.set(x, "BreakStatement", js.undefined)
      
      inline def setCallExpression(value: Handler): Self = StObject.set(x, "CallExpression", value.asInstanceOf[js.Any])
      
      inline def setCallExpressionUndefined: Self = StObject.set(x, "CallExpression", js.undefined)
      
      inline def setCatchClause(value: Handler): Self = StObject.set(x, "CatchClause", value.asInstanceOf[js.Any])
      
      inline def setCatchClauseUndefined: Self = StObject.set(x, "CatchClause", js.undefined)
      
      inline def setChainExpression(value: Handler): Self = StObject.set(x, "ChainExpression", value.asInstanceOf[js.Any])
      
      inline def setChainExpressionUndefined: Self = StObject.set(x, "ChainExpression", js.undefined)
      
      inline def setClassBody(value: Handler): Self = StObject.set(x, "ClassBody", value.asInstanceOf[js.Any])
      
      inline def setClassBodyUndefined: Self = StObject.set(x, "ClassBody", js.undefined)
      
      inline def setClassDeclaration(value: Handler): Self = StObject.set(x, "ClassDeclaration", value.asInstanceOf[js.Any])
      
      inline def setClassDeclarationUndefined: Self = StObject.set(x, "ClassDeclaration", js.undefined)
      
      inline def setClassExpression(value: Handler): Self = StObject.set(x, "ClassExpression", value.asInstanceOf[js.Any])
      
      inline def setClassExpressionUndefined: Self = StObject.set(x, "ClassExpression", js.undefined)
      
      inline def setConditionalExpression(value: Handler): Self = StObject.set(x, "ConditionalExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionalExpressionUndefined: Self = StObject.set(x, "ConditionalExpression", js.undefined)
      
      inline def setContinueStatement(value: Handler): Self = StObject.set(x, "ContinueStatement", value.asInstanceOf[js.Any])
      
      inline def setContinueStatementUndefined: Self = StObject.set(x, "ContinueStatement", js.undefined)
      
      inline def setDebuggerStatement(value: Handler): Self = StObject.set(x, "DebuggerStatement", value.asInstanceOf[js.Any])
      
      inline def setDebuggerStatementUndefined: Self = StObject.set(x, "DebuggerStatement", js.undefined)
      
      inline def setDoWhileStatement(value: Handler): Self = StObject.set(x, "DoWhileStatement", value.asInstanceOf[js.Any])
      
      inline def setDoWhileStatementUndefined: Self = StObject.set(x, "DoWhileStatement", js.undefined)
      
      inline def setEmptyStatement(value: Handler): Self = StObject.set(x, "EmptyStatement", value.asInstanceOf[js.Any])
      
      inline def setEmptyStatementUndefined: Self = StObject.set(x, "EmptyStatement", js.undefined)
      
      inline def setExportAllDeclaration(value: Handler): Self = StObject.set(x, "ExportAllDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportAllDeclarationUndefined: Self = StObject.set(x, "ExportAllDeclaration", js.undefined)
      
      inline def setExportDefaultDeclaration(value: Handler): Self = StObject.set(x, "ExportDefaultDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportDefaultDeclarationUndefined: Self = StObject.set(x, "ExportDefaultDeclaration", js.undefined)
      
      inline def setExportNamedDeclaration(value: Handler): Self = StObject.set(x, "ExportNamedDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportNamedDeclarationUndefined: Self = StObject.set(x, "ExportNamedDeclaration", js.undefined)
      
      inline def setExportSpecifier(value: Handler): Self = StObject.set(x, "ExportSpecifier", value.asInstanceOf[js.Any])
      
      inline def setExportSpecifierUndefined: Self = StObject.set(x, "ExportSpecifier", js.undefined)
      
      inline def setExpressionStatement(value: Handler): Self = StObject.set(x, "ExpressionStatement", value.asInstanceOf[js.Any])
      
      inline def setExpressionStatementUndefined: Self = StObject.set(x, "ExpressionStatement", js.undefined)
      
      inline def setForInStatement(value: Handler): Self = StObject.set(x, "ForInStatement", value.asInstanceOf[js.Any])
      
      inline def setForInStatementUndefined: Self = StObject.set(x, "ForInStatement", js.undefined)
      
      inline def setForOfStatement(value: Handler): Self = StObject.set(x, "ForOfStatement", value.asInstanceOf[js.Any])
      
      inline def setForOfStatementUndefined: Self = StObject.set(x, "ForOfStatement", js.undefined)
      
      inline def setForStatement(value: Handler): Self = StObject.set(x, "ForStatement", value.asInstanceOf[js.Any])
      
      inline def setForStatementUndefined: Self = StObject.set(x, "ForStatement", js.undefined)
      
      inline def setFunctionDeclaration(value: Handler): Self = StObject.set(x, "FunctionDeclaration", value.asInstanceOf[js.Any])
      
      inline def setFunctionDeclarationUndefined: Self = StObject.set(x, "FunctionDeclaration", js.undefined)
      
      inline def setFunctionExpression(value: Handler): Self = StObject.set(x, "FunctionExpression", value.asInstanceOf[js.Any])
      
      inline def setFunctionExpressionUndefined: Self = StObject.set(x, "FunctionExpression", js.undefined)
      
      inline def setIdentifier(value: Handler): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
      
      inline def setIfStatement(value: Handler): Self = StObject.set(x, "IfStatement", value.asInstanceOf[js.Any])
      
      inline def setIfStatementUndefined: Self = StObject.set(x, "IfStatement", js.undefined)
      
      inline def setImportDeclaration(value: Handler): Self = StObject.set(x, "ImportDeclaration", value.asInstanceOf[js.Any])
      
      inline def setImportDeclarationUndefined: Self = StObject.set(x, "ImportDeclaration", js.undefined)
      
      inline def setImportDefaultSpecifier(value: Handler): Self = StObject.set(x, "ImportDefaultSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportDefaultSpecifierUndefined: Self = StObject.set(x, "ImportDefaultSpecifier", js.undefined)
      
      inline def setImportExpression(value: Handler): Self = StObject.set(x, "ImportExpression", value.asInstanceOf[js.Any])
      
      inline def setImportExpressionUndefined: Self = StObject.set(x, "ImportExpression", js.undefined)
      
      inline def setImportNamespaceSpecifier(value: Handler): Self = StObject.set(x, "ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportNamespaceSpecifierUndefined: Self = StObject.set(x, "ImportNamespaceSpecifier", js.undefined)
      
      inline def setImportSpecifier(value: Handler): Self = StObject.set(x, "ImportSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportSpecifierUndefined: Self = StObject.set(x, "ImportSpecifier", js.undefined)
      
      inline def setJSXAttribute(value: Handler): Self = StObject.set(x, "JSXAttribute", value.asInstanceOf[js.Any])
      
      inline def setJSXAttributeUndefined: Self = StObject.set(x, "JSXAttribute", js.undefined)
      
      inline def setJSXClosingElement(value: Handler): Self = StObject.set(x, "JSXClosingElement", value.asInstanceOf[js.Any])
      
      inline def setJSXClosingElementUndefined: Self = StObject.set(x, "JSXClosingElement", js.undefined)
      
      inline def setJSXClosingFragment(value: Handler): Self = StObject.set(x, "JSXClosingFragment", value.asInstanceOf[js.Any])
      
      inline def setJSXClosingFragmentUndefined: Self = StObject.set(x, "JSXClosingFragment", js.undefined)
      
      inline def setJSXElement(value: Handler): Self = StObject.set(x, "JSXElement", value.asInstanceOf[js.Any])
      
      inline def setJSXElementUndefined: Self = StObject.set(x, "JSXElement", js.undefined)
      
      inline def setJSXEmptyExpression(value: Handler): Self = StObject.set(x, "JSXEmptyExpression", value.asInstanceOf[js.Any])
      
      inline def setJSXEmptyExpressionUndefined: Self = StObject.set(x, "JSXEmptyExpression", js.undefined)
      
      inline def setJSXExpressionContainer(value: Handler): Self = StObject.set(x, "JSXExpressionContainer", value.asInstanceOf[js.Any])
      
      inline def setJSXExpressionContainerUndefined: Self = StObject.set(x, "JSXExpressionContainer", js.undefined)
      
      inline def setJSXFragment(value: Handler): Self = StObject.set(x, "JSXFragment", value.asInstanceOf[js.Any])
      
      inline def setJSXFragmentUndefined: Self = StObject.set(x, "JSXFragment", js.undefined)
      
      inline def setJSXIdentifier(value: Handler): Self = StObject.set(x, "JSXIdentifier", value.asInstanceOf[js.Any])
      
      inline def setJSXIdentifierUndefined: Self = StObject.set(x, "JSXIdentifier", js.undefined)
      
      inline def setJSXMemberExpression(value: Handler): Self = StObject.set(x, "JSXMemberExpression", value.asInstanceOf[js.Any])
      
      inline def setJSXMemberExpressionUndefined: Self = StObject.set(x, "JSXMemberExpression", js.undefined)
      
      inline def setJSXNamespacedName(value: Handler): Self = StObject.set(x, "JSXNamespacedName", value.asInstanceOf[js.Any])
      
      inline def setJSXNamespacedNameUndefined: Self = StObject.set(x, "JSXNamespacedName", js.undefined)
      
      inline def setJSXOpeningElement(value: Handler): Self = StObject.set(x, "JSXOpeningElement", value.asInstanceOf[js.Any])
      
      inline def setJSXOpeningElementUndefined: Self = StObject.set(x, "JSXOpeningElement", js.undefined)
      
      inline def setJSXOpeningFragment(value: Handler): Self = StObject.set(x, "JSXOpeningFragment", value.asInstanceOf[js.Any])
      
      inline def setJSXOpeningFragmentUndefined: Self = StObject.set(x, "JSXOpeningFragment", js.undefined)
      
      inline def setJSXSpreadAttribute(value: Handler): Self = StObject.set(x, "JSXSpreadAttribute", value.asInstanceOf[js.Any])
      
      inline def setJSXSpreadAttributeUndefined: Self = StObject.set(x, "JSXSpreadAttribute", js.undefined)
      
      inline def setJSXText(value: Handler): Self = StObject.set(x, "JSXText", value.asInstanceOf[js.Any])
      
      inline def setJSXTextUndefined: Self = StObject.set(x, "JSXText", js.undefined)
      
      inline def setLabeledStatement(value: Handler): Self = StObject.set(x, "LabeledStatement", value.asInstanceOf[js.Any])
      
      inline def setLabeledStatementUndefined: Self = StObject.set(x, "LabeledStatement", js.undefined)
      
      inline def setLiteral(value: Handler): Self = StObject.set(x, "Literal", value.asInstanceOf[js.Any])
      
      inline def setLiteralUndefined: Self = StObject.set(x, "Literal", js.undefined)
      
      inline def setLogicalExpression(value: Handler): Self = StObject.set(x, "LogicalExpression", value.asInstanceOf[js.Any])
      
      inline def setLogicalExpressionUndefined: Self = StObject.set(x, "LogicalExpression", js.undefined)
      
      inline def setMemberExpression(value: Handler): Self = StObject.set(x, "MemberExpression", value.asInstanceOf[js.Any])
      
      inline def setMemberExpressionUndefined: Self = StObject.set(x, "MemberExpression", js.undefined)
      
      inline def setMetaProperty(value: Handler): Self = StObject.set(x, "MetaProperty", value.asInstanceOf[js.Any])
      
      inline def setMetaPropertyUndefined: Self = StObject.set(x, "MetaProperty", js.undefined)
      
      inline def setMethodDefinition(value: Handler): Self = StObject.set(x, "MethodDefinition", value.asInstanceOf[js.Any])
      
      inline def setMethodDefinitionUndefined: Self = StObject.set(x, "MethodDefinition", js.undefined)
      
      inline def setNewExpression(value: Handler): Self = StObject.set(x, "NewExpression", value.asInstanceOf[js.Any])
      
      inline def setNewExpressionUndefined: Self = StObject.set(x, "NewExpression", js.undefined)
      
      inline def setObjectExpression(value: Handler): Self = StObject.set(x, "ObjectExpression", value.asInstanceOf[js.Any])
      
      inline def setObjectExpressionUndefined: Self = StObject.set(x, "ObjectExpression", js.undefined)
      
      inline def setObjectPattern(value: Handler): Self = StObject.set(x, "ObjectPattern", value.asInstanceOf[js.Any])
      
      inline def setObjectPatternUndefined: Self = StObject.set(x, "ObjectPattern", js.undefined)
      
      inline def setPrivateIdentifier(value: Handler): Self = StObject.set(x, "PrivateIdentifier", value.asInstanceOf[js.Any])
      
      inline def setPrivateIdentifierUndefined: Self = StObject.set(x, "PrivateIdentifier", js.undefined)
      
      inline def setProgram(value: Handler): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
      
      inline def setProgramUndefined: Self = StObject.set(x, "Program", js.undefined)
      
      inline def setProperty(value: Handler): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
      
      inline def setPropertyDefinition(value: Handler): Self = StObject.set(x, "PropertyDefinition", value.asInstanceOf[js.Any])
      
      inline def setPropertyDefinitionUndefined: Self = StObject.set(x, "PropertyDefinition", js.undefined)
      
      inline def setPropertyUndefined: Self = StObject.set(x, "Property", js.undefined)
      
      inline def setRestElement(value: Handler): Self = StObject.set(x, "RestElement", value.asInstanceOf[js.Any])
      
      inline def setRestElementUndefined: Self = StObject.set(x, "RestElement", js.undefined)
      
      inline def setReturnStatement(value: Handler): Self = StObject.set(x, "ReturnStatement", value.asInstanceOf[js.Any])
      
      inline def setReturnStatementUndefined: Self = StObject.set(x, "ReturnStatement", js.undefined)
      
      inline def setSequenceExpression(value: Handler): Self = StObject.set(x, "SequenceExpression", value.asInstanceOf[js.Any])
      
      inline def setSequenceExpressionUndefined: Self = StObject.set(x, "SequenceExpression", js.undefined)
      
      inline def setSpreadElement(value: Handler): Self = StObject.set(x, "SpreadElement", value.asInstanceOf[js.Any])
      
      inline def setSpreadElementUndefined: Self = StObject.set(x, "SpreadElement", js.undefined)
      
      inline def setStaticBlock(value: Handler): Self = StObject.set(x, "StaticBlock", value.asInstanceOf[js.Any])
      
      inline def setStaticBlockUndefined: Self = StObject.set(x, "StaticBlock", js.undefined)
      
      inline def setSuper(value: Handler): Self = StObject.set(x, "Super", value.asInstanceOf[js.Any])
      
      inline def setSuperUndefined: Self = StObject.set(x, "Super", js.undefined)
      
      inline def setSwitchCase(value: Handler): Self = StObject.set(x, "SwitchCase", value.asInstanceOf[js.Any])
      
      inline def setSwitchCaseUndefined: Self = StObject.set(x, "SwitchCase", js.undefined)
      
      inline def setSwitchStatement(value: Handler): Self = StObject.set(x, "SwitchStatement", value.asInstanceOf[js.Any])
      
      inline def setSwitchStatementUndefined: Self = StObject.set(x, "SwitchStatement", js.undefined)
      
      inline def setTaggedTemplateExpression(value: Handler): Self = StObject.set(x, "TaggedTemplateExpression", value.asInstanceOf[js.Any])
      
      inline def setTaggedTemplateExpressionUndefined: Self = StObject.set(x, "TaggedTemplateExpression", js.undefined)
      
      inline def setTemplateElement(value: Handler): Self = StObject.set(x, "TemplateElement", value.asInstanceOf[js.Any])
      
      inline def setTemplateElementUndefined: Self = StObject.set(x, "TemplateElement", js.undefined)
      
      inline def setTemplateLiteral(value: Handler): Self = StObject.set(x, "TemplateLiteral", value.asInstanceOf[js.Any])
      
      inline def setTemplateLiteralUndefined: Self = StObject.set(x, "TemplateLiteral", js.undefined)
      
      inline def setThisExpression(value: Handler): Self = StObject.set(x, "ThisExpression", value.asInstanceOf[js.Any])
      
      inline def setThisExpressionUndefined: Self = StObject.set(x, "ThisExpression", js.undefined)
      
      inline def setThrowStatement(value: Handler): Self = StObject.set(x, "ThrowStatement", value.asInstanceOf[js.Any])
      
      inline def setThrowStatementUndefined: Self = StObject.set(x, "ThrowStatement", js.undefined)
      
      inline def setTryStatement(value: Handler): Self = StObject.set(x, "TryStatement", value.asInstanceOf[js.Any])
      
      inline def setTryStatementUndefined: Self = StObject.set(x, "TryStatement", js.undefined)
      
      inline def setUnaryExpression(value: Handler): Self = StObject.set(x, "UnaryExpression", value.asInstanceOf[js.Any])
      
      inline def setUnaryExpressionUndefined: Self = StObject.set(x, "UnaryExpression", js.undefined)
      
      inline def setUpdateExpression(value: Handler): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
      
      inline def setUpdateExpressionUndefined: Self = StObject.set(x, "UpdateExpression", js.undefined)
      
      inline def setVariableDeclaration(value: Handler): Self = StObject.set(x, "VariableDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVariableDeclarationUndefined: Self = StObject.set(x, "VariableDeclaration", js.undefined)
      
      inline def setVariableDeclarator(value: Handler): Self = StObject.set(x, "VariableDeclarator", value.asInstanceOf[js.Any])
      
      inline def setVariableDeclaratorUndefined: Self = StObject.set(x, "VariableDeclarator", js.undefined)
      
      inline def setWhileStatement(value: Handler): Self = StObject.set(x, "WhileStatement", value.asInstanceOf[js.Any])
      
      inline def setWhileStatementUndefined: Self = StObject.set(x, "WhileStatement", js.undefined)
      
      inline def setWithStatement(value: Handler): Self = StObject.set(x, "WithStatement", value.asInstanceOf[js.Any])
      
      inline def setWithStatementUndefined: Self = StObject.set(x, "WithStatement", js.undefined)
      
      inline def setYieldExpression(value: Handler): Self = StObject.set(x, "YieldExpression", value.asInstanceOf[js.Any])
      
      inline def setYieldExpressionUndefined: Self = StObject.set(x, "YieldExpression", js.undefined)
    }
  }
  
  trait Map extends StObject {
    
    var file: String
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sources: js.Array[String]
    
    var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
    
    var version: Double
  }
  object Map {
    
    inline def apply(
      file: String,
      mappings: String,
      names: js.Array[String],
      sources: js.Array[String],
      version: Double
    ): Map = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.estreeUtilToJs.libMod.OptionsWithoutSourceMapGenerator
    - typings.estreeUtilToJs.libMod.OptionsWithSourceMapGenerator
  */
  trait Options extends StObject
  object Options {
    
    inline def OptionsWithSourceMapGenerator(SourceMapGenerator: SourceMapGenerator): typings.estreeUtilToJs.libMod.OptionsWithSourceMapGenerator = {
      val __obj = js.Dynamic.literal(SourceMapGenerator = SourceMapGenerator.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.estreeUtilToJs.libMod.OptionsWithSourceMapGenerator]
    }
    
    inline def OptionsWithoutSourceMapGenerator(SourceMapGenerator: Unit, filePath: Unit): typings.estreeUtilToJs.libMod.OptionsWithoutSourceMapGenerator = {
      val __obj = js.Dynamic.literal(SourceMapGenerator = SourceMapGenerator.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.estreeUtilToJs.libMod.OptionsWithoutSourceMapGenerator]
    }
  }
  
  trait OptionsWithSourceMapGenerator
    extends StObject
       with BaseFields
       with SourceMapFieldsWithSourceMapGenerator
       with Options
  object OptionsWithSourceMapGenerator {
    
    inline def apply(SourceMapGenerator: SourceMapGenerator): OptionsWithSourceMapGenerator = {
      val __obj = js.Dynamic.literal(SourceMapGenerator = SourceMapGenerator.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithSourceMapGenerator]
    }
  }
  
  trait OptionsWithoutSourceMapGenerator
    extends StObject
       with BaseFields
       with SourceMapFieldsWithoutSourceMapGenerator
       with Options
  object OptionsWithoutSourceMapGenerator {
    
    inline def apply(SourceMapGenerator: Unit, filePath: Unit): OptionsWithoutSourceMapGenerator = {
      val __obj = js.Dynamic.literal(SourceMapGenerator = SourceMapGenerator.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithoutSourceMapGenerator]
    }
  }
  
  type Program = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Program */ Any
  
  type Result = ResultRegardlessOfSourceMapGenerator
  
  trait ResultFieldsRegardlessOfSourceMapGenerator extends StObject {
    
    /**
      * Source map as (parsed) JSON, if `SourceMapGenerator` is passed.
      */
    var map: js.UndefOr[Map] = js.undefined
  }
  object ResultFieldsRegardlessOfSourceMapGenerator {
    
    inline def apply(): ResultFieldsRegardlessOfSourceMapGenerator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultFieldsRegardlessOfSourceMapGenerator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultFieldsRegardlessOfSourceMapGenerator] (val x: Self) extends AnyVal {
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  trait ResultFieldsWithSourceMapGenerator extends StObject {
    
    /**
      * Source map as (parsed) JSON, if `SourceMapGenerator` is passed.
      */
    var map: Map
  }
  object ResultFieldsWithSourceMapGenerator {
    
    inline def apply(map: Map): ResultFieldsWithSourceMapGenerator = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultFieldsWithSourceMapGenerator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultFieldsWithSourceMapGenerator] (val x: Self) extends AnyVal {
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultFieldsWithoutSourceMapGenerator extends StObject {
    
    /**
      * Source map as (parsed) JSON, if `SourceMapGenerator` is passed.
      */
    var map: Unit
  }
  object ResultFieldsWithoutSourceMapGenerator {
    
    inline def apply(map: Unit): ResultFieldsWithoutSourceMapGenerator = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultFieldsWithoutSourceMapGenerator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultFieldsWithoutSourceMapGenerator] (val x: Self) extends AnyVal {
      
      inline def setMap(value: Unit): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultRegardlessOfSourceMapGenerator
    extends StObject
       with BaseResultFields
       with ResultFieldsRegardlessOfSourceMapGenerator
  object ResultRegardlessOfSourceMapGenerator {
    
    inline def apply(value: String): ResultRegardlessOfSourceMapGenerator = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultRegardlessOfSourceMapGenerator]
    }
  }
  
  trait ResultWithSourceMapGenerator
    extends StObject
       with BaseResultFields
       with ResultFieldsWithSourceMapGenerator
  object ResultWithSourceMapGenerator {
    
    inline def apply(map: Map, value: String): ResultWithSourceMapGenerator = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultWithSourceMapGenerator]
    }
  }
  
  trait ResultWithoutSourceMapGenerator
    extends StObject
       with BaseResultFields
       with ResultFieldsWithoutSourceMapGenerator
  object ResultWithoutSourceMapGenerator {
    
    inline def apply(map: Unit, value: String): ResultWithoutSourceMapGenerator = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultWithoutSourceMapGenerator]
    }
  }
  
  trait SourceMapFieldsWithSourceMapGenerator extends StObject {
    
    /**
      * Generate a source map by passing a `SourceMapGenerator` from `source-map`
      * in.
      */
    var SourceMapGenerator: typings.estreeUtilToJs.libMod.SourceMapGenerator
    
    /**
      * Path to input file.
      */
    var filePath: js.UndefOr[String] = js.undefined
  }
  object SourceMapFieldsWithSourceMapGenerator {
    
    inline def apply(SourceMapGenerator: SourceMapGenerator): SourceMapFieldsWithSourceMapGenerator = {
      val __obj = js.Dynamic.literal(SourceMapGenerator = SourceMapGenerator.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapFieldsWithSourceMapGenerator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceMapFieldsWithSourceMapGenerator] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setSourceMapGenerator(value: SourceMapGenerator): Self = StObject.set(x, "SourceMapGenerator", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceMapFieldsWithoutSourceMapGenerator extends StObject {
    
    /**
      * Generate a source map by passing a `SourceMapGenerator` from `source-map`
      * in.
      */
    var SourceMapGenerator: Unit
    
    /**
      * Path to input file.
      */
    var filePath: Unit
  }
  object SourceMapFieldsWithoutSourceMapGenerator {
    
    inline def apply(SourceMapGenerator: Unit, filePath: Unit): SourceMapFieldsWithoutSourceMapGenerator = {
      val __obj = js.Dynamic.literal(SourceMapGenerator = SourceMapGenerator.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapFieldsWithoutSourceMapGenerator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceMapFieldsWithoutSourceMapGenerator] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: Unit): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setSourceMapGenerator(value: Unit): Self = StObject.set(x, "SourceMapGenerator", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceMapGenerator
    extends StObject
       with Instantiable0[typings.sourceMap.mod.SourceMapGenerator] {
    
    /**
      * Creates a new SourceMapGenerator based on a SourceMapConsumer
      *
      * @param sourceMapConsumer The SourceMap.
      */
    def fromSourceMap(sourceMapConsumer: SourceMapConsumer): typings.sourceMap.mod.SourceMapGenerator = js.native
  }
}
