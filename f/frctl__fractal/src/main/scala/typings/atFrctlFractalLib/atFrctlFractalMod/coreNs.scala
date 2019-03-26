package typings
package atFrctlFractalLib.atFrctlFractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "core")
@js.native
object coreNs extends js.Object {
  @js.native
  class ComponentCls protected ()
    extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component {
    def this(config: js.Object, files: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.filesNs.FileCollection, resources: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection, parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity) = this()
  }
  
  @js.native
  class DocCls protected ()
    extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc {
    def this(config: js.Any, content: java.lang.String, parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity) = this()
  }
  
  @js.native
  class VariantCls protected ()
    extends atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant {
    def this(config: js.Object, view: js.Any, resources: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection, parent: atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component) = this()
  }
  
  val Component: atFrctlFractalLib.Anon_Config = js.native
  val Doc: atFrctlFractalLib.Anon_ConfigContent = js.native
  val Variant: atFrctlFractalLib.Anon_ConfigCreate = js.native
  type Component = atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
  type Doc = atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc
  type Variant = atFrctlFractalLib.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant
}

