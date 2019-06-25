package typings
package eslintDashPluginDashReactLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Global {
  type Fixer = eslintLib.eslintMod.RuleNs.RuleFixer
  type JSXAttribute = ASTNode
  type JSXSpreadAttribute = ASTNode
  type Scope = eslintLib.eslintMod.ScopeNs.Scope
  type Token = eslintLib.eslintMod.ASTNs.Token
  type TypeDeclarationBuilder = js.Function3[
    /* annotation */ ASTNode, 
    /* parentName */ java.lang.String, 
    /* seen */ stdLib.Set[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof annotation */ js.Any
    ], 
    js.Object
  ]
  type TypeDeclarationBuilders = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in string ]: eslint-plugin-react.eslint-plugin-react/lib/types.Global.TypeDeclarationBuilder}
    */ eslintDashPluginDashReactLib.eslintDashPluginDashReactLibStrings.TypeDeclarationBuilders with js.Any
  type UnionTypeDefinitionChildren = js.Array[js.Any]
}
