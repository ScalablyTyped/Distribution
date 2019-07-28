package typings.atFrctlFractal.atFrctlFractalMod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.assetsNs.AssetCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.filesNs.FileCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.variantsNs.VariantCollection
import typings.atFrctlFractal.atFrctlFractalMod.fractalNs.coreNs.entitiesNs.Entity
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "core")
@js.native
object coreNs extends js.Object {
  @js.native
  class ComponentCls protected ()
    extends typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component {
    def this(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity) = this()
  }
  
  @js.native
  class DocCls protected ()
    extends typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc {
    def this(config: js.Any, content: String, parent: Entity) = this()
  }
  
  @js.native
  class VariantCls protected ()
    extends typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant {
    def this(
      config: js.Object,
      view: js.Any,
      resources: AssetCollection,
      parent: typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
    ) = this()
  }
  
  @js.native
  object Component
    extends Instantiable4[
          /* config */ js.Object, 
          /* files */ FileCollection, 
          /* resources */ AssetCollection, 
          /* parent */ Entity, 
          typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
        ] {
    def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[
        js.Object | VariantCollection | typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
      ] = js.native
  }
  
  @js.native
  object Doc
    extends Instantiable3[
          /* config */ js.Any, 
          /* content */ String, 
          /* parent */ Entity, 
          typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc
        ] {
    def create(config: js.Any, content: String, parent: Entity): typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc = js.native
  }
  
  @js.native
  object Variant
    extends Instantiable4[
          /* config */ js.Object, 
          /* view */ js.Any, 
          /* resources */ AssetCollection, 
          /* parent */ typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component, 
          typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant
        ] {
    def create(
      config: js.Object,
      view: js.Any,
      resources: AssetCollection,
      parent: typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
    ): typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant = js.native
  }
  
  type Component = typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.componentsNs.Component
  type Doc = typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.docsNs.Doc
  type Variant = typings.atFrctlFractal.atFrctlFractalMod.fractalNs.apiNs.variantsNs.Variant
}

