package typings
package eslintLib.eslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RuleNs {
  type NodeListener = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ T in eslint.eslint.Rule.NodeTypes ]:? (node : estree.estree.Node): void}
    */ eslintLib.eslintLibStrings.NodeListener with js.Any
  type NodeTypes = /* import warning: ImportType.apply Failed type conversion: estree.estree.Node['type'] */ js.Any
  type ReportDescriptor = ReportDescriptorMessage with ReportDescriptorLocation with ReportDescriptorOptions
}
