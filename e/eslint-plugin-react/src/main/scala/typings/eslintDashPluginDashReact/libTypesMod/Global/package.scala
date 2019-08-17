package typings.eslintDashPluginDashReact.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Global {
  import typings.eslint.eslintMod.RuleNs.RuleFixer
  import typings.std.Set

  type Fixer = RuleFixer
  type JSXAttribute = ASTNode
  type JSXSpreadAttribute = ASTNode
  type Scope = typings.eslint.eslintMod.ScopeNs.Scope
  type Token = typings.eslint.eslintMod.ASTNs.Token
  type TypeDeclarationBuilder = js.Function3[
    /* annotation */ ASTNode, 
    /* parentName */ String, 
    /* seen */ Set[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof annotation */ js.Any
    ], 
    js.Object
  ]
  type TypeDeclarationBuilders = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in string ]: eslint-plugin-react.eslint-plugin-react/lib/types.Global.TypeDeclarationBuilder}
    */ typings.eslintDashPluginDashReact.eslintDashPluginDashReactStrings.TypeDeclarationBuilders with js.Any
  type UnionTypeDefinitionChildren = js.Array[js.Any]
}
