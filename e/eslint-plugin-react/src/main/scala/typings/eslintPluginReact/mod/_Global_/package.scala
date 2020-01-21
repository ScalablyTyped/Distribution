package typings.eslintPluginReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _Global_ {
  type Fixer = typings.eslint.mod.Rule.RuleFixer
  type JSXAttribute = typings.eslintPluginReact.mod._Global_.ASTNode
  type JSXElement = typings.eslintPluginReact.mod._Global_.ASTNode
  type JSXFragment = typings.eslintPluginReact.mod._Global_.ASTNode
  type JSXSpreadAttribute = typings.eslintPluginReact.mod._Global_.ASTNode
  type Scope = typings.eslint.mod.Scope.Scope
  type Token = typings.eslint.mod.AST.Token
  type TypeDeclarationBuilder = js.Function3[
    /* annotation */ typings.eslintPluginReact.mod._Global_.ASTNode, 
    /* parentName */ java.lang.String, 
    /* seen */ typings.std.Set[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof annotation */ js.Any
    ], 
    js.Object
  ]
  type TypeDeclarationBuilders = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in string ]: eslint-plugin-react.eslint-plugin-react/lib/types._Global_.TypeDeclarationBuilder}
    */ typings.eslintPluginReact.eslintPluginReactStrings.TypeDeclarationBuilders with js.Any
}
